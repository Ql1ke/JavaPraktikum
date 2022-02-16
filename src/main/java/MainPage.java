import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //Кнопка логотип Яндекс - class Header_LogoYandex__3TSOI
    //Кнопка заказа в заголовке - class Button_Button__ra12g
    //Кнопка статуса заказа - class Header_Link__1TAG7
    //Поле ввода номера заказа - xpath //div[@class='Input_InputContainer__3NykH']/input[@placeholder='Введите номер заказа']
    //Кнопка поиска заказа - xpath //div[@class='Input_InputContainer__3NykH']/button[text()='Go!']

    //Коллекция элементов дорожной карты - class Home_SubHeader__zwi_E
    //Элемент Заказываете самокат - xpath //div[text()='Заказываете самокат']
    //Элемент Курьер привозит самокат - xpath //div[text()='Курьер привозит самокат']
    //Элемент Катаетесь - xpath //div[text()='Катаетесь']
    //Элемент Курьер забирает самокат - xpath //div[text()='Курьер забирает самокат']
    //Кнопка заказа в дорожной карте - xpath //div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']


    //Элемент Вопросы о важном - xpath //div[text()='Вопросы о важном']
    //Поле FAQ - class Home_FAQ__3uVm4
    //Кнопка 1-го вопроса - id accordion__heading-16
    //Кнопка 2-го вопроса - id accordion__heading-17
    //Кнопка 3-го вопроса - id accordion__heading-18
    //Кнопка 4-го вопроса - id accordion__heading-19
    //Кнопка 5-го вопроса - id accordion__heading-20
    //Кнопка 6-го вопроса - id accordion__heading-21
    //Кнопка 7-го вопроса - id accordion__heading-22
    //Кнопка 8-го вопроса - id accordion__heading-23



    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement headerLogoYandex; //Логотип Яндекса

    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement headerOrderButton; //Кнопка заказа в заголовке

    @FindBy(how = How.CLASS_NAME, using = "class Header_Link__1TAG7")
    private SelenideElement statusOrderButton; //Кнопка статуса заказа

    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Введите номер заказа']")
    private SelenideElement orderNumberInputFiled; //Поле ввода номера заказа

    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/button[text()='Go!']")
    private SelenideElement orderSearchButton; //Кнопка поиска заказа

    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private ElementsCollection subHeaderRoadMap; //Коллекция элементов дорожной карты

    public String getSubHeaderRoadMap(int number) { //Значения аргумента 0-3
        return subHeaderRoadMap.get(number).getText();
    }





}
