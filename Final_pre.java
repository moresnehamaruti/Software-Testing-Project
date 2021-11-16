package Coffeedriftway;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Final_pre
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_JAR\\chromedriver.exe");
		WebDriver w =new ChromeDriver();
		
		w.get("https://driftaway.coffee");
		
		
		
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//click on about us
		w.findElement(By.linkText("About us")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on our story
		w.findElement(By.linkText("Our Story")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on refer a friend
		w.findElement(By.linkText("Refer-a-friend")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on reviews
		w.findElement(By.linkText("Reviews")).click();
		//w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//click on press kit
		w.findElement(By.linkText("Press Kit")).click();
		//Thread.sleep(8000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.navigate().to("https://driftaway.coffee");
		
		
		//click on price transparency
		w.findElement(By.linkText("Price Transparency")).click();
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		
		//click on carbon neutral operation
		w.findElement(By.linkText("Carbon neutral operations")).click();
		
		//click on coffee academy
		w.findElement(By.linkText("Coffeecademy")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on home brewing
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[1]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on brewing guide
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[2]")).click();
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on cold brew
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[3]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on equipments
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[4]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on gifts
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[5]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on health
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[6]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on history
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[7]")).click();
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on origin
		w.findElement(By.xpath("//*[@id=\"wpupg-grid-coffee_cademy-filter\"]/div[8]")).click();
		Thread.sleep(4000);
		
		//================================================================
	
		w.navigate().to("https://driftaway.coffee/");
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//mouse hover on coffee
		Actions a =new Actions(w);
		//a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		//a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		
		
		
		//click on subscription
		//w.findElement(By.xpath(" //header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//Thread.sleep(2000);
		//click on no thanks 
		//w.findElement(By.id("atlanta-button-no")).click();
	
		//Thread.sleep(2000);
		

		//====================================================================================
				
		//click on virtual testing
	   a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1422334\"]/a/span"))).build().perform();
				
		//click on private tasting parties
		w.findElement(By.xpath("//*[@id=\"menu-item-1427509\"]/a/span")).click();
				
		//click for schedule tasting
		//Thread.sleep(4000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		w.navigate().to("https://driftaway.coffee/schedule-private-tasting/");
			
	    //click on 1 pm
	    //Thread.sleep(5000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //w.findElement(By.xpath("//*[@id=\"genesis-content\"]/article/div/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]/h4[1]")).click();

	    //click on corporate tasting
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1422334\"]/a/span"))).build().perform();
			    
	    w.findElement(By.xpath("//*[@id=\"menu-item-1427510\"]/a/span")).click();
			    
		Thread.sleep(2000);
			    
		//click on shop-office-subscription
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Offices')]"))).build().perform(); //office
				
		//Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248171\"]/a/span")).click();
				
				
		
		//click on single bags
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248170\"]/a/span"))).build().perform(); //office
				
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248172\"]/a/span")).click();
				
		//click on corporate tasting
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248170\"]/a/span"))).build().perform(); //office
						
		//Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"menu-item-1321293\"]/a/span")).click();
						
		//click on corporate gifts
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248170\"]/a/span"))).build().perform(); //office
						
		//Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248173\"]/a/span")).click();
						
		//===========================================================
		
		
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		
		//click on single bags
         w.findElement(By.xpath("//*[@id=\"menu-item-906480\"]/a/span")).click();
         
         w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         //Thread.sleep(2000);
         //click on single origin
         w.findElement(By.xpath("//*[@id=\"fl-tabs-5e84328bdeb01-panel-0\"]/div[1]/button[2]")).click();
         
         w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         //Thread.sleep(2000);
        //click on buy single origin radio
         w.findElement(By.xpath("//*[@id=\"fl-tabs-5e84328bdeb01-panel-0\"]/div[2]/div/div[1]/div/div/div/div/div[2]/div[3]/div[1]")).click();
	   
        // Thread.sleep(2000);
         
	    //click on ground
        // w.findElement(By.xpath("//*[@id=\"cpi_radio_1424841_1\"]/ul[2]/li[2]/p")).click();
         
        w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        //click on request radio button
        w.findElement(By.xpath("//body/div[1]/div[1]/div[7]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/label[1]")).click();
	
        //Thread.sleep(2000);
        w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //click on size guide
        w.findElement(By.xpath("//*[@id=\"fl-tabs-5e84328bdeb01-panel-0\"]/div[2]/div/div[3]/div/div/div/div/div[2]/div[3]/div[1]/div[1]/a")).click();
	
       // Thread.sleep(2000);
        w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
	   //click on close
        w.findElement(By.xpath("/html/body/div[11]/i")).click();
	
        //Thread.sleep(2000);
        w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		
	    //click on cold brew
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        w.findElement(By.xpath("//span[contains(text(),'Cold Brew')]")).click();
	
        
        
		
		//click on subscribe
        // w.findElement(By.xpath("//*[@id=\"genesis-content\"]/article/div/div[1]/div[1]/div/div/div/div/div/div[2]/div/div/a")).click();
        
		//mouse hover on shop-for you-coffee gear
        //Thread.sleep(2000);
        w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		
		//Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Coffee Gear')]")).click();
		//Thread.sleep(2000);
		//w.navigate().refresh();
		
		//Thread.sleep(2000);
		w.findElement(By.linkText("Grinder")).click();
		
		//Thread.sleep(2000);
		w.findElement(By.linkText("Brewer")).click();
		
		//Thread.sleep(2000);
		w.findElement(By.linkText("Kettle")).click();
		
		//Thread.sleep(2000);
		w.findElement(By.linkText("Scale")).click();
      
		w.navigate().refresh(); 
       
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on virtual testing parties
		
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248161\"]/a/span")).click();
		
		//click on explorer kits
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248158\"]/a/span"))).build().perform();//for you
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248162\"]/a/span")).click();



		//click on terms and conditions
        w.findElement(By.linkText("Terms & Conditions")).click();
		
        //click on privacy policy
		w.findElement(By.linkText("Privacy Policy")).click();
		
		
		//==============================================
	/*  
			 
			
			 //click on customize your gift.
			w.findElement(By.xpath("//*[@id=\"genesis-content\"]/article/div/div[1]/div[1]/div/div/div/div[1]/div/div[3]/div/div/a/span")).click();
			//Thread.sleep(2000);
			w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//click on whole beam
			w.findElement(By.id("ngcChooseCoffeewhole-bean")).click();
			//Thread.sleep(4000);
			w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
	    //click on single bags
        //Thread.sleep(2000);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248163\"]/a/span"))).build().perform();//Gift
		
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.findElement(By.xpath("//*[@id=\"menu-item-1248165\"]/a/span")).click();
		
		//click on virtual tasting parties
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-404060\"]/a/span"))).build().perform(); //shop
		a.moveToElement(w.findElement(By.xpath("//*[@id=\"menu-item-1248163\"]/a/span"))).build().perform();//Gift
		//Thread.sleep(2000);
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[1]/ul/li[2]/ul/li[3]/a/span")).click();      
		
		
		
		
*/				
        

	}

}
