package com.resonance.utility;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.resonance.config.BaseFramework;

public class WaitFor {

	private static final FluentWait<WebDriver> wait = new FluentWait<WebDriver>(BaseFramework.thread.get());
	static {
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(ElementClickInterceptedException.class, NoSuchElementException.class);
	}

	public static void elementToBeClickable(WebElement e) {
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
}
