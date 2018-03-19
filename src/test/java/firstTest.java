import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RENT\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String actualTitle = "";

        driver.get("http://www.pracuj.pl");
        actualTitle = driver.getTitle();
        System.out.println("NIZEJ BEDZIE TYTUL");
        System.out.println("Tytul strony: " + actualTitle);

        if (actualTitle.contentEquals( "Oferty pracy - Pracuj.pl")){
            System.out.println("Test zdany");


        } else {System.out.println("Test oblany");

        }


        driver.quit();


    }

}
