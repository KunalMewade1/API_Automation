package OrgJson;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject AddressInfo= new JSONObject();
		AddressInfo.put("H_No","37277");
		AddressInfo.put("StreetName","August Lane");
		AddressInfo.put("Age","38");
		JSONObject BasicInfo= new JSONObject();
		BasicInfo.put("FirstName", "RaghuBir");
		BasicInfo.put("LastName", "Singh");
		BasicInfo.put("Age", "38");
		BasicInfo.put("id", "3699");
		BasicInfo.put("Address",AddressInfo);
		
		Response res= given()
				      .contentType(ContentType.JSON)
				      .body(BasicInfo.toString())
				      .when()
				      .post("http://localhost:3000/friends");
		
		
		System.out.println("Status code for the post request is" + res.getStatusCode());
		System.out.println("Data posted is ");
		System.out.println(res.asString());
		
		
		
		
		

	}

}
