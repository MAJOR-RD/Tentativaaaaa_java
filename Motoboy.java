
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    
     private String placaDaMoto;
     //CONSTRUTOR

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }
    
   //TO STRING

    @Override
    public String toString() {
        return super.toString()+
                "\n Placa De Moto: " + placaDaMoto +
                "\n Salário Motoboy: " +getSalarioFinal();
    }
    
    
    
    //GETTER E SETTOR

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
    
    //GET SALARIO FINAL
    
    public double getSalarioFinal(){
        return  super.salarioBase;
    }
}
