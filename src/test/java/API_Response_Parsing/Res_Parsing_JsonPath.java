package API_Response_Parsing;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Res_Parsing_JsonPath {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Response res= given()
				      .contentType(ContentType.JSON)
				      .when() 
				      .get("http://localhost:3000/store");
				     
		
		System.out.println(res.asString());
		String firstname= res.jsonPath().get("[1].firstname");
		System.out.println(firstname);

	}

}
