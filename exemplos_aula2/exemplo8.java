import java.util.Scanner;

public class exemplo8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor inteiro para saber sua tabuada: ");
    int valor = sc.nextInt();

    for(int i = 1; i<=10; i++){
      System.out.println(valor +" x " +i+ " = " + valor*i);
    }

    sc.close();
  }
}
