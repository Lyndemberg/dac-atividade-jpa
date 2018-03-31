package edu.ifpb.dac.jpa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Evento implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private int ano;
    private String local;

    public Evento() {
    }

    public Evento(String nome, int ano, String local) {
        this.nome = nome;
        this.ano = ano;
        this.local = local;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
}
