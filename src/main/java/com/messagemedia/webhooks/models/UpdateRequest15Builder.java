/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;

public class UpdateRequest15Builder {
    //the instance to build
    private UpdateRequest15 updateRequest15;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateRequest15Builder() {
        updateRequest15 = new UpdateRequest15();
    }

    /**
     * target for the webhook. http and https are authorized
     */
    public UpdateRequest15Builder url(String url) {
        updateRequest15.setUrl(url);
        return this;
    }

    /**
     * expected template. see doc for possibilitie
     */
    public UpdateRequest15Builder template(String template) {
        updateRequest15.setTemplate(template);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateRequest15 build() {
        return updateRequest15;
    }
}