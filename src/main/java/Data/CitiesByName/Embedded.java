package Data.CitiesByName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import Data.CitiesByName.CitySearchResult;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city:search-results"
})
@Generated("jsonschema2pojo")
public class Embedded {

    @JsonProperty("city:search-results")
    private List<CitySearchResult> citySearchResults = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city:search-results")
    public List<CitySearchResult> getCitySearchResults() {
        return citySearchResults;
    }

    @JsonProperty("city:search-results")
    public void setCitySearchResults(List<CitySearchResult> citySearchResults) {
        this.citySearchResults = citySearchResults;
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