package com.mycompany.main;

public abstract class Pessoa {
    protected String nome;

  
   
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public String getNome() {
        return nome;
    }

    
    public String getDados() {
        return String.format("👤 Nome: %s", nome);
    }
}

