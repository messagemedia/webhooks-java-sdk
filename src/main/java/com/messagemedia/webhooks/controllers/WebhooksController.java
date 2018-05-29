/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.messagemedia.webhooks.*;
import com.messagemedia.webhooks.models.*;
import com.messagemedia.webhooks.exceptions.*;
import com.messagemedia.webhooks.http.client.HttpClient;
import com.messagemedia.webhooks.http.client.HttpContext;
import com.messagemedia.webhooks.http.request.HttpRequest;
import com.messagemedia.webhooks.http.response.HttpResponse;
import com.messagemedia.webhooks.http.response.HttpStringResponse;
import com.messagemedia.webhooks.http.client.APICallBack;
import com.messagemedia.webhooks.controllers.syncwrapper.APICallBackCatcher;

public class WebhooksController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static WebhooksController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the WebhooksController class 
     */
    public static WebhooksController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new WebhooksController();
            }
        }
        return instance;
    }

    /**
     * Create a webhook for one or more of the specified events.
     * A webhook would typically have the following structure:
     * ```
     * {
     *   "url": "http://webhook.com",
     *   "method": "POST",
     *   "encoding": "JSON",
     *   "headers": {
     *     "Account": "DeveloperPortal7000"
     *   },
     *   "events": [
     *     "RECEIVED_SMS"
     *   ],
     *   "template": "{\"id\":\"$mtId\",\"status\":\"$statusCode\"}"
     * }
     * ```
     * A valid webhook must consist of the following properties:
     * - ```url``` The configured URL which will trigger the webhook when a selected event occurs.
     * - ```method``` The methods to map CRUD (create, retrieve, update, delete) operations to HTTP requests.
     * - ```encoding``` The format in which the payload will be returned. You can choose from ```JSON```, ```FORM_ENCODED``` or ```XML```. This will automatically add the Content-Type header for you so you don't have to add it again in the `headers` property.
     * - ```headers``` HTTP header fields which provide required information about the request or response, or about the object sent in the message body. This should not include the `Content-Type` header.
     * - ```events``` Event or events that will trigger the webhook. Atleast one event should be present.
     * - ```template``` The structure of the payload that will be returned.
     * #### Types of Events
     * You can select all of the events (listed below) or combine them in whatever way you like but atleast one event must be used. Otherwise, the webhook won't be created.
     * A webhook will be triggered when any one or more of the events occur:
     * + **SMS**
     *     + `RECEIVED_SMS` Receive an SMS
     *     + `OPT_OUT_SMS` Opt-out occured
     * + **MMS**
     *     + `RECEIVED_MMS` Receive an MMS
     * + **DR (Delivery Reports)**
     *     + `ENROUTE_DR` Message is enroute
     *     + `EXPIRED_DR` Message has expired
     *     + `REJECTED_DR` Message is rejected
     *     + `FAILED_DR` Message has failed 
     *     + `DELIVERED_DR` Message is delivered
     *     + `SUBMITTED_DR` Message is submitted
     * #### Template Parameters
     * You can choose what to include in the data that will be sent as the payload via the Webhook.
     * Keep in my mind, you must escape the JSON in the template value (see example above).
     * The table illustrates a list of all the parameters that can be included in the template and which event types it can be applied to.
     * | Data  | Parameter Name | Example | Event Type |
     * |:--|--|--|--|--|
     * | **Service Type**  | $type| `SMS` | `DR` `MO` `MO MMS` |
     * | **Message ID**  | $mtId, $messageId| `877c19ef-fa2e-4cec-827a-e1df9b5509f7` | `DR` `MO` `MO MMS`|
     * | **Delivery Report ID** |$drId, $reportId| `01e1fa0a-6e27-4945-9cdb-18644b4de043` | `DR` |
     * | **Reply ID**| $moId, $replyId| `a175e797-2b54-468b-9850-41a3eab32f74` | `MO` `MO MMS` |
     * | **Account ID**  | $accountId| `DeveloperPortal7000` | `DR` `MO` `MO MMS` |
     * | **Message Timestamp**  | $submittedTimestamp| `2016-12-07T08:43:00.850Z` | `DR` `MO` `MO MMS` |
     * | **Provider Timestamp**  | $receivedTimestamp| `2016-12-07T08:44:00.850Z` | `DR` `MO` `MO MMS` |
     * | **Message Status** | $status| `enroute` | `DR` |
     * | **Status Code**  | $statusCode| `200` | `DR` |
     * | **External Metadata** | $metadata.get('key')| `name` | `DR` `MO` `MO MMS` |
     * | **Source Address**| $sourceAddress| `+61491570156` | `DR` `MO` `MO MMS` |
     * | **Destination Address**| $destinationAddress| `+61491593156` | `MO` `MO MMS` |
     * | **Message Content**| $mtContent, $messageContent| `Hi Derp` | `DR` `MO` `MO MMS` |
     * | **Reply Content**| $moContent, $replyContent| `Hello Derpina` | `MO` `MO MMS` |
     * | **Retry Count**| $retryCount| `1` | `DR` `MO` `MO MMS` |
     * *Note: A 400 response will be returned if the `url` is invalid, the `events`, `encoding` or `method` is null or the `headers` has a Content-Type  attribute.*
     * @param    body    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse createWebhook(
                final CreateWebhookRequest body
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        createWebhookAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create a webhook for one or more of the specified events.
     * A webhook would typically have the following structure:
     * ```
     * {
     *   "url": "http://webhook.com",
     *   "method": "POST",
     *   "encoding": "JSON",
     *   "headers": {
     *     "Account": "DeveloperPortal7000"
     *   },
     *   "events": [
     *     "RECEIVED_SMS"
     *   ],
     *   "template": "{\"id\":\"$mtId\",\"status\":\"$statusCode\"}"
     * }
     * ```
     * A valid webhook must consist of the following properties:
     * - ```url``` The configured URL which will trigger the webhook when a selected event occurs.
     * - ```method``` The methods to map CRUD (create, retrieve, update, delete) operations to HTTP requests.
     * - ```encoding``` The format in which the payload will be returned. You can choose from ```JSON```, ```FORM_ENCODED``` or ```XML```. This will automatically add the Content-Type header for you so you don't have to add it again in the `headers` property.
     * - ```headers``` HTTP header fields which provide required information about the request or response, or about the object sent in the message body. This should not include the `Content-Type` header.
     * - ```events``` Event or events that will trigger the webhook. Atleast one event should be present.
     * - ```template``` The structure of the payload that will be returned.
     * #### Types of Events
     * You can select all of the events (listed below) or combine them in whatever way you like but atleast one event must be used. Otherwise, the webhook won't be created.
     * A webhook will be triggered when any one or more of the events occur:
     * + **SMS**
     *     + `RECEIVED_SMS` Receive an SMS
     *     + `OPT_OUT_SMS` Opt-out occured
     * + **MMS**
     *     + `RECEIVED_MMS` Receive an MMS
     * + **DR (Delivery Reports)**
     *     + `ENROUTE_DR` Message is enroute
     *     + `EXPIRED_DR` Message has expired
     *     + `REJECTED_DR` Message is rejected
     *     + `FAILED_DR` Message has failed 
     *     + `DELIVERED_DR` Message is delivered
     *     + `SUBMITTED_DR` Message is submitted
     * #### Template Parameters
     * You can choose what to include in the data that will be sent as the payload via the Webhook.
     * Keep in my mind, you must escape the JSON in the template value (see example above).
     * The table illustrates a list of all the parameters that can be included in the template and which event types it can be applied to.
     * | Data  | Parameter Name | Example | Event Type |
     * |:--|--|--|--|--|
     * | **Service Type**  | $type| `SMS` | `DR` `MO` `MO MMS` |
     * | **Message ID**  | $mtId, $messageId| `877c19ef-fa2e-4cec-827a-e1df9b5509f7` | `DR` `MO` `MO MMS`|
     * | **Delivery Report ID** |$drId, $reportId| `01e1fa0a-6e27-4945-9cdb-18644b4de043` | `DR` |
     * | **Reply ID**| $moId, $replyId| `a175e797-2b54-468b-9850-41a3eab32f74` | `MO` `MO MMS` |
     * | **Account ID**  | $accountId| `DeveloperPortal7000` | `DR` `MO` `MO MMS` |
     * | **Message Timestamp**  | $submittedTimestamp| `2016-12-07T08:43:00.850Z` | `DR` `MO` `MO MMS` |
     * | **Provider Timestamp**  | $receivedTimestamp| `2016-12-07T08:44:00.850Z` | `DR` `MO` `MO MMS` |
     * | **Message Status** | $status| `enroute` | `DR` |
     * | **Status Code**  | $statusCode| `200` | `DR` |
     * | **External Metadata** | $metadata.get('key')| `name` | `DR` `MO` `MO MMS` |
     * | **Source Address**| $sourceAddress| `+61491570156` | `DR` `MO` `MO MMS` |
     * | **Destination Address**| $destinationAddress| `+61491593156` | `MO` `MO MMS` |
     * | **Message Content**| $mtContent, $messageContent| `Hi Derp` | `DR` `MO` `MO MMS` |
     * | **Reply Content**| $moContent, $replyContent| `Hello Derpina` | `MO` `MO MMS` |
     * | **Retry Count**| $retryCount| `1` | `DR` `MO` `MO MMS` |
     * *Note: A 400 response will be returned if the `url` is invalid, the `events`, `encoding` or `method` is null or the `headers` has a Content-Type  attribute.*
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createWebhookAsync(
                final CreateWebhookRequest body,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webhooks/messages");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 5600241497466020242L;
                    {
                        put( "user-agent", "messagemedia-webhooks-java-sdk-1.0.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request;
                try {
                    _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body),
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new CreateWebhook400ResponseException("Unexpected error in API call. See HTTP response body for details.", _context);

                            if (_responseCode == 409)
                                throw new CreateWebhook400ResponseException("Unexpected error in API call. See HTTP response body for details.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Retrieve all the webhooks created for the connected account.
     * A successful request to the retrieve webhook endpoint will return a response body as follows:
     * ```
     * {
     *     "page": 0,
     *     "pageSize": 100,
     *     "pageData": [
     *         {
     *             "url": "https://webhook.com",
     *             "method": "POST",
     *             "id": "8805c9d8-bef7-41c7-906a-69ede93aa024",
     *             "encoding": "JSON",
     *             "events": [
     *                 "RECEIVED_SMS"
     *             ],
     *             "headers": {},
     *             "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
     *         }
     *     ]
     * }
     * ```
     * *Note: Response 400 is returned when the `page` query parameter is not valid or the `pageSize` query parameter is not valid.*
     * @param    page    Optional parameter: Example: 
     * @param    pageSize    Optional parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse retrieveWebhook(
                final Integer page,
                final Integer pageSize
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        retrieveWebhookAsync(page, pageSize, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieve all the webhooks created for the connected account.
     * A successful request to the retrieve webhook endpoint will return a response body as follows:
     * ```
     * {
     *     "page": 0,
     *     "pageSize": 100,
     *     "pageData": [
     *         {
     *             "url": "https://webhook.com",
     *             "method": "POST",
     *             "id": "8805c9d8-bef7-41c7-906a-69ede93aa024",
     *             "encoding": "JSON",
     *             "events": [
     *                 "RECEIVED_SMS"
     *             ],
     *             "headers": {},
     *             "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
     *         }
     *     ]
     * }
     * ```
     * *Note: Response 400 is returned when the `page` query parameter is not valid or the `pageSize` query parameter is not valid.*
     * @param    page    Optional parameter: Example: 
     * @param    pageSize    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void retrieveWebhookAsync(
                final Integer page,
                final Integer pageSize,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webhooks/messages/");

                //process query parameters
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5694394017312321968L;
                    {
                        put( "page", page );
                        put( "pageSize", pageSize );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 5625182578924248129L;
                    {
                        put( "user-agent", "messagemedia-webhooks-java-sdk-1.0.0" );
                        put( "accept", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new RetrieveWebhook400ResponseException("Unexpected error in API call. See HTTP response body for details.", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Delete a webhook that was previously created for the connected account.
     * A webhook can be cancelled by appending the UUID of the webhook to the endpoint and submitting a DELETE request to the /webhooks/messages endpoint.
     * *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @param    webhookId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void deleteWebhook(
                final String webhookId
    ) throws Throwable {
        APICallBackCatcher<Object> callback = new APICallBackCatcher<Object>();
        deleteWebhookAsync(webhookId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        callback.getResult();
    }

    /**
     * Delete a webhook that was previously created for the connected account.
     * A webhook can be cancelled by appending the UUID of the webhook to the endpoint and submitting a DELETE request to the /webhooks/messages endpoint.
     * *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @param    webhookId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void deleteWebhookAsync(
                final String webhookId,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webhooks/messages/{webhookId}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5069233887795938764L;
                    {
                        put( "webhookId", webhookId );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 5244496200788021303L;
                    {
                        put( "user-agent", "messagemedia-webhooks-java-sdk-1.0.0" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null,
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 404)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //let the caller know of the success
                            callBack.onSuccess(_context, _context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update a webhook. You can update individual attributes or all of them by submitting a PATCH request to the /webhooks/messages endpoint (the same endpoint used above to delete a webhook)
     * A successful request to the retrieve webhook endpoint will return a response body as follows:
     * ```
     * {
     *     "url": "https://webhook.com",
     *     "method": "POST",
     *     "id": "04442623-0961-464e-9cbc-ec50804e0413",
     *     "encoding": "JSON",
     *     "events": [
     *         "RECEIVED_SMS"
     *     ],
     *     "headers": {},
     *     "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
     * }
     * ```
     * *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @param    webhookId    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse updateWebhook(
                final String webhookId,
                final UpdateWebhookRequest body
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        updateWebhookAsync(webhookId, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update a webhook. You can update individual attributes or all of them by submitting a PATCH request to the /webhooks/messages endpoint (the same endpoint used above to delete a webhook)
     * A successful request to the retrieve webhook endpoint will return a response body as follows:
     * ```
     * {
     *     "url": "https://webhook.com",
     *     "method": "POST",
     *     "id": "04442623-0961-464e-9cbc-ec50804e0413",
     *     "encoding": "JSON",
     *     "events": [
     *         "RECEIVED_SMS"
     *     ],
     *     "headers": {},
     *     "template": "{\"id\":\"$mtId\", \"status\":\"$statusCode\"}"
     * }
     * ```
     * *Note: Only pre-created webhooks can be deleted. If an invalid or non existent webhook ID parameter is specified in the request, then a HTTP 404 Not Found response will be returned.*
     * @param    webhookId    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void updateWebhookAsync(
                final String webhookId,
                final UpdateWebhookRequest body,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webhooks/messages/{webhookId}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5433286773030152666L;
                    {
                        put( "webhookId", webhookId );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 4680496999208860836L;
                    {
                        put( "user-agent", "messagemedia-webhooks-java-sdk-1.0.0" );
                        put( "accept", "application/json" );
                        put( "content-type", "application/json" );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request;
                try {
                    _request = getClientInstance().patchBody(_queryUrl, _headers, APIHelper.serialize(body),
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new UpdateWebhook400ResponseException("Unexpected error in API call. See HTTP response body for details.", _context);

                            if (_responseCode == 404)
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}