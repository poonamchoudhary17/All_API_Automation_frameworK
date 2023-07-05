package RequestRepository;

public class Post_Retry_Req_Repository {
	
public static String baseURI()
{
	String BaseURI = "https://reqres.in/" ;
	return BaseURI;
}
public static String Post_Resource() 
{
	String post_Resource= "api/users";
	return post_Resource;
}
public static String Post_Req_TC1() 
{
	String RequestBody= "{\r\n" + "  "
			+ "  \"name\": \"morpheus\",\r\n" + " "
			+ "   \"job\": \"leader\"\r\n" + "}";    
	return RequestBody;
}
}

