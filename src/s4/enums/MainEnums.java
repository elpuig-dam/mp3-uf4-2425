package s4.enums;

import java.util.Map;

public class MainEnums {

    public static void main(String[] args) {
        Alumne alumne = new Alumne("Eric", Alumne.Genere.HOME,"09929288PUIG");
        UF mp3uf4 = new UF("003004","Introducció a la POO");
        UF mp3uf5 = new UF("003005","POO avançada");

        alumne.addNota(mp3uf4,Qualifier.EXCELLENT);
        alumne.addNota(mp3uf5,Qualifier.SATISFACTORI);

        for(Qualifier q: Qualifier.values()) {
            System.out.printf("%s, %d %n", q.name(), q.ordinal());
        }

        for (Map.Entry entry : alumne.getNotes().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
