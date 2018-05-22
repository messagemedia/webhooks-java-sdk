/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks;

import com.messagemedia.webhooks.controllers.*;
import com.messagemedia.webhooks.http.client.HttpClient;

public class MessageMediaWebhooksClient {
    /**
     * Singleton access to Webhooks controller
     * @return	Returns the WebhooksController instance 
     */
    public WebhooksController getWebhooks() {
        return WebhooksController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public MessageMediaWebhooksClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public MessageMediaWebhooksClient(String basicAuthUserName, String basicAuthPassword) {
        this();
        Configuration.basicAuthUserName = basicAuthUserName;
        Configuration.basicAuthPassword = basicAuthPassword;
    }
}