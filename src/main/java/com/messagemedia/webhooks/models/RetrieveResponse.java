/*
 * MessageMediaWebhooks
 *
 * This file was automatically generated for MessageMedia by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.messagemedia.webhooks.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RetrieveResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5048336400339501333L;
    private int page;
    private int pageSize;
    private List<Object> pageData;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("page")
    public int getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("page")
    public void setPage (int value) { 
        this.page = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pageSize")
    public int getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pageSize")
    public void setPageSize (int value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pageData")
    public List<Object> getPageData ( ) { 
        return this.pageData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pageData")
    public void setPageData (List<Object> value) { 
        this.pageData = value;
    }
 
}
 