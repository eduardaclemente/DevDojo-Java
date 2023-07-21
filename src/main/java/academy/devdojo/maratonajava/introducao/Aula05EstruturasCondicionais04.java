package academy.devdojo.maratonajava.introducao;

    public class Aula05EstruturasCondicionais04 {
        public static void main(String[] args) {
            // imprima o dia da semana, considerando 1 como domingo
            byte dia = 1;

            // char, int, byte, short, enum, string
            switch (dia){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }


            char sexo = 'M';
            switch (sexo){
                case 'M':
                    System.out.println("Homem");
                    break;
                case 'F':
                    System.out.println("Mulher");
                    break;
                default:
                    System.out.println("Inválido!");

            }
        }
}
