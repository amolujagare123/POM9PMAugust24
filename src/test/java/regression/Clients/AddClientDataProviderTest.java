package regression.Clients;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import regression.util.DoLogin;

import java.io.IOException;

import static utility.ForDataProvider.getMyData;

public class AddClientDataProviderTest extends DoLogin {


    @Test(dataProvider = "getData")
    public void addClientTest(
            String clientName,
            String clientSurname,
            String language,
            String streetAddress1,
            String streetAddress2,
            String city,
            String state,
            String zipCode,
            String country,
            String gender,
            String birthDate,
            String phoneNumber,
            String faxNumber,
            String mobileNumber,
            String emailAddress,
            String webAddress,
            String vatId,
            String taxesCode) throws InterruptedException {

        Menu menu = new Menu(driver);
        menu.clickOnAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(clientName);
        addClient.setClientSurname(clientSurname);
        addClient.setLanguage(language);
        addClient.setStreetAddress1(streetAddress1);
        addClient.setStreetAddress2(streetAddress2);
        addClient.setCity(city);
        addClient.setState(state);
        addClient.setZipCode(zipCode);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthDate(birthDate);
        addClient.setPhoneNumber(phoneNumber);
        addClient.setFaxNumber(faxNumber);
        addClient.setMobileNumber(mobileNumber);
        addClient.setEmailAddress(emailAddress);
        addClient.setWebAddress(webAddress);
        addClient.setVATID(vatId);
        addClient.setTaxesCode(taxesCode);
        addClient.clickSave();
    }

    @DataProvider
    Object[][] getData() throws IOException {
        return getMyData("Data/data.xlsx","data");
    }
}
