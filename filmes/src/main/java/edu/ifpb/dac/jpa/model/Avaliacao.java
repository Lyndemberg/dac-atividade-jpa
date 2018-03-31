package edu.ifpb.dac.jpa.model;

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
public class Avaliacao implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Filme filme;
    @OneToOne
    private Evento evento;
    private int nota;

    public Avaliacao() {
    }

    public Avaliacao(Filme filme, Evento evento, int nota) {
        this.filme = filme;
        this.evento = evento;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
     
    
}
