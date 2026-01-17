package com.selenium.day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class javaday2 {

	public static void main(String[] args) {
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.awesomeqa.com/ui");
	}

}
