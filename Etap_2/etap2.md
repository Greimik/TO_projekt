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



## Przypisy

 <sup>1</sup> Myers G., Projektowanie niezawodnego oprogramowania, Wyd
Techniczne, Warszawa 1980.  
<sup>2</sup> ISTQB – Certified Tester, Foundation Level Syllabus, International Software Testing
Qualifications Board, 2011.  
<sup>3</sup> Adam Roman, Testowanie i jakość oprogramowania, Wyd Wydawnictwo Naukowe PWN, Warszawa 2015