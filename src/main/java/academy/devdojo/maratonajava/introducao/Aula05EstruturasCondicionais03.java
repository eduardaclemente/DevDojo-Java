package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        boolean possoDoar = salario > 5000;
        String resultado = possoDoar ?  "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);

    }
}
