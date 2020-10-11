/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *
 * @author Henry Coarite
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "seleniumgluecode")
public class TestRunner {
    
}
