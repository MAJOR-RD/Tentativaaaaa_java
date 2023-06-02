
import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("FSA-1392", "Justin Pontes", "666-666-999-23", "242424666", Genero.FEMININO, Setor.RECURSO_HUMANOS, 300, LocalDate.of(2020, Month.MARCH, 20));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Diego Bieber", "478.346.585-43", "22354543634-65", Genero.FEMININO, Setor.ADMINISTRATIVO, 20, LocalDate.of(2022, Month.JANUARY, 3));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Neymar", "101.232.453-43", "3242352-44", Genero.MASCULINO, Setor.SAUDE, 1500, LocalDate.of(2017, Month.MARCH, 2));
        
        
        System.out.println("MOTOBOY:");
        System.out.println(motoboy);
        System.out.println("");
        System.out.println("GERENTE:");
        System.out.println(gerente);
        System.out.println("");
        System.out.println("Diretor");
        System.out.println(diretor);
        
        
    }
}
