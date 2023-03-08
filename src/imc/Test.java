package imc;

import mathematique.Divisiblite;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1=new Personne();
		p1.setNomComplet("Ali");
		//System.out.println(p1.getNomComplet());
		Personne p2=new Personne("User ", 110, 1.90);
		/*long imcVal=p2.indice();
		String userEval=p2.evaluation();
		*/
		//System.out.println(p2.toString());
		Divisiblite divisiblite=new Divisiblite(346);
		divisiblite.diviseTrois();
		
	}

}
