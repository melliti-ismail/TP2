# TP2
ex1 ISMAIL MELLITI , TP2 ,
    class Article {
        # int numinventaire
        # String designation
        # String couleur
        # double prix
        # String famille
        + Article(int numinventaire, String designation, String couleur, double prix, String famille)
        + String toString()
        + boolean memeFamille(Article a)
        + int getNuminventaire()
        + String getDesignation()
        + String getCouleur()
        + String getPrix()
        + String getFamille()
    }

    class Article_Lot {
        - int quantite
        + Article_Lot(int numinventaire, String designation, String couleur, double prix, String famille, int quantite)
        + String toString()
        + int getQuantite()
        + void setQuantite(int quantite)
    }

    class Magasin {
        - String nom
        - List~Article~ listeArticles
        + Magasin(String nom)
        + void ajouterArticle(Article a)
        + void afficherMagasin()
        + List~Article~ rechercherParFamille(String famille)
    }

    Article <|-- Article_Lot : Héritage (Est un)
    Magasin "1" --> "0..*" Article : Contient (Association)
