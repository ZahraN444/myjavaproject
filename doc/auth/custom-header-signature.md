
# Custom Header Signature



Documentation for accessing and setting credentials for apiKeyAuth.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| apikey | `String` | Use your API key for authentication. | `apikey` | `getApikey()` |



**Note:** Auth credentials can be set using `customHeaderAuthenticationCredentials` in the client builder and accessed through `getCustomHeaderAuthenticationCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
EasySendSMSAPIClient client = new EasySendSMSAPIClient.Builder()
    .customHeaderAuthenticationCredentials(new CustomHeaderAuthenticationModel.Builder(
            "apikey"
        )
        .build())
    .build();
```


