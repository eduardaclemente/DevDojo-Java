package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaior = 10 > 20; // padrão colocar "is" antes no nome da variável
        boolean isDezMenor = 10 < 20;
        boolean isDezIgual = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaior);
        System.out.println(isDezMenor);
        System.out.println(isDezIgual);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);


    }
}
