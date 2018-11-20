package com.bigapple.reptiles.service;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\soft\\webDriver\\chromedriver.exe");// chromedriver服务地址
	        WebDriver driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new 的是谷歌的驱动
	        String url = "http://www.gsxt.gov.cn/";
	        String compamy_name="tencent";	
	        driver.get(url); // 打开指定的网站
//	        try {
//	            /**
//	             * WebDriver自带了一个智能等待的方法。 dr.manage().timeouts().implicitlyWait(arg0, arg1）；
//	             * Arg0：等待的时间长度，int 类型 ； Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
//	             */
//	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	        } catch (Exception e) {
//	        	System.out.println(e);
//	            e.printStackTrace();
//	        }
	        try {
				Thread.sleep(3000*2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.id("keyword")).sendKeys(compamy_name);
	        System.out.println("11111111111");
	        WebElement  tmp_but = driver.findElement(By.id("btn_query"));
	        tmp_but.click();  
	        System.out.println("22222222222");
	        
	        String s=HttpRequest.sendGet("http://jiyan.25531.com/api/create", "appkey=a0018a50e841ed7b187f35cbed6ac3fd"
	        		+ "&gt=62756445cd524543f5a16418cd920ffd&challenge=49d7961f36f328932c214f32d773749f"
	        		+ "&referer=http://www.gsxt.gov.cn&model=3");
//	       	String s=HttpRequest.sendGet("http://jiyan.25531.com/api/info", "appkey=a0018a50e841ed7b187f35cbed6ac3fd");

	        System.out.println(s);
	        
	        
	}

}
