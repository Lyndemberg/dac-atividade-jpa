package edu.ifpb.dac.naval.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Navio implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private int capacidade;
    private String pais;
    @OneToOne
    private Comandante comandante;

    public Navio() {
    }

    public Navio(String nome, int capacidade, String pais, Comandante comandante) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
        this.comandante = comandante;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
