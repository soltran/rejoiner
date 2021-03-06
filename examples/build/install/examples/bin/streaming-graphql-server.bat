@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  streaming-graphql-server startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and STREAMING_GRAPHQL_SERVER_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\javax.servlet-api-3.1.0.jar;%APP_HOME%\lib\reactive-streams-1.0.2.jar;%APP_HOME%\lib\protobuf-java-util-3.4.0.jar;%APP_HOME%\lib\grpc-context-1.7.0.jar;%APP_HOME%\lib\netty-codec-socks-4.1.16.Final.jar;%APP_HOME%\lib\grpc-stub-1.7.0.jar;%APP_HOME%\lib\antlr4-runtime-4.7.1.jar;%APP_HOME%\lib\proto-google-common-protos-0.1.9.jar;%APP_HOME%\lib\jetty-servlet-9.3.8.v20160314.jar;%APP_HOME%\lib\joda-time-2.8.2.jar;%APP_HOME%\lib\jetty-http-9.3.8.v20160314.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.7.0.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.16.Final.jar;%APP_HOME%\lib\netty-transport-4.1.16.Final.jar;%APP_HOME%\lib\guava-24.1-jre.jar;%APP_HOME%\lib\guice-4.2.0.jar;%APP_HOME%\lib\slf4j-api-1.7.25.jar;%APP_HOME%\lib\java-dataloader-2.0.2.jar;%APP_HOME%\lib\jackson-databind-2.9.6.jar;%APP_HOME%\lib\checker-compat-qual-2.0.0.jar;%APP_HOME%\lib\rejoiner-0.2.0-SNAPSHOT.jar;%APP_HOME%\lib\netty-tcnative-boringssl-static-2.0.6.Final.jar;%APP_HOME%\lib\error_prone_annotations-2.1.3.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\jetty-security-9.3.8.v20160314.jar;%APP_HOME%\lib\jackson-core-2.9.6.jar;%APP_HOME%\lib\java-jwt-3.4.0.jar;%APP_HOME%\lib\slf4j-simple-1.6.2.jar;%APP_HOME%\lib\future-converter-guava-common-1.1.0.jar;%APP_HOME%\lib\jetty-io-9.3.8.v20160314.jar;%APP_HOME%\lib\guice-servlet-4.2.0.jar;%APP_HOME%\lib\jackson-annotations-2.9.0.jar;%APP_HOME%\lib\opencensus-api-0.6.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\auto-value-1.5.2.jar;%APP_HOME%\lib\grpc-netty-1.7.0.jar;%APP_HOME%\lib\graphql-java-9.0.jar;%APP_HOME%\lib\protobuf-java-3.5.0.jar;%APP_HOME%\lib\netty-buffer-4.1.16.Final.jar;%APP_HOME%\lib\instrumentation-api-0.4.3.jar;%APP_HOME%\lib\future-converter-java8-common-1.1.0.jar;%APP_HOME%\lib\commons-codec-1.11.jar;%APP_HOME%\lib\future-converter-common-1.1.0.jar;%APP_HOME%\lib\netty-resolver-4.1.16.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.16.Final.jar;%APP_HOME%\lib\api-common-1.0.0-rc1.jar;%APP_HOME%\lib\netty-common-4.1.16.Final.jar;%APP_HOME%\lib\jsr305-3.0.0.jar;%APP_HOME%\lib\examples.jar;%APP_HOME%\lib\jetty-util-9.3.8.v20160314.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\gson-2.7.jar;%APP_HOME%\lib\grpc-protobuf-1.7.0.jar;%APP_HOME%\lib\grpc-core-1.7.0.jar;%APP_HOME%\lib\netty-codec-http-4.1.16.Final.jar;%APP_HOME%\lib\future-converter-java8-guava-1.1.0.jar;%APP_HOME%\lib\jetty-server-9.3.8.v20160314.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\guice-multibindings-4.1.0.jar;%APP_HOME%\lib\netty-handler-4.1.16.Final.jar;%APP_HOME%\lib\netty-codec-4.1.16.Final.jar

@rem Execute streaming-graphql-server
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %STREAMING_GRAPHQL_SERVER_OPTS%  -classpath "%CLASSPATH%" com.google.api.graphql.examples.streaming.graphqlserver.GraphQlGrpcServer %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable STREAMING_GRAPHQL_SERVER_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%STREAMING_GRAPHQL_SERVER_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
