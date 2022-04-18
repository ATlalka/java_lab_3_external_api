package Data.CitiesByName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import Data.Common.Links;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_links",
        "matching_alternate_names",
        "matching_full_name"
})
@Generated("jsonschema2pojo")
public class CitySearchResult {

    @JsonProperty("_links")
    private Links links;
    @JsonProperty("matching_alternate_names")
    private List<MatchingAlternateName> matchingAlternateNames = null;
    @JsonProperty("matching_full_name")
    private String matchingFullName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("matching_alternate_names")
    public List<MatchingAlternateName> getMatchingAlternateNames() {
        return matchingAlternateNames;
    }

    @JsonProperty("matching_alternate_names")
    public void setMatchingAlternateNames(List<MatchingAlternateName> matchingAlternateNames) {
        this.matchingAlternateNames = matchingAlternateNames;
    }

    @JsonProperty("matching_full_name")
    public String getMatchingFullName() {
        return matchingFullName;
    }

    @JsonProperty("matching_full_name")
    public void setMatchingFullName(String matchingFullName) {
        this.matchingFullName = matchingFullName;
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
