package com.nopcommerce.com.BaseClass;


import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.nopcommerce.com.pageobject.SearchData_Pageobject;
import com.nopcommerce.com.utilities.Baseclass;

public class Base_Class {

	
	public WebDriver driver;
	public SearchData_Pageobject Searchpage;
	public Baseclass readconfig;
	public static Logger log;
	
	// This method for genrate email for everytime //
	public String genrateEmailID()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}

}
