package s4.enums;

import java.util.HashMap;
import java.util.Map;

public class Alumne {
    public enum Genere {
        HOME,
        DONA,
        NOBINARI
    }
    private String nom;
    private String idalu;
    private Genere genere;
    private Map<UF,Qualifier> notes;

    public Alumne(String nom, Genere genere, String idalu) {
        this.nom = nom;
        this.idalu = idalu;
        this.genere = genere;
        notes = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdalu() {
        return idalu;
    }

    public void setIdalu(String idalu) {
        this.idalu = idalu;
    }

    public Map<UF, Qualifier> getNotes() {
        return notes;
    }

    public void addNota(UF uf , Qualifier qf) {
        notes.put(uf,qf);
    }


}
