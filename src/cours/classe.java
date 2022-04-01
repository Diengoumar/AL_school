package cours;

import java.util.HashMap;
import java.util.List;

public class classe {
    private String classe;
    private HashMap<String, List> mesCours;
    public classe(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public HashMap getMesCours() {
        return mesCours;
    }

    public void setMesCours(HashMap mesCours) {
        this.mesCours = mesCours;
    }

    public List matieres(){
        return mesCours.get(getClasse());
    }
}
