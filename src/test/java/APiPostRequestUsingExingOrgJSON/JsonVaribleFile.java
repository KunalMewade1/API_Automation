package APiPostRequestUsingExingOrgJSON;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonVaribleFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f= new File("../API_Automation_Project/JsonVariableFile.json");
		FileReader fr= new FileReader(f);
		JSONTokener jt= new JSONTokener(fr);
		JSONObject jo= new JSONObject(jt);
		
		String FirstName,id,designation;
		Scanner variables=new Scanner(System.in);
		id=variables.next();
		FirstName=variables.next();
		designation=variables.next();
		
		String Data=jo.toString();
		Data=Data.replaceAll(Pattern.quote("{{"+"id"+"}}"), id);
		Data=Data.replaceAll(Pattern.quote("{{"+"FirstName"+"}}"), FirstName);
		Data=Data.replaceAll(Pattern.quote("{{"+"designation"+"}}"), designation);
		
		Response Res=given()
				.contentType(ContentType.JSON)
				.body(Data)
				.when()
				.post("http://localhost:3000/friends");
		
		System.out.println("Status code for the post request:=" + Res.getStatusCode());
		System.out.println("Data posted is");
		System.out.println(Res.asString());
	}

}
