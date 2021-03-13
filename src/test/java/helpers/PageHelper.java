package helpers;

import static com.codeborne.selenide.Selenide.$x;

public class PageHelper {
    public static void openPersonalData() {
        $x("//span[contains(text(),'Профиль')]").click();
        $x("//a[contains(text(),'Личные данные')]").click();
    }

    public static void clickSave() {
        $x("//button[contains(text(),'Сохранить')]").click();
    }
}
