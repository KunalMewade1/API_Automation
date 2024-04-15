package API_Response_Parsing;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Json_Array_Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response Res= given()
				 	  .contentType(ContentType.JSON)
				 	  .when()
				 	  .get("http://dummy.restapiexample.com/api/v1/employees");
		 
		       
		//String EmployeeName=Res.jsonPath().getString("data[5].employee_name");
		//System.out.println(EmployeeName);
		       //System.out.println(Res.asString());
		JSONObject jo=  new JSONObject(Res.asString());
		//String EmployeeName= jo.getJSONArray("data").getJSONObject(5).getString("employee_name").toString();
		//System.out.println("Employee name of the 6th employee is "+EmployeeName);
		for(int i=0; i<jo.getJSONArray("data").length();i++)
		{
		String Record=jo.getJSONArray("data").getJSONObject(i)
		.get("employee_name").toString();
		System.out.println(i+" "+Record);
		}
		
		
		

	}

}
