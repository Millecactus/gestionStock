package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String email;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")//mappé dans l'autre entité par l'identifiant 'fournisseur'
    private List<CommandeFournisseur> commandeFournisseur;

}
