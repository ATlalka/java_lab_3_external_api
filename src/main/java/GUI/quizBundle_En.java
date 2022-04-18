package GUI;

import java.util.ListResourceBundle;

public class quizBundle_En extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"question", "Question:"}, {"submit", "Submit answers"},
                {"answer", "Your answer:"}, {"correct", "Correct answer:"},
                {"contQuestion", "How many countries does"},
                {"countryQuestion", "How many first-level administrative divisions does"},
                {"cityQuestion", "How many residents does"}, {"<city>", "<city>"}, {"<country>", "<country>"},
                {"Africa", "Africa"}, {"Antarctica", "Antarctica"}, {"Asia", "Asia"}, {"Europe", "Europe"},
                {"North America", "North America"}, {"Oceania", "Oceania"}, {"South America", "South America"},
                {"Yes", "Yes"}, {"No", "No"}};
    }
}
