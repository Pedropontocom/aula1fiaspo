import java.util.Scanner;

public class exemplo3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = sc.nextLine();

    int nCaracteresNome = nome.length();
    String caixaAlta = nome.toUpperCase();

    System.out.println("Seu nome tem: " +nCaracteresNome+ " caracteres");
    System.out.println("Seu nome em caixa alta fica: " + caixaAlta);

    sc.close();

  }
}
