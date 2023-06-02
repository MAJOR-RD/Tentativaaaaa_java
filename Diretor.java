
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
public class Diretor extends CargoDeConfianca{
    private  double PREMIO=(0.1);
   
   //CONSTRUTOR

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
   
    
   //GETTER E SETTER

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }
    
   //SALARIO
    public double getSalarioFinal(){
        return salarioBase +(salarioBase * PREMIO) + (salarioBase * super.bonificacao.valor);
    }
    
   // TO STRING

    @Override
    public String toString() {
        return super.toString()+
                "\n O adicional é " + PREMIO + " porcentos" +
                "\n O salario é :" +getSalarioFinal();
    }
}
