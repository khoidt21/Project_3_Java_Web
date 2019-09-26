package com.org.db;
import java.util.HashMap;
import java.util.Map;

public class DBMap {
	
	 	public static HashMap<String,String> mapAccount;
	 	
		public void addAccount(String username,String password){
			  mapAccount = new HashMap<String, String>();
			  mapAccount.put(username, password);	
			  
		}
		
		public String checkAccount(String username,String password) {
			HashMap<String,String> mapAcc = mapAccount;
			if(mapAcc !=null) {
				for(Map.Entry m : mapAcc.entrySet()){    
				       //	System.out.println("check account " + m.getKey() + " " + m.getValue());
						if(m.getKey().equals(username) && m.getValue().equals(password)) {
							return "Sccuess";
						}
				}
			}
			return "Error";
		}
		
		public void getAllAccount() {
			HashMap<String,String> mapAccAll = mapAccount;
			//String allAccount = "";
			if(mapAccAll !=null) {
				for(String i : mapAccAll.keySet()) {
					System.out.println("Key " + i +  " " + "value " + " " + mapAccAll.get(i));
				}
			}
		}
		
}
