package s6.ComparableExemple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCoches {


    public static void main(String[] args) {
        List<Cotxe> llistaCotxes = new ArrayList<>();

        Cotxe c1 = new Cotxe("Porsche","Carrera","3412SAA",300,2200);
        Cotxe c2 = new Cotxe("Ferrari","Testarossa","3412SAD",200,2500);

        llistaCotxes.add(new Cotxe("Toyota","Corolla","4229DFD",116,1998));
        llistaCotxes.add(new Cotxe("Seat","León","111ADF",110,2000));
        llistaCotxes.add(new Cotxe("BNW","X3","8976AAA",150,2500));
        llistaCotxes.add(c1);
        llistaCotxes.add(c2);

        System.out.println("Ordenat per cavalls");
        Collections.sort(llistaCotxes);

        for (Cotxe c : llistaCotxes) {
            System.out.println(c);
        }

        System.out.println("Ordenat per cilindrada");
        ComparatorCotxeCV cmp = new ComparatorCotxeCV();
        Collections.sort(llistaCotxes,cmp);
        llistaCotxes.sort(cmp);

        for (Cotxe c : llistaCotxes) {
            System.out.println(c);
        }
        System.out.println("Ordenat per matrícula");
        Collections.sort(llistaCotxes, new Comparator<Cotxe>() {
            @Override
            public int compare(Cotxe o1, Cotxe o2) {
                return o1.getMatricula().compareTo(o2.getMatricula());
            }
        });
        for (Cotxe c : llistaCotxes) {
            System.out.println(c);
        }

        System.out.println("Ordenat per MARCA");
        Collections.sort(llistaCotxes,((o1, o2) -> o1.getMarca().compareTo(o2.getMarca())));
        for (Cotxe c : llistaCotxes) {
            System.out.println(c);
        }


        System.out.println("Ordenat per MODEL");
        Collections.sort(llistaCotxes,(Comparator.comparing(Cotxe::getModel)));
        for (Cotxe c : llistaCotxes) {
            System.out.println(c);
        }

        if(c1.equals(c2)) System.out.println("c1 i c2 iguals");

        if(llistaCotxes.contains(c1)) System.out.println("a la llista hi ha c1");


    }
}
