/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.messagemedia.webhooks.models.*;
import com.messagemedia.webhooks.exceptions.*;
import com.messagemedia.webhooks.APIHelper;
import com.messagemedia.webhooks.Configuration;
import com.messagemedia.webhooks.testing.TestHelper;
import com.messagemedia.webhooks.controllers.WebhooksController;

import com.fasterxml.jackson.core.type.TypeReference;

public class WebhooksControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static WebhooksController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getWebhooks();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Delete a webhook that was previously created for the connected account.
A webhook can be cancelled by appending the UUID of the webhook to the endpoint and submitting a DELETE request to the /webhooks/messages endpoint.
*Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @throws Throwable
     */
    @Test
    public void testDeleteWebhook1() throws Throwable {
        // Parameters for the API call
        UUID webhookId = UUID.fromString("a7f11bb0-f299-4861-a5ca-9b29d04bc5ad");

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.deleteWebhook(webhookId);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 204", 
                204, httpResponse.getResponse().getStatusCode());

        assertEquals("Headers do not match strictly",
            headers.Count, httpResponse.getResponse().getHeaders().Count);
    }

    /**
     * Update a webhook. You can update individual attributes or all of them by submitting a PATCH request to the /webhooks/messages endpoint (the same endpoint used above to delete a webhook)
A successful request to the retrieve webhook endpoint will return a response body as follows:
```
{
    "url": "https://webhook.com",
    "method": "POST",
    "id": "04442623-0961-464e-9cbc-ec50804e0413",
    "encoding": "JSON",
    "events": [
        "RECEIVED_SMS"
    ],
    "headers": {},
    "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
}
```
*Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @throws Throwable
     */
    @Test
    public void testUpdateWebhook1() throws Throwable {
        // Parameters for the API call
        UUID webhookId = UUID.fromString("a7f11bb0-f299-4861-a5ca-9b29d04bc5ad");
        UpdateWebhookRequest body = APIHelper.deserialize("    {        \"url\": \"https://myurl.com\",        \"method\": \"POST\",        \"encoding\": \"FORM_ENCODED\",        \"events\": [            \"ENROUTE_DR\"        ],        \"template\": \"{\\\"id\\\":\\\"$mtId\\\", \\\"status\\\":\\\"$statusCode\\\"}\"    }", new TypeReference<UpdateWebhookRequest>(){});

        // Set callback and perform API call
        DynamicResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.updateWebhook(webhookId, body);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        assertEquals("Headers do not match strictly",
            headers.Count, httpResponse.getResponse().getHeaders().Count);
    }

}
