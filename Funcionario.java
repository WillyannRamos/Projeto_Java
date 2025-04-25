package com.mycompany.main;

/**
 *
 * Willyann Ramos 
 */
public abstract class Funcionario extends Pessoa implements SalarioCalculavel {

    
    private String cargo;
    private double salario;

    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    
    @Override
    public String getDados() {
        return String.format(
            "👤 Funcionário: %s\n📌 Cargo: %s\n💰 Salário: R$ %.2f",
            getNome(), cargo, salario
        );
    }

    
    @Override
    public double calcularSalario() {
        return salario;
    }
}
