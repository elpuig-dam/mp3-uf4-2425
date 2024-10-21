package s5.enunciat1;

public class Gos extends Animal {
    public Gos(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public void ferSoroll() {
        System.out.println("El gos borda!");
    }
}
