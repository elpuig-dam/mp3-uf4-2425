package s6.ComparableExemple;

import java.util.Comparator;

public class ComparatorCotxeCV implements Comparator<Cotxe> {
    @Override
    public int compare(Cotxe o1, Cotxe o2) {
        if(o1.getCilindrada() < o2.getCilindrada()) return 1;
        else if(o1.getCilindrada() > o2.getCilindrada()) return -1;
        else return 0;
    }
}
