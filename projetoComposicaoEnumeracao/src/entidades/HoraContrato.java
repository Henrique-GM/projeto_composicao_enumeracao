/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Henrique
 */
public class HoraContrato {
    
    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HoraContrato() {
        
    }
    
    public HoraContrato(Date date, Double valorPorHora, Integer horas) {
        this.data = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    public double valorTotal() {
        return valorPorHora * horas;
    }
}
