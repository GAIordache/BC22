package designpattern.factory;

public class Person {
	private String mNume;
	private Integer mAge;
	private String mCnp;
	private Integer mHeight;

	public String getNume() {
		return mNume;
	}

	public void setNume(String pNume) {
		mNume = pNume;
	}

	public Integer getAge() {
		return mAge;
	}

	public void setAge(Integer pAge) {
		mAge = pAge;
	}

	public String getCnp() {
		return mCnp;
	}

	public void setCnp(String pCnp) {
		mCnp = pCnp;
	}

	public Integer getHeight() {
		return mHeight;
	}

	public void setHeight(Integer pHeight) {
		mHeight = pHeight;
	}

}
