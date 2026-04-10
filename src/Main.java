import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
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
            System.out.println("\n--- Menu da Indústria ---");
            System.out.println("1. Incluir novo fornecedor");
            System.out.println("2. Incluir novo funcionário");
            System.out.println("3. Listar cadastrados");
            System.out.println("4. Folha de pagamento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("\n--- Cadastro de Fornecedores ---");
                    System.out.print("Nome: ");
                    String nomeF = input.nextLine();
                    System.out.print("Telefone: ");
                    int telF = input.nextInt();
                    System.out.print("Valor da Dívida");
                    float divida = input.nextFloat();
                    System.out.println("Valor do Crédito");
                    float credito = input.nextFloat();
                    input.nextLine();

                    Fornecedor fornecedor = new Fornecedor(nomeF, telF, divida, credito);

                    System.out.println("Fornecedor Cadastrado com sucesso!");
                    break;
                case 2:
                    int tipoEmpregado;
                    do {
                        System.out.println("\n--- Cadastro de Funcionários ---");
                        System.out.println("Qual o tipo de funcionário? (1-Operario / 2-Vendedor)");
                        tipoEmpregado = input.nextInt();
                        input.nextLine();

                        if (tipoEmpregado == 1) {
                            System.out.println("\n--- Cadastrar novo Operário --- ");
                            System.out.print("Nome: ");
                            String nomeO = input.nextLine();
                            System.out.print("Telefone: ");
                            int telO = input.nextInt();
                            System.out.print("Código de Setor: ");
                            int codO = input.nextInt();
                            System.out.print("Salário Base: ");
                            double salO = input.nextDouble();
                            System.out.print("Taxa de imposto: ");
                            double impO = input.nextDouble();
                            System.out.println("Valor hora extra: ");
                            double valorHoraO = input.nextDouble();
                            System.out.println("Total de horas extras: ");
                            int horaO = input.nextInt();
                            input.nextLine();

                            Operario operario = new Operario(nomeO, telO, codO, salO, impO, valorHoraO, horaO);

                            System.out.println("Novo Operário Cadastrado com Sucesso!");

                        } else if (tipoEmpregado == 2) {
                            System.out.println("\n--- Cadastrar novo Vendedor ---");
                            System.out.print("Nome: ");
                            String nomeV = input.nextLine();
                            System.out.print("Telefone: ");
                            int telV = input.nextInt();
                            System.out.print("Código de Setor: ");
                            int codV = input.nextInt();
                            System.out.print("Salário Base: ");
                            double salV = input.nextDouble();
                            System.out.print("Taxa de imposto: ");
                            double impV = input.nextDouble();
                            System.out.print("Valor total de vendas: ");
                            double valVen = input.nextDouble();
                            System.out.print("Porcentagem comissão: ");
                            double comi = input.nextDouble();

                            Vendedor vendedor = new Vendedor(nomeV, telV, codV, salV, impV, valVen, comi);

                            System.out.println("Novo Vendedor Cadastrado com Sucesso!");

                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (tipoEmpregado != 1 && tipoEmpregado != 2);
                    break;
                case 3:
                    for (Pessoa p : pessoas) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    for (Pessoa p : pessoas) {
                        if (p instanceof Empregado) {
                            Empregado emp = (Empregado) p;
                            System.out.println("Funcionário: " + emp.getNome() + " | Salário a receber: R$ " + emp.calcularSalario());
                        }
                    }
                    break;
            }

        } while (opcao != 0);
    }
}