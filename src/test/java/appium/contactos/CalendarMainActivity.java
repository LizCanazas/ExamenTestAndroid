package appium.contactos;

import org.openqa.selenium.By;

public class CalendarMainActivity {

    public appium.appiumControl.Button netxtButton1;
    public appium.appiumControl.Button netxtButton2;
    public appium.appiumControl.Button entendidoButton;

    public CalendarMainActivity() {
       netxtButton1 = new appium.appiumControl.Button(By.id("com.google.android.calendar:id/next_arrow"));
       netxtButton2 = new appium.appiumControl.Button(By.id("com.google.android.calendar:id/next_arrow"));
       entendidoButton = new appium.appiumControl.Button(By.id("com.google.android.calendar:id/next_arrow"));
    }

}
