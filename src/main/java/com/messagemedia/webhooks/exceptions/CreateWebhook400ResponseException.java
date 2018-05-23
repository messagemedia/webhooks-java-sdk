/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.messagemedia.webhooks.http.client.HttpContext;

public class CreateWebhook400ResponseException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5488053487431467768L;
    private String message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    private void setMessage (String value) { 
        this.message = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public CreateWebhook400ResponseException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 