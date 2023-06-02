/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private final String texto;

    
    //CONSTRUTOR
    private Genero(String texto) {
        this.texto = texto;
    }
    
    //GETTER E SETTER

    public String getTexto() {
        return texto;
    }
    
}
