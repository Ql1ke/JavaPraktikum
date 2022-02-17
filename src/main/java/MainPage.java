import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;

public class MainPage {

    //Логотип Яндекса
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement headerLogoYandex;

    //Кнопка заказа в заголовке
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement headerOrderButton;

    //Кнопка статуса заказа
    @FindBy(how = How.CLASS_NAME, using = "class Header_Link__1TAG7")
    private SelenideElement statusOrderButton;

    //Поле ввода номера заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/input[@placeholder='Введите номер заказа']")
    private SelenideElement orderNumberInputFiled;

    //Кнопка поиска заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']/button[text()='Go!']")
    private SelenideElement orderSearchButton;

    //Элемент дорожной карты
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private SelenideElement subHeaderRoadMap;

    //Элемент Заказываете самокат
    @FindBy(how = How.XPATH, using = "//div[text()='Заказываете самокат']")
    private SelenideElement elementOrderScooter;

    //Элемент Курьер привозит самокат
    @FindBy(how = How.XPATH, using = "//div[text()='Курьер привозит самокат']")
    private SelenideElement elementCourierScooterGive;

    //Элемент Катаетесь
    @FindBy(how = How.XPATH, using = "//div[text()='Катаетесь']")
    private SelenideElement elementRiding;

    //элемент Курьер забирает самокат
    @FindBy(how = How.XPATH, using = "//div[text()='Курьер забирает самокат']")
    private SelenideElement elementCourierScooterTake;

    //кнопка заказа самоката в подвале страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement footerOrderButton;

    //элемент Вопросы о важном
    @FindBy(how = How.XPATH, using = "//div[text()='Вопросы о важном']")
    private SelenideElement elementFAQ;

    //Методы MainPage элементов, не участвующих в тестах


    //Элементы для тестов
    //Коллекция строк FAQ
    @FindBy(how = How.CLASS_NAME, using = "accordion__button")
    private ElementsCollection  collectionStringQuestion;

    //Текст ответа на первый вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-0']")
    private SelenideElement answerTextFirstQuestion;



    //Методы MainPage для тестов
    //Получить коллекцию области FAQ
    public MainPage getCollectionStringQuestion(int number) {
        collectionStringQuestion.get(number).scrollTo().click();
        return this;
    }
    //Сравнить текст в первом ответе FAQ с эталонным
    public SelenideElement assertTextFirstQuestion() {
        return answerTextFirstQuestion.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        }



}
