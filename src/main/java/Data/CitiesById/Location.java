package Data.CitiesById;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "geohash",
        "latlon"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("geohash")
    private String geohash;
    @JsonProperty("latlon")
    private Latlon latlon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geohash")
    public String getGeohash() {
        return geohash;
    }

    @JsonProperty("geohash")
    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    @JsonProperty("latlon")
    public Latlon getLatlon() {
        return latlon;
    }

    @JsonProperty("latlon")
    public void setLatlon(Latlon latlon) {
        this.latlon = latlon;
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
