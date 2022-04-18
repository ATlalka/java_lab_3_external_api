package API;

import Data.AllContinents.ContinentItem;
import Data.AllCountries.CountryItem;
import Data.Responses.*;

import java.util.ArrayList;

public interface IClientAPI {

    public ArrayList<CountryItem> getCountriesByContinent(String continent);

    public ArrayList<ContinentItem> getAllContinents();

    public ResponseContinent getContinent(String continentName);

    public ArrayList<CountryItem> getAllCountries();

    public ResponseCountry getCountry(String countryName);

    public ResponseCountryA1 getCountryA1 (String countryName);

    public ResponseCities getCities(String cityName);

    public ResponseCity getCity(String cityName);
}
