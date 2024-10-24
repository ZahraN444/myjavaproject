
# Send Sms Response

## Structure

`SendSmsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Scheduled` | `String` | Optional | - | String getScheduled() | setScheduled(String scheduled) |
| `MessageIds` | `List<String>` | Optional | - | List<String> getMessageIds() | setMessageIds(List<String> messageIds) |

## Example (as JSON)

```json
{
  "status": "OK",
  "scheduled": "Now",
  "messageIds": [
    "messageIds9",
    "messageIds0"
  ]
}
```

