package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Sanji Vinsmoke";
        nomes[1] = "Ronroroa Zoro";
        nomes[2] = "Monkey D. Luffy";

        for (int i = 0; i < nomes.length; i++) {  // i < 3
            System.out.println(nomes[i]);
        }
    }
}
