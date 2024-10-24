
# Nv Query Request

## Structure

`NvQueryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `String` | Required | Subscriber's MSISDN to be checked. Multiple numbers can be queried using commas, max 30 per request. | String getNumber() | setNumber(String number) |

## Example (as JSON)

```json
{
  "number": "19876543210,12345678900"
}
```

