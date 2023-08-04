package com.example;

public class AppScanner {
    
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setRenda(10000);
        cliente1.setSexo('M');
        cliente1.setAnoNascimento(1991);
        cliente1.setNome ("David Costa");
       

        System.out.println("renda "+ cliente1.getRenda());
        System.out.println("sexo "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento "+ cliente1.getAnoNascimento());
        System.out.println("É um cliente especial ?"+ cliente1.isEspecial());
        System.out.println("Olá "+ cliente1.getNome());
        System.out.println();
      
    }    
}
