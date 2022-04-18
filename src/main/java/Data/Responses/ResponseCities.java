package Data.Responses;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import Data.CitiesByName.Embedded;
import Data.CitiesByName.Links__1;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_embedded",
        "_links",
        "count"
})
@Generated("jsonschema2pojo")
public class ResponseCities {

    @JsonProperty("_embedded")
    private Embedded embedded;
    @JsonProperty("_links")
    private Links__1 links;
    @JsonProperty("count")
    private Integer count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_embedded")
    public Embedded getEmbedded() {
        return embedded;
    }

    @JsonProperty("_embedded")
    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    @JsonProperty("_links")
    public Links__1 getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links__1 links) {
        this.links = links;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}