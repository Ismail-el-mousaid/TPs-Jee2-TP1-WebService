package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

// un objet compte doit etre transféré en élément xml qui s'appele compte
@XmlRootElement(name = "compte")
// Placer les annotations sur chaque attribut
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private Long code;
    private double solde;
    @XmlTransient  //indique que l'attribut n'est pas sérialisable (ne s'affiche pas)
    private Date dateCreation;

    public Compte(Long code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {

    }

    public Long getCode() {
        return code;
    }

    public Compte setCode(Long code) {
        this.code = code;
        return this;
    }

    public double getSolde() {
        return solde;
    }

    public Compte setSolde(double solde) {
        this.solde = solde;
        return this;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Compte setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
        return this;
    }
}
