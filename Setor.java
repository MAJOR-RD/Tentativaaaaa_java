/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public enum Setor {
      ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSO_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    private final String nome;
    
    //CONSTRUTOR

    private Setor(String nome) {
        this.nome = nome;
    }
    
    //Getter e Setter

  

    public String getNome() {
        return nome;
    }
}
