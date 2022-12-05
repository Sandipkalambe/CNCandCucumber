
package com.resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;
import com.resonance.utility.WaitFor;

public class DashboardManagerIO {
	Keyword keyword = null;

	public DashboardManagerIO() {
		PageFactory.initElements(BaseFramework.thread.get(), this);
		keyword = new Keyword();
	}

	@FindBy(xpath = "(//span[@class='text'])[5]")
	private WebElement selectPT;
	@FindBy(xpath = "//span[starts-with(text(),' Invoiced Orders')]")
	private WebElement invoicedOrders;
	@FindBy(xpath = "//div[@class='select2-container select input-xs']")
	private WebElement showTab;
	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	private WebElement thenNumber100;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-xs btn-primary dropdown-toggle'])[1]")
	private WebElement actionBtnforIntransitStatus;
	@FindBy(xpath = "//a[starts-with(@href,'https://qa-cnc.rameesystems.com/admin/picking/invoiced_order/view/201')]")
	private WebElement saledetailsforIntransitStatus;
	@FindBy(xpath = "//button[@class='btn btn-default btn-default no-print pull-right']")
	private WebElement printBtnforIntransitStatus;
	@FindBy(xpath = "//a[starts-with(@href,'https://qa-cnc.rameesystems.com/admin/sales/email/201')]")
	private WebElement emailSaleforIntransitStatus;
	@FindBy(xpath = "//a[starts-with(@href,'https://qa-cnc.rameesystems.com/admin/sales/pdf/201')]")
	private WebElement downloadIforIntransitStatus;
	@FindBy(xpath = "//a[starts-with(@href,'https://qa-cnc.rameesystems.com/admin/picking/invoiced_order/barcodes/201')]")
	private WebElement labelPforIntransitStatus;

	public void clickOnPickingTabs() {
		selectPT.click();

	}

	public void selectInvoicedOrders() {
		WaitFor.elementToBeClickable(invoicedOrders);
		invoicedOrders.click();
	}

	public void selecttheshowtab() {
		showTab.click();
	}

	public void selectthenum() {
		thenNumber100.click();
	}

	public void actionbutton() {
		actionBtnforIntransitStatus.click();

	}

	public void saledetails() {
		saledetailsforIntransitStatus.click();
	}

	public void printbutton() {
		printBtnforIntransitStatus.click();

	}

	public void downloademailsale() {
		emailSaleforIntransitStatus.click();
	}

	public void downloadinvoice() {
		downloadIforIntransitStatus.click();
	}

	public void labelprinting() {
		labelPforIntransitStatus.click();
	}
}