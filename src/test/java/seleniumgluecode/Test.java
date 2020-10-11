/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 *
 * @author Henry Coarite
 */
public class Test {
    
    //^I have authentication to todo\.ly$
    @Given("^Cargar datos de usuario$")
    public void testGiven(){
        System.err.println("Crer usuario");
    }
    @When("^Se envia el xml$")
    public void testWhen(){
        System.err.println("-------------------------------**");
    }
    @Then("^Se obtien la respuesta$")
    public void testThen(){
        System.err.println("-------------------------------**");
    }
}
