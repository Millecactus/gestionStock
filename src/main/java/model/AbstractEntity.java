package model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)//cette annotation écoute la superclasse et modifie automatiquement les createdDate et LastModifiedDate
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer Id;

    @CreatedDate
    @Column (name= "creationDate", nullable = false)
    @JsonIgnore// JSONIgnore signifie qu'on va pas persisté cette donnée car attribut technique = pas persisté (caractéristique intrisèque a l'objet pas besoin de persistence
    private Instant creationDate;

    @LastModifiedDate
    @Column (name= "lastModifyDate")
    @JsonIgnore//attribut technique = pas persisté
    private Instant lastModifyDate;

}
