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

    @Test
    public void testRetireveWebhook() throws Throwable {
        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
            controller.retrieveWebhook(0, 0);
        } catch(APIException e) {};

        // Test whether the response is null
        assertNotNull("Response is null",
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200",
                200, httpResponse.getResponse().getStatusCode());
    }
    

}
