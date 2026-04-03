import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("---      SELECIONE UMA OPÇÃO     ---");
            System.out.println("---  1- Incluir novo Fornecedor  ---");
            System.out.println("---  2- Incluir novo Funcionário ---");
            System.out.println("---  3- Listar Cadastrados       ---");
            System.out.println("---  4- Ver Folha de Pagamento   ---");
            opcao = input.nextInt();
        } while (opcao != 0);
    }
}