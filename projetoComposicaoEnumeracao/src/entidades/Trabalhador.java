/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.enums.Nivel_trabalho;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class Trabalhador {
    
    private String nome;
    private Nivel_trabalho nivel;
    private Double salarioBase;
    
    //composicão entre objetos
    private Departamento departamento;
    private List<HoraContrato> contrato = new ArrayList<>();

    public Trabalhador() {
        
    }
    
    public Trabalhador(String nome, Nivel_trabalho nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel_trabalho getNivel() {
        return nivel;
    }

    public void setNivel(Nivel_trabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void adicionarContrato(HoraContrato contratos) {
        contrato.add(contratos);
    }
    
    public void removerContrato(HoraContrato contratos) {
        contrato.remove(contratos);
    } 
    
    public Double CalcularSalarioMes(int ano, int mes) {
        
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
       
        for (HoraContrato c : contrato) {
            
            calendario.setTime(c.getDate());
            
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = 1 + calendario.get(Calendar.MONTH);
                    
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }                
        }
        
        return soma;
    }
}
