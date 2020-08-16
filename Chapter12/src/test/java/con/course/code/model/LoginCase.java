package con.course.code.model;

public class LoginCase {
        private int id;
        private String userName;
        private String password;
        public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getExpected() {
			return expected;
		}

		public void setExpected(String expected) {
			this.expected = expected;
		}

		private String expected;
		@Override
		public String toString() {
			return "LoginCase [id=" + id + ", userName=" + userName + ", password=" + password + ", expected="
					+ expected + ", getId()=" + getId() + ", getUserName()=" + getUserName() + ", getPassword()="
					+ getPassword() + ", getExpected()=" + getExpected() + "]";
		}
}
