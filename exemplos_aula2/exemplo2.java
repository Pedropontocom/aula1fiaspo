import java.util.Scanner;

public class exemplo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da compra: ");
    double compra = sc.nextDouble();
    System.out.println("Digite o valor do desconto: ");
    double desconto = sc.nextDouble();

    double valorFinal = compra*((100-desconto)/100);

    System.out.printf("%.2f", valorFinal);

    sc.close();
  }
}
