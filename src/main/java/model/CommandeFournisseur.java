package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="CommandeFournisseur")

public class CommandeFournisseur extends AbstractEntity{

    @Column (name ="codeFournisseur")
    private String code;

    @Column (name ="dateCommandeFournisseur")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn (name="idFournisseur")//joincolumn car il recoit une clé étrangère
    private Fournisseur fournisseur;
}
