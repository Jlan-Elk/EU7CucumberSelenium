package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        //selelnium code in here
        System.out.println("The user navigate to Fleet,Vehicle");

    }

    @Then("the title should be Vehicle")
    public void the_title_should_be_Vehicle() {
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user navigates to Marketing,Cmapaigns")
    public void the_user_navigates_to_Marketing_Cmapaigns() {
        System.out.println("The user navigating to Marketing,Campaigns");

    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user navigates to Activities,Calender Events")
    public void the_user_navigates_to_Activities_Calender_Events() {
        System.out.println("The user navigating to Activities,Calender Events");

    }

    @Then("the title should be Calenders")
    public void the_title_should_be_Calenders() {
        System.out.println("Expected and Actual title are matching");

    }


}
