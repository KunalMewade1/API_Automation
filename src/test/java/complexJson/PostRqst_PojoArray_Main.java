package complexJson;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_PojoArray_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Post_Rqst_PojoComplex_Address[] Address= new Post_Rqst_PojoComplex_Address[2];
     Address[0]= new Post_Rqst_PojoComplex_Address();
     Address[1]= new Post_Rqst_PojoComplex_Address();
     
     Address[0].setH_No("3726/10");
     Address[0].setStreet("August LANE");
     Address[0].setZipCode("ME46DG");
     
     Address[1].setH_No("486");
     Address[1].setStreet("sadle Lane");
     Address[1].setZipCode("A49AB");
     
     PostRqst_PojoArray_BasicInfo basicInfo= new PostRqst_PojoArray_BasicInfo();
     basicInfo.setFirstName("Rahubir");
     basicInfo.setLastName("Singh");
     basicInfo.setCourseName("APT Testing");
     basicInfo.setDesignation("Test Lead");
     basicInfo.setMentorName("Deepak");
     basicInfo.setId("3696");
     basicInfo.setAddress(Address);
     
     Response res= given()
    		      .contentType(ContentType.JSON)
    		      .body(basicInfo)
    		      .when()
    		      .post("http://localhost:3000/friends");
     
     System.out.println("Status code for post requste" + res.getStatusCode());
     System.out.println("Data posted is ");
     System.out.println(res.asString());
     
    
     
     
	}

}
