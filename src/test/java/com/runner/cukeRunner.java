package com.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
       // publish = true,
        features = "src/test/resources/features",
        glue = "com/step_definition",
        dryRun = false, //true deyince herseyi dogru kabul edersin false olup testteki hatalari gorebilirsin
        tags = "@login"
)

//  tags="@purchase")
//bunu run ettikten sonra hard coding i onlemek icin feauture in tag ikoyarak run edince step definitons i parametrize ediyoruz.
//run ettikten sonra console given dan baslayarak kopyala ve login stepdefinitons a yapistir.
  public class cukeRunner {

}
