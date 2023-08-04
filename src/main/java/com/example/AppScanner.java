package com.example;

import java.util.Scanner;

public class AppScanner {
    
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o nome: ");
        cliente1.setNome(scanner.nextLine());

        System.out.println(" Digite o ano de nascimento: ");
        cliente1.setAnoNascimento(scanner.nextInt());
        scanner.nextLine();
        System.out.println(" Digite o sexo, (utilize 'm' para masculino e 'f' para feminino):");
        String sexo = scanner.nextLine();
        cliente1.setSexo(sexo.charAt(0));

        
        System.out.println(" Digite a sua renda ");
        cliente1.setRenda(scanner.nextDouble());




      
        
       

        System.out.println("renda "+ cliente1.getRenda());
        System.out.println("sexo "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento "+ cliente1.getAnoNascimento());
        System.out.println("É um cliente especial ?"+ cliente1.isEspecial());
        System.out.println("Olá "+ cliente1.getNome());
        System.out.println();

        
      
    }    
}
