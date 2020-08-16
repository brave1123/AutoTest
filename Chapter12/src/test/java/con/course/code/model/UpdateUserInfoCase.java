package con.course.code.model;

public class UpdateUserInfoCase {

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	private int id;
    private int userId;
    private String userName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
	@Override
	public String toString() {
		return "UpdateUserInfoCase [id=" + id + ", userId=" + userId + ", userName=" + userName + ", sex=" + sex
				+ ", age=" + age + ", permission=" + permission + ", isDelete=" + isDelete + ", expected=" + expected
				+ ", getId()=" + getId() + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getSex()=" + getSex() + ", getAge()=" + getAge() + ", getPermission()=" + getPermission()
				+ ", getIsDelete()=" + getIsDelete() + ", getExpected()=" + getExpected() + "]";
	}

}
