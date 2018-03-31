package edu.ifpb.dac.naval.model;

import edu.ifpb.dac.naval.model.Categoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-31T00:03:32")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Integer> codigo;
    public static volatile SingularAttribute<Produto, Categoria> categoria;
    public static volatile SingularAttribute<Produto, String> nome;

}