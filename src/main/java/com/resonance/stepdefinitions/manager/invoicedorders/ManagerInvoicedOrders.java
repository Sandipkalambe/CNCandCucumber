package com.resonance.stepdefinitions.manager.invoicedorders;

import com.resonance.pages.DashboardManagerIO;
import com.resonance.pages.HomePage;
import com.resonance.utility.WaitFor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerInvoicedOrders {
	HomePage home = new HomePage();
	DashboardManagerIO dmr = new DashboardManagerIO();

	@Given("User logs into the application as manager")
	public void loginToTheApplication() {
		home.loginAsManager();
	}
 
	@When("manager selects picking tabs")
	public void pickingTab() {
		dmr.clickOnPickingTabs();

	}

	@Then("manager clicks on the Invoiced orders options")
	public void clickontheIO() throws InterruptedException {
		dmr.selectInvoicedOrders();
		
	}

	@Then("manager clicks on the show tab")
	public void selecttheShowTab() {
		dmr.selecttheshowtab();

	}

	@Then("manager select the number 100 from show tab dropdown list")
	public void SeeTheListInNum() {
		dmr.selectthenum();
	}

	@Then("manager Clicks on the Action buttun for Intransit Status")
	public void ClickOnActionButtonforIntransitStatus() throws InterruptedException {
		dmr.actionbutton();
		Thread.sleep(1000);
	}

	@Then("manager Click on the Sale Detail a new Window Should open with all details of the sale Details")
	public void saleDetailsForIntransit() {
		dmr.saledetails();

	}

	@Then("manager Click on the Sale details user can allow the print of sale details")
	public void clickOnIntransitButton() {
		dmr.printbutton();

	}

	@Then("manager clicks on the Email sale a new window should be displayed then the user can send the email")
	public void clickontheEmailSaleforIntransitStatus() {
		dmr.downloademailsale();
	}

	@Then("manager clicks on the Download Invoice user is able to download the Invoic")
	public void downloadInvoiceForIntransit() {
		dmr.downloadinvoice();

	}

	@Then("manager Clicks on the Label Printing user can see the new window of label printing")
	public void clickonLabelPrintingforIntransitStatus() {
		dmr.labelprinting();
	}

}