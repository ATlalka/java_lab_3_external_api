# Java lab 3 - zewnętrzne API, bundle, properties
Aplikacja zrobiona w ramach przedmiotu "Programowanie w języku Java - techniki zaawansowane"  
Wykorzystane API:  
*https://developers.teleport.org/api/reference/*


## Treść zadania:

Napisz aplikację, która pozwoli skonsumować dane pozyskiwane z serwisu oferującego publiczne restowe API. Ciekawą listę serwisów można znaleźć pod adresem:
https://rapidapi.com/collection/list-of-free-apis (wymagają klucza API), czy też https://mixedanalytics.com/blog/list-actually-free-open-no-auth-needed-apis/ (te klucza API nie wymagają). W szczególności w tej drugiej grupie istnieje: https://developers.teleport.org/api/reference/. Właśnie to api ma być użyte w aplikacji.

Bazując na nim należy zbudować intefejs użytkownika, który pozwoli na przeprowadzanie testów z wiedzy z geograficznej. Renderowanie zapytań i odpowiedzi powinno być tak zaimplementowane, by dało się zmianić ustawienia językowe (lokalizacji) w oparciu o tzw. bundle (definiowane w plikach i klasach - obie te opcje należy przetestować). Wspierane mają być języki: polski i angielski. 

Proszę zapoznać się z api i zaproponować kilka schematów zapytań i pól odpowiedzi. Niech użytkownik ma możliwość parametryzowania tych zapytania (w miejsce kropek niech wpisywane będą wartości z list wyboru - jeśli da się je pozyskać z serwisu, lub niech będą to wartości wprowadzone wolnym tekstem) oraz ma możliwość zadeklarowanie własnej odpowiedzi. Odpowiedź podana przez użytkownika powinna być zweryfikowana przez aplikację (aplikacja, po wysłaniu zapytania przez api powinna sprawdzić, czy wynik tego zapytania jest zgodny z odpowiedzią udzieloną przez użytkownika).

Na przykład dla szablonu zapytania zapytania: 
    "Ile jednostek administracyjnych poziomu ... istnieje w państwie ...." (w miejsce kropek powinno dać się coś wpisać)
powinno istnieć jedno pole na wpisanie odpowiedzi
    "..."  (miejsce na wpisanie liczby).
oraz linijka weryfikacji, np.:
     "Tak, masz rację. W państwie .... istnieją 3 jednostki podziału administracyjnego poziomu ..." (to ma wypełnić sama aplikacja).

Jak widać na interfejsie użytkownika trzeba obsłużyć odmianę przez liczby. Można do tego zastosować wariantowe pobieranie tekstów z bundli. Do tego przyda się klasa ChoiceFormat. 

Do pozyskiwania danych być może trzeba będzie uruchomić kilka zapytań (patrz np. endpoint: https://api.teleport.org/api/countries/iso_alpha2:PL/admin1_divisions/)
W implementacji do wykorzystania są również klasy z pakietów java.text, java.util.

Proszę zuważyć, że we wskazanym api nie korzysta się z parametru pozwalającego określić język zwracanych danych (niektóre serwisy to umożliwiają, np. atrybutu languageCode jest używany w GeoDB Cities API: https://rapidapi.com/wirefreethought/api/geodb-cities?endpoint=59908d68e4b075a0d1d6d9ac ).

Opcjonalnie można wykorzystać jakieś inne api, jeśli tylko zachowa się przedstawioną wyżej koncepcję (parametryzowane szablony zapytań, do wypełnienia pola odpowiedzi, linijka weryfikacji z odmianą przez liczby/osoby - wszystko przynajmniej z obsługą dwóch języków: polski i angielski). Na przykład może powstać aplikacja testującą wiedzę o muzyce (ile dany kompozytor napisał jakich utworów).

