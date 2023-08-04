package com.example;

public class AppClasses {
    
    
    public static void main(String[] args) {
        System.out.println("criador de classes");

        Cliente cliente1 = new Cliente();
        cliente1.setRenda(10000);
        cliente1.setSexo('M');
        cliente1.setAnoNascimento(1991);
        cliente1.setNome ("David Costa");
        var vetornome = cliente1.getNome().split(" ");
        System.out.println("Seu primeiro nome é: "+vetornome[0]);
        System.out.println("Seu sobrenome é "+vetornome[1]);
        System.out.println("A primeira letra do seu nome é:"+cliente1.getNome().charAt(0));

        System.out.println("renda "+ cliente1.getRenda());
        System.out.println("sexo "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento "+ cliente1.getAnoNascimento());
        System.out.println("É um cliente especial ?"+ cliente1.isEspecial());
        System.out.println("Olá "+ cliente1.getNome());
        System.out.println();
      
        
        Cliente cliente2 = new Cliente(-800,'F',1995,("Enídia Cordeiro"));
        cliente2.setNome("Enídia Cristine");
        System.out.println("renda "+ cliente2.getRenda() );
        System.out.println("sexo "+ cliente2.getSexo());
        System.out.println("Ano de Nascimento "+ cliente2.getAnoNascimento());
        System.out.println("É um cliente especial ? "+ cliente2.isEspecial());
        System.out.println("Olá como vai? "+ cliente2.getNome());
    }
}
