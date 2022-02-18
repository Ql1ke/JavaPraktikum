
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Or;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;;
import static com.codeborne.selenide.Selenide.*;

public class OrderPageFields {

    private final String URL = "https://qa-scooter.praktikum-services.ru/";
    //Создаётся экземпляр класса главной страницы и страницы заказа

//   MainPage mainPage = new MainPage();
//    OrderPage orderPage = mainPage.clickHeaderOrderButton();
//    OrderPage orderPage = new OrderPage();

    @Before
    public void setBrowser() {
//        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
        open(URL);
//        mainPage.clickHeaderOrderButton();

    }

/*
Александр Захаров  4 days ago
Вообще, лучше сделать метод вначале класса с тестами с аннотацией вот так
    @BeforClass
    public void setProperties() {
        Configuration.browser = "edge";
    }
*/

/*
     @BeforeTest
    public void BeforeTestAcceptCookie(){

        System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
        System.setProperty("selenide.browser", "firefox");
        open("https://qa-scooter.praktikum-services.ru");
        makingOrder.clickButtonAcceptCookie();
    }

*/

    /*
    1. Нажать кнопку Заказатью 2 штуки
    2.1 Зполнить форму заказа
    2.2  и Нажать на далее
    2.3 Заполнить доп форму заказа
    2.4 и нажать далее
    3. Проверка, что появилось всплывающее окно с сообщением об успешном создании заказа
     */

    @Test
    public void test() {


        MainPage mainPage = page(MainPage.class);
        //Нажатие на кнопку ЗАКАЗАТЬ в заголовке главной страницы и создание экземпляра класса страницы заказа
        OrderPage orderPage = mainPage.clickHeaderOrderButton();


        orderPage.clickFileName()
        orderPage.setFileName("Сергей");

    }

}
