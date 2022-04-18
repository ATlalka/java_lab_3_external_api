package API;

//import Data.Responses.ResponseAllContinents;

import Data.AllContinents.ContinentItem;
import Data.AllCountries.CountryItem;
import Data.Responses.*;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ClientAPI implements IClientAPI {

    ArrayList<ContinentItem> continents;

    ArrayList<CountryItem> countries;

    public ClientAPI() {
        continents = getAllContinents();
        countries = getAllCountries();
    }

    public int getCityPopulation(String cityName) {

        return getCity(cityName).getPopulation();

    }

    public ArrayList<CountryItem> getCountries() {
        return countries;
    }

    public ArrayList<ContinentItem> getContinents() {
        return continents;
    }

    public int getCountryNumberOfA1(String countryName) {
        return getCountryA1(countryName).getCount();
    }

    public int getContinentNumberOfCountries(String chosenContinent) {
        return getContinent(chosenContinent).getCount();
    }

    @Override
    public ArrayList<CountryItem> getCountriesByContinent(String continent) {

        return null;
    }

    @Override
    public ArrayList<ContinentItem> getAllContinents() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.teleport.org/api/continents/"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("continent:items", "continentItems");
            ResponseAllContinents x = g.fromJson(formatJson, ResponseAllContinents.class);

            return (ArrayList<ContinentItem>) x.getLinks().getContinentItems();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResponseContinent getContinent(String continentName) {
        ContinentItem continentItem = null;

        for (ContinentItem c : continents) {
            if (c.getName().equals(continentName)) {
                continentItem = c;
                break;
            }
        }

        if (continentItem != null) {
            String code = continentItem.getHref().substring(continentItem.getHref().length() - 3, continentItem.getHref().length() - 1);

            String uri = "https://api.teleport.org/api/continents/geonames%3A" + code + "/countries/";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response;

            try {
                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

                Gson g = new Gson();

                String formatJson = response.body();
                formatJson = formatJson.replace("_links", "links");
                formatJson = formatJson.replace("country:items", "countryItems");

                ResponseContinent x = g.fromJson(formatJson, ResponseContinent.class);

                return x;

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public ArrayList<CountryItem> getAllCountries() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.teleport.org/api/countries/"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("country:items", "countryItems");
            ResponseAllCountries x = g.fromJson(formatJson, ResponseAllCountries.class);

            return (ArrayList<CountryItem>) x.getLinks().getCountryItems();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ResponseCountry getCountry(String countryName) {
        String code = "";

        for (CountryItem c : countries) {
            if (c.getName().equals(countryName)) {
                code = c.getHref().substring(c.getHref().length() - 3, c.getHref().length() - 1);
                break;
            }
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.teleport.org/api/countries/iso_alpha2%3A" + code + "/"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("country:admin1_divisions", "countryAdmin1Divisions");
            formatJson = formatJson.replace("country:continent", "countryContinent");
            formatJson = formatJson.replace("country:salaries", "countrySalaries");
            ResponseCountry x = g.fromJson(formatJson, ResponseCountry.class);

            return x;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ResponseCountryA1 getCountryA1(String countryName) {
        String code = "";

        for (CountryItem c : countries) {
            if (c.getName().equals(countryName)) {
                code = c.getHref().substring(c.getHref().length() - 3, c.getHref().length() - 1);
                break;
            }
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.teleport.org/api/countries/iso_alpha2%3A" + code + "/admin1_divisions/"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("a1:country", "a1Country");
            formatJson = formatJson.replace("a1:items", "a1Items");
            ResponseCountryA1 respo = g.fromJson(formatJson, ResponseCountryA1.class);

            return respo;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ResponseCities getCities(String cityName) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.teleport.org/api/cities/?search=" + cityName))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("_embedded", "embedded");
            formatJson = formatJson.replace("city:search-results", "citySearchResults");
            formatJson = formatJson.replace("city:item", "cityItem");
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("matching_alternate_names", "matchingAlternateNames");
            formatJson = formatJson.replace("matching_full_name", "matchingFullName");
            ResponseCities respo = g.fromJson(formatJson, ResponseCities.class);

            return respo;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ResponseCity getCity(String cityName) {

        String href = getCities(cityName).getEmbedded().getCitySearchResults().get(0).getLinks().getCityItem().getHref();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(href))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            Gson g = new Gson();
            String formatJson = response.body();
            formatJson = formatJson.replace("city:admin1_division", "cityAdmin1Division");
            formatJson = formatJson.replace("city:alternate-names", "cityAlternateNames");
            formatJson = formatJson.replace("_links", "links");
            formatJson = formatJson.replace("city:country", "cityCountry");
            formatJson = formatJson.replace("city:timezone", "cityTimezone");
            formatJson = formatJson.replace("city:urban_area", "cityUrbanArea");
            formatJson = formatJson.replace("full_name", "fullName");
            formatJson = formatJson.replace("geoname_id", "geonameId");
            ResponseCity respo = g.fromJson(formatJson, ResponseCity.class);

            return respo;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
