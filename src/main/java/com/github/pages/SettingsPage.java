package com.github.pages;

 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class SettingsPage extends SeleniumBase{
	public SettingsPage(RemoteWebDriver driver) {
		this.driver =driver;
	}
	
	
	public void clickDeleteRep(String repoName ) {
		
		click(driver.findElement(By.id("Settings.delete.id")));
		click(driver.findElement(By.xpath("Settings.delete.xpath")));
		click(driver.findElement(By.xpath("Settings.read.xpath")));
		String username = driver.findElement(By.xpath("Settings.delete.reponame.xpath")).getText();
	
		type(driver.findElement(By.id("Settings.delete.repo.id")), username);	
		click(driver.findElement(By.id("Settings.delete.repobtn.id")));
	}
	
	
	
	
}
