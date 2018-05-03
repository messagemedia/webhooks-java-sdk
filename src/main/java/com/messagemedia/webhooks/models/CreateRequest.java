/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4652797436069613671L;
    private String url;
    private String method;
    private String encoding;
    private List<String> events;
    private String template;
    private Headers headers;
    /** GETTER
     * target for the webhook. http and https are authorized
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * target for the webhook. http and https are authorized
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * authorized webhook methods  :  GET, POST, PUT, DELETE, PATCH
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * authorized webhook methods  :  GET, POST, PUT, DELETE, PATCH
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * JSON, FORM_ENCODED, XML
     */
    @JsonGetter("encoding")
    public String getEncoding ( ) { 
        return this.encoding;
    }
    
    /** SETTER
     * JSON, FORM_ENCODED, XML
     */
    @JsonSetter("encoding")
    public void setEncoding (String value) { 
        this.encoding = value;
    }
 
    /** GETTER
     * list of events we want to suscribe to. see docs
     */
    @JsonGetter("events")
    public List<String> getEvents ( ) { 
        return this.events;
    }
    
    /** SETTER
     * list of events we want to suscribe to. see docs
     */
    @JsonSetter("events")
    public void setEvents (List<String> value) { 
        this.events = value;
    }
 
    /** GETTER
     * expected template. see doc for possibilities
     */
    @JsonGetter("template")
    public String getTemplate ( ) { 
        return this.template;
    }
    
    /** SETTER
     * expected template. see doc for possibilities
     */
    @JsonSetter("template")
    public void setTemplate (String value) { 
        this.template = value;
    }
 
    /** GETTER
     * customized headers.no content Type header because we set it in the encoding attribute. an example below
     */
    @JsonGetter("headers")
    public Headers getHeaders ( ) { 
        return this.headers;
    }
    
    /** SETTER
     * customized headers.no content Type header because we set it in the encoding attribute. an example below
     */
    @JsonSetter("headers")
    public void setHeaders (Headers value) { 
        this.headers = value;
    }
 
}
 