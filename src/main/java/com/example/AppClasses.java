package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;


}

public class AppClasses {
    
    
    public static void main(String[] args) {
        System.out.println("criador de classes");

        Cliente cliente1 = new Cliente();
        cliente1.renda = 10000;
        cliente1.sexo = 'M';
        cliente1.anoNascimento = 1991;
        
        System.out.println("renda "+ cliente1.renda );
        System.out.println("sexo "+ cliente1.sexo );
        System.out.println("Ano de Nascimento"+ cliente1.anoNascimento );
    }
}
