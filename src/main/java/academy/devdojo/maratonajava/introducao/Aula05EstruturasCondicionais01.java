package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizado = idade >=18;

        if (isAutorizado != false) {
            System.out.println("Autorizado comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado!");
        }



        if (!isAutorizado){
            System.out.println("Não está autorizado a comprar bebida alcólica!");
        }

        boolean c = true; // estou associando e não comparando
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");

    }
}
