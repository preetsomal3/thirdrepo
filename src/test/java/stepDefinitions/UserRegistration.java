package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.LittleEndianDataOutputStream;

public class UserRegistration {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigates on Reg. page");
	   
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e:userList) {
			for (String e1:e) {
				System.out.println(e1);
			}
			
		}
	  
	}
	
	@When("User enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
	  
		List<Map<String,String>> userList = dataTable.asMaps(String.class,String.class);
		
		//System.out.println(userList);// complete list consisting of 2 maps
		//System.out.println(userList.get(0).get("firstname"));// for map at 0 index, fetch the value using key i.e. firstname/lastname/email/id/location
		
		for (Map<String,String> e: userList ) {
			
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("id"));
			System.out.println(e.get("location"));
		}
	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("User registration successful");
	}


}
