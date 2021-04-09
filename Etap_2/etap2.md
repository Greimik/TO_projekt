# Etap 2

## Testowanie

Testowanie jest zagadnieniem dosyć szerokim zwalszcza w ujęciu świata IT. Już przy samej definicji pojawiają się pewne rozjazdy jak rozumiemy to zagadnienie. Wg Myersa testowanie to "proces wykonywania programu lub systemu z inetencją znajdowania w nim błędów" <sup>1</sup>. 
Definicja niezykle ukierunkowa na konkretny cel jakim jest znalezienie jak największej ilości błędów. Myers pomija w niej inne aspekty testowania takie jak np. budowanie zaufania do systemu, zapobieganie defektom czy też dostarczanie informacji potrzebnych do podejmowania decyzji zaproponowane w sylabusie ISTQB. <sup>2</sup> 
Z drugiej definicji można wysnuć wniosek że testowanie to proces na który składa się wiele czynników. 
Ważnym odnotowania aspektem jest moment wykonywana samych testów. 
W początkowej fazie projektowania systemu nalezy znaleźć możliwie największą liczbę defektów, koszty naprawy takich błędów jest w tym etapie jest najniższy w porówaniu z kolejnymi etapami. 
W końcowym etapie testowania głównym celem może być nabierania zaufania do oprogramowania przez sprawdzenie czy spełnia założone wymagania. 
Koszt naprawy błędu w ramach testów akceptacyjnych jest wg Adama Romana <sup>3</sup> jest trzykrotnie większy niż we wstępnej fazie.

## Zasady testowania

Testowanie opiera się na pewnych zasadach, zaproponowane przez sylabus ISTQB <sup>2</sup> obowiązują one niezaleźnie od zakresu testowania, rodzaju testowanego systemu czy używanych technik.

### Zasada 1. Testowanie ujawnia usterki

Testowanie powinno pokazywać obecność, a nie brak usterek, co niejako jest w kontrze do definicji testowania wspomnianego Myersa. 
Test, którego wynik różni się od oczekiwanego, pokazuje istnienie jakiegoś problemu w kodzie lub dokumentacji. 
Jednakże pozytywny wynik wszystkich testów nie dowodzi poprawności testowanego systemu, ponieważ może istnieć defekt którego nie wykrył żaden przeprowadzony test. 

### Zasada 2. Testowanie gruntowne jest niewykonalne

Druga zasada mówi o przetestowaniu każdego możliwego scenariusza. 
Przetestowania wszystkich kombinacji warunków początkowych i danych wejściowych jest możliwa tylko w trywialnych przypadkach. 
W innych przypadkach nie jest możliwe testowanie gruntowne, czyli testowanie polegające na konstrukcji zestawu testów obejmującego wszystkie możliwe kombinacje wejść i warunków wstępnych. 

### Zasada 3. Wczesne testowanie

Kolejna zasadą testowania jest możliwie jak najwcześniejsze jego rozpoczęcie. 
Czynności związane z przygotowaniem planu testów oraz przypadków testowych powstają już na etapie analizy wymagań, gdy nie została jeszcze napisana ani jedna linia kodu. 
Tak wczesne rozpoczęcie procesu testowania jest zasadne z dwóch powodów. 
Po pierwsze późniejsze wykrycie defektu jest znacznie bardziej kosztowne niż w początkowej fazie tworzenia oprogramowania. 
Po drugie wczesne testowanie pełni funkcję prewencyjną i pozwala zapobiegać defektom od samego początku.

### Zasada 4. Kumulowanie się błędów

Czwarta zasada mówi o pracochłonności testowania, w poszczególnych modułach systemu. 
Podobnie jak w wielu innych aspektach inżynierii występuje tutaj zasada Pareto (zwaną też zasadą 80/20), która mówi o tym że 20% przyczyn odpowiada za 80% skutków. 
Przenosząc to na środowisko testerski można powiedzieć że 80% defektów pochodzi z 20% modułów systemu. 
Dlatego uwazne monitorowanie i kontrolowanie procesu testowania pozwala na zlokalizowanie potencjalnych źródeł defektów.

### Zasada 5. Paradoks pestycydów

Paradoks ten polega na stosowaniu pestycydów w celu eliminacji szkodniów co może w rezultacie zwiększych ich obfitość. 
W programowaniu paradoks ten odnosi sie bardziej do udoparniania się kodu na testy. 
Mianowicie te same testy wykonywane cały czas bez zmian, stają się coraz mniej skuteczne w znajdywaniu usterek. 
Leakrstwem na ten paradoks jest regularny audyt przypadków testowych.

### Zasada 6. Testowanie zależy od kontekstu

Należy zawsze dostosowywac odpowiednie techniki przeprowadzania testów do danego testowanego systemu. 
Z racji mnogości czynników warunkujących działanie systemu, nie można każdego systemu testować w taki sam sposób. 
Inaczej będzie testowana gra komputerowa czy aplikacja sklepu internetowego a inaczej system zarządzający turbinami w elektrociepłowniach. 
Aby testowanie był efektywne, zawsze musi być "szyte na miarę".

### Zasada 7. Fałszywe przekonanie o braku błędów

Ostattnia z zasad zamieszczonych w sylabusie ISTQB zaznacza inną odpowiedzialnośc procesu testowania. 
Testowanie samo w sobie jest obecne w sferze technicznej przynajmniej w początkowych fazach testowania. 
Wychodzi z tej sfery w końcowych etapach testowania np. w testowaniu akceptacyjnym. 
Wówczas to klient/uzytkownik danego systemu sprawdza czy system działa wg jego wymagań. 
Takie testy odpowiadają na pytanie czy system nadaje się do uzytku czy może jest tylko kulą spowalniającą pracę. 
W takiej sytuacji metryki testowania przestają mieć znaczenie, ponieważ dla uzytkownika ten system jest bezużyteczny.


## Poziomy testów

Testowanie zawsze odbywa się w określonym cyklu zycia oprogramowania. Wymienione poniżej typy testów odnoszą się do faz wytwarzania oprogramowania. 
Nalezy pamiętąc że poziomy testów mogą różnić się w zależności od projektu i specyfiki danego systemu. 
Te które opisałem są najbardziej typowymi i można je znaleźć na większości projektów.

### Testowanie jednostkowe

Testowanie jednostkowe (testy modułowe) opiera się na testowaniu możliwie najmniejszej jednostce systemu (moduł, kalsa, funkcja), którą można testować w izolacji od innych jednostek. 
Ze względu na fakt że głównie testy jednostkowe piszą programiści (z wykorzystaniem narzedzi takich jak np. JUnit) mogą one być nie do końca miarodajne co może wynikać np. ze stosunku programisty do napisanego kodu. 
Tester nie posiada takiej relacji więc jego testy mogą być bardziej wiarygodne. 
Testy modułowe idealnie nadają się do stosowania w podejściu Test Driven development (TDD). 
Testowanie jednostkowe jest wykonywane bez stosowania formalnego procesu zarządzania usterkami. 
Podczas wykonywania testów jednostkowych wykorzystuje się odpowiednie środowisko, w którym moduł może być przetestowany w izolacji od pozostałych cześci systemu. 
Środowiska takie umożliwiają również automatyczne wykonywanie testów (lub ich zestawów) i w graficzny sposób pokazuje odsetek zdanych testów oraz stopień pokrycia kodu.

### Testowanie integracyjne

Testowanie integracyjne to testowanie wykonywane w celu wykrycia defektów podczas interakcji między komponentami lub systemami. 
Jest to niejako przeniesienie testowania na wyższy poziom abstrakcji systemu. 
W takim testowaniu nie koniecznie muszą być testowane integracje z innnymi (zewnętrznymi) systemami ale również integracja z innym modułem lub nawet metodą. 
W takiej zależności możemy mówić o testach małej lub dużej skali  integracji. 
Integracja małej skali dotyczy łączenia ze sobą "małych" elementów oprogramowania jak metody czy klasy. Integracja dużej skali polega na łączeniu ze sobą większych elementów, takich jak całe programy lub systemu. 
Podstawą do testów integracyjnych jest projekt architektury systemu oraz opis przepływu procesów. 
W przypadku dużej integracji podstawą testów mogą być także przypadki użycia. 
Waznym elementem tego typu testowania jest również konfiguracja. Konfiguracja różnych ustawień systemowych może mieć wpływ na działanie wszystkich modułów wchodzących w skłąd aplikacji. 
Podczas testowania integracyjnego testerzy powinni skupiac się wyłącznie na aspekcie współdziałania testowanych komponentów, np. na testowaniu interfejsu. 
Na tym etapie testowania nie interesuje nas poprawnośc funkcjonalności każdego z modułów z osobna.

### Testowanie systemowe

Testowanie systemowe rozpoczyna się wtedy kiedy poszczególne elementy danego systemu zostały już ze sobą zintegrowane w spójny działający system. 
Jest to jeszcze wyższy poziom testowania niż testowanie integracyjne, pozwaljące na sprawdzenie wysokopoziomej funkcjonalności systemu od momentu zalogowania sie do niego po zakończenie pracy (nazywane też testami end-to-end). 
Zadaniem testowania systemowego jest porownanie stworzonego programu/systemu z jego pierwotnymi celami projektowymi (wymaganiami biznesowymi). 
Podstawe w takich testach stanowią więc wymagania systemowe, przypadki użycia, specyfikacja funkcjonalna oraz specyfikacja procesów biznesowych realizowanych przez system. 
Obiektami testowanymi są wówczas: sam sytem, podręczniki systemowe, dokumentacja użytkowa a także konfiguracja systemu. 
Należy pamiętać że testy systemowe powinny być przeprowadzane na środowisku bliżniaczym do środowiska produkcyjnego.

### Testowanie akceptacyjne

Testowanie akceptacyjne jest wykonywane w momecie kiedy system jest już gotowy. 
Wykonują te testy klienci/użytkownicy zaintalowanego programu. 
Głównym celem testowania akceptacyjnego nie jest znajdywanie usterek (chodź same usterki mogą się na tym etapie pojawić). 
Wiekszość z nich powinna zostać wykryta na wczesniejszych etapach.
Testowanie akceptacyjne powinno służyć przedewszystkim do nabrania zaufania do systemu lub jego atrybutów niefunkcjonalnych. 
Jest to forma walidacji, czyli potwierdzenia że produkt spełnia oczekiwania klienta. 
Ocenie podelgają wówczas zaróno aspekty funkcjonalne (co system robi) jak i niefunkcjonalne (jak system pracuje). 
Wyniki takich testów mogą mieć formę kwestionariuszy bądź ankiet. 
Nalezy jednak pamiętać że to użytkownicy systemu przeprowadzające ten rodzaj testów, przez co mogą niewiedzieć jak zgłosić napotkany defekt. 
W takiej sytuacji warto jest rozważyć zastosowanie odpowiedniej techniki do rejestracji błędu lub np. nagrywać akcje wykonywane przez uzytkownika. 
Dzięki takim technikom programiści łatwiej zreprodukują błąd i w konsekwencji naprawią go. 
Drugą rzeczą wartą wspomnienia jest koszt naprawy defektu wykrytego na tym etapie testowania, bowiem jest on znacznie większy niż na wcześniejszych poziomach testowania.

## Przypisy

 <sup>1</sup> Myers G., Projektowanie niezawodnego oprogramowania, Wyd
Techniczne, Warszawa 1980.  
<sup>2</sup> ISTQB – Certified Tester, Foundation Level Syllabus, International Software Testing
Qualifications Board, 2011.  
<sup>3</sup> Adam Roman, Testowanie i jakość oprogramowania, Wyd Wydawnictwo Naukowe PWN, Warszawa 2015