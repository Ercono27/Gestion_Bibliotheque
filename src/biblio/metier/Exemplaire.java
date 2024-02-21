package biblio.metier;

public class Exemplaire {
    private String matricule;
    private String descriptionEtat;


    public void modifierEtat(String etat){}
    public void lecteurActuel(){}
    public void lecteurs(){}
    public void envoiMailLecteurActuel(Mail mai){}
    public void envoiMailLecteurs(Mail mail){}
    public boolean enRetard(){
        return true;
    }
    public int joursRetard(){
        return 0;
    }
    public boolean enLocation(){
        return true;
    }
}
