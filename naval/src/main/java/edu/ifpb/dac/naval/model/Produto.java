    package edu.ifpb.dac.naval.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
}
