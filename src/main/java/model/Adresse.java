package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
@Entity

public class Adresse {

    @Column (name = "adress1")
    private String adresse1;

    @Column (name = "adress2")
    private String adresse2;

    @Column (name = "ville")
    private String ville;

    @Column (name = "codePostal")
    private String codePostal;

    @Column (name = "Pays")
    private String Pays;

}
