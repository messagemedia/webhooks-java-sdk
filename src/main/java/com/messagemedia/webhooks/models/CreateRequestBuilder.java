/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class CreateRequestBuilder {
    //the instance to build
    private CreateRequest createRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateRequestBuilder() {
        createRequest = new CreateRequest();
    }

    /**
     * target for the webhook. http and https are authorized
     */
    public CreateRequestBuilder url(String url) {
        createRequest.setUrl(url);
        return this;
    }

    /**
     * authorized webhook methods  :  GET, POST, PUT, DELETE, PATCH
     */
    public CreateRequestBuilder method(String method) {
        createRequest.setMethod(method);
        return this;
    }

    /**
     * JSON, FORM_ENCODED, XML
     */
    public CreateRequestBuilder encoding(String encoding) {
        createRequest.setEncoding(encoding);
        return this;
    }

    /**
     * list of events we want to suscribe to. see docs
     */
    public CreateRequestBuilder events(List<String> events) {
        createRequest.setEvents(events);
        return this;
    }

    /**
     * expected template. see doc for possibilities
     */
    public CreateRequestBuilder template(String template) {
        createRequest.setTemplate(template);
        return this;
    }

    /**
     * customized headers.no content Type header because we set it in the encoding attribute. an example below
     */
    public CreateRequestBuilder headers(Headers headers) {
        createRequest.setHeaders(headers);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateRequest build() {
        return createRequest;
    }
}