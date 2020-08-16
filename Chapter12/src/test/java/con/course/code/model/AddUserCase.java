package con.course.code.model;

public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public String getExpected() {
		return expected;
	}
	public void setExpected(String expected) {
		this.expected = expected;
	}
	private String age;
    private String permission;
    private String isDelete;
    private String expected;
	@Override
	public String toString() {
		return "AddUserCase [userName=" + userName + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ ", permission=" + permission + ", isDelete=" + isDelete + ", expected=" + expected
				+ ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getSex()=" + getSex()
				+ ", getAge()=" + getAge() + ", getPermission()=" + getPermission() + ", getIsDelete()=" + getIsDelete()
				+ ", getExpected()=" + getExpected() + "]";
	}
}
