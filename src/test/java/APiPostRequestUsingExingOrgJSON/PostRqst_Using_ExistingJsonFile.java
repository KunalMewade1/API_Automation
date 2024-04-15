package APiPostRequestUsingExingOrgJSON;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_Using_ExistingJsonFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f= new File("../API_Automation_Project/Body.json");
		FileReader fr= new FileReader(f);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject jo= new JSONObject(jt);
		System.out.println(jo.toString());
		
		Response Res= given()
				  .contentType(ContentType.JSON)
				  .body(jo.toString())
				  .when()
				  .post("http://localhost:3000/friends");
		System.out.println("status code of the post request" + Res.getStatusCode());
		System.out.println("Data Posted is");
		System.out.println(Res.asString());
		

	}

}
