import java.util.HashMap;

public class IDandPasswords {
	HashMap<String , String> logininfo = new HashMap<String , String>();
	
	 IDandPasswords() {
		 logininfo.put("Bro", "pizza");
		 logininfo.put("test", "test");
		 logininfo.put("test2", "test2");
	}

	 
	 protected HashMap getLoginInfo() {
		 return logininfo;
		
	}
}
