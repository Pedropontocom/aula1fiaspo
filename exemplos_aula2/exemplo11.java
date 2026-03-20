import java.util.ArrayList;
import java.util.Scanner;

public class exemplo11 {
    public static void main(String[] args) {
        boolean verdade = true;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> produto = new ArrayList<>();
        produto.add("agua");
        produto.add("refrigerante");
        produto.add("leite");
        produto.add("cerveja");
        produto.add("corote");

        while (verdade) {
            System.out.println("Pesquisa de produto: \nDigite 0 para sair:");
            String valor = sc.nextLine();

            if(valor.equals("0")){
                verdade = false;
            }else if(produto.contains(valor)){
                System.out.println("Esse produto tem no estoque!");
                System.out.println("");
            }else{
                System.out.println("Não tem esse produto no estoque!");
                System.out.println("");
            }
        }
        sc.close();
    }
}