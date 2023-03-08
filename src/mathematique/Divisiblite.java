package mathematique;

public class Divisiblite {
private int x;

public Divisiblite(int x) {
	super();
	this.x = x;
}

public Divisiblite() {
	super();
	// TODO Auto-generated constructor stub
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
public void diviseTrois()
{
int c=this.x/100;
int d=(this.x%100)/10;
int u=this.x%10;
int somme=c+d+u;
if(somme%3==0)
{
System.out.println(x+ "est divisible par 3");	
}
else
	System.out.println(x+ "n 'est pas divisible par 3");
}



}
