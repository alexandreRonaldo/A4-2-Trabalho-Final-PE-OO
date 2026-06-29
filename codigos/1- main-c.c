#include <stdio.h>
#include <string.h>

// Estrutura para armazenar os dados do aluno
struct Aluno {
    char nome[50];
    float nota1;
    float nota2;
    float media_semestre;
    float nota_final;
    float media_final;
};

// Função para calcular a média semestral
float calcular_media(float n1, float n2) {
    return (n1 + n2) / 2.0;
}

// Função para processar a situação do aluno
void processar_situacao(struct Aluno *aluno) {
    aluno->media_semestre = calcular_media(aluno->nota1, aluno->nota2);
    printf("\n--- Resultado Semestral ---\n");
    printf("Aluno: %s\n", aluno->nome);
    printf("Média Semestral: %.2f\n", aluno->media_semestre);

    if (aluno->media_semestre >= 7.0) {
        printf("Situação: APROVADO DIRETO\n");
    } else if (aluno->media_semestre < 4.0) {
        printf("Situação: REPROVADO DIRETO\n");
    } else {
        printf("Situação: EM RECUPERAÇÃO (PROVA FINAL)\n");
        printf("Digite a nota da Prova Final: ");
        scanf("%f", &aluno->nota_final);

        aluno->media_final = (aluno->media_semestre + aluno->nota_final) / 2.0;
        printf("Média Final após exame: %.2f\n", aluno->media_final);

        if (aluno->media_final >= 5.0) {
            printf("Situação: APROVADO NA FINAL\n");
        } else {
            printf("Situação: REPROVADO NA FINAL\n");
        }
    }
}

int main() {
    struct Aluno aluno1;

    printf("### Sistema de Notas - Paradigma Estruturado (C) ###\n");
    printf("Digite o nome do aluno: ");
    fgets(aluno1.nome, sizeof(aluno1.nome), stdin);
    aluno1.nome[strcspn(aluno1.nome, "\n")] = 0; // Remove o '\n' do buffer

    printf("Digite a Nota 1: ");
    scanf("%f", &aluno1.nota1);
    printf("Digite a Nota 2: ");
    scanf("%f", &aluno1.nota2);

    processar_situacao(&aluno1);

    return 0;
}