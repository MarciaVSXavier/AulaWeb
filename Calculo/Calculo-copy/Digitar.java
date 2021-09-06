//importacão da classe Scanner
import java.util.Scanner;

public class Digitar {
    
    public static void main(String args[]){
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);
        
        double base, altura, areaRetangulo;
        
        System.out.println("Digite a base e a altura de um retângulo para saber a sua área");
        
        System.out.println("Digite o valor da base do retangulo: " + "\n");
        base = ler.nextDouble();
        
        System.out.println("Digite o valor da altura do retangulo: " + "\n");
        altura = ler.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("A área do Retangulo é: " + areaRetangulo);
        
        

    }