/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class UpdateWebhookRequestBuilder {
    //the instance to build
    private UpdateWebhookRequest updateWebhookRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateWebhookRequestBuilder() {
        updateWebhookRequest = new UpdateWebhookRequest();
    }

    public UpdateWebhookRequestBuilder url(String url) {
        updateWebhookRequest.setUrl(url);
        return this;
    }

    public UpdateWebhookRequestBuilder method(String method) {
        updateWebhookRequest.setMethod(method);
        return this;
    }

    public UpdateWebhookRequestBuilder encoding(String encoding) {
        updateWebhookRequest.setEncoding(encoding);
        return this;
    }

    public UpdateWebhookRequestBuilder events(List<String> events) {
        updateWebhookRequest.setEvents(events);
        return this;
    }

    public UpdateWebhookRequestBuilder template(String template) {
        updateWebhookRequest.setTemplate(template);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateWebhookRequest build() {
        return updateWebhookRequest;
    }
}