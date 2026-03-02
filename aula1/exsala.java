import java.util.Scanner;

public class exsala {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean programa = true;
    boolean luz = false;
    boolean arcond = false;
    boolean janela = true;

    System.out.println("Está tudo desligado! Deseja ligar?");
    do {
      System.out.println(
          "1- Ligar luz \n2- Desligar luz \n3- Ligar ar \n4- Desligar ar \n5- Abrir janela \n6- Fechar janela \n7- Sair");
      int valor = sc.nextInt();

      switch (valor) {
        case 1:
          if (luz == true) {
            System.out.println("Não dá para ligar, o que já está ligado!");
          } else {
            System.out.println("Luz ligada!");
            luz = true;
          }
          break;
        case 2:
          if (luz == false) {
            System.out.println("não dá para deligar, o que está desligado!");
          } else {
            System.out.println("luz desligada!");
            luz = false;
          }
          break;
        case 3:
          if (arcond == true) {
            System.out.println("Não dá para ligar, o que já está ligado!");
          } else if (arcond == false && janela == true) {
            System.out.println("Ar-condicionado ligado!");
            arcond = true;
          }
          break;
        case 4:
          if (arcond == false) {
            System.out.println("Não dá para desligar, o que já está desligado!");
          } else {
            System.out.println("Ar-condicionado desligado");
            arcond = false;
          }
          break;
        case 5:
          if (janela == false) {
            System.out.println("Não dá para abrir, o que já está aberto!");
          } else {
            System.out.println("Janela aberta!\nDesligando ar-condicionado!");
            janela = false;
            arcond = false;
          }
          break;
        case 6:
          if (janela == true) {
            System.out.println("Não dá para fechar a janela que já está fechada!");
          } else {
            System.out.println("Janela fechada!");
            janela = true;
          }
          break;
        case 7:
          System.out.println("Saindo...");
          programa = false;
          break;

        default:
          System.out.println("Informe um valor correto!");
          break;
      }
    } while (programa);
    sc.close();
  }
}
