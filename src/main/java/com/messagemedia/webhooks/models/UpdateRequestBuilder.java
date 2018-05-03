/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class UpdateRequestBuilder {
    //the instance to build
    private UpdateRequest updateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateRequestBuilder() {
        updateRequest = new UpdateRequest();
    }

    /**
     * target for the webhook. http and https are authorized
     */
    public UpdateRequestBuilder url(String url) {
        updateRequest.setUrl(url);
        return this;
    }

    /**
     * authorized webhook methods  :  GET, POST, PUT, DELETE, PATCH
     */
    public UpdateRequestBuilder method(String method) {
        updateRequest.setMethod(method);
        return this;
    }

    /**
     * JSON, FORM_ENCODED, XML
     */
    public UpdateRequestBuilder encoding(String encoding) {
        updateRequest.setEncoding(encoding);
        return this;
    }

    /**
     * customized headers.no content Type header because we set it in the encoding attribute. an example belowf
     */
    public UpdateRequestBuilder headers(Object headers) {
        updateRequest.setHeaders(headers);
        return this;
    }

    /**
     * list of events we want to suscribe to. see docs
     */
    public UpdateRequestBuilder events(List<String> events) {
        updateRequest.setEvents(events);
        return this;
    }

    /**
     * expected template. see doc for possibilitie
     */
    public UpdateRequestBuilder template(String template) {
        updateRequest.setTemplate(template);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateRequest build() {
        return updateRequest;
    }
}