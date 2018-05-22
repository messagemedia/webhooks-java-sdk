/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class CreateWebhookRequestBuilder {
    //the instance to build
    private CreateWebhookRequest createWebhookRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateWebhookRequestBuilder() {
        createWebhookRequest = new CreateWebhookRequest();
    }

    public CreateWebhookRequestBuilder url(String url) {
        createWebhookRequest.setUrl(url);
        return this;
    }

    public CreateWebhookRequestBuilder method(String method) {
        createWebhookRequest.setMethod(method);
        return this;
    }

    public CreateWebhookRequestBuilder encoding(String encoding) {
        createWebhookRequest.setEncoding(encoding);
        return this;
    }

    public CreateWebhookRequestBuilder headers(Object headers) {
        createWebhookRequest.setHeaders(headers);
        return this;
    }

    public CreateWebhookRequestBuilder events(List<String> events) {
        createWebhookRequest.setEvents(events);
        return this;
    }

    public CreateWebhookRequestBuilder template(String template) {
        createWebhookRequest.setTemplate(template);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateWebhookRequest build() {
        return createWebhookRequest;
    }
}