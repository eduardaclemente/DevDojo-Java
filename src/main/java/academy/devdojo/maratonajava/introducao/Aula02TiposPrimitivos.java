package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 24; // inicializar a variável
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte= 24;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';


        System.out.println("A idade é:  " + age);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);


        //casting é forçar a entrada do valor
        int idade = (int) 1000000000000000000L;
    }
}
