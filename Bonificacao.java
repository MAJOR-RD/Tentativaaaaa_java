/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);
    
    protected final double valor;
    
    //CONSTRUTOR

    private Bonificacao(double valor) {
        this.valor = valor;
    }
    
    //GETTER

    

    public double getValor() {
        return valor;
    }
    
}

