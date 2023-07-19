package academy.devdojo.maratonajava.introducao;

/*
    Prática:

    Crie variáveis para os campos descritos abaixo entre o <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi
    o sala´rio de <salario>, na data <data>
 */
public class Aula03TipoPrimitivoExercicio {
    public static void main(String[] args) {

        String nome = "Eduarda Clemente";
        String endereco = "Itaquaquecetuba, rua Araras ";
        float salario = 1500.00F;
        String data = "19/07/2023";


        String relatorio = ("Eu " +nome+ ", moando no endereço " +endereco+
                "confirmo que recebi o salário de " +salario+ ", na data " + data + ".");

        System.out.println(relatorio);
    }
}
