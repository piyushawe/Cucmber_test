import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;


@CucumberOptions(
        features= {"src/test/Feature"}
        ,glue= {"Cucmber_test"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"}
        ,tags= {"@testing"}
)

public class Runner1 {
    @Test(groups = "Positive")
            public void ruunnnn(){
                new TestNGCucumberRunner(getClass()).;
            }
}
