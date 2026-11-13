package magasin;
import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private final String nom;
    private final List<Article> listeArticles;
    public Magasin(String nom) {
        this.nom = nom;
        this.listeArticles = new ArrayList<>();
    }
    public void ajouterArticle(Article a) {
        if (a != null) {
            listeArticles.add(a);
            System.out.println("Article ajouté avec succès : " + a.getDesignation());
        }
    }
    public void afficherMagasin() {
        System.out.println("Magasin : " + nom);
        if (listeArticles.isEmpty()) {
            System.out.println("Le magasin est vide.");
        } else {
            for (Article a : listeArticles) {
                System.out.println(a.toString());
            }
        }
    }
    public List<Article> rechercherParFamille(String Famille) {
        List<Article> resultat = new ArrayList<>();
        for (Article a : listeArticles) {
            if (a.getFamille() != null && a.getFamille().equalsIgnoreCase(Famille)) {
                resultat.add(a);
            }
        }
        return resultat;
    }
}