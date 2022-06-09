package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class ManageAdress 
{
	@When("^user click on ManageAdress$")
	public void user_click_on_ManageAdress() throws Throwable 
	{
		Thread.sleep(6000);
		Object[] input4=new Object[1];
		input4[0]=("(//*[@class='NS64GK'])[1]");
		Hashtable<String,Object> output4=SeleniumOperation.clickonelements(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on ManageAdress$",output4.get("MESSAGE").toString());
	    
	}

	@When("^user click on add new adress$")
	public void user_click_on_add_new_adress() throws Throwable 
	{
		Thread.sleep(6000);
		Object[] input4=new Object[1];
		input4[0]=("//*[@class='_1QhEVk']");
		Hashtable<String,Object> output4=SeleniumOperation.clickonelements(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on add new adress$",output4.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as a name$")
	public void user_enter_as_a_name(String value1) throws Throwable 
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("(//*[@class='_1w3ZZo _2mFmU7'])[1]");
		input5[1]=value1;
		Hashtable<String,Object> output5=SeleniumOperation.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a name$",output5.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as a mobile number$")
	public void user_enter_as_a_mobile_number(String value12) throws Throwable
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("(//*[@class='_1w3ZZo _2mFmU7'])[2]");
		input5[1]=value12;
		Hashtable<String,Object> output5=SeleniumOperation.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a mobile number$",output5.get("MESSAGE").toString());
	}
	    
		
	@When("^user enter \"([^\"]*)\" as a pincode$")
	public void user_enter_as_a_pincode(String value123) throws Throwable
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("(//*[@class='_1w3ZZo _2mFmU7'])[3]");
		input5[1]=value123;
		Hashtable<String,Object> output5=SeleniumOperation.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a pincode$",output5.get("MESSAGE").toString());
		
	}

	@When("^user enter \"([^\"]*)\" as a locality$")
	public void user_enter_as_a_locality(String value1234) throws Throwable
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("(//*[@class='_1w3ZZo _2mFmU7'])[4]");
		input5[1]=value1234;
		Hashtable<String,Object> output5=SeleniumOperation.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a locality$",output5.get("MESSAGE").toString());
		
	}

	@When("^user enter \"([^\"]*)\" as a Adress$")
	public void user_enter_as_a_Adress(String value12345) throws Throwable 
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("//*[@class='_1sQQBU _1w3ZZo _1TO48q']");
		input5[1]=value12345;
		Hashtable<String,Object> output5=SeleniumOperation.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as a Adress$",output5.get("MESSAGE").toString());
		
	}

	@When("^user click on home as a adress type$")
	public void user_click_on_home_as_a_adress_type() throws Throwable
	{
		Object[] input4=new Object[1];
		input4[0]=("//*[@class='_1XFPmK']");
		Hashtable<String,Object> output4=SeleniumOperation.clickonelements(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on home as a adress type$",output4.get("MESSAGE").toString()); 
		
	}

	@When("^user  click on save button$")
	public void user_click_on_save_button() throws Throwable 
	{
		Object[] input4=new Object[1];
		input4[0]=("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']");
		Hashtable<String,Object> output4=SeleniumOperation.clickonelements(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user  click on save button$",output4.get("MESSAGE").toString()); 
		
		
	}

	@Then("^adress added sucessfully$")
	public void adress_added_sucessfully() throws Throwable 
	{
		Thread.sleep(6000);
		Object[] input8=new Object[2];
		input8[0]=("//*[@class='_1ruvv2']");
		input8[1]="PRADIP KHARADE";
		Hashtable<String,Object> output8=SeleniumOperation.validationwithvalid(input8);	
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^adress added sucessfully$",output8.get("MESSAGE").toString());
	}


}
