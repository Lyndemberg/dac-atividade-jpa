package edu.ifpb.dac.naval.model;

import edu.ifpb.dac.naval.converter.LocalDateToDate;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Transporte implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private BigDecimal valor;
    @Convert(converter = LocalDateToDate.class)
    private LocalDate data;
    @OneToOne
    private Navio navio;
    @OneToOne
    private Carga carga;

    public Transporte() {
    }

    public Transporte(BigDecimal valor, LocalDate data, Navio navio, Carga carga) {
        this.valor = valor;
        this.data = data;
        this.navio = navio;
        this.carga = carga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
    
    
}
