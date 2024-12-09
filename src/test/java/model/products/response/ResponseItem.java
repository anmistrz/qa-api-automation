package model.products.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseItem {
    @JsonProperty("id")
    public int id;

    @JsonProperty("title")
    public String title;
}
