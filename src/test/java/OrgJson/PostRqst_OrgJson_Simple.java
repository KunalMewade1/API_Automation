package OrgJson;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PostRqst_OrgJson_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject BasicInfo= new JSONObject();
		BasicInfo.put("FirstName", "RaghuBir");
		BasicInfo.put("LastName", "Singh");
		BasicInfo.put("Age", "38");
		BasicInfo.put("id", "3699");
		
		Response res= given()
				.contentType(ContentType.JSON)
				.body(BasicInfo.toString())
				.when()
				.post("http://localhost:3000/friends");
		        //delete("http://localhost:3000/friends");
		
		System.out.println("Status for the post request:=" + res.getStatusCode());
		System.out.println("Data posted is");
		System.out.println(res.asString());



}
}
