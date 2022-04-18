package GUI;

import java.util.ListResourceBundle;

public class quizBundle_Pl extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"question", "Pytanie:"}, {"submit", "Zatwierdź odpowiedzi"},
                {"answer", "Twoja odpowiedź:"}, {"correct", "Poprawna odpowiedź:"},
                {"contQuestion", "Ile krajów ma"},
                {"countryQuestion", "Ile jednostek administracyjnych pierwszego stopnia ma"},
                {"cityQuestion", "Ile mieszkańców ma"}, {"<city>", "<miasto>"}, {"<country>", "<kraj>"},
                {"Africa", "Afryka"}, {"Antarctica", "Antarktyda"}, {"Asia", "Azja"}, {"Europe", "Europa"},
                {"North America", "Ameryka Północna"}, {"Oceania", "Oceania"}, {"South America", "Ameryka Południowa"},
                {"Yes","Tak"},{"No", "Nie"}};
    }
}
