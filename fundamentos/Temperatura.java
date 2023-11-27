package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double fator = 5 / 9.0;
        final double ajuste = 32;

        double fahrenheit = 86;
        final double celsius = (fahrenheit - ajuste) * fator;

        System.out.println("O resultado é " + celsius);
    }
}
