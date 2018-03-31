package edu.ifpb.dac.naval.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Comandante implements Serializable {   
    @Id 
    @GeneratedValue
    private int id;
    private String nome;
    private String pais;

    public Comandante() {
    }

    public Comandante(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
