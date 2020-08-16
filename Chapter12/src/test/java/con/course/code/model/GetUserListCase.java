package con.course.code.model;

public class GetUserListCase {
    private String userName;
    private String age;
    private String sex;
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
		return "GetUserListCase [userName=" + userName + ", age=" + age + ", sex=" + sex + ", expected=" + expected
				+ ", getUserName()=" + getUserName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()
				+ ", getExpected()=" + getExpected() + "]";
	}
}
