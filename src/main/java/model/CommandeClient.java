package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name="CommandeClient")
public class CommandeClient extends AbstractEntity{

    @Column (name="codeClient")
    private String codeClient;

    @Column (name="dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn (name="idclient")
    private Client client;

    @OneToMany (mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

}
