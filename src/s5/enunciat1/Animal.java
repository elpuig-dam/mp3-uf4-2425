package s5.enunciat1;

abstract class Animal {
    String nom;
    int edat;

    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public abstract void ferSoroll(); // Mètode abstracte que cada animal ha d'implementar

    public void mostrarInformacio() {  // Mètode comú per mostrar informació
        System.out.println("Nom: " + nom + ", Edat: " + edat);
    }
}
