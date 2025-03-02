package DOAN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class demo {
//	public String baseUrl = "https://cntttest.vanlanguni.edu.vn";
//	String driverPath = "C:\\chromedriver.exe";
//	public WebDriver driver;
//		
//	@BeforeTest
//	public void launchBrowser() throws InterruptedException{
//		System.out.println("Chay Trinh Duyet Chrome");
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//
//
//	}
//	@Test(priority=0)
//	public void Operator_Information() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[1]/li[3]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
//		driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
//	}
//	@Test
//	public void KiemThuSoSanhTieuDe() {
//		String expectedTitle = "PLT SOLUTIONS (Panda Laptop)";
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
//		if (actualTitle.equalsIgnoreCase(expectedTitle.toString())){
//			System.out.println("Hai tieu de mong doi va thuc te giong nhau - pass roi");
//		}
//	}

//	@AfterTest
//	public void terminateBrowser() {
//		driver.close();
//	}
//
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/Account/Login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/form/div/div/div/button")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.id("i0116")).sendKeys("an.2274802010002@vanlanguni.vn");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("i0118")).sendKeys("minhvlu32969&");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/"
				+ "div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
		Thread.sleep(8000);
		
//		xem ds nganh hoc
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(8000);
		
//		tạo nganh hoc
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("id")).sendKeys("0");
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.name("abbreviation")).sendKeys("CP");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[1]/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/button[2]")).click();
		Thread.sleep(6000);

//		cap nhat nganh hoc
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[1]/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/button[2]")).click();
		Thread.sleep(10000);
		
//		xoa nganh hoc
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
		
//		tim kiem nganh hoc
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/label/input")).sendKeys("CT");
		Thread.sleep(2000);

	}


//	
//	driver.quit();

}
