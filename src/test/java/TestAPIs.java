import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestAPIs  {
    

    @Test
    public void testGetUsers() throws NoSuchFieldException, Exception {
        //TODO: Add your code here
    }
    
    
     /****************************************************************************************************************************************************
     Function Name : callGet
     Description : Performs a get with URL, headers and verifies with the status code expected
     Parameters : URL, headers and status code
     *****************************************************************************************************************************************************/

    public void callGet(String URL, int statusCode) {
        System.out.println("-----------------------***GET CALL***-----------------------");
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL)
                .then()
                .assertThat().statusCode(statusCode).and().extract().response();
    }

    /****************************************************************************************************************************************************
    Function Name : callGetWithQueryParam
    Description : Performs a get with URL, headers and verifies with the status code expected
    Parameters : URL, headers and status code
     *****************************************************************************************************************************************************/

    public void callGetWithQueryParam(String URL, int statusCode, String queryKey, String queryValue) {
        System.out.println("-----------------------***GET CALL WITH PARAMS***-----------------------");
        Response response = given()
                .contentType(ContentType.JSON)
                .queryParam(queryKey,queryValue)
                .when()
                .get(URL)
                .then()
                .assertThat().statusCode(statusCode).and().extract().response();
    }


}


