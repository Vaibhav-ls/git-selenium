package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class CreateRepoPage extends SeleniumBase{

	public CreateRepoPage(RemoteWebDriver driver) {
		this.driver =driver;
	}
	
	public void enterRepoDetails(String repoName, String description) {
		 type(driver.findElement(By.id("Repo.name.id")), repoName);
		 type(driver.findElement(By.id("Repo.description.id")), description);
	}
	public boolean getSelectedRepoType() {
		return driver.findElement(By.id("Repo.publicInput.id")).isSelected();	
	}
	
	public void clickCreateRepository() {
		
		click(driver.findElement(By.id("Repo.createBtn.css")));
	}
}
