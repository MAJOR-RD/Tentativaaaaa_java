/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{
    //CONSTRUTOR
      public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
        
     
    //SALARIO
    
    public double getSalarioFinal(){
        return salarioBase + (salarioBase * super.bonificacao.valor);
    }
    
   //TO STRING

    @Override
    public String toString() {
        return super.toString()+
         "\n Salário Final: " +getSalarioFinal();       
    }
}
