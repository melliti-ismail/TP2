package magasin;
public class Testmagasin {
    public static void main(String[] args) {
        Magasin monMagasin = new Magasin("Electro-Home");
        Article art1 = new Article(101, "Téléviseur LED", "Noir", 450.0, "Électronique");
        Article art2 = new Article(102, "Aspirateur", "Gris", 120.0, "Électroménager");
        Article_Lot lot1 = new Article_Lot(201, "Ampoules LED E27", "Blanc", 25.5, "Éclairage",20);
        Article_Lot lot2 = new Article_Lot(202, "Piles AA", "Noir/Rouge", 10.0, "Accessoires",10);
        monMagasin.ajouterArticle(art1);
        monMagasin.ajouterArticle(art2);
        monMagasin.ajouterArticle(lot1);
        monMagasin.ajouterArticle(lot2);
        System.out.println("\n--- Affichage de tous les articles du magasin ---");
        monMagasin.afficherMagasin();
        System.out.println("\n--- Meme Famille ---");
        Article art3 = new Article(103, "Casque Audio", "Noir", 60.0, "Électronique");
        System.out.println("L'article '" + art1.getDesignation() + "' et l'article '" + art3.getDesignation() + 
                           "' sont-ils de la même famille ? " + art1.memeFamille(art3));
        System.out.println("\n--- Recherche des articles de la famille 'Électronique' ---");
        for (Article a : monMagasin.rechercherParFamille("Électronique")) {
            System.out.println(a.toString());
        }
    }
}