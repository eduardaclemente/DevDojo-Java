package academy.devdojo.maratonajava.introducao;

public class Aula06Break {
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i < valorMax; i++){
            if (i > 25){
               break;
               // break precisa estar dentro de um switch ou loop, senão quebra codigo
            }
            System.out.println("I = " +i);
        }
    }
}
