package Serialization;

import java.io.Serializable;

public class User implements Serializable {
	
		 
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -6677871809562425053L;
	
	private String userName;
	private transient String password;   //transient is used to hide 


		public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
		
	
		
		@Override
		public String toString() {
			return "User [userName=" + userName + ", password=" + password + "]";
		}

}
