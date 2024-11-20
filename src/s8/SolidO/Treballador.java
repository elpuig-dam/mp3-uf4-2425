package s8.SolidO;

/**
 * Exemple per explicar Open/Close Principle
 * Tenim la class Treballador i necessitem diferenciar entre treballador fix o temporal
 * també necessitem fer el càlcul del bonus que li pertoca segons sigui fix o temporal
 * Si modifiquem la class Treballador i afegim una propietat tipus i un mètode per a cada tipus
 * estem violant aquest principi.
 * Tancat a modificar però Obert a extendre
 * Per tant cal crear un mètode abstracte CalcularBonus
 * I per crear un treballador fix tenir una nova classe que extengui de Treballador i que obligui
 * a implementar com serà el càlcul del seu bonus. Igualment amb el treballador temporal.
 */
public abstract class Treballador {
    private String Nom;
    private String Cognom;
    private float Salari;
    private boolean Casat;

    public Treballador(String nom, String cognom, float salari, boolean casat) {
        Nom = nom;
        Cognom = cognom;
        Salari = salari;
        Casat = casat;
    }

    public abstract float CalcularBonus();

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognom() {
        return Cognom;
    }

    public void setCognom(String cognom) {
        Cognom = cognom;
    }

    public float getSalari() {
        return Salari;
    }

    public void setSalari(float salari) {
        Salari = salari;
    }

    public boolean isCasat() {
        return Casat;
    }

    public void setCasat(boolean casat) {
        Casat = casat;
    }

    @Override
    public String toString() {
        return Nom + "," + Cognom + "," + Salari + "," + Casat;
    }
}
