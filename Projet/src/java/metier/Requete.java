package metier;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
*
* @author Jean-Luc et Evelyne
*/
@Entity
public class Requete implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
private Long id;
    public Long getId() {
    return id;
}

public String getEmail() {
    return email;
}
 
public void setEmail(String email) {
    this.email = email;
}

public String getLogiciel() {
    return logiciel;
}

public void setLogiciel(String logiciel) {
    this.logiciel = logiciel;
}
 
public String getSysteme() {
    return systeme;
}

public void setSysteme(String systeme) {
    this.systeme = systeme;
}

public String getProbleme() {
    return probleme;
}

public void setProbleme(String probleme) {
    this.probleme = probleme;
}

String email, logiciel, systeme, probleme;

public void setId(Long id) {
    this.id = id;
}
@Override

public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
}
@Override

public boolean equals(Object object) {
     // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Requete)) {
    return false;
    }
    Requete other = (Requete) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
    return false;
}
return true;
}
@Override

public String toString() {
    return "metier.Requete[ id=" + id + " ]";
}
}