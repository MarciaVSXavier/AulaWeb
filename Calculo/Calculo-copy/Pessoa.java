
public class Pessoa {
    
    public static void main(String args[]) {
        //declaracao dos atributos
        
        String nome, sobrenome, profissao;
        
        nome = "Josefa";
        sobrenome = "Souza";
        profissao ="Farmacéutica";
        int idade = 32;
        double altura, salariohora, horas;
        altura = 1.78;
        salariohora = 234.78;
        horas = 40;
        
        System.out.println("Dados cadastrais = RH");
        System.out.println("*************");
        System.out.println("Nome: " + nome + "\n" +
                          "Sobrenome: " + sobrenome + "\n" +
                          "Altura:"  + altura + "\n" + "Cargo" + profissao);
        System.out.println("Dados Cadastrais + Financeiro");
        System.out.println("*************");
        System.out.println("O salario de: " + nome + " é: ");
        System.out.println("Trabalho de 40h semanais:" + ((salariohora * horas) * 4)); 
        
                
        
        
        
        
        
    }
    
}