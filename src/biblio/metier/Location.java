package biblio.metier;

import java.time.LocalDate;
import java.util.*;

public class Location {
    private Lecteur lecteur;
    private List<Exemplaire> exemplaire = new ArrayList<>();
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    double amende;

    public Location(LocalDate dateLoc, LocalDate dateRestitution, double amende) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public double getAmende() {
        return amende;
    }

    public void setAmende(double amende) {
        this.amende = amende;
    }

    public void calculerAmende(){

    }
    public void enregistrerRetour(){

    }

}