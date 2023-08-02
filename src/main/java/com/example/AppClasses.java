package com.example;

class Cliente {
    private double renda;
    private char sexo;
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    private int anoNascimento;

    double getRenda(){
        return renda;
    }
    void setRenda(double renda){
        if (renda >= 0)
            this.renda = renda;
            else System.out.println("O valor da renda deve ser maior que 0");
    }

}

public class AppClasses {
    
    
    public static void main(String[] args) {
        System.out.println("criador de classes");

        Cliente cliente1 = new Cliente();
        cliente1.setRenda(10000);
        cliente1.setSexo('M');
        cliente1.setAnoNascimento(1991);
        
        System.out.println("renda "+ cliente1.getRenda());
        System.out.println("sexo "+ cliente1.getSexo());
        System.out.println("Ano de Nascimento "+ cliente1.getAnoNascimento());


        Cliente cliente2 = new Cliente();
        cliente2.setRenda(-800);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1995);

        System.out.println("renda "+ cliente2.getRenda() );
        System.out.println("sexo "+ cliente2.getSexo());
        System.out.println("Ano de Nascimento "+ cliente2.getAnoNascimento());
    }
}
