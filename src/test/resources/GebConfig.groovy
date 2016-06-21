import org.openqa.selenium.chrome.ChromeDriver

waiting {
	timeout = 15
}

environments {
	chrome {
		driver = { new ChromeDriver() }
	}
}

baseUrl = "https://johnroach.info"
