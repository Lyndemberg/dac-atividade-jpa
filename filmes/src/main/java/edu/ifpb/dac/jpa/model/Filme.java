package edu.ifpb.dac.jpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author lyndemberg
 */
@Entity
public class Filme implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String titulo;
    private String genero;
    private String diretor;
    private int ano;
    @OneToMany
    private List<Ator> atores;

    public Filme() {
    }

    public Filme(String titulo, String genero, String diretor, int ano, List<Ator> atores) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.atores = atores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    
}
