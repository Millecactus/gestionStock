package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="LigneCommandeClient")
public class LigneCommandeClient extends AbstractEntity{

    @ManyToOne
    @JoinColumn (name="idArticle")
    private  Article article;

    @ManyToOne
    @JoinColumn (name="idCommandeClient")
    private CommandeClient commandeClient;
}
