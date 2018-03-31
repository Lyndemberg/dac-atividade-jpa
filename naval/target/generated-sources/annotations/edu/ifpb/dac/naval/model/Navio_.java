package edu.ifpb.dac.naval.model;

import edu.ifpb.dac.naval.model.Comandante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T09:45:22")
@StaticMetamodel(Navio.class)
public class Navio_ { 

    public static volatile SingularAttribute<Navio, Integer> codigo;
    public static volatile SingularAttribute<Navio, Comandante> comandante;
    public static volatile SingularAttribute<Navio, Integer> capacidade;
    public static volatile SingularAttribute<Navio, String> nome;
    public static volatile SingularAttribute<Navio, String> pais;

}