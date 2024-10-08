package regression.Clients;

import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

public class AddClientTest extends DoLogin {
    /*WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);

        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickLogin();

    }*/

    @Test
    public void addClientTest() throws InterruptedException {
        Menu menu = new Menu(driver);
        menu.clickOnAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("Rahul");
        addClient.setClientSurname("Sharma");
        addClient.setLanguage("German");
        addClient.setStreetAddress1("12 MG Road");
        addClient.setStreetAddress2("Near Brigade Towers");
        addClient.setCity("Bengaluru");
        addClient.setState("Karnataka");
        addClient.setZipCode("560001");
        addClient.setCountry("Nepal");
        addClient.setGender("Female");
        addClient.setBirthDate("05/09/1985");
        addClient.setPhoneNumber("08012345678");
        addClient.setFaxNumber("08087654321");
        addClient.setMobileNumber("9845012345");
        addClient.setEmailAddress("rahul.sharma@example.in");
        addClient.setWebAddress("http://rahulsharma.in");
        addClient.setVATID("VATIN1234567");
        addClient.setTaxesCode("TAXIN8901234");
        addClient.clickSave();
    }
}
