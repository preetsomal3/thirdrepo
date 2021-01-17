package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BillingDefinition {
	
	double billingamount;
	double taxamount;
	double finalamount;
	
	
	@When("User enter billing amount {string}")
	public void user_enter_billing_amount(String billingamount) {
		this.billingamount = Double.parseDouble(billingamount);
	    
	}

	@When("User enter tax amount  {string}")
	public void user_enter_tax_amount(String taxamount) {
	    this.taxamount = Double.parseDouble(taxamount);
	}

	@Then("The final amount is {string}")
	public void the_final_amount_is(String finalamount) {
	   this.finalamount =this.taxamount + this.billingamount;
	   
	   System.out.println(this.finalamount);
		System.out.println(Double.parseDouble(finalamount));
		
	   Assert.assertTrue(this.finalamount == Double.parseDouble(finalamount));
	}

	
	
	
	@When("User enter billing amount {int}")
	public void user_enter_billing_amount(Integer billingamount) {
		this.billingamount = billingamount;
	    
	}

	@When("User enter tax amount  {int}")
	public void user_enter_tax_amount(Integer taxamount) {
		this.taxamount = taxamount;
	   
	}

	@Then("The final amount is {int}")
	public void the_final_amount_is(Integer finalamount) {
		this.finalamount = finalamount;
	   
	}

	@When("User enter tax amount  {double}")
	public void user_enter_tax_amount(Double taxamount) {
		this.taxamount = taxamount;
	   
	}

	@Then("The final amount is {double}")
	public void the_final_amount_is(Double finalamount) {
		this.finalamount = this.taxamount + this.billingamount;
		
		
        Assert.assertTrue(this.finalamount == finalamount);
	}
	

}
