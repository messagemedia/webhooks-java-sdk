/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class HeadersBuilder {
    //the instance to build
    private Headers headers;

    /**
     * Default constructor to initialize the instance
     */
    public HeadersBuilder() {
        headers = new Headers();
    }

    /**
     * Example of
     */
    public HeadersBuilder account(String account) {
        headers.setAccount(account);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Headers build() {
        return headers;
    }
}