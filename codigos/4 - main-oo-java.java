import java.util.Scanner;

class Aluno {
    // Encapsulamento: atributos privados
    private String nome;
    private double nota1;
    private double nota2;
    private double mediaSemestre;
    private double notaFinal;
    private double mediaFinal;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getMediaSemestre() {
        this.mediaSemestre = (this.nota1 + this.nota2) / 2.0;
        return this.mediaSemestre;
    }

    public void avaliarFinal(double notaFinal) {
        this.notaFinal = notaFinal;
        this.mediaFinal = (this.mediaSemestre + this.notaFinal) / 2.0;
    }

    public double getMediaFinal() {
        return this.mediaFinal;
    }

    public String getNome() {
        return this.nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Sistema de Notas - Paradigma OO (Java) ###");
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a Nota 2: ");
        double n2 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, n1, n2);
        double mediaSemestre = aluno.getMediaSemestre();

        System.out.println("\n--- Resultado Semestral POO ---");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média Semestral: %.2f\n", mediaSemestre);

        if (mediaSemestre >= 7.0) {
            System.out.println("Situação: APROVADO DIRETO");
        } else if (mediaSemestre < 4.0) {
            System.out.println("Situação: REPROVADO DIRETO");
        } else {
            System.out.println("Situação: EM RECUPERAÇÃO (PROVA FINAL)");
            System.out.print("Digite a nota da Prova Final: ");
            double notaExame = scanner.nextDouble();
            
            aluno.avaliarFinal(notaExame);
            System.out.printf("Média Final após exame: %.2f\n", aluno.getMediaFinal());

            if (aluno.getMediaFinal() >= 5.0) {
                System.out.println("Situação: APROVADO NA FINAL");
            } else {
                System.out.println("Situação: REPROVADO NA FINAL");
            }
        }
        scanner.close();
    }
}

