import java.util.Scanner;

public class exemplo9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String senha = "Java2026";
    while (true) {
      System.out.println("Informe a senha:");
      String password = sc.nextLine();

      if(password.equals(senha)){
        System.out.println("Acesso Garantido!");
        break;
      }else{
        System.out.println("Senha Incorreta!");
        System.out.println("Tente novamente!");
      }
    }

    sc.close();
  }
}
