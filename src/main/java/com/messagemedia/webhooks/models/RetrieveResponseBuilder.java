/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class RetrieveResponseBuilder {
    //the instance to build
    private RetrieveResponse retrieveResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RetrieveResponseBuilder() {
        retrieveResponse = new RetrieveResponse();
    }

    public RetrieveResponseBuilder page(int page) {
        retrieveResponse.setPage(page);
        return this;
    }

    public RetrieveResponseBuilder pageSize(int pageSize) {
        retrieveResponse.setPageSize(pageSize);
        return this;
    }

    public RetrieveResponseBuilder pageData(List<Object> pageData) {
        retrieveResponse.setPageData(pageData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RetrieveResponse build() {
        return retrieveResponse;
    }
}