package metier;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
*
* @author Jean-Luc et Evelyne
*/
@ManagedBean
@SessionScoped
public class Hotline {
    public String getProbleme() {
    return probleme;
 }
    
public void setProbleme(String probleme) {
    this.probleme = probleme;
}

private String probleme;
public String getPrenom() {
    return prenom;
}

public void setPrenom(String prenom) {
    this.prenom = prenom;
}

    public String getNom() {
        return nom;
}
    
public void setNom(String nom) {
    this.nom = nom;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getTelephone() {
    return telephone;
}

public void setTelephone(String telephone) {
    this.telephone = telephone;
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

private String prenom, nom, email, telephone, logiciel, systeme;

 /**
 * Creates a new instance of Hotline
 */
 public Hotline() {
 }
 public String inscrireClient() {
 Client c = new Client();
 c.setId(email); c.setPrenom(prenom); c.setNom(nom);c.setTelephone(telephone);
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetPU");
 ClientJpaController clientControleur = new ClientJpaController( emf );
 clientControleur.create( c );
 return "ok" ;}
public String sauvegardeRequete()
{
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetPU");
 RequeteJpaController j = new RequeteJpaController( emf );
 Requete r = new Requete( );
 r.setEmail( email ); r.setLogiciel(logiciel); r.setProbleme( probleme ); r.setSysteme(systeme);
 j.create(r);

 ClientJpaController clientControleur = new ClientJpaController( emf );
 Client c = clientControleur.findClient(email);
 if( c != null) return "ok";
 else return "client";
}
}