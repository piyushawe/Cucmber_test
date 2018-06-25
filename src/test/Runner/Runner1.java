import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;


@CucumberOptions(
        features= {"src/test/Feature"}
        ,glue= {"Cucmber_test"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
      //  ,tags= {"@testing"}
)
@Listeners(Cucmber_test.Listeners.class)
public class Runner1 {
    private TestNGCucumberRunner testing;
    @BeforeClass(alwaysRun = true)
    public void before(){
        System.out.println("This is Beforeclass");
        testing=new TestNGCucumberRunner(this.getClass());
    }
    @DataProvider
    public Object[][] data(){
        System.out.println("this is dataprovider");
        return testing.provideFeatures();

    }

    @Test(groups = "Positive",dataProvider = "data")
            public void ruunnnn(CucumberFeatureWrapper cuc){
        System.out.println("This is Test");
        testing.runCucumber(cuc.getCucumberFeature());

            }
}
