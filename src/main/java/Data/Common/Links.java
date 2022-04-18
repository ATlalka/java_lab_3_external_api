package Data.Common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Data.AllContinents.ContinentItem;
import Data.AllCountries.CountryItem;
import Data.CitiesById.*;
import Data.CitiesByName.CityItem;
import Data.CountriesAdmin1Divisions.A1Country;
import Data.CountriesAdmin1Divisions.A1Item;
import Data.CountriesById.CountryAdmin1Divisions;
import Data.CountriesById.CountryContinent;
import Data.CountriesById.CountrySalaries;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city:admin1_division",
        "city:alternate-names",
        "city:country",
        "city:timezone",
        "city:urban_area",
        "continent:items",
        "country:admin1_divisions",
        "country:continent",
        "city:item",
        "a1:country",
        "a1:items",
        "country:salaries",
        "country:items",
        "curies",
        "self"
})
@Generated("jsonschema2pojo")
public class Links {

    public List<ContinentItem> getContinentItems() {
        return continentItems;
    }

    public void setContinentItems(List<ContinentItem> continentItems) {
        this.continentItems = continentItems;
    }

    @JsonProperty("city:item")
    private CityItem cityItem;
    @JsonProperty("a1:country")
    private A1Country a1Country;
    @JsonProperty("a1:items")
    private List<A1Item> a1Items = null;
    @JsonProperty("country:admin1_divisions")
    private CountryAdmin1Divisions countryAdmin1Divisions;
    @JsonProperty("country:continent")
    private CountryContinent countryContinent;
    @JsonProperty("country:salaries")
    private CountrySalaries countrySalaries;
    @JsonProperty("continent:items")
    private List<ContinentItem> continentItems = null;
    @JsonProperty("country:items")
    private List<CountryItem> countryItems ;
    @JsonProperty("curies")
    private List<Cury> curies;
    @JsonProperty("self")
    private Self self;
    @JsonProperty("city:admin1_division")
    private CityAdmin1Division cityAdmin1Division;
    @JsonProperty("city:alternate-names")
    private CityAlternateNames cityAlternateNames;
    @JsonProperty("city:country")
    private CityCountry cityCountry;
    @JsonProperty("city:timezone")
    private CityTimezone cityTimezone;
    @JsonProperty("city:urban_area")
    private CityUrbanArea cityUrbanArea;



    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city:admin1_division")
    public CityAdmin1Division getCityAdmin1Division() {
        return cityAdmin1Division;
    }

    @JsonProperty("city:admin1_division")
    public void setCityAdmin1Division(CityAdmin1Division cityAdmin1Division) {
        this.cityAdmin1Division = cityAdmin1Division;
    }

    @JsonProperty("city:alternate-names")
    public CityAlternateNames getCityAlternateNames() {
        return cityAlternateNames;
    }

    @JsonProperty("city:alternate-names")
    public void setCityAlternateNames(CityAlternateNames cityAlternateNames) {
        this.cityAlternateNames = cityAlternateNames;
    }

    @JsonProperty("city:country")
    public CityCountry getCityCountry() {
        return cityCountry;
    }

    @JsonProperty("city:country")
    public void setCityCountry(CityCountry cityCountry) {
        this.cityCountry = cityCountry;
    }

    @JsonProperty("city:timezone")
    public CityTimezone getCityTimezone() {
        return cityTimezone;
    }

    @JsonProperty("city:timezone")
    public void setCityTimezone(CityTimezone cityTimezone) {
        this.cityTimezone = cityTimezone;
    }

    @JsonProperty("city:urban_area")
    public CityUrbanArea getCityUrbanArea() {
        return cityUrbanArea;
    }

    @JsonProperty("city:urban_area")
    public void setCityUrbanArea(CityUrbanArea cityUrbanArea) {
        this.cityUrbanArea = cityUrbanArea;
    }


    @JsonProperty("city:item")
    public CityItem getCityItem() {
        return cityItem;
    }

    @JsonProperty("city:item")
    public void setCityItem(CityItem cityItem) {
        this.cityItem = cityItem;
    }

    @JsonProperty("a1:country")
    public A1Country getA1Country() {
        return a1Country;
    }

    @JsonProperty("a1:country")
    public void setA1Country(A1Country a1Country) {
        this.a1Country = a1Country;
    }

    @JsonProperty("a1:items")
    public List<A1Item> getA1Items() {
        return a1Items;
    }

    @JsonProperty("a1:items")
    public void setA1Items(List<A1Item> a1Items) {
        this.a1Items = a1Items;
    }
    @JsonProperty("country:admin1_divisions")
    public CountryAdmin1Divisions getCountryAdmin1Divisions() {
        return countryAdmin1Divisions;
    }

    @JsonProperty("country:admin1_divisions")
    public void setCountryAdmin1Divisions(CountryAdmin1Divisions countryAdmin1Divisions) {
        this.countryAdmin1Divisions = countryAdmin1Divisions;
    }

    @JsonProperty("country:continent")
    public CountryContinent getCountryContinent() {
        return countryContinent;
    }

    @JsonProperty("country:continent")
    public void setCountryContinent(CountryContinent countryContinent) {
        this.countryContinent = countryContinent;
    }

    @JsonProperty("country:salaries")
    public CountrySalaries getCountrySalaries() {
        return countrySalaries;
    }

    @JsonProperty("country:salaries")
    public void setCountrySalaries(CountrySalaries countrySalaries) {
        this.countrySalaries = countrySalaries;
    }

    @JsonProperty("country:items")
    public List<CountryItem> getCountryItems() {
        return countryItems;
    }

    @JsonProperty("country:items")
    public void setCountryItems(List<CountryItem> countryItems) {
        this.countryItems = countryItems;
    }

    @JsonProperty("curies")
    public List<Cury> getCuries() {
        return curies;
    }

    @JsonProperty("curies")
    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
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