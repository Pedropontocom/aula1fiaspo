import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----CATRACA----- \n1- inserir moeda \n2- empurrar catraca \n3- sair do busão \n digite a opção:");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("pagamento sendo processado...");
                System.out.println("catraca LIBERADA, pode passar");
                while (true) {
                    System.out.println("passou pela catraca?\n 1-sim \n2-não");
                    int verificacao = sc.nextInt();
                    if (verificacao == 1) {
                        System.out.println("Catraca TRAVADA");
                        break;
                    }else if(verificacao ==2){
                        System.out.println("passe a catraca para os outros passageiros entrar");
                    }else{
                        System.out.println("coloque a opção correta caba safado");
                      
                    }

                }
            }else if(opcao == 2){
                System.out.println("Catraca TRAVADA");
                System.out.println("insira a moeda para destravar a catraca");
            }
            else if(opcao == 3){
                System.out.println("saindo...");
                break;
            }
            else{
                System.out.println("digite a opção correta");
            }

       }
    }
}
