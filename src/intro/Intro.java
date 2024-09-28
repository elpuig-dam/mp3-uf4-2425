package intro;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Activitat 1: Variables i Conversió de Tipus");
        a1();
        System.out.println("--------------------------------------------------");
        System.out.println("Activitat 2: Operacions Bàsiques i Constants");
        a2();
        System.out.println("--------------------------------------------------");
        System.out.println("Activitat 3: Format de Cadenes");
        a3();
        System.out.println("--------------------------------------------------");
    }

    public static void a1() {
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;

        // Conversió de tipus
        double doubleFromInt = intVar; // conversió implícita
        int intFromDouble = (int) doubleVar; // conversió explícita

        System.out.println("doubleFromInt: " + doubleFromInt);
        System.out.println("intFromDouble: " + intFromDouble);
    }

    public static void a2() {
        int num1 = 20;
        int num2 = 5;

        // Operacions bàsiques
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicació: " + (num1 * num2));
        System.out.println("Divisió: " + (num1 / num2));
        System.out.println("Mòdul: " + (num1 % num2));

        // Operacions amb números en punt flotant
        float floatNum1 = 10.5f;
        double doubleNum1 = 20.5;

        System.out.println("Suma (float): " + (floatNum1 + doubleNum1));
        System.out.println("Suma (double): " + (doubleNum1 + floatNum1));

        // Constants i màxims/mínims
        System.out.println("Int màxim: " + Integer.MAX_VALUE);
        System.out.println("Int mínim: " + Integer.MIN_VALUE);
        System.out.println("Double màxim: " + Double.MAX_VALUE);
        System.out.println("Double mínim: " + Double.MIN_VALUE);
    }

    public static void a3() {
            float floatVar = 12.34567f;
            int intVar = 123456;
            String stringVar = "Hello, World!";

            // Format String
            System.out.format("El valor de la variable float és %.3f, mentre que el valor de la variable int és %,d, i la cadena és %s%n", floatVar, intVar, stringVar);

            // Flags i Especificadors
            System.out.printf("Número amb signe: %+d%n", intVar);
            System.out.printf("Número amb zeros a l'esquerra: %08d%n", intVar);
            System.out.printf("Número en format local amb separadors de milers: %,d%n", intVar);
            System.out.printf("Número amb 3 decimals: %.3f%n", floatVar);
            System.out.printf("Número amb 10 caràcters d'amplada i 3 decimals: %10.3f%n", floatVar);
            System.out.printf("Text alineat a l'esquerra: %-20s%n", stringVar);
    }
}
