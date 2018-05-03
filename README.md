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

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.messagemedia.webhooks.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="create_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.APIController.createAsync") createAsync

> This will create a webhook for the specified `events`
> ### Parameters
> **list of supported parameters in `template` according to the message type :**
> you must escape the json for the template parameter. see example .
> | Data   | parameter name | DR| MO | MO MMS | Comment |
> |:--|--|--|--|--|--|
> | **service type**  | $type| ``OK`` |`OK`| `OK`| |
> | **Message ID**  | $mtId, $messageId| `OK` |`OK`| `OK`| |
> | **Delivery report ID** |$drId, $reportId | `OK` || | |
> | **Reply ID**| $moId, $replyId| |`OK`| `OK`||
> | **Account ID**  | $accountId| `OK` |`OK`| `OK`||
> | **Message Timestamp**  | $submittedTimestamp| `OK` |`OK`| `OK`||
> | **Provider Timestamp**  | $receivedTimestamp| `OK` |`OK`| `OK`||
> | **Message status** | $status| `OK` ||||
> | **Status code**  | $statusCode| `OK` ||||
> | **External metadata** | $metadata.get('key')| `OK` |`OK`| `OK`||
> | **Source address**| $sourceAddress| `OK` |`OK`| `OK`||
> | **Destination address**| $destinationAddress|  |`OK`| `OK`||
> | **Message content**| $mtContent, $messageContent| `OK` |`OK`| `OK`||
> | **Reply Content**| $moContent, $replyContent|  |`OK`| `OK`||
> | **Retry Count**| $retryCount| `OK` |`OK`| `OK`||
> **list of allowed  `events` :**
> you can combine all the events whatever the message type.(at least one Event set otherwise the webhook won't be created)
> + **events for SMS**
>     + `RECEIVED_SMS`
>     + `OPT_OUT_SMS`
> + **events for MMS**
>     + `RECEIVED_MMS`
> + **events for DR**
>     + `ENROUTE_DR`
>     + `EXPIRED_DR`
>     + `REJECTED_DR`
>     + `FAILED_DR`
>     + `DELIVERED_DR`
>     + `SUBMITTED_DR`
> a **Response 400 is returned when** :
>     <ul>
>      <li>the `url` is not valid </li>
>      <li>the `events` is null/empty </li>
>      <li>the `encoding` is null </li>
>      <li>the `method` is null </li>
>      <li>the `headers` has a `ContentType`  attribute </li>
>     </ul>


```java
void createAsync(
        final String contentType,
        final CreateRequest body,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    CreateRequest body = new CreateRequest();
    // Invoking the API call with sample inputs
    client.createAsync(contentType, body, new APICallBack<DynamicResponse>() {
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
| 400 | TODO: Add an error description |



### <a name="delete_delete_and_update_webhook_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.APIController.deleteDeleteAndUpdateWebhookAsync") deleteDeleteAndUpdateWebhookAsync

> This will delete the webhook wuth the give id.
> a **Response 404 is returned when** :
>     <ul>
>      <li>there is no webhook  with this `webhookId` </li>
>     </ul>


```java
void deleteDeleteAndUpdateWebhookAsync(
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
client.deleteDeleteAndUpdateWebhookAsync(webhookId, new APICallBack<void>() {
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



### <a name="retrieve_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.APIController.retrieveAsync") retrieveAsync

> This will retrieve all webhooks for the account we're connected with.
> a **Response 400 is returned when** :
>     <ul>
>      <li>the `page` query parameter is not valid </li>
>      <li>the `pageSize` query parameter is not valid </li>
>     </ul>


```java
void retrieveAsync(
        final Integer page,
        final Integer pageSize,
        final APICallBack<RetrieveResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | TODO: Add a parameter description |
| pageSize |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
Integer page = '1';
Integer pageSize = '10';
// Invoking the API call with sample inputs
client.retrieveAsync(page, pageSize, new APICallBack<RetrieveResponse>() {
    public void onSuccess(HttpContext context, RetrieveResponse response) {
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
| 400 | TODO: Add an error description |



### <a name="update_async"></a>![Method: ](https://apidocs.io/img/method.png "com.messagemedia.webhooks.controllers.APIController.updateAsync") updateAsync

> This will update a webhook and returned the updated Webhook. 
> you can update all the attributes individually or together.
> PS : the new value will override the previous one.
> ### Parameters
> + same parameters rules as create webhook apply
>  a **Response 404 is returned when** :
>     <ul>
>      <li>there is no webhook with this `webhookId` </li>
>     </ul>   
>  a **Response 400 is returned when** :
>     <ul>
>       <li>all attributes are null </li>
>      <li>events array is empty </li>
>      <li>content-Type is set in the headers instead of using the `encoding` attribute  </li>
>     </ul>


```java
void updateAsync(
        final UUID webhookId,
        final String contentType,
        final UpdateRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| webhookId |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    UUID webhookId = UUID.randomUUID();
    String contentType = "Content-Type";
    UpdateRequest body = new UpdateRequest();
    // Invoking the API call with sample inputs
    client.updateAsync(webhookId, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
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
| 404 | TODO: Add an error description |



[Back to List of Controllers](#list_of_controllers)



