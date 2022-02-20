import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Or;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.lang.reflect.Field;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {

    //Написать 2 набора данных для полей ввода

    //локаторы поля ввода для теста из страницы заказа
    // заголовок формы заказа
    @FindBy(how = How.CLASS_NAME, using = "Order_Header__BZXOb")
    private SelenideElement orderHeaderScooter;
    // Локатор поля ввода имени
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Имя']")
    private SelenideElement fieldName;
    // Локатор поля ввода фамилия
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Фамилия']")
    public SelenideElement fieldSurname;
    // Локатор поля ввода адреса
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    public SelenideElement fieldDeliveryAddress;
    // Локатор выпадающего списка станций метро
    @FindBy(how = How.CLASS_NAME, using = "select-search__input")
    private SelenideElement metroStation;
    //Кнопка выбора станции метро
    @FindBy(how = How.XPATH, using = "//div[@class='select-search__select']/ul[@class='select-search__options']/li[@class='select-search__row']")
    private ElementsCollection collectionMetroStation;

    @FindBy(how = How.CLASS_NAME, using = "select-search__input")
    private SelenideElement metroStationName;


    // Локатор поля ввода телефона
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    public SelenideElement fieldNumberPhone;
    //Локатор кнопки Далее в заказе
    @FindBy(how = How.XPATH, using = "//div[@class='Order_NextButton__1_rCA']/button[text() = 'Далее']")
    private SelenideElement buttonNext;

    //Локаторы описания обязательных полей ввода на 2-й странице заказа
    //Локатор поля для выбора даты доставки самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement whenToBringScooter;
    //Локатор поля срока аренды
    @FindBy(how = How.XPATH, using = "//div[text()='* Срок аренды']")
    private SelenideElement dropdownRental;
    //Локатор выбора срока аренды
    @FindBy(how = How.XPATH, using = "//div[@class='Dropdown-menu']/div[@class='Dropdown-option']")
    private ElementsCollection listDropdownRental;
    //Локатор для выбора цвета самоката
    @FindBy(how = How.CLASS_NAME, using = "Checkbox_Label__3wxSf")
    private ElementsCollection colorScooter;
    //Комментарий курьеру к заказу
    @FindBy(how = How.CSS, using = ".Input_Input__1iN_Z.Input_Responsible__1jDKN")
    private SelenideElement commentFieldForCourier;
    //Локатор для кнопки "Заказать" во втором поле оформления заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']/button[text() = 'Заказать']")
    private SelenideElement buttonOrderFieldTwo;
    //Локатор кнопки подтверждения заказа
    @FindBy(how = How.XPATH, using = "//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Да']")
    private SelenideElement buttonOrderComplete;

    //метод ожидания закгрузки страниы
    public void waitForLoadOrderPage() {
        orderHeaderScooter.shouldBe(Condition.visible);
    }
    //метод записать имя
    public OrderPage setFieldName(String name) {
        fieldName.sendKeys(name);
        return this;
    }
    //метод записать фамилию
    public OrderPage setFieldSurname(String surname) {
        fieldSurname.sendKeys(surname);
        return this;
    }
    //метод ввести адрес доставки
    public OrderPage setFieldDeliveryAddress(String address) {
        fieldDeliveryAddress.setValue(address);
        return this;
    }
    //Нажать на кнопку списка станций метро и выбрать станцию
    public OrderPage chooseMetroStation(String metroName) {
        metroStation.click();
        $(byXpath(("//*[text()='" + metroName + "']"))).click();
        return this;
    }
    //Ввод номера телефона для связи
    public OrderPage setFieldNumberPhone(String numberPhone) {
        fieldNumberPhone.sendKeys(numberPhone);
        return this;
    }
    //Нажать на кнопку Далее в форме заказа
    public OrderPage clickButtonNextOrderForm() {
        buttonNext.click();
        return this;
    }
    //ввести дату в поле заказа
    public OrderPage setWhenToBringScooter(String data) {
        whenToBringScooter.setValue(data).pressEnter();
        return this;
    }
    //Выбрать срок аренды самоката [0-6]
    public OrderPage setListDropdownRental(int number) {
        dropdownRental.click();
        listDropdownRental.get(number).click();
        return this;
    }
    //Нажатие на кнопку заказать
    public OrderPage getButtonOrderFieldTwo() {
        buttonOrderFieldTwo.click();
        return this;
    }
    //Нажать кнопку подтверждения заказа
    public OrderPage clickButtonOrderComplete() {
        buttonOrderComplete.click();
        return this;
    }
    //Выбрать цвет скутера [0-1] и нажать кнопку
    public OrderPage setColorScooter(int number) {
        colorScooter.get(number).click();
        return this;
    }
    //Написать комментарий курьеру
    public OrderPage setCommentFieldForCourier(String text) {
        commentFieldForCourier.setValue(text);
        return this;
    }

    //Локатор кнопки успешного заказа "Посмотреть статус"
    @FindBy(how = How.CLASS_NAME, using = "Order_NextButton__1_rCA")
    private SelenideElement buttonOrderNext;
    //Проверка наличия кнопки успешного заказа "Посмотреть статус"
    public Boolean isSearchButtonOrder() {
        return buttonOrderNext.isDisplayed();
    }

}
