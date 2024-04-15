package API_Automation_Project.API_Automation_Project;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostRqst__PojoComplex_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Post_Rqst_PojoComplex_Address Address= new Post_Rqst_PojoComplex_Address();
		Address.setH_No("3726/10");
		Address.setStreet("AugustLane");
		Address.setZipCode("ME46DG");
		
		Post_Rqst_PojoComplex_BasicInfo BasicInfo= new Post_Rqst_PojoComplex_BasicInfo();
		BasicInfo.setFirstName("Rahubir");
		BasicInfo.setLastName("singh");
		BasicInfo.setCourseName("API_Testing");
		BasicInfo.setDesignation("TestLead");
		BasicInfo.setMentorName("Deepak");
		BasicInfo.setId("3693");
		BasicInfo.setAddress(Address);
		
		
		Response res= given()
				     .contentType(ContentType.JSON)
				     .body(BasicInfo)
				     .when()
                    .post("http://localhost:3000/friends");
		           //put("http://localhost:3000/friends/369RT");
		         //delete("http://localhost:3000/friends/3693");
		
		System.out.println("Status code for the post request" + res.getStatusCode());
		System.out.println("Data posted is");
		System.out.println(res.asString());
	}

}
