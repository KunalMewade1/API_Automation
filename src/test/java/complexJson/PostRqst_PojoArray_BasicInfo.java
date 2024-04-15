package complexJson;

public class PostRqst_PojoArray_BasicInfo {
	String FirstName;
	String LastName;
	String Id;
	String MentorName;
	String courseName;
	String Designation;
	Post_Rqst_PojoComplex_Address[] Address;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMentorName() {
		return MentorName;
	}
	public void setMentorName(String mentorName) {
		MentorName = mentorName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Post_Rqst_PojoComplex_Address[] getAddress() {
		return Address;
	}
	public void setAddress(Post_Rqst_PojoComplex_Address[] address) {
		Address = address;
	}
	

}
