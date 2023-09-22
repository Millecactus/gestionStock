package model;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="Article")
public class Article extends AbstractEntity{

    @Column(name="codeArticle")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixUnitaireHT")
    private BigDecimal prixUnitaireHT;

    @Column(name="tauxTVA")
    private BigDecimal tauxTVA;

    @Column(name="prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    private String photo;

    @ManyToOne
    @JoinColumn (name="idCategorie")
    private Categorie categorie;

}
