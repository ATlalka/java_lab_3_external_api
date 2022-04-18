package Data.Responses;

import java.util.HashMap;
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
        "currency_code",
        "geoname_id",
        "iso_alpha2",
        "iso_alpha3",
        "name",
        "population"
})
@Generated("jsonschema2pojo")
public class ResponseCountry {

    @JsonProperty("_links")
    private Links links;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("geoname_id")
    private Integer geonameId;
    @JsonProperty("iso_alpha2")
    private String isoAlpha2;
    @JsonProperty("iso_alpha3")
    private String isoAlpha3;
    @JsonProperty("name")
    private String name;
    @JsonProperty("population")
    private Integer population;
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

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("geoname_id")
    public Integer getGeonameId() {
        return geonameId;
    }

    @JsonProperty("geoname_id")
    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    @JsonProperty("iso_alpha2")
    public String getIsoAlpha2() {
        return isoAlpha2;
    }

    @JsonProperty("iso_alpha2")
    public void setIsoAlpha2(String isoAlpha2) {
        this.isoAlpha2 = isoAlpha2;
    }

    @JsonProperty("iso_alpha3")
    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    @JsonProperty("iso_alpha3")
    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
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
