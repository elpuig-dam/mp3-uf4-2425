package intro;

public class ArgsTest {
    //per executar des de la terminal:
    //java -cp out/production/mp3-uf4-2425/ intro.ArgsTest arg1 arg2 arg3
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No s'han passat arguments");
        } else {
            System.out.println("S'han passat " + args.length + " arguments");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }
    }
}
