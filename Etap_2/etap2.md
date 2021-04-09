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





## Przypisy

 <sup>1</sup> Myers G., Projektowanie niezawodnego oprogramowania, Wyd
Techniczne, Warszawa 1980.  
<sup>2</sup> ISTQB – Certified Tester, Foundation Level Syllabus, International Software Testing
Qualifications Board, 2011.  
<sup>3</sup> Adam Roman, Testowanie i jakość oprogramowania, Wyd Wydawnictwo Naukowe PWN, Warszawa 2015