package magasin;


public class Article_Lot extends Article {
    public int Npiece;
    
    public Article_Lot(int Numinventaire, String Designation, String Couleur, double Prix, String Famille, int Npiece) {
        super(Numinventaire, Designation, Couleur, Prix, Famille);
        this.Npiece=Npiece;
    }
    public int getNpiece(){
        return Npiece;
    }
    public void setNpiece(int Npiece){
        this.Npiece=Npiece;
    }
    @Override
    public String toString(){
        return "Quantite: "+Npiece;
    }
}
