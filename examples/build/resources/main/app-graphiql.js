$(function (global) {
  /**
   * This GraphiQL example illustrates how to use some of GraphiQL's props
   * in order to enable reading and updating the URL parameters, making
   * link sharing of queries a little bit easier.
   *
   * This is only one example of this kind of feature, GraphiQL exposes
   * various React params to enable interesting integrations.
   */

  // Parse the search string to get url parameters.
  var search = window.location.search;
  var parameters = {};
  search.substr(1).split('&').forEach(function (entry) {
    var eq = entry.indexOf('=');
    if (eq >= 0) {
      parameters[decodeURIComponent(entry.slice(0, eq))] =
          decodeURIComponent(entry.slice(eq + 1));
    }
  });

  // if variables was provided, try to format it.
  if (parameters.variables) {
    try {
      parameters.variables =
          JSON.stringify(JSON.parse(query.variables), null, 2);
    } catch (e) {
      // Do nothing
    }
  }

  // When the query and variables string is edited, update the URL bar so
  // that it can be easily shared
  function onEditQuery(newQuery) {
    parameters.query = newQuery;
    updateURL();
  }

  function onEditVariables(newVariables) {
    parameters.variables = newVariables;
    updateURL();
  }

  function updateURL() {
    var newSearch = '?' + Object.keys(parameters).map(function (key) {
          return encodeURIComponent(key) + '=' +
              encodeURIComponent(parameters[key]);
        }).join('&');
    history.replaceState(null, null, newSearch);
  }


  /**
   * Functions to manage the accessToken.
   *
   * For convenience, we will save any entered user ID as a cookie
   * and generate the corresponding JSON web token (JWT),
   * so the user does not have to always copy / paste the same token
   * each time they visit the page.
   *
   */
  var userIdCookieName = 'userId';
  var tokenCookieName = 'accessToken';
  var tokenHeader = {
    "alg": "HS256",
    "typ": "JWT"
  };
  var secret = "rubrik-spark";
  var customClaimNamespace = "https://my.rubrik.com/";

  // code from https://www.jonathan-petitcolas.com/2014/11/27/
  // creating-json-web-token-in-javascript.html
  function base64url(source) {
    // Encode in classical base64
    encodedSource = CryptoJS.enc.Base64.stringify(source);
    // Remove padding equal characters
    encodedSource = encodedSource.replace(/=+$/, '');
    // Replace characters according to base64url specifications
    encodedSource = encodedSource.replace(/\+/g, '-');
    encodedSource = encodedSource.replace(/\//g, '_');
    return encodedSource;
  }

  function encodeObject(payload) {
    var stringifiedPayload = CryptoJS.enc.Utf8.parse(JSON.stringify(payload));
    var encodedPayload = base64url(stringifiedPayload);
    return encodedPayload;
  }

  function generateJWT(account, userId) {
    var data = {
      "sub": userId
    };
    data[customClaimNamespace + "email"] = "";
    data[customClaimNamespace + "account"] =  account;
    var token = encodeObject(tokenHeader) + "." + encodeObject(data);
    var signature = base64url(CryptoJS.HmacSHA256(token, secret));
    return token + "." + signature;
  }

  // code from https://www.w3schools.com/js/js_cookies.asp
  function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
  }

  // code from https://www.w3schools.com/js/js_cookies.asp
  function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
      var c = ca[i];
      while (c.charAt(0) == ' ') {
        c = c.substring(1);
      }
      if (c.indexOf(name) == 0) {
        return c.substring(name.length, c.length);
      }
    }
    return "";
  }

  // Function to automatically set the user ID from the cookie.
  // This is run when the body element loads.
  global.setUserIdFromCookie = function() {
    var token = getCookie(userIdCookieName);
    document.getElementById('userId').value = token;
  }

  // Defines a GraphQL fetcher using the fetch API.
  function graphQLFetcher(graphQLParams) {
    var userId = document.getElementById('userId').value;
    var account = window.location.hostname.split('.')[0];
    // Save the account name value in a cookie.
    setCookie(userIdCookieName, userId, 3650);
    var token = generateJWT(account, userId);
    return fetch(window.location.origin + '/graphql', {
      method: 'post',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' + token
      },
      body: JSON.stringify(graphQLParams),
      credentials: 'include'
    }).then(function (response) {
      return response.text();
    }).then(function (responseBody) {
      try {
        return JSON.parse(responseBody);
      } catch (error) {
        return responseBody;
      }
    });
  }

  function setupZoom(percent) {
    $('html > head').append($('<style>body {zoom: ' + percent + '%;}</style>'))
  }

  if (parameters['zoom']) {
    setupZoom(parameters['zoom'])
  }

  if (parameters["hideVariables"]) {
    $('html > head')
        .append($('<style>.variable-editor {display: none !important}</style>'))
  }

  global.renderGraphiql = function (elem) {
    // Render <GraphiQL /> into the body.
    ReactDOM.render(
        React.createElement(GraphiQL, {
          fetcher: graphQLFetcher,
          query: parameters.query,
          variables: parameters.variables,
          response: parameters.response,
          onEditQuery: onEditQuery,
          onEditVariables: onEditVariables,
          defaultQuery:
            "# Welcome to GraphiQL for Spark\n" +
            "#\n" +
            "# ctrl-space: auto-completion\n" +
            "#\n" +
            "# ctrl-enter: execute query\n\n"
        }),
        elem
    );
  }
}(window))