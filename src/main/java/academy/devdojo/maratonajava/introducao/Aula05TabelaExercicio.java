package academy.devdojo.maratonajava.introducao;

public class Aula05TabelaExercicio {
        public static void main(String[] args) {
            double salario = 50000; // Valor do salário que você deseja verificar

            double taxaAnual;

            if (salario <= 0 || salario < 34712) {
                taxaAnual = 0.097; // 9.70%
            } else if (salario <= 34712 || salario < 68506) {
                taxaAnual = 0.3735; // 37.35%
            } else {
                taxaAnual = 0.495; // 49.50%
            }

            double taxaPagar = salario * taxaAnual;
            System.out.println("O valor a ser pago de taxa anual é: " + taxaPagar);
            System.out.println(salario);
        }
}


