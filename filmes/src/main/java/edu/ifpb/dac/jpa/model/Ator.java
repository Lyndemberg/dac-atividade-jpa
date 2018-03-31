
package edu.ifpb.dac.jpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author lyndemberg
 */
@Entity
public class Ator implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String nacionalidade;
    @OneToMany
    private List<Ator> parRomantico;

    public Ator() {
    }

    public Ator(String nome, Sexo sexo, String nacionalidade, List<Ator> parRomantico) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.parRomantico = parRomantico;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Ator> getParRomantico() {
        return parRomantico;
    }

    public void setParRomantico(List<Ator> parRomantico) {
        this.parRomantico = parRomantico;
    }
    
}
