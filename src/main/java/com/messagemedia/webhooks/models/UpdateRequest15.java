/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateRequest15 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5333748985967981660L;
    private String url;
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
 