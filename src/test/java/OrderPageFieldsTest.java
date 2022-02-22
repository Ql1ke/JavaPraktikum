
import org.junit.Before;
import org.junit.Test;;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

public class OrderPageFieldsTest {

    private final String URL = "https://qa-scooter.praktikum-services.ru/";
    //Тестовый набор данных №1
    private final String NAME_KIT_ONE = "Сергей";
    private final String SURNAME_KIT_ONE = "Иванов";
    private final String ADDRESS_KIT_ONE = "Московская д.1";
    private final String METRO_STATION_KIT_ONE = "Сокольники";
    private final String NUMBER_PHONE_KIT_ONE = "+79119119191";
    private final String DATA_DELIVERY_KIT_ONE = "26.02.2022";
    private final Integer LIST_DAYS_ORDER_KIT_ONE = 1;
    private final Integer LIST_COLOR_SELECTION_SCOOTER_KIT_ONE = 0;
    private final String COMMENT_COURIER_KIT_ONE = "Позвонить за час";

    //Тестовый набор данных №2
    private final String NAME_KIT_TWO = "Алексей";
    private final String SURNAME_KIT_TWO = "Захаров";
    private final String ADDRESS_KIT_TWO = "пр. Непокорённых д.1, кв.299";
    private final String METRO_STATION_KIT_TWO = "Спортивная";
    private final String NUMBER_PHONE_KIT_TWO = "+79998887766";
    private final String DATA_DELIVERY_KIT_TWO = "23.02.2022";
    private final Integer LIST_DAYS_ORDER_KIT_TWO = 4;
    private final Integer LIST_COLOR_SELECTION_SCOOTER_KIT_TWO = 1;
    private final String COMMENT_COURIER_KIT_TWO = "Позвонить за час или отправить смс";

    @Before
    public void setBrowser() {
        //Вызов браузера safari
//        System.setProperty("selenide.browser", "safari");
        //Вызов браузера chrome
        System.setProperty("selenide.browser", "chrome");
        open(URL);
    }

    @Test
    public void checkingOutTheOrderHeaderButtonTest() {
        MainPage mainPage = page(MainPage.class);
        //Нажатие на кнопку ЗАКАЗАТЬ в заголовке главной страницы и создание экземпляра класса страницы заказа
        mainPage.clickCookiesButton();
        OrderPage orderPage = mainPage.clickHeaderOrderButton();
        //Заполнение поля регистрации
        boolean isResult = orderPage.setFieldName(NAME_KIT_ONE)
                .setFieldSurname(SURNAME_KIT_ONE)
                .setFieldDeliveryAddress(ADDRESS_KIT_ONE)
                .chooseMetroStation(METRO_STATION_KIT_ONE)
                .setFieldNumberPhone(NUMBER_PHONE_KIT_ONE)
                .clickButtonNextOrderForm()
//Заполнение дополнительного поля регистрации
                .setWhenToBringScooter(DATA_DELIVERY_KIT_ONE)
                .setListDropdownRental(LIST_DAYS_ORDER_KIT_ONE)
                .setColorScooter(LIST_COLOR_SELECTION_SCOOTER_KIT_ONE)
                .setCommentFieldForCourier(COMMENT_COURIER_KIT_ONE)
                .getButtonOrderFieldTwo()
                .clickButtonOrderComplete()
                .isSearchButtonOrder();
        assertTrue("Не отобразилось окно об успехе заказа", isResult);
    }

    @Test
    public void checkingOutTheOrderFooterButtonTest() {
        MainPage mainPage = page(MainPage.class);
        //Нажатие на кнопку ЗАКАЗАТЬ в заголовке главной страницы и создание экземпляра класса страницы заказа
//        mainPage.clickCookiesButton();
        OrderPage orderPage = mainPage.clickFooterOrderButton();
        //Заполнение поля регистрации
        boolean isResult = orderPage.setFieldName(NAME_KIT_TWO)
                .setFieldSurname(SURNAME_KIT_TWO)
                .setFieldDeliveryAddress(ADDRESS_KIT_TWO)
                .chooseMetroStation(METRO_STATION_KIT_TWO)
                .setFieldNumberPhone(NUMBER_PHONE_KIT_TWO)
                .clickButtonNextOrderForm()
//Заполнение дополнительного поля регистрации
                .setWhenToBringScooter(DATA_DELIVERY_KIT_TWO)
                .setListDropdownRental(LIST_DAYS_ORDER_KIT_TWO)
                .setColorScooter(LIST_COLOR_SELECTION_SCOOTER_KIT_TWO)
                .setCommentFieldForCourier(COMMENT_COURIER_KIT_TWO)
                .getButtonOrderFieldTwo()
                .clickButtonOrderComplete()
                .isSearchButtonOrder();
        assertTrue("Не отобразилось окно об успехе заказа", isResult);

    }
}


