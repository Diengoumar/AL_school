package architecture;

import cours.classe;

import java.util.List;

public class professeur extends humain {
    private String profession;
    private int salaire;
    private List<classe> mesclasses;


    public professeur(String nom, String prenom, String dateDeNaissance, String profession) {
        super(nom, prenom, dateDeNaissance);
        this.profession = profession;

    }

    public professeur(String nom, String prenom, String profession, int salaire, List<classe> mesclasses) {
        super(nom, prenom);
        this.profession = profession;
        this.salaire = salaire;
        this.mesclasses = mesclasses;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getsalaire() {
        return salaire;
    }

    public void setsalaire(int salaire) {
        salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public List<classe> getMesclasses() {
        return mesclasses;
    }

    public void setMesclasses(List<classe> mesclasses) {
        this.mesclasses = mesclasses;
    }
    public void affecterUneClasse(classe nouvelleClasse){
        mesclasses.add(nouvelleClasse);
    }
    public void retirerUneClasse(classe supprimerclasse){
        mesclasses.get(mesclasses.indexOf(supprimerclasse));
    }
    @Override
    public String toString() {
        return "professeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance='" + dateDeNaissance + '\'' +
                ", profession='" + profession + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
