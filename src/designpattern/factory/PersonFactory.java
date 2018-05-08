package designpattern.factory;

public class PersonFactory {
	public Person createPerson(String pNume,String pCNP,Integer pVarsta,Integer pHeight) {
		Person p = new Person();
		// VALIDARI , ALEA ALE
		p.setNume(pNume);
		p.setCnp(pCNP);
		p.setAge(13);
		p.setHeight(pHeight);
		return p;
	}
}
