import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

//18- Create 4 scenarios and tag them with smoke and Regression, and run with cucumber
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}, tags = {"~@SmokeTest"})
public class CucumberRunner {
}
