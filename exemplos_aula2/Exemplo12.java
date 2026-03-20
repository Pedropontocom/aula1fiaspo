import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double[] notas = new double[3];

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void exibirResultado() {
        double media = calcularMedia();
        System.out.println("--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

public class Exemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        aluno.idade = sc.nextInt();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            aluno.notas[i] = sc.nextDouble();
        }

        aluno.exibirResultado();

        sc.close();
    }
}
