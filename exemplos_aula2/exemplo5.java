import java.util.Scanner;

public class exemplo5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o seu salário atual: ");
    double salario = sc.nextDouble();

    System.out.println("Seu salário atual é de R$"+salario);
    System.out.println("Seu salario agora com o reajuste será R$"+(salario*1.15));

    sc.close();
  }
}
