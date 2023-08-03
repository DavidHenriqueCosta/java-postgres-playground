package com.example;

class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    

    public Cliente(){
        System.out.println(" Criando um novo objeto sem parâmetro .");
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
            else especial = false;
    };
    
    public Cliente(double renda, char sexo, int anoNascimento){
        System.out.println(" Criando um novo objeto com parâmetro .");
    
        
        this.anoNascimento = anoNascimento;
        if (sexo == 'M' || sexo == 'm' || sexo == 'f' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("O sexo informado é inválido use M ou F.");

        if (renda >= 0)
            this.renda = renda;
            else System.out.println("O valor da renda deve ser maior que 0");
        
    };

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm' || sexo == 'f' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("O sexo informado é inválido use M ou F.");

    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
   

    double getRenda(){
        return renda;
    }
    void setRenda(double renda){
        if (renda >= 0)
            this.renda = renda;
            else System.out.println("O valor da renda deve ser maior que 0");
    }
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}