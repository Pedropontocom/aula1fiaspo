import java.util.Scanner;

public class exemplo7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 1° valor: ");
    double valor1 = sc.nextDouble();
    System.out.println("Digite 2° valor: ");
    double valor2 = sc.nextDouble();
    System.out.println("Digite 3° valor: ");
    double valor3 = sc.nextDouble();

    if(valor1>valor2 && valor1>valor3){
      if (valor1>valor2&& valor2>valor3) {
        System.out.println(valor1+" é o maior valor");
        System.out.println(valor3+" é o menor valor");
      }
      else if (valor1>valor2&& valor2<valor3){
        System.out.println(valor1+" é o maior valor");
        System.out.println(valor2+" é o menor valor");
      }
    }
    else if (valor2>valor1 &&valor2>valor3) {
      if(valor2>valor1 &&valor1>valor3){
        System.out.println(valor2+" é o maior valor");
        System.out.println(valor3+" é o menor valor");
      }
      else if(valor2>valor1 && valor1<valor3){
        System.out.println(valor2+" é o maior valor");
        System.out.println(valor1+" é o menor valor");
      }
    }
    else if (valor3>valor1 && valor3>valor2) {
        if(valor3>valor1&& valor1>valor2){
          System.out.println(valor3+" é o maior valor");
          System.out.println(valor2+" é o menor valor");
        }
        if(valor3>valor1&& valor1<valor2){
          System.out.println(valor3+" é o maior valor");
          System.out.println(valor1+" é o menor valor");
        }
      }

    sc.close();
  }
}
