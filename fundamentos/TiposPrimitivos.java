package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações de um funcionário
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        //Para definir um long é preciso passar um L no final do numero
        long pontosAcumulados = 3_234_845_223L;

        //Para definir um float é preciso passar um L no final do numero
        float salario = 11_145.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        boolean estaDeFerias = false;

        char status = 'A'; //Aceita apenas um carácter

        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
        System.out.println("Voos realizados: " + numeroDeVoos / 2);
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias: " + estaDeFerias);
        System.out.println("Status: " + status);


    }
}
