package con.course.code.model;

public class GetUserInfoCase {
    private int userId;
    
    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
		return "GetUserInfoCase [userId=" + userId + ", expected=" + expected + ", getUserId()=" + getUserId()
				+ ", getExpected()=" + getExpected() + "]";
	}
}
