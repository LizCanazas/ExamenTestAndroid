package appium.contactos;

import org.openqa.selenium.By;

public class MainActivity {

    public appium.appiumControl.Button addContactButton;

    public MainActivity() {
        addContactButton = new appium.appiumControl.Button(By.id("com.simplemobiletools.contacts:id/fragment_fab"));
    }

    public boolean viewCalendar() {
        try {
            String id = "com.google.android.calendar:id/label_calendar_All_on_view";
            appium.appiumControl.Label contact = new appium.appiumControl.Label(By.id(id));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
