# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`

## Methods

* [Send Sms](../../doc/controllers/api.md#send-sms)
* [Get Sms Balance](../../doc/controllers/api.md#get-sms-balance)
* [Hlr Query](../../doc/controllers/api.md#hlr-query)
* [Nv Query](../../doc/controllers/api.md#nv-query)


# Send Sms

Send a single SMS message.

```java
CompletableFuture<SendSmsResponse> sendSmsAsync(
    final SendSmsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SendSmsRequest`](../../doc/models/send-sms-request.md) | Body, Required | - |

## Response Type

[`SendSmsResponse`](../../doc/models/send-sms-response.md)

## Example Usage

```java
SendSmsRequest body = new SendSmsRequest.Builder(
    "YourSenderName",
    "12345678900,19876543210",
    "Hello, this is a test message!",
    "0"
)
.scheduled(DateTimeHelper.fromRfc8601DateTime("12/31/2023 19:35:00"))
.build();

aPIController.sendSmsAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 429 | Too many requests | `ApiException` |
| 500 | Internal server error | `ApiException` |


# Get Sms Balance

Retrieve the remaining balance for SMS messages.

```java
CompletableFuture<BalanceResponse> getSmsBalanceAsync()
```

## Response Type

[`BalanceResponse`](../../doc/models/balance-response.md)

## Example Usage

```java
aPIController.getSmsBalanceAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 429 | Too many requests | `ApiException` |
| 500 | Internal server error | `ApiException` |


# Hlr Query

Perform an HLR (Home Location Register) query to check the status of a phone number.

```java
CompletableFuture<HlrQueryResponse> hlrQueryAsync(
    final HlrQueryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HlrQueryRequest`](../../doc/models/hlr-query-request.md) | Body, Required | - |

## Response Type

[`HlrQueryResponse`](../../doc/models/hlr-query-response.md)

## Example Usage

```java
HlrQueryRequest body = new HlrQueryRequest.Builder(
    "19876543210,12345678900"
)
.build();

aPIController.hlrQueryAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 429 | Too many requests | `ApiException` |
| 500 | Internal server error | `ApiException` |


# Nv Query

Perform a Number Validation (NV) query to validate a phone number.

```java
CompletableFuture<NvQueryResponse> nvQueryAsync(
    final NvQueryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NvQueryRequest`](../../doc/models/nv-query-request.md) | Body, Required | - |

## Response Type

[`NvQueryResponse`](../../doc/models/nv-query-response.md)

## Example Usage

```java
NvQueryRequest body = new NvQueryRequest.Builder(
    "19876543210,12345678900"
)
.build();

aPIController.nvQueryAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 429 | Too many requests | `ApiException` |
| 500 | Internal server error | `ApiException` |

