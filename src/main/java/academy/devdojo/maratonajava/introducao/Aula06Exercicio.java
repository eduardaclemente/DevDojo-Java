package academy.devdojo.maratonajava.introducao;

public class Aula06Exercicio {
    public static void main(String[] args) {

        int count = 0;
        while (count <= 10000) {
            System.out.println(count);
            count +=2;
        }

        for (int numero = 0; numero <= 100000; numero += 2) {
            System.out.println(numero);
        }
    }
}
