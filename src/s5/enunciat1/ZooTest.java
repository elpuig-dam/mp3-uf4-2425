package s5.enunciat1;

public class ZooTest {
    public static void main(String[] args) {
        Animal ocell = new Ocell("Periquito", 2);
        Animal gos = new Gos("Rex", 5);

        ocell.ferSoroll();
        ocell.mostrarInformacio();

        // Comprovem si l'animal és Volador
        if (ocell instanceof Volador) {
            ((Volador) ocell).volar();
        }
        //podem fer això si instanciem ocell com a Ocell i no com a Animal
        //ocell.volar();

        gos.ferSoroll();
        gos.mostrarInformacio();
    }
}

/**
 * Explicació de la solució:
 *
 * abstract class Animal: S'utilitza una classe abstracta per representar els animals,
 * ja que tots comparteixen comportaments com el nom, l'edat i el fet de fer soroll.
 * Cada tipus d'animal ha d'implementar el mètode ferSoroll(),
 * però tenen un comportament comú per a mostrarInformacio().
 *
 * interface Volador: Es fa servir una interfície per representar la capacitat de volar,
 * ja que només alguns animals tenen aquesta característica.
 * Així, només els animals que volen han d'implementar aquest mètode.
 *
 * Incorrecte: Hauria estat incorrecte utilitzar una interfície per a Animal,
 * ja que els animals tenen comportament comú que es pot implementar parcialment
 * en una classe abstracta. A més, no tots els animals poden volar,
 * de manera que la interfície Volador s'aplica només a aquells que tenen aquesta capacitat.
 */
