package imc;

public class Personne {
	//boilerplate code
	// x % y=> le reste de division de x et y
private String nomComplet;
private double poids,taille;



public Personne() {
	super();
}
public Personne(String nomComplet, double poids, double taille) {
	super();
	this.nomComplet = nomComplet;
	this.poids = poids;
	this.taille = taille;
}
//encapsulation
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public double getPoids() {
	return poids;
}
public void setPoids(double poids) {
	this.poids = poids;
}
public double getTaille() {
	return taille;
}
public void setTaille(double taille) {
	this.taille = taille;
}
public long indice()
{
double imc=this.poids/(Math.pow(this.taille,2));
return Math.round(imc); // l'arrondie de IMC
}
public String evaluation()
{
long valeurImc=this.indice();
if(valeurImc<20)
	return "vous êtes maigre";
else if(valeurImc<=25)
{
	return "vous êtes idéale!";
}
else
	return "vous êtes en surpoid";
	

}
@Override
public String toString() {
	return "Personne [nomComplet=" + nomComplet + ", poids=" + poids + ", taille=" + taille + ", indice=" + indice()
			+ ", evaluation=" + evaluation() + "]";
}

}
