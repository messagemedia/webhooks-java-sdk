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
import com.messagemedia.webhooks.controllers.APIController;

import com.fasterxml.jackson.core.type.TypeReference;

public class APIControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static APIController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getClient();
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
     * This will delete the webhook wuth the give id.
a **Response 404 is returned when** :
    <ul>
     <li>there is no webhook  with this `webhookId` </li>
    </ul>
     * @throws Throwable
     */
    @Test
    public void testDeleteDeleteAndUpdateWebhook1() throws Throwable {
        // Parameters for the API call
        UUID webhookId = UUID.fromString("a7f11bb0-f299-4861-a5ca-9b29d04bc5ad");

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.deleteDeleteAndUpdateWebhook(webhookId);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 204", 
                204, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * This will retrieve all webhooks for the account we're connected with.
a **Response 400 is returned when** :
    <ul>
     <li>the `page` query parameter is not valid </li>
     <li>the `pageSize` query parameter is not valid </li>
    </ul>
     * @throws Throwable
     */
    @Test
    public void testRetrieve1() throws Throwable {
        // Parameters for the API call
        Integer page = "1";
        Integer pageSize = "10";

        // Set callback and perform API call
        RetrieveResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.retrieve(page, pageSize);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", TestHelper.isJsonObjectProperSubsetOf(
                "    {    \"page\": 0,    \"pageSize\": 100,    \"pageData\": [{    \"id\": \"6e2c61df-d30a-4555-82a5-0e79822d8f53\",    \"url\": \"http://myurl.com\",    \"method\": \"POST\",    \"encoding\": \"FORM_ENCODED\",    \"headers\": {    \"Account\": \"FunGuys\"    },    \"template\": \"id=$mtId&status=$statusCode\",    \"events\": [    \"ENROUTE_DR\",    \"DELIVERED_DR\"    ]    }, {    \"id\": \"6e2c61df-d30a-4555-82a5-0e79822d8f53\",    \"url\": \"http://myurl.com\",    \"method\": \"POST\",    \"encoding\": \"XML\",    \"headers\": {    \"Account\": \"FunGuys\"    },    \"template\": \"<content><id> $mtId < /id> <status > $statusCode < /status> </content>\",    \"events\": [    \"ENROUTE_DR\",    \"DELIVERED_DR\"    ]    }]    }", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
