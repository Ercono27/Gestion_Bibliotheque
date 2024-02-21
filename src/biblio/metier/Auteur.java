package biblio.metier;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String nom;
    private String prenom;
    private String nationalite;
    private List <Ouvrage> listeOuvrage=new ArrayList<>();

    public Auteur() {
    }

    public Auteur(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void listerExemplaires(){
    }
    public void listerExemplaires(boolean enLocation){
    }

    public List<Ouvrage> getOuvrage() {
        return listeOuvrage;
    }

    public void setOuvrage(List<Ouvrage> listeOuvrage) {
        this.listeOuvrage = listeOuvrage;
    }
}
