package biblio.metier;

import java.time.LocalDate;

public class Livre extends Ouvrage {

    private String isbn;
    private int nombrePages;
    private TypeLivre typeLivre;
    private String resume;

    public Livre() {
        super("", (byte)0, LocalDate.now(), TypeOuvrage.LIVRE, 0.0, "", "");
    }

    public Livre(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre,String isbn, int nombrePages, TypeLivre typeLivre, String resume) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombrePages = nombrePages;
        this.typeLivre = typeLivre;
        this.resume = resume;
    }

}
