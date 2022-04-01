package architecture;

import java.util.List;

public class directeur extends humain{
    private List<professeur> professeurList;
    private List<etudiant> etudiantList;

    public directeur(String nom, String prenom, List<professeur> professeurList, List<etudiant> etudiantList) {
        super(nom, prenom);
        this.professeurList = professeurList;
        this.etudiantList = etudiantList;
    }

    public List<professeur> getProfesseurList() {
        return professeurList;
    }

    public void setProfesseurList(List<professeur> professeurList) {
        this.professeurList = professeurList;
    }

    public List<etudiant> getEtudiantList() {
        return etudiantList;
    }

    public void setEtudiantList(List<etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

    @Override
    public String toString() {
        return "directeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public void ajoutprofesseur(professeur p){
        professeurList.add(p);
    }
    public void SuppProfesseur(professeur p){
        professeurList.remove(p);
    }
    public void ajoutEtudiant(etudiant e){
        etudiantList.add(e);
    }
    public void suppEtudiant(etudiant e){
        etudiantList.add(e);
    }
    public String resteAPayerEtudiant(etudiant etudiant){
        etudiant e=etudiantList.get(etudiantList.indexOf(etudiant));
        return "montant à payer "+e.resteApayer();
    }
    public void changerSalaireProf(professeur p,int salaire){

        professeurList.get(professeurList.indexOf(p)).setsalaire(salaire);
        System.out.println("salaire du professeur "+ p.prenom+"à été changé à : "+salaire);
    }
}
