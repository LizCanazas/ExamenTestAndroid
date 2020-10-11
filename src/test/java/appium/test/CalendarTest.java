package appium.test;

import appium.appiumControl.Button;
import appium.contactos.CalendarMainActivity;
import appium.deviceFactory.Android;
import appium.sessionManager.Session;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.junit.Before;

public class CalendarTest {
    appium.contactos.MainActivity mainActivity = new appium.contactos.MainActivity();
    CalendarMainActivity calendarMainActivity = new CalendarMainActivity();

    Session s;
    AppiumDriver appiumDriver;

    @Before
    public void beforeTest() throws MalformedURLException {
        //s = Session.getInstance();
        Android a = new Android();
        appiumDriver = a.create();
    }

    @Test
    public void startTestCalendar() throws MalformedURLException {

        //appiumDriver.findElementByAccessibilityId("com.google.android.calendar:id/next_arrow").click();
        //appiumDriver.findElementByAccessibilityId("com.google.android.calendar:id/next_arrow").click();
        //appiumDriver.findElementByAccessibilityId("com.google.android.calendar:id/oobe_done_button").click();
        calendarMainActivity.netxtButton1.click();
        calendarMainActivity.netxtButton2.click();
        calendarMainActivity.entendidoButton.click();
        
         Assert.assertTrue("El test fue ejecutado con el siguiente resultado :"+mainActivity.viewCalendar(),mainActivity.viewCalendar());

    }

    @After
    public void after() throws MalformedURLException {
        //Session.getInstance().closeSession();
    }
}
