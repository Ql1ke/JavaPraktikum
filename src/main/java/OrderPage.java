import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Or;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
    // Локатор поля ввода телефона
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    public SelenideElement fieldNumberPhone;

    // Локатор выпадающего списка станций метро



    //метод ожидания закгрузки страниы
    public void waitForLoadOrderPage() {
        orderHeaderScooter.shouldBe(Condition.visible);
    }

    public OrderPage clickFileName() {
        fieldName.click();
        return this;
    }

    public OrderPage setFileName(String name) {
        fieldName.sendKeys(name);
        return this;
    }








/*

    public void setFieldsOrderForm(int number, String name) {
        fieldsOrderForm.get(number).click();
        fieldName.setValue(name);
    }
*/



}
