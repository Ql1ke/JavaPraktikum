import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    //Коллекция элементов FAQ - class accordion__item
    //Элемент с наличием текста ответа на 1-й вопрос Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    // - id accordion__panel-0
    //Элемент с наличием текста ответа на 2-й вопрос Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    // - id accordion__panel-1
    //Элемент с наличием текста ответа на 3-й вопрос Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    // - id accordion__panel-2
    //Элемент с наличием текста ответа на 4-й вопрос Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    // - id accordion__panel-3
    //Элемент с наличием текста ответа на 5-й вопрос Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    // - id accordion__panel-4
    //Элемент с наличием текста ответа на 6-й вопрос Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    // - id accordion__panel-5
    //Элемент с наличием текста ответа на 7-й вопрос  Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    // - id accordion__panel-6
    //Элемент с наличием текста ответа на 8-й вопрос "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    // - id accordion__panel-7






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
    private SelenideElement subHeaderRoadMap; //"лемент дорожной карты

    @FindBy(how = How.XPATH, using = "//div[text()='Заказываете самокат']")
    private SelenideElement elementOrderScooter; //Элемент Заказываете самокат

    @FindBy(how = How.XPATH, using = "//div[text()='Курьер привозит самокат']")
    private SelenideElement elementCourierScooterGive; //Элемент Курьер привозит самокат

    @FindBy(how = How.XPATH, using = "//div[text()='Катаетесь']")
    private SelenideElement elementRiding; //Элемент Катаетесь

    @FindBy(how = How.XPATH, using = "//div[text()='Курьер забирает самокат']")
    private SelenideElement elementCourierScooterTake; //элемент Курьер забирает самокат

    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement footerOrderButton; //кнопка заказа самоката в подвале страницы


    @FindBy(how = How.XPATH, using = "//div[text()='Вопросы о важном']")
    private SelenideElement elementFAQ; //элемент Вопросы о важном

    @FindBy(how = How.CLASS_NAME, using = "accordion__button")
    private ElementsCollection  collectionStringQuestion; //Коллекция строк FAQ

    @FindBy(how = How.XPATH, using = ".//div[@class='accordion__item']/div[@aria-labelledby='accordion__heading-0']/p")
    private SelenideElement answerTextFirstQuestion; //Текст ответа на первый вопрос

    /*public String koko(int number) {
        return collectionStringQuestion.get(number).getText();
    }*/

    public MainPage getCollectionStringQuestion(int number) {
        collectionStringQuestion.get(number).click();
        return this;
    }

    public MainPage text() {
        answerTextFirstQuestion.text();
        return this;
    }


}
