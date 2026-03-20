
import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Conversor de metros para centimetros e milimetros: ");
    double valor = sc.nextDouble();

    double centimetro = valor*100;
    double milimetro = valor*1000;

    System.out.println(valor + " em centimetros, é: " +centimetro+", e em milimetros, é: "+milimetro);
    sc.close();
  }
}
