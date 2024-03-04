package jpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-09-11T14:45:25")
@StaticMetamodel(Events.class)
public class Events_ { 

    public static volatile SingularAttribute<Events, Date> createdAt;
    public static volatile SingularAttribute<Events, Date> endDate;
    public static volatile SingularAttribute<Events, Long> id;
    public static volatile SingularAttribute<Events, String> event;
    public static volatile SingularAttribute<Events, Date> startDate;
    public static volatile SingularAttribute<Events, Date> updatedAt;

}