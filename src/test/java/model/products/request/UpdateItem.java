package model.products.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateItem {

    @JsonProperty("title")
    public String title;

}
