
********* Reflektion kring Multifrabriken AB *********

Anledningen till att jag valt att använda flera klasser är dels för att uppgiften kräver det men 
också för att det är väldigt logiskt. Jag har gjort en fabrik som säljer saker och varje sak är sin
egen så därför har jag olika klasser för godis, rör, havremjölk och bilar.

Jag har även en klass, Order.java, för att lägga till saker i "kundkorgen". Dessa handlingar 
skulle jag kunna stoppa in i varje enskild produkts klass men Order.java är handlingar. 
Handlingen att lägga till ett rör är inte samma sak som ett rör etc, så därför valde jag att använda 
en ny klass. De saker som har lagts ner i kundkorgen är förvisso saker men de är mer saker som tillhör 
just den kundkorgen så därför har jag alla ArrayLists<>() där.

Order.java har fyra olika addItem()-metoder. Dessa metoder skulle jag kunna bryta upp och kalla 
ex addPipe() osv, men det skulle inte vara optimalt. Anledningen till att addItem() är en bättre lösning är 
för att jag senare i App.java lättare ska kunna förstå vad det är som händer utan att behöva gå in i varje 
enskilld add-metod och lära mig den. Det räcker med att jag, eller framförallt mina framtida kollegor, förstår 
vad en gör så har jag väldigt bra koll på vad resten gör.

Jag är inte helt nöjd med min lösning att använda fyra listor. Jag ville ha en lista, en lista som samlar 
alla saker som är i kundkorgen för det är just det, EN kundkorg och inte fyra. Jag gjorde försök att få 
en övergripande lista som de andra listorna skulle ligga i. Ursprungslistorna skulle fortfarnade finnas 
så att det lätt skulle gå att få fram allt i de fyra samlade staplar även om det först läggs till en bil sedan 
ett rör för att slutligen läggas till en bil igen. Hade min tanke om den övergripande listan fungerat så 
hade det inte varit ett problem alls.

I App.java har jag även en metod för felmeddelanden, errorMessage(), ifall användaren exempelvis skulle 
skriva en bokstav där det krävs en siffra. Jag valde att göra detta för att visa att jag förstår och kan 
använda DRY-principen. Jag är osäker på om den ligger rätt dock. Den borde kanske ligga i en egen klass för 
den är väldigt egen. Den hör inte till någon annan gruppering så att säga.
