# Getting started

TODO: Add a description

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

## How to Use

The following section explains how to use the MessageMediaWebhooks library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *MessageMediaWebhooks* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

Clicking the ``` Add ``` button will open a dialog where you need to specify MessageMediaWebhooks in ``` Group Id ``` and MessageMediaWebhooks in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=MessageMediaWebhooks-Java&workspaceName=MessageMediaWebhooks&projectName=MessageMediaWebhooks&rootNamespace=com.messagemedia.webhooks)

## How to Test

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *MessageMediaWebhooks* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

MessageMediaWebhooksClient client = new MessageMediaWebhooksClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [WebhooksController](#webhooks_controller)

## <a name="webhooks_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.messagemedia.webhooks.controllers.WebhooksController") WebhooksController

### Get singleton instance

The singleton instance of the ``` WebhooksController ``` class can be accessed from the API Client.

```java
WebhooksController webhooks = client.getWebhooks();
```

### <a name="create_webhook_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.WebhooksController.createWebhookAsync") createWebhookAsync

> Create a webhook for one or more of the specified events.
> A webhook would typically have the following structure:
> ```
> {
>   "url": "http://webhook.com",
>   "method": "POST",
>   "encoding": "JSON",
>   "headers": {
>     "Account": "DeveloperPortal7000"
>   },
>   "events": [
>     "RECEIVED_SMS"
>   ],
>   "template": "{\"id\":\"$mtId\",\"status\":\"$statusCode\"}"
> }
> ```
> A valid webhook must consist of the following properties:
> - ```url``` The configured URL which will trigger the webhook when a selected event occurs.
> - ```method``` The methods to map CRUD (create, retrieve, update, delete) operations to HTTP requests.
> - ```encoding``` The format in which the payload will be returned. You can choose from ```JSON```, ```FORM_ENCODED``` or ```XML```. This will automatically add the Content-Type header for you so you don't have to add it again in the `headers` property.
> - ```headers``` HTTP header fields which provide required information about the request or response, or about the object sent in the message body. This should not include the `Content-Type` header.
> - ```events``` Event or events that will trigger the webhook. Atleast one event should be present.
> - ```template``` The structure of the payload that will be returned.
> #### Types of Events
> You can select all of the events (listed below) or combine them in whatever way you like but atleast one event must be used. Otherwise, the webhook won't be created.
> A webhook will be triggered when any one or more of the events occur:
> + **SMS**
>     + `RECEIVED_SMS` Receive an SMS
>     + `OPT_OUT_SMS` Opt-out occured
> + **MMS**
>     + `RECEIVED_MMS` Receive an MMS
> + **DR (Delivery Reports)**
>     + `ENROUTE_DR` Message is enroute
>     + `EXPIRED_DR` Message has expired
>     + `REJECTED_DR` Message is rejected
>     + `FAILED_DR` Message has failed
>     + `DELIVERED_DR` Message is delivered
>     + `SUBMITTED_DR` Message is submitted
> #### Template Parameters
> You can choose what to include in the data that will be sent as the payload via the Webhook.
> Keep in my mind, you must escape the JSON in the template value (see example above).
> The table illustrates a list of all the parameters that can be included in the template and which event types it can be applied to.
> | Data  | Parameter Name | Example | Event Type |
> |:--|--|--|--|--|
> | **Service Type**  | $type| `SMS` | `DR` `MO` `MO MMS` |
> | **Message ID**  | $mtId, $messageId| `877c19ef-fa2e-4cec-827a-e1df9b5509f7` | `DR` `MO` `MO MMS`|
> | **Delivery Report ID** |$drId, $reportId| `01e1fa0a-6e27-4945-9cdb-18644b4de043` | `DR` |
> | **Reply ID**| $moId, $replyId| `a175e797-2b54-468b-9850-41a3eab32f74` | `MO` `MO MMS` |
> | **Account ID**  | $accountId| `DeveloperPortal7000` | `DR` `MO` `MO MMS` |
> | **Message Timestamp**  | $submittedTimestamp| `2016-12-07T08:43:00.850Z` | `DR` `MO` `MO MMS` |
> | **Provider Timestamp**  | $receivedTimestamp| `2016-12-07T08:44:00.850Z` | `DR` `MO` `MO MMS` |
> | **Message Status** | $status| `enroute` | `DR` |
> | **Status Code**  | $statusCode| `200` | `DR` |
> | **External Metadata** | $metadata.get('key')| `name` | `DR` `MO` `MO MMS` |
> | **Source Address**| $sourceAddress| `+61491570156` | `DR` `MO` `MO MMS` |
> | **Destination Address**| $destinationAddress| `+61491593156` | `MO` `MO MMS` |
> | **Message Content**| $mtContent, $messageContent| `Hi Derp` | `DR` `MO` `MO MMS` |
> | **Reply Content**| $moContent, $replyContent| `Hello Derpina` | `MO` `MO MMS` |
> | **Retry Count**| $retryCount| `1` | `DR` `MO` `MO MMS` |
> *Note: A 400 response will be returned if the `url` is invalid, the `events`, `encoding` or `method` is null or the `headers` has a Content-Type  attribute.*


```java
void createWebhookAsync(
        final CreateWebhookRequest body,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateWebhookRequest body = new CreateWebhookRequest();
    // Invoking the API call with sample inputs
    webhooks.createWebhookAsync(body, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 409 | Unexpected error in API call. See HTTP response body for details. |



### <a name="retrieve_webhook_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.WebhooksController.retrieveWebhookAsync") retrieveWebhookAsync

> Retrieve all the webhooks created for the connected account.
> A successful request to the retrieve webhook endpoint will return a response body as follows:
> ```
> {
>     "page": 0,
>     "pageSize": 100,
>     "pageData": [
>         {
>             "url": "https://webhook.com",
>             "method": "POST",
>             "id": "8805c9d8-bef7-41c7-906a-69ede93aa024",
>             "encoding": "JSON",
>             "events": [
>                 "RECEIVED_SMS"
>             ],
>             "headers": {},
>             "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
>         }
>     ]
> }
> ```
> *Note: Response 400 is returned when the `page` query parameter is not valid or the `pageSize` query parameter is not valid.*


```java
void retrieveWebhookAsync(
        final Integer page,
        final Integer pageSize,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | TODO: Add a parameter description |
| pageSize |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
Integer page = 188;
Integer pageSize = 188;
// Invoking the API call with sample inputs
webhooks.retrieveWebhookAsync(page, pageSize, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |



### <a name="delete_webhook_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.WebhooksController.deleteWebhookAsync") deleteWebhookAsync

> Delete a webhook that was previously created for the connected account.
> A webhook can be cancelled by appending the UUID of the webhook to the endpoint and submitting a DELETE request to the /webhooks/messages endpoint.
> *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*


```java
void deleteWebhookAsync(
        final UUID webhookId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| webhookId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
UUID webhookId = a7f11bb0-f299-4861-a5ca-9b29d04bc5ad;
// Invoking the API call with sample inputs
webhooks.deleteWebhookAsync(webhookId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | TODO: Add an error description |



### <a name="update_webhook_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.WebhooksController.updateWebhookAsync") updateWebhookAsync

> Update a webhook. You can update individual attributes or all of them by submitting a PATCH request to the /webhooks/messages endpoint (the same endpoint used above to delete a webhook)
> A successful request to the retrieve webhook endpoint will return a response body as follows:
> ```
> {
>     "url": "https://webhook.com",
>     "method": "POST",
>     "id": "04442623-0961-464e-9cbc-ec50804e0413",
>     "encoding": "JSON",
>     "events": [
>         "RECEIVED_SMS"
>     ],
>     "headers": {},
>     "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
> }
> ```
> *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*


```java
void updateWebhookAsync(
        final UUID webhookId,
        final UpdateWebhookRequest body,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| webhookId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    UUID webhookId = a7f11bb0-f299-4861-a5ca-9b29d04bc5ad;
    String bodyValue = "    {        \"url\": \"https://myurl.com\",        \"method\": \"POST\",        \"encoding\": \"FORM_ENCODED\",        \"events\": [            \"ENROUTE_DR\"        ],        \"template\": \"{\\\"id\\\":\\\"$mtId\\\", \\\"status\\\":\\\"$statusCode\\\"}\"    }";
    UpdateWebhookRequest body = mapper.readValue(bodyValue,new TypeReference<UpdateWebhookRequest> (){});
    // Invoking the API call with sample inputs
    webhooks.updateWebhookAsync(webhookId, body, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Unexpected error in API call. See HTTP response body for details. |
| 404 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)
