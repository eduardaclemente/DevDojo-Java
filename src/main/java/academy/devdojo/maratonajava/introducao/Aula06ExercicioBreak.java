package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioBreak {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
               break;
            }
            System.out.println("Parcela " + parcela + " R$ " +valorParcela);
            // System.out.println("Fora do if, mas dentro do for" +parcela);
        }
    }
}
