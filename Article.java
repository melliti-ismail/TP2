package magasin;

public class  Article {
    public int Numinventaire;
    public String Designation;
    public String Couleur;
    public double Prix;
    public String Famille;
    public Article(int Numinventaire,String Designation,String Couleur,double Prix,String Famille){
        this.Numinventaire=Numinventaire;
        this.Couleur=Couleur;
        this.Designation=Designation;
        this.Prix=Prix;
        this.Famille=Famille;
    }
    public int getNuminventaire(){
        return Numinventaire;
    }
    public String getCouleur(){
        return Couleur;
    }
    public String getDesignation(){
        return Designation;
    }
    public double getPrix(){
        return Prix;
    }
    public String getFamille(){
        return Famille;
    }
    public void setNuminventaire(int Numinventaire){
        this.Numinventaire= Numinventaire;
    }
    public void setCouleur(String Couleur){
        this.Couleur=Couleur;
    }
    public void setDesignation(String Designation){
        this.Designation=Designation;
    }
    public void setPrix(double Prix){
        this.Prix=Prix;
    }
   public void setFamille(String Famille){
       this.Famille=Famille;
   }
    @Override
    public String toString(){
         return "Article [Numinventaire=" + Numinventaire + ", Désignation=" + Designation + ", Couleur=" + Couleur + ", Prix=" + Prix + ", Famille=" + Famille + "]";        
    }
    public boolean memeFamille(Article a) {
        if (a == null) {
            return false;
        }
        return this.Famille != null && this.Famille.equalsIgnoreCase(a.Famille);
    }
   
    public static void main(String[] args) {
    }
    
}
