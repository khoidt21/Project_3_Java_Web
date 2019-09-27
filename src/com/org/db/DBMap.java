package com.org.db;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBMap {
	
	 	public static HashMap<String, String> mapAccount = new HashMap<String, String>();
	    public static HashMap<String, String> listAccountLogin = new HashMap<String,String>();
	    
		public void addAccount(String username,String password){
			  mapAccount.put(username, password);	
		}
		public boolean checkAccount(String username,String password) {
			
			HashMap<String,String> mapAcc = mapAccount;
			if(mapAcc !=null) {
				for(Map.Entry m : mapAcc.entrySet()){    
						if(m.getKey().equals(username) && m.getValue().equals(password)) {
							return true;
						}
				}
			}
			return false;
		}
		public void getAllAccount() {
			HashMap<String,String> mapAccAll = mapAccount;
			if(mapAccAll !=null) {
				for(String i : mapAccAll.keySet()) {
					System.out.println("Key " + i +  " " + "value " + " " + mapAccAll.get(i));
				}
			}
		}
		public void addAcountLogin(String username,String password) {
			listAccountLogin.put(username,password);
		}
		public String getAllAccountLogin() {
			String html = "";
			for (String i:listAccountLogin.keySet()) {
				html +="<div class='lead'>";
				html +=i;
				html +="</div>";
			}
			return html;
		}
}
