import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverInvoke {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\18327\\Downloads\\operadriver_win64\\operadriver.exe");
        WebDriver myOperadriver=new OperaDriver();
        myOperadriver.get("http://www.amazon.com");
    }


}


/*public class FirefoxInvocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\18327\\Downloads\\operadriver_win64\\operadriver.exe");
        WebDriver myMozilladriver=new FirefoxDriver();
        myMozilladriver.get("http://www.amazon.com");
    }
}*/
