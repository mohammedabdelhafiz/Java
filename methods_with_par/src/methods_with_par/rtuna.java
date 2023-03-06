package methods_with_par;

public class rtuna {
	private String girlname;
	public void setname (String name) {
		girlname= name;
	}
	public String getname() {
		return girlname;
	}
	
	public void saying () {
		System.out.printf("your gf is : %s", getname());
	}
}
