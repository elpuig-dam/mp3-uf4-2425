## Alguns apunts

### Encapsulament
Aquí tens una taula amb els tipus d'encapsulació en Java i les seves característiques:

| **Modificador d'Accés** | **Classe** | **Paquet** | **Subclasse** | **Món Extern** |
|--------------------------|------------|------------|---------------|----------------|
| **private**               | ✔️         | ❌         | ❌            | ❌             |
| **default** (sense modificador) | ✔️         | ✔️         | ❌            | ❌             |
| **protected**             | ✔️         | ✔️         | ✔️            | ❌             |
| **public**                | ✔️         | ✔️         | ✔️            | ✔️             |

### Explicació:
- **private**: Accessible només dins de la mateixa classe.
- **default** (sense modificador): Accessible dins del mateix paquet.
- **protected**: Accessible dins del mateix paquet i a subclasses fins i tot si estan en un altre paquet.
- **public**: Accessible des de qualsevol lloc.


### Abstract Class

<pre>
1. Pot contenir variables de classe i variables estàtiques
2. Pot contenir mètodes de classe i mètodes estàtics
3. Pot tenir constructors però no es pot cridar donat que no es pot instanciar
4. pot tenir mètodes abstractes
5. Qualsevol classe que tingui algun mètode abstracte farà que la classe sigui abstracta
</pre>

### Interface
<pre>
1. Només pot tenir <b>final static</b> variables
2. Només pot tenir mètodes abstractes (amb algunes excepcions)
3. No pot tenir constructor i per tant no pot ser instanciada
4. Pot heretar d'altres interfaces
5. Una classe pot implementar varies interfaces
6. Es diu que la classe es de tipus NomInterface si aquesta classe implementa a NomInterface
</pre>