/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5255789804836000549L;
    private String url;
    private String method;
    private String encoding;
    private Object headers;
    private List<String> events;
    private String template;
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
     * customized headers.no content Type header because we set it in the encoding attribute. an example belowf
     */
    @JsonGetter("headers")
    public Object getHeaders ( ) { 
        return this.headers;
    }
    
    /** SETTER
     * customized headers.no content Type header because we set it in the encoding attribute. an example belowf
     */
    @JsonSetter("headers")
    public void setHeaders (Object value) { 
        this.headers = value;
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
     * expected template. see doc for possibilitie
     */
    @JsonGetter("template")
    public String getTemplate ( ) { 
        return this.template;
    }
    
    /** SETTER
     * expected template. see doc for possibilitie
     */
    @JsonSetter("template")
    public void setTemplate (String value) { 
        this.template = value;
    }
 
}
 