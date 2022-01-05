package annotations;

import org.testng.annotations.*;

public class ConfigurationAnnotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite Chrome - Set Up System Property");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest Open Chrome");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod Sign In");
    }

    @Test
    public void searchCustomer() {
        System.out.println("@Test1 Search For Customer");
    }

    @Test
    public void searchProduct() {
        System.out.println("@Test2 Search For Product");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod Sing Out");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass Close The Application");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest Close Chrome");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite Chrome - Clean Up All Cookies");
    }
}
