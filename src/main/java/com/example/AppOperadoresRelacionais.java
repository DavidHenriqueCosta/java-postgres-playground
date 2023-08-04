package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente3 = new Cliente();
        cliente3.setAnoNascimento(2014);
        var cliente4 = new Cliente();
        cliente4.setAnoNascimento(1991);

        if (cliente3.getAnoNascimento() > cliente4.getAnoNascimento())
            System.out.println("O primeiro cliente é mais novo");
        else
            System.out.println(" na verdade o segundo é mais novo !");

    }
}
