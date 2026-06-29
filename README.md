# A4-2-Trabalho-Final-PE-OO

## A4.2 - Trabalho Final: Paradigmas Estruturado e Orientado a Objetos

Este repositório contém exemplos de implementação do sistema de lançamento de notas, desenvolvido para demonstrar a diferença entre o paradigma estruturado e o paradigma orientado a objetos.

## Objetivo do sistema

O sistema recebe os dados do aluno, suas notas do semestre, calcula a média e define a situação final conforme as regras abaixo:

- Média semestral: $(n1 + n2) / 2$
- Se a média for maior ou igual a 7,0: aluno aprovado
- Se a média for inferior a 4,0: aluno reprovado
- Se a média estiver entre 4,0 e 6,9: aluno fica em recuperação e precisa fazer a prova final
- Na prova final, a nova média é recalculada com a fórmula: $(média\ semestral + nota\ final) / 2$
- Se a média final for maior ou igual a 5,0: aluno aprovado na final
- Caso contrário: aluno reprovado na final

## Arquivos do projeto

- [codigos/1- main-c.c](codigos/1-%20main-c.c): implementação em C, seguindo o paradigma estruturado
- [codigos/2 - main-python.py](codigos/2%20-%20main-python.py): arquivo em Python para estudo e implementação futura
- [codigos/3 - main-oo-python.py](codigos/3%20-%20main-oo-python.py): versão em Python com abordagem orientada a objetos
- [codigos/4 - main-oo-java.java](codigos/4%20-%20main-oo-java.java): implementação em Java, utilizando conceitos de orientação a objetos

## Estrutura da lógica implementada

O sistema trabalha com os seguintes passos:

1. Entrada do nome do aluno e das notas do semestre
2. Cálculo da média semestral
3. Definição da situação do aluno
4. Caso o aluno esteja em recuperação, solicitação da nota da prova final
5. Recalculo da situação final

## Diferencial do trabalho

O projeto mostra como a mesma regra de negócio pode ser implementada de formas diferentes, dependendo do paradigma utilizado:

- Paradigma estruturado: foco em funções e procedimentos
- Paradigma orientado a objetos: foco em classes, atributos, métodos e encapsulamento

## Como executar

### C
Use um compilador C, como o GCC:

```bash
gcc "codigos/1- main-c.c" -o sistema_notas
./sistema_notas
```

### Java
Compile e execute a classe principal:

```bash
javac "codigos/4 - main-oo-java.java"
java Main
```

## Conclusão

Este trabalho tem como finalidade comparar abordagens de programação e demonstrar como diferentes paradigmas podem resolver o mesmo problema de forma clara e organizada.
