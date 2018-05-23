/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateWebhookRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5060809873956640358L;
    private String url;
    private String method;
    private String encoding;
    private List<String> events;
    private String template;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("encoding")
    public String getEncoding ( ) { 
        return this.encoding;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("encoding")
    public void setEncoding (String value) { 
        this.encoding = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("events")
    public List<String> getEvents ( ) { 
        return this.events;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("events")
    public void setEvents (List<String> value) { 
        this.events = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("template")
    public String getTemplate ( ) { 
        return this.template;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("template")
    public void setTemplate (String value) { 
        this.template = value;
    }
 
}
 