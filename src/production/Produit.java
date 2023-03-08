package production;

public class Produit {
private double prix;
private int quantite;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(double prix, int quantite) {
	super();
	this.prix = prix;
	this.quantite = quantite;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double prixHT()
{
return this.quantite*this.prix;	
}
public double taxe()
{
if(this.prixHT()<=10000)
{
return this.prixHT()*0.07;
}
else if(this.prixHT()<=50000)
	return this.prixHT()*0.1;
else
	return this.prixHT()*0.14;


}
public double prixTTC()
{
return this.prixHT()+this.taxe();	
}
@Override
public String toString() {
	return "Produit [prix=" + prix + ", quantite=" + quantite + ", prixHT()=" + prixHT() + ", taxe()=" + taxe()
			+ ", prixTTC()=" + prixTTC() + "]";
}


}
