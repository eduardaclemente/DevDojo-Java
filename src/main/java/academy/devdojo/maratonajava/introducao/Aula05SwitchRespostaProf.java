package academy.devdojo.maratonajava.introducao;

public class Aula05SwitchRespostaProf {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 6:
                System.out.println("Dia Útil!");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
