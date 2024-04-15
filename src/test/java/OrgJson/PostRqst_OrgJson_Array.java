package OrgJson;
import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_OrgJson_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONArray Address= new JSONArray();
		JSONObject Primary_AddressInfo= new JSONObject();
		
		Primary_AddressInfo.put("H_No", "P_3726");
		Primary_AddressInfo.put("StreetName", "Paras Down Town");
		Primary_AddressInfo.put("Zip", "ME46DG");
		
		JSONObject  Secondary_AddressInfo= new JSONObject();
		Secondary_AddressInfo.put("H_No", "S-3726");
		Secondary_AddressInfo.put("StreetName", "Sadle Lake NE");
		Secondary_AddressInfo.put("Zip", "CA36AB");
		
		Address.put(0,Primary_AddressInfo);
		Address.put(1,Secondary_AddressInfo);
		
		JSONObject BasicInfo= new JSONObject();
		BasicInfo.put("FirstName", "RaghuBir");
		BasicInfo.put("LastName", "Singh");
		BasicInfo.put("Age", "38");
		BasicInfo.put("id", "3698");
		BasicInfo.put("Address",Address);
		
		Response Res= given()
				  .contentType(ContentType.JSON)
				  .body(BasicInfo.toString())
				  .when()
				  .post("http://localhost:3000/friends");
		
		System.out.println("Status code for the post request:=" + Res.getStatusCode());
		System.out.println("Data posted is ");
		System.out.println(Res.asString());
		
		
		
		
		

	}

}
