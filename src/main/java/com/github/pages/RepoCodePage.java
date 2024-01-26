package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class RepoCodePage extends SeleniumBase {
 
	public RepoCodePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isRepoCreated(String repoName) {
		return driver.findElement(By.linkText(repoName)).isDisplayed();
	}
	
	public void clickSettings() {
		WebElement settings = driver.findElement(By.cssSelector("Repocode.settings.css"));
		click(settings);
	}
}
