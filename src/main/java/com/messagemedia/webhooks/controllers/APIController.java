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
import com.fasterxml.jackson.core.type.TypeReference;

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

public class APIController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static APIController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the APIController class 
     */
    public static APIController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new APIController();
            }
        }
        return instance;
    }

    /**
     * This will create a webhook for the specified `events`
     * ### Parameters
     * **list of supported parameters in `template` according to the message type :**
     * you must escape the json for the template parameter. see example .
     * | Data   | parameter name | DR| MO | MO MMS | Comment |
     * |:--|--|--|--|--|--|
     * | **service type**  | $type| ``OK`` |`OK`| `OK`| |
     * | **Message ID**  | $mtId, $messageId| `OK` |`OK`| `OK`| |
     * | **Delivery report ID** |$drId, $reportId | `OK` || | |
     * | **Reply ID**| $moId, $replyId| |`OK`| `OK`||
     * | **Account ID**  | $accountId| `OK` |`OK`| `OK`||
     * | **Message Timestamp**  | $submittedTimestamp| `OK` |`OK`| `OK`||
     * | **Provider Timestamp**  | $receivedTimestamp| `OK` |`OK`| `OK`||
     * | **Message status** | $status| `OK` ||||
     * | **Status code**  | $statusCode| `OK` ||||
     * | **External metadata** | $metadata.get('key')| `OK` |`OK`| `OK`||
     * | **Source address**| $sourceAddress| `OK` |`OK`| `OK`||
     * | **Destination address**| $destinationAddress|  |`OK`| `OK`||
     * | **Message content**| $mtContent, $messageContent| `OK` |`OK`| `OK`||
     * | **Reply Content**| $moContent, $replyContent|  |`OK`| `OK`||
     * | **Retry Count**| $retryCount| `OK` |`OK`| `OK`||
     * **list of allowed  `events` :**
     * you can combine all the events whatever the message type.(at least one Event set otherwise the webhook won't be created)
     * + **events for SMS**
     *     + `RECEIVED_SMS`
     *     + `OPT_OUT_SMS`
     * + **events for MMS**
     *     + `RECEIVED_MMS`
     * + **events for DR**
     *     + `ENROUTE_DR`
     *     + `EXPIRED_DR`
     *     + `REJECTED_DR`
     *     + `FAILED_DR`
     *     + `DELIVERED_DR`
     *     + `SUBMITTED_DR`
     * a **Response 400 is returned when** :
     *     <ul>
     *      <li>the `url` is not valid </li>
     *      <li>the `events` is null/empty </li>
     *      <li>the `encoding` is null </li>
     *      <li>the `method` is null </li>
     *      <li>the `headers` has a `ContentType`  attribute </li>
     *     </ul>
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse create(
                final String contentType,
                final CreateRequest body
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        createAsync(contentType, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This will create a webhook for the specified `events`
     * ### Parameters
     * **list of supported parameters in `template` according to the message type :**
     * you must escape the json for the template parameter. see example .
     * | Data   | parameter name | DR| MO | MO MMS | Comment |
     * |:--|--|--|--|--|--|
     * | **service type**  | $type| ``OK`` |`OK`| `OK`| |
     * | **Message ID**  | $mtId, $messageId| `OK` |`OK`| `OK`| |
     * | **Delivery report ID** |$drId, $reportId | `OK` || | |
     * | **Reply ID**| $moId, $replyId| |`OK`| `OK`||
     * | **Account ID**  | $accountId| `OK` |`OK`| `OK`||
     * | **Message Timestamp**  | $submittedTimestamp| `OK` |`OK`| `OK`||
     * | **Provider Timestamp**  | $receivedTimestamp| `OK` |`OK`| `OK`||
     * | **Message status** | $status| `OK` ||||
     * | **Status code**  | $statusCode| `OK` ||||
     * | **External metadata** | $metadata.get('key')| `OK` |`OK`| `OK`||
     * | **Source address**| $sourceAddress| `OK` |`OK`| `OK`||
     * | **Destination address**| $destinationAddress|  |`OK`| `OK`||
     * | **Message content**| $mtContent, $messageContent| `OK` |`OK`| `OK`||
     * | **Reply Content**| $moContent, $replyContent|  |`OK`| `OK`||
     * | **Retry Count**| $retryCount| `OK` |`OK`| `OK`||
     * **list of allowed  `events` :**
     * you can combine all the events whatever the message type.(at least one Event set otherwise the webhook won't be created)
     * + **events for SMS**
     *     + `RECEIVED_SMS`
     *     + `OPT_OUT_SMS`
     * + **events for MMS**
     *     + `RECEIVED_MMS`
     * + **events for DR**
     *     + `ENROUTE_DR`
     *     + `EXPIRED_DR`
     *     + `REJECTED_DR`
     *     + `FAILED_DR`
     *     + `DELIVERED_DR`
     *     + `SUBMITTED_DR`
     * a **Response 400 is returned when** :
     *     <ul>
     *      <li>the `url` is not valid </li>
     *      <li>the `events` is null/empty </li>
     *      <li>the `encoding` is null </li>
     *      <li>the `method` is null </li>
     *      <li>the `headers` has a `ContentType`  attribute </li>
     *     </ul>
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createAsync(
                final String contentType,
                final CreateRequest body,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webooks/messages");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 5307147615583971842L;
                    {
                        put( "Content-Type", contentType );
                        put( "user-agent", "messagesmedia-webhooks" );
                        put( "accept", "application/json" );
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

    /**
     * This will delete the webhook wuth the give id.
     * a **Response 404 is returned when** :
     *     <ul>
     *      <li>there is no webhook  with this `webhookId` </li>
     *     </ul>
     * @param    webhookId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void deleteDeleteAndUpdateWebhook(
                final UUID webhookId
    ) throws Throwable {
        APICallBackCatcher<Object> callback = new APICallBackCatcher<Object>();
        deleteDeleteAndUpdateWebhookAsync(webhookId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        callback.getResult();
    }

    /**
     * This will delete the webhook wuth the give id.
     * a **Response 404 is returned when** :
     *     <ul>
     *      <li>there is no webhook  with this `webhookId` </li>
     *     </ul>
     * @param    webhookId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void deleteDeleteAndUpdateWebhookAsync(
                final UUID webhookId,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webooks/messages/{webhookId}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5289367526774986773L;
                    {
                        put( "webhookId", webhookId );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 5499951159555191376L;
                    {
                        put( "user-agent", "messagesmedia-webhooks" );
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
     * This will retrieve all webhooks for the account we're connected with.
     * a **Response 400 is returned when** :
     *     <ul>
     *      <li>the `page` query parameter is not valid </li>
     *      <li>the `pageSize` query parameter is not valid </li>
     *     </ul>
     * @param    page    Optional parameter: Example: 
     * @param    pageSize    Optional parameter: Example: 
     * @return    Returns the RetrieveResponse response from the API call 
     */
    public RetrieveResponse retrieve(
                final Integer page,
                final Integer pageSize
    ) throws Throwable {
        APICallBackCatcher<RetrieveResponse> callback = new APICallBackCatcher<RetrieveResponse>();
        retrieveAsync(page, pageSize, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * This will retrieve all webhooks for the account we're connected with.
     * a **Response 400 is returned when** :
     *     <ul>
     *      <li>the `page` query parameter is not valid </li>
     *      <li>the `pageSize` query parameter is not valid </li>
     *     </ul>
     * @param    page    Optional parameter: Example: 
     * @param    pageSize    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void retrieveAsync(
                final Integer page,
                final Integer pageSize,
                final APICallBack<RetrieveResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webooks/messages/");

                //process query parameters
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5542281561944044771L;
                    {
                        put( "page", page );
                        put( "pageSize", pageSize );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 4724708093923862272L;
                    {
                        put( "user-agent", "messagesmedia-webhooks" );
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
                                throw new APIException("", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            RetrieveResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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
     * This will update a webhook and returned the updated Webhook. 
     * you can update all the attributes individually or together.
     * PS : the new value will override the previous one.
     * ### Parameters
     * + same parameters rules as create webhook apply
     *  a **Response 404 is returned when** :
     *     <ul>
     *      <li>there is no webhook with this `webhookId` </li>
     *     </ul>   
     *  a **Response 400 is returned when** :
     *     <ul>
     *       <li>all attributes are null </li>
     *      <li>events array is empty </li>
     *      <li>content-Type is set in the headers instead of using the `encoding` attribute  </li>
     *     </ul>
     * @param    webhookId    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void update(
                final UUID webhookId,
                final String contentType,
                final UpdateRequest body
    ) throws Throwable {
        APICallBackCatcher<Object> callback = new APICallBackCatcher<Object>();
        updateAsync(webhookId, contentType, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        callback.getResult();
    }

    /**
     * This will update a webhook and returned the updated Webhook. 
     * you can update all the attributes individually or together.
     * PS : the new value will override the previous one.
     * ### Parameters
     * + same parameters rules as create webhook apply
     *  a **Response 404 is returned when** :
     *     <ul>
     *      <li>there is no webhook with this `webhookId` </li>
     *     </ul>   
     *  a **Response 400 is returned when** :
     *     <ul>
     *       <li>all attributes are null </li>
     *      <li>events array is empty </li>
     *      <li>content-Type is set in the headers instead of using the `encoding` attribute  </li>
     *     </ul>
     * @param    webhookId    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void updateAsync(
                final UUID webhookId,
                final String contentType,
                final UpdateRequest body,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/v1/webooks/messages/{webhookId}");

                //process template parameters
                APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
                    private static final long serialVersionUID = 5373099528512404239L;
                    {
                        put( "webhookId", webhookId );
                    }});
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 4786471210291466190L;
                    {
                        put( "Content-Type", contentType );
                        put( "user-agent", "messagesmedia-webhooks" );
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

}