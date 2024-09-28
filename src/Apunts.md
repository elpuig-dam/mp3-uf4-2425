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