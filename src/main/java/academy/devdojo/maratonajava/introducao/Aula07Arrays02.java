package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // padrão de inicialização:
        // byte, short, int, long, float e double = 0
        // char = unicode do espaço em branco '\u0000' '
        // boolean = false
        // String = null

        String[] idades1 = new String[3];
        System.out.println(idades1[0]);

        int[] idades2 = new int[3];
        System.out.println(idades2[0]);

        float[] idades3 = new float[3];
        System.out.println(idades3[0]);

        char[] idades4 = new char[3];
        System.out.println(idades4[0]);

        boolean[] idades5 = new boolean[3];
        System.out.println(idades5[0]);
    }
}
