
# Getting Started with EasySendSMS API

## Introduction

API for sending SMS, checking balance, HLR queries, and number validation using EasySendSMS.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>packagegroupidtest</groupId>
  <artifactId>zahra-test123</artifactId>
  <version>1.2.3</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/packagegroupidtest/zahra-test123/1.2.3

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project EasySendSMSAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `customHeaderAuthenticationCredentials` | [`CustomHeaderAuthenticationCredentials`](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
EasySendSMSAPIClient client = new EasySendSMSAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials(new CustomHeaderAuthenticationModel.Builder(
            "apikey"
        )
        .build())
    .build();
```

## Authorization

This API uses the following authentication schemes.

* [`apiKeyAuth (Custom Header Signature)`](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/auth/custom-header-signature.md)

## List of APIs

* [API](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/controllers/api.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-request.md)
* [HttpResponse](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-string-response.md)
* [HttpContext](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-callback-interface.md)
* [Headers](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/headers.md)
* [ApiException](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/ZahraN444/myjavaproject/tree/1.2.3/doc/http-client-configuration-builder.md)

