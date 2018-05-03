/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Headers 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5209925820669987987L;
    private String account;
    /** GETTER
     * Example of
     */
    @JsonGetter("Account")
    public String getAccount ( ) { 
        return this.account;
    }
    
    /** SETTER
     * Example of
     */
    @JsonSetter("Account")
    public void setAccount (String value) { 
        this.account = value;
    }
 
}
 