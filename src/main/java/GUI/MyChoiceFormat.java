package GUI;

import java.text.ChoiceFormat;

public class MyChoiceFormat {

    final static double[] limitsCountries = {1, 2, 3, 4, 5};
    final static String[] formatsCountries = {"country", "countries", "kraj", "kraje", "krajów"};
    final static ChoiceFormat fmtCountries = new ChoiceFormat(limitsCountries, formatsCountries);

    final static double[] limitsDivisions = {1, 2, 3, 4, 5};
    final static String[] formatsDivisions = {"1. level administrative division", "1. level administrative divisions", "jednostka administracyjna 1. stopnia", "jednostki administracyjne 1. stopnia", "jednostek administracyjnych 1. stopnia"};
    final static ChoiceFormat fmtDivisions = new ChoiceFormat(limitsDivisions, formatsDivisions);

    public static String getCountriesEn(int number) {
        if (number > 1)
            return fmtCountries.format(2);

        else
            return fmtCountries.format(1);

    }

    public static String getDivisionsEn(int number) {
        if (number > 1)
            return fmtDivisions.format(2);

        else
            return fmtDivisions.format(1);

    }

    public static String getCountriesPl(int number) {
        if ((number % 10 >= 2 && number % 10 <= 4 && number != 14 && number != 12 && number != 13))
            return fmtCountries.format(4);
        else if (number == 1)
            return fmtCountries.format(3);
        else
            return fmtCountries.format(5);
    }

    public static String getDivisionsPl(int number) {
        if ((number % 10 >= 2 && number % 10 <= 4 && number != 14 && number != 12 && number != 13))
            return fmtDivisions.format(4);
        else if (number == 1)
            return fmtDivisions.format(3);
        else
            return fmtDivisions.format(5);
    }

}
