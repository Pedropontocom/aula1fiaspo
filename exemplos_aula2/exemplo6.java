import java.util.Scanner;

public class exemplo6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor inteiro para saber se ele é impar ou par: ");
    int numero = sc.nextInt();

    if (numero%2==0) {
      System.out.println("Esse número é par!");
    }else{
      System.out.println("Esse número é impar!");
    }

    sc.close();
  }
}
