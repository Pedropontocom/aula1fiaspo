import java.util.Arrays;
import java.util.Scanner;

public class exemplo10{
    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 5 valores diferentes! ");

        for(int i = 0; i<5; i++){
            System.out.println("valor " +(i+1) + ":");
            numeros[i] = sc.nextInt();
        }
        int maior = Arrays.stream(numeros).max().orElseThrow();
        int menor = Arrays.stream(numeros).min().orElseThrow();

        System.out.println("número maior: "+maior);
        System.out.println("número menor: "+menor);

        int soma = 0;
        int tamnho = numeros.length;

        for(int i = 0; i<tamnho; i++){
            soma = soma + numeros[1];
        }
        System.out.println("A média é aritimetica, é " + (float) (soma/tamnho));

        sc.close();
    }
}
