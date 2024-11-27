### Exemples Open/Close Principle

#### Exemple 1
Implementa una aplicació que gestioni diferents tipus de vehicles i calculi el cost del manteniment anual  
per a cada tipus de vehicle. Seguint el principi Open/Close de SOLID, 
la classe base Vehicle ha d'estar oberta a l'extensió però tancada a la modificació.  
Això significa que hauràs de crear subclasses per a cada tipus de vehicle i implementar el mètode de càlcul del cost  
de manteniment de manera específica per a cada tipus.  

Requisits:  
 - Crea una classe abstracta __Vehicle__ amb els següents atributs i mètodes: 
 - Atributs: __marca, model, any__
 - Mètode específic: __calcularCostManteniment()__
 - Mètode comú: __mostrarInformacio()__

Crea subclasses per a diferents tipus de vehicles, com ara Cotxe, Moto i Camio, que extenguin la classe Vehicle i  
implementin el mètode calcularCostManteniment() de manera específica per a cada tipus de vehicle.  
Implementa una classe Main que creï instàncies de diferents tipus de vehicles i mostri la informació i el cost de  
manteniment anual per a cada vehicle.  

<hr>

#### Exemple 2  :  Carret de la compra

Una important empresa de supermercats us demana que li dissenyeu una aplicació revolucionaria!  
Consisteix en fer que el carro de la compra mostri, en temps real, el preu dels productes que s'hi van introduint.  
L'empresa us indica que l'aplicació, de moment, només ha de permetre gestionar les dades d'uns quants dels seus productes:  
alimentació, tèxtil i electrònica.   
Aquests productes tenen unes característiques comuns (preu, nom i codi de barres) i un conjunt de característiques  
específiques de cada tipus de producte: 
 - __Alimentació__: data de caducitat.  
   - El preu d'aquest tipus de producte varia en funció dels dies que falten per caducar, segons la fórmula:ç 
     -      preu - preu*(1/(dataCaducitat-dataActual+1)) + (preu * 0.1)
 - __Tèxtil__: composició tèxtil (text)  
 - __Electrònica__: dies de garantia (numèric)  
   - El preu d'aquest tipus de producte varia en funció dels dies que té de garantia segons la fórmula:
     -      preu + preu*(diesGarantia/365)*0.1
     
L'aplicació que heu de fer ha de permetre emmagatzemar tots els productes que s'hi van introduint (màxim 100 productes)  
i calcular-ne el preu. També ha de permetre que, en passar per caixa, es generi el tiquet de compra i es buidi el carro.
Com que això de la programació orientada a objectes és una metodologia que té molts avantatges, heu decidit programar-ho en Java.

##### Es demana 

   Fer un programa principal que faci ús de les classes dissenyades. El programa ha de tenir un menú d'opcions com el següent,
   i fer el que es descriu a continuació:
   1. __Introduir producte__: En escollir aquesta opció s'ha de mostrar un altre
      menú d'opcions: Quin tipus de producte vols afegir?  
      2. __Alimentació__: En escollir aquesta opció s'ha de demanar que
         s'entri per teclat les dades d'un producte del tipus Alimentació  
      3. __Tèxtil__: En escollir aquesta opció s'ha de demanar que s'entri
         per teclat les dades d'un producte del tipus Tèxtil  
      4. __Electrònica__: En escollir aquesta opció s'ha de demanar que
         s'entri per teclat les dades d'un producte del tipus Electrònica  
      5. __Tornar__: En escollir aquesta opció s'ha de tornar al menú principal  
      
    Us podeu saltar aquest punt i hardcodejar les dades dels productes per a fer proves.
      
   2. __Passar per caixa__: En escollir aquesta opció se simula que es passen tots els productes per caixa i es genera el tiquet. 
      El tiquet (es mostra per pantalla) ha de mostrar una capçalera amb: data de la compra i nom del supermercat. A continuació es
      mostra el detall amb: nom del producte, unitats introduïdes al carro, preu unitari i preu total. Finalment ha de calcular la suma
      total a pagar.  
      __Si s'han introduït dos productes iguals (tenen el mateix codi de barres i el mateix preu unitari) només es mostrarà una
      vegada, amb la quantitat total d'aquell producte, és a dir, les unitats.__
      Aquesta opció també implica buidar el carro de la compra.
   
   3. __Mostrar carro de la compra__: En escollir aquesta opció es mostra un llistat amb la descripció i quantitat de cada producte (sense preu) que hi
      ha dins el carro del a compra.  
     __En aquest cas, si hi ha productes repetits ho seran si tenen el mateix codi de barres (no cal mirar el
     preu unitari).__
   
   4. __Sortir__: En escollir aquesta opció es tanca l'aplicació.