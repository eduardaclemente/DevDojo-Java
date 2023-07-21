package academy.devdojo.maratonajava.introducao;

public class Aula05SwitchExercicio {
    public static void main(String[] args) {

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo. É final de semana!");
                break;
            case 2:
                System.out.println("Segunda-Feira. É dia da semana!");
                break;
            case 3:
                System.out.println("Terça-Feira. É dia da semana!");
                break;
            case 4:
                System.out.println("Quarta-Feira. É dia da semana!");
                break;
            case 5:
                System.out.println("Quinta-Feira. É dia da semana!");
                break;
            case 6:
                System.out.println("Sexta-Feira. É dia da semana!");
                break;
            case 7:
                System.out.println("Sábado. Final de semana!");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
