package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Medrab;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T09:06:04")
@StaticMetamodel(Otdelenie.class)
public class Otdelenie_ { 

    public static volatile SingularAttribute<Otdelenie, String> name;
    public static volatile SingularAttribute<Otdelenie, Long> id;
    public static volatile CollectionAttribute<Otdelenie, Medrab> medrabotnikCollection;

}