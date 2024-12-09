package model.products.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItem {

    @JsonProperty("title")
    public String title;

}
