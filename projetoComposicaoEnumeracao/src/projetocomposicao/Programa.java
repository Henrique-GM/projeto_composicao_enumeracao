/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomposicao;


import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.Nivel_trabalho;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
              
        System.out.print("Entre com o nome do departamento: "); 
        String departamentoNome = sc.nextLine();
        
        System.out.print("Entre com os dados do trabalhador: ");
        
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        
        System.out.print("Nível: ");
        String nivelTrabalhador = sc.nextLine();
              
        System.out.print("Salário base: ");     
        double salarioBaseTrabalhador = sc.nextDouble();
        
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, Nivel_trabalho.valueOf(nivelTrabalhador), salarioBaseTrabalhador, new Departamento(departamentoNome));
        
        sc.close();
    }    

    
}
