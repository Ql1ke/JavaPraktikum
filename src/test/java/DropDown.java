import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class DropDown {

    @Before

    public void openPage() {
        //Открывается страница и создаётся экземпляр класса страницы
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
    }
    @Test
    public void test() {


    }
}