package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioRespostaProf {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 9.70 / 100;
        double terceiraFaixa = 9.70 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);


    }
}
