package s5.enunciat1;

public class Ocell  extends Animal implements Volador {
    public Ocell(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public void ferSoroll() {
        System.out.println("L'ocell piula!");
    }

    @Override
    public void volar() {
        System.out.println("L'ocell està volant!");
    }
}
