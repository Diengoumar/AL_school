package Connexion;



public class login  {
    private String identifiant;
    private String mdp;

    public login(String identifiant, String mdp) {
        this.identifiant = identifiant;
        this.mdp = mdp;
    }
    public boolean verifIdentiant(){
        return true;
    }
    public boolean verifMdp(){
        return true;
    }
    public boolean connexion(){
        verifIdentiant();
        verifMdp();
        System.out.println("ok");
        return true;
    }
}
