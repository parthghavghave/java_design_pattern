package builder;

public class User {
	
	private final String id;
	private final String UserName;
	private final String emailId;
	
	private User(UserBuilder userBuilder) {
		
		this.id = userBuilder.id;
		this.UserName = userBuilder.UserName;
		this.emailId = userBuilder.emailId;
		
	}

	public String getId() {
		return id;
	}

	public String getUserName() {
		return UserName;
	}

	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String toString() {
		return "User [getId()=" + getId() + ", getUserName()=" + getUserName() + ", getEmailId()=" + getEmailId() + "]";
	}

	//inner class to create obj

	public static class UserBuilder {
		
		private String id;
		private String UserName;
		private String emailId;
		
		public UserBuilder() {
			
		}
		
		public UserBuilder setId(String id) {
			this.id = id;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			UserName = userName;
			return this;
		}
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		public User Build() {
			User user = new User(this);
			return user;
		}
		
	}

}
