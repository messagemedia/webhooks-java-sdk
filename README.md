# MessageMedia Webhooks Java SDK
[![Travis Build Status](https://api.travis-ci.org/messagemedia/webhooks-java-sdk.svg?branch=master)](https://travis-ci.org/messagemedia/webhooks-java-sdk)
[![Pull Requests Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat)](http://makeapullrequest.com)
[![maven](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/messagemedia/sdk/webhooks/maven-metadata.xml.svg)](https://mvnrepository.com/artifact/com.messagemedia.sdk/webhooks)

The MessageMedia Webhooks allows you to subscribe to one or several events and when one of those events is triggered, an HTTP request is sent to the URL of your choice along with the message or payload. In simpler terms, it allows applications to "speak" to one another and get notified automatically when something new happens.

![Webhooks Flow](http://i66.tinypic.com/2ufxf81.jpg)

## Table of Contents
* [Authentication](#closed_lock_with_key-authentication)
* [Errors](#interrobang-errors)
* [Information](#newspaper-information)
  * [Slack and Mailing List](#slack-and-mailing-list)
  * [Bug Reports](#bug-reports)
  * [Contributing](#contributing)
* [Installation](#star-installation)
* [Get Started](#clapper-get-started)
* [API Documentation](#closed_book-api-documentation)
* [Need help?](#confused-need-help)
* [License](#page_with_curl-license)

## :closed_lock_with_key: Authentication

Authentication is done via API keys. Sign up at https://developers.messagemedia.com/register/ to get your API keys.

Requests are authenticated using HTTP Basic Auth or HMAC. Provide your API key as the auth_user_name and API secret as the auth_password.

## :interrobang: Errors

Our API returns standard HTTP success or error status codes. For errors, we will also include extra information about what went wrong encoded in the response as JSON. The most common status codes are listed below.

#### HTTP Status Codes

| Code      | Title       | Description |
|-----------|-------------|-------------|
| 400 | Invalid Request | The request was invalid |
| 401 | Unauthorized | Your API credentials are invalid |
| 403 | Disabled feature | Feature not enabled |
| 404 | Not Found |	The resource does not exist |
| 50X | Internal Server Error | An error occurred with our API |

## :newspaper: Information

#### Slack and Mailing List

If you have any questions, comments, or concerns, please join our Slack channel:
https://developers.messagemedia.com/collaborate/slack/

Alternatively you can email us at:
developers@messagemedia.com

#### Bug reports

If you discover a problem with the SDK, we would like to know about it. You can raise an [issue](https://github.com/messagemedia/signingkeys-nodejs-sdk/issues) or send an email to: developers@messagemedia.com

#### Contributing

We welcome your thoughts on how we could best provide you with SDKs that would simplify how you consume our services in your application. You can fork and create pull requests for any features you would like to see or raise an [issue](https://github.com/messagemedia/signingkeys-nodejs-sdk/issues)

## :star: Installation
At present the jars are available from a public maven repository.

Use the following dependency in your project to grab via Maven:
```
<dependency>
    <groupId>com.messagemedia.sdk</groupId>
    <artifactId>webhooks</artifactId>
    <version>1.0.0</version>
</dependency>

```

## :clapper: Get Started
It's easy to get started. Simply enter the API Key and secret you obtained from the [MessageMedia Developers Portal](https://developers.messagemedia.com) into the code snippet below.

### Create a webhook
```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messagemedia.webhooks.MessageMediaWebhooksClient;
import com.messagemedia.webhooks.controllers.WebhooksController;
import com.messagemedia.webhooks.models.CreateWebhookRequest;

public class Main {

    public static void main(String[] args) throws Throwable {
        // Configuration parameters and credentials
        String basicAuthUserName = "API_KEY"; // The username to use with basic authentication
        String basicAuthPassword = "API_SECRET"; // The password to use with basic authentication

        MessageMediaWebhooksClient client = new MessageMediaWebhooksClient(basicAuthUserName, basicAuthPassword);

        WebhooksController webhooks = client.getWebhooks();

        String bodyValue = "{\"url\": \"https://webhook.com\"," +
                "\"method\": \"POST\"," +
                "\"encoding\": \"JSON\"," +
                "\"events\": [ \"RECEIVED_SMS\" ]," +
                "\"template\": \"{\\\"id\\\":\\\"$mtId\\\", \\\"status\\\":\\\"$statusCode\\\"}\"" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        CreateWebhookRequest body = mapper.readValue(bodyValue,new TypeReference<CreateWebhookRequest>(){});

        webhooks.createWebhook(body);
    }
}

```

### Retrieve all webhooks
```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.messagemedia.webhooks.MessageMediaWebhooksClient;
import com.messagemedia.webhooks.controllers.WebhooksController;

public class Main {

    public static void main(String[] args) throws Throwable {
        // Configuration parameters and credentials
        String basicAuthUserName = "API_KEY"; // The username to use with basic authentication
        String basicAuthPassword = "API_SECRET"; // The password to use with basic authentication

        MessageMediaWebhooksClient client = new MessageMediaWebhooksClient(basicAuthUserName, basicAuthPassword);

        WebhooksController webhooks = client.getWebhooks();

        Integer page = 0;
        Integer pageSize = 0;

        String result = (webhooks.retrieveWebhook(page, pageSize).parseAsString());
        System.out.print(result);
    }
}

```

### Update a webhook
You can get a webhook ID by looking at the `id` of each webhook created from the response of the above example.
```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messagemedia.webhooks.MessageMediaWebhooksClient;
import com.messagemedia.webhooks.controllers.WebhooksController;
import com.messagemedia.webhooks.models.UpdateWebhookRequest;

public class Main {

    public static void main(String[] args) throws Throwable {
        // Configuration parameters and credentials
        String basicAuthUserName = "API_KEY"; // The username to use with basic authentication
        String basicAuthPassword = "API_SECRET"; // The password to use with basic authentication

        MessageMediaWebhooksClient client = new MessageMediaWebhooksClient(basicAuthUserName, basicAuthPassword);

        WebhooksController webhooks = client.getWebhooks();

        String webhookId = "WEBHOOK_ID";

        String bodyValue = "{\"url\": \"https://myurl.com\"," +
                "\"method\": \"POST\"," +
                "\"encoding\": \"JSON\"," +
                "\"events\": [ \"ENROUTE_DR\" ]," +
                "\"template\": \"{\\\"id\\\":\\\"$mtId\\\", \\\"status\\\":\\\"$statusCode\\\"}\"" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        UpdateWebhookRequest body = mapper.readValue(bodyValue,new TypeReference<UpdateWebhookRequest>(){});

        webhooks.updateWebhook(webhookId, body);
    }
}

```

### Delete a webhook
You can get a webhook ID by looking at the `id` of each webhook created from the response of the retrieve webhooks example.
```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.messagemedia.webhooks.MessageMediaWebhooksClient;
import com.messagemedia.webhooks.controllers.WebhooksController;

public class Main {

    public static void main(String[] args) throws Throwable {
        // Configuration parameters and credentials
        String basicAuthUserName = "API_KEY"; // The username to use with basic authentication
        String basicAuthPassword = "API_SECRET"; // The password to use with basic authentication

        MessageMediaWebhooksClient client = new MessageMediaWebhooksClient(basicAuthUserName, basicAuthPassword);

        WebhooksController webhooks = client.getWebhooks();

        String webhookId = "WEBHOOK_ID";

        webhooks.deleteWebhook(webhookId);
    }
}

```

## :closed_book: API Reference Documentation
Check out the [full API documentation](https://developers.messagemedia.com/code/webhooks-api-documentation/) for more detailed information.

## :confused: Need help?
Please contact developer support at developers@messagemedia.com or check out the developer portal at [developers.messagemedia.com](https://developers.messagemedia.com/)

## :page_with_curl: License
Apache License. See the [LICENSE](LICENSE) file.
