package architecture;

public class humain {
    protected String nom;
    protected String prenom;
    protected String dateDeNaissance;

    public humain(String nom,String prenom, String dateDeNaissance){
        this.dateDeNaissance=dateDeNaissance;
        this.nom=nom;
        this.prenom=prenom;

    }

    public humain(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

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

    @Override
    public String toString() {
        return "humain{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance='" + dateDeNaissance + '\'' +
                '}';
    }
}
