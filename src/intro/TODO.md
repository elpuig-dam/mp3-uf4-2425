## Tasques

### Activitat 1: Variables de Tipus Primitiva en Java

**Instruccions:**
1. **Definicions:** Llegeix la documentació sobre els tipus primitius en Java (byte, short, int, long, float, double, char
2. **Declaració de Variables:** Escriu un programa Java que declari una variable de cada tipus primitiu i les inicialitzi amb un valor apropiat.
3. **Conversió de Tipus:** Escriu un fragment de codi que mostri com convertir una variable de tipus int a double i viceversa. Explica els resultats obtinguts.

### Activitat 2: Operacions amb Números en Java

**Instruccions:**
1. **Operacions Bàsiques:** Escriu un programa que realitzi i mostri el resultat de les operacions següents amb dos números enters (suma, resta, multiplicació, divisió, mòdul).
2. **Operacions amb números en punt flotant:** Escriu un fragment de codi que realitzi operacions amb números de tipus float i double. Comenta sobre qualsevol diferència observada.
3. **Constants i Màxims/Mínims:** Utilitza les constants de la classe usada per obtenir el valor màxim i mínim d'un `int` i d'un `double`. Mostra aquests valors al teu programa.
4. Perquè creus que et pot servir obtenir el mínim i el màxim d'un int o un double?

### Activitat 3: format i printf en Java

**Objectiu:** Avaluar la comprensió dels alumnes sobre l'ús de les funcions `format` i `printf` per a la sortida formatada en Java, especificant formats més concrets per a números.

**Instruccions:**
1. **Format String:** Escriu un programa que declari variables de tipus `float`, `int` i `String`. Utilitza la funció `format` per mostrar aquestes variables en una cadena de text,
   especificant formats adequats amb 3 decimals amb i sense signe, amb separador de milers i zeros a l'esquerra.
2. **Flags i Especificadors:** Escriu un programa que utilitzi diverses combinacions de flags i especificadors amb `printf` per mostrar les variables amb diferents formats. Comenta cada línia de codi explicant què fa cada flag i especificador.


### Activitat 4: args

**Instruccions:**
1. **args:** Escriu un programa que mostri com passar-li arguments i com usar-los des del codi.
2. Executa'l des del terminal amb diferents arguments i comprova com es comporta el programa.
```bash 
#single file excecution
  java ArgsTest.java arg1 arg2 arg3
  ````
```bash 
#compiling and executing
  java -cp out/production/mp3-uf4-2425/ intro.ArgsTest arg1 arg2 arg3
```
<hr>

### Activitat 45 Disseny OO

**Objectiu:**

Desenvolupar un programa en Java que modelitzi un banc amb diferents tipus de comptes corrents (estalvi, corrent, etc.)
i les operacions habituals sobre ells. El programa utilitzarà classes abstractes i subclasses per a representar la jerarquia
de classes dels comptes corrents.

**Reqüisits:**

- Crear una classe abstracta `CompteCorrent` que defineixi els atributs comuns a tots els tipus de comptes (número de compte, saldo)
  i els mètodes per ingressar i retirar diners.
- Implementar subclasses de CompteCorrent per a representar els diferents tipus de comptes: CompteEstalvi, CompteCorrent, etc.
  Cada subclasse pot tenir atributs i mètodes addicionals específics del tipus de compte:
   - Tipus d'interès diferent per cada subtipus de compte
- Crear una classe Banc que gestioni la col·lecció de comptes corrents del banc. La classe Banc ha de permetre:
   - Alta de nous comptes
   - Eliminació de comptes existents
   - Consulta del saldo d'un compte
   - Realització d'ingressos i reintegraments en un compte
   - Tenir un registre de les transaccions realitzades en cada compte
- Implementar un menú principal que permeti a l'usuari realitzar les operacions bàsiques sobre els comptes corrents del banc.
