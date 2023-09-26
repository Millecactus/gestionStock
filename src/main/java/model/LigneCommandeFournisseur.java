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
@Table(name="LigneCommandeFournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idCommandeFournisseur")//joincolumn car il recoit une clé étrangère
    private List<CommandeFournisseur> commandeFournisseur;
}
