
/**
 Crie um programa que leia o nome e os valores digitados de duas notas de um aluno e calcule a sua média de acordo com a fórmula abaixo:
Media = nota1 + nota2 multiplicado por 2 e dividido por 3.

*/
import java.util. Scanner;

public class Exercício4

{
    public static void main(String[] args) {
        String nome;
        double n1, n2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno(a): ");
        nome = ler.nextLine();
        
        System.out.println("Digite a note 1:");
        n1 = ler.nextDouble();
        System.out.println("Digite a note 2:");
        n2 = ler.nextDouble();
        
        System.out.println("A médio do aluno: " + (n1 + (n2 * 2)) / 3);
        
    }
}