package API_Automation_Project.API_Automation_Project;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

    public static void main(String[] args) {
        try {
            // TODO Auto-generated method stub
            POJO_PostReq Data = new POJO_PostReq();
            Data.setFirstName("Raghubir_tanu");
            Data.setLastName("Singh_1");
            Data.setId("369_6");
            Data.setMentorName("Deepak_chahana");
            Data.setCourseName("APITesting");
            Data.setDesignation("Project_Leader1");

            Response Res = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(Data)
                    .when()
                    .post("http://localhost:3000/friends");

            System.out.println("Status code for post request: " + Res.getStatusCode());
            System.out.println("Data posted");
            System.out.println(Res.asString());
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}