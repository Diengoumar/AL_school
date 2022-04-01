package architecture;

import cours.classe;

public class etudiant extends humain{

    private classe classe;
    private int totalpay;
    private int pay;

    public etudiant(String nom, String prenom, String dateDeNaissance, classe classe, int totalpay, int pay) {
        super(nom, prenom, dateDeNaissance);
        this.classe = classe;
        this.totalpay = totalpay;
        this.pay = pay;
    }

    public classe getClasse() {
        return classe;
    }

    public void setClasse(classe classe) {
        this.classe = classe;
    }

    public int getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(int totalpay) {
        this.totalpay = totalpay;
    }

    public int getpay() {
        return pay;
    }

    public void setpay(int pay) {
        this.pay = pay;
    }
    public int resteApayer(){
        return totalpay-pay;
    }

    @Override
    public String toString() {
        return "etudiant{" +
                "classe='" + classe.getClasse() + '\'' +
                ", totalpay=" + totalpay +
                ", pay=" + pay +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance='" + dateDeNaissance + '\'' +
                '}';
    }
}
