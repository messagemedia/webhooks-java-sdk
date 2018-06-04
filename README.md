# MessageMedia Webhooks Java SDK
[![Travis Build Status](https://api.travis-ci.org/messagemedia/webhooks-java-sdk.svg?branch=master)](https://travis-ci.org/messagemedia/webhooks-java-sdk)
[![maven](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/messagemedia/sdk/webhooks/maven-metadata.xml.svg)](https://mvnrepository.com/artifact/com.messagemedia.sdk/webhooks)

The MessageMedia Webhooks allows you to subscribe to one or several events and when one of those events is triggered, an HTTP request is sent to the URL of your choice along with the message or payload. In simpler terms, it allows applications to "speak" to one another and get notified automatically when something new happens.

## ⭐️ Installing via Maven
At present the jars are available from a public maven repository.

Use the following dependency in your project to grab via Maven:
```
<dependency>
    <groupId>com.messagemedia.sdk</groupId>
    <artifactId>webhooks</artifactId>
    <version>1.0.0</version>
</dependency>

```

## 🎬 Get Started
It's easy to get started. Simply enter the API Key and secret you obtained from the [MessageMedia Developers Portal](https://developers.messagemedia.com) into the code snippet below.

### 🚀 Create a webhook
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

### 📥 Retrieve all webhooks
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

### 🔄 Update a webhook
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

### ❌ Delete a webhook
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

## 📕 Documentation
Check out the [full API documentation](DOCUMENTATION.md) for more detailed information.

## 😕 Need help?
Please contact developer support at developers@messagemedia.com or check out the developer portal at [developers.messagemedia.com](https://developers.messagemedia.com/)

## 📃 License
Apache License. See the [LICENSE](LICENSE) file.
