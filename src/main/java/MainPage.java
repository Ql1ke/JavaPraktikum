import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    //Элементы главной страницы
    //Header
    //Логотип Яндекса
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement headerLogoYandex;
    //Кнопка заказа в заголовке
    @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']")
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

    //Элементы характеристик самоката
    //изображение самоката
    @FindBy(how = How.CSS, using = "[alt='Scooter blueprint']")
    private SelenideElement imgScooter;
    //Элемент текста "Самокат на пару дней"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FirstPart__3g6vG']/div[text()='Самокат ']")
    private SelenideElement textDescriptionScooter;
    //Элемент описания куда привезут самокат
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FirstPart__3g6vG']/div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement textDeliveryDescriptionScooter;
    //Элемент описания как ехать на самокате
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FirstPart__3g6vG']/div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement textDriveDescriptionScooter;
    //Элемент описания модели самрката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK']/div[text()=' Модель Toxic PRO']")
    private SelenideElement textDescriptionModelScooter;
    //Элемент с какой максмимальной скоростью едет самокат
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2 Home_FirstRow__1pAl9']/div[text()='Максимальная скорость']")
    private SelenideElement textDescriptionSpecSpeedScooter;
    //Элемент с какой скоростью едет самокат в км/ч
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2 Home_FirstRow__1pAl9']/div[text()='40 км/ч']")
    private SelenideElement textDescriptionSpecSpeedNumberScooter;
    //Элемент сколько проедет самокат
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2']/div[text()='Проедет без поздарядки']")
    private SelenideElement textDescriptionSpecDistanceScooter;
    //Элемент сколько проедет самокат в км
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2']/div[text()='80 км']")
    private SelenideElement textDescriptionSpecDistanceNumberScooter;
    //Элемент сколько выдержит самокат
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2']/div[text()='Выдерживает вес']")
    private SelenideElement textDescriptionSpecWeightScooter;
    //Элемент сколько выдержит самокат в кг
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Row__jdQW2']/div[text()='120 кг']")
    private SelenideElement textDescriptionSpecWeightNumberScooter;

    //Элементы этапов работы сервиса
    //Элемент дорожной карты "Как это работает"
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private SelenideElement subHeaderRoadMap;
    //Элемент "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='Заказываете самокат']")
    private SelenideElement elementOrderScooter;
    //Элемент описания "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='Выбираете, когда и куда привезти']")
    private SelenideElement elementDescriptionOneOrderScooter;
    //Элемент кружка с 1-м этапом заказа самоката
    @FindBy(how = How.XPATH, using = "//div[text()='1']")
    private SelenideElement elementCircleOneOrderScooter;
    //Элемент "Курьер привозит самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='Курьер привозит самокат']")
    private SelenideElement elementCourierScooterGive;
    //Элемент описания "Курьер привозит самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='А вы — оплачиваете аренду']")
    private SelenideElement elementDescriptionTwoOrderScooter;
    //Элемент кружка со 2-м этапом заказа самоката
    @FindBy(how = How.XPATH, using = "//div[text()='2']")
    private SelenideElement elementCircleTwoOrderScooter;
    //Элемент "Катаетесь"
    @FindBy(how = How.XPATH, using = "//div[text()='Катаетесь']")
    private SelenideElement elementRiding;
    //Элемент описания "Катаетесь"
    @FindBy(how = How.XPATH, using = "//div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement elementDescriptionThreeOrderScooter;
    //Элемент кружка с 3-м этапом заказа самоката
    @FindBy(how = How.XPATH, using = "//div[text()='3']")
    private SelenideElement elementCircleThreeOrderScooter;
    //Элемент "Курьер забирает самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='Курьер забирает самокат']")
    private SelenideElement elementCourierScooterTake;
    //Элемент описания "Курьер забирает самокат"
    @FindBy(how = How.XPATH, using = "//div[text()='Когда аренда заканчивается']")
    private SelenideElement elementDescriptionFourOrderScooter;
    //Элемент кружка с 4-м этапом заказа самоката
    @FindBy(how = How.XPATH, using = "//div[text()='4']")
    private SelenideElement elementCircleFourOrderScooter;

    //кнопка "заказать" самокат в описании работы сервиса
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']/button[text() = 'Заказать']")
    private SelenideElement footerOrderButton;

    public OrderPage clickHeaderOrderButton() {
        headerOrderButton.click();
        // создаём экземпляр класса страницы заказа
        OrderPage orderPage = page(OrderPage.class);
        // ожидаю загрузку страницы заказа
        orderPage.waitForLoadOrderPage();
        //  возвращаю экземпляр класса страницы заказа
        return orderPage;
    }

    public OrderPage clickFooterOrderButton() {
        footerOrderButton.scrollTo().click();
        return page(OrderPage.class);
    }

    //Cookies
    //элемент cookies текста
    @FindBy(how = How.CLASS_NAME, using = "App_CookieText__1sbqp")
    private SelenideElement cookiesText;
    //элемент cookies кнопка
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement cookiesButton;

    //метод нажать на кнопку куки
    public MainPage clickCookiesButton() {
        cookiesButton.click();
        return this;
    }

    //Элементы для тестов сравнениея полученного текста с эталонным
    //Элемент Вопросы о важном
    @FindBy(how = How.XPATH, using = "//div[text()='Вопросы о важном']")
    private SelenideElement elementFAQ;
    //Коллекция строк-элементов FAQ
    @FindBy(how = How.CLASS_NAME, using = "accordion__button")
    private ElementsCollection collectionStringQuestion;

    //Текст ответа на первый вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-0']")
    private SelenideElement answerTextFirstQuestion;
    //Текст ответа на второй вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-1']")
    private SelenideElement answerTextSecondQuestion;
    //Текст ответа на третий вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-2']")
    private SelenideElement answerTextThirdQuestion;
    //Текст ответа на 4-й вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-3']")
    private SelenideElement answerTextFourthQuestion;
    //Текст ответа на 5-й вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-4']")
    private SelenideElement answerTextFifthQuestion;
    //Текст ответа на 6-й вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-5']")
    private SelenideElement answerTextSixthQuestion;
    //Текст ответа на 7-й вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-6']")
    private SelenideElement answerTextSeventhQuestion;
    //Текст ответа на 8-й вопрос
    @FindBy(how = How.XPATH, using = ".//div[@aria-labelledby='accordion__heading-7']")
    private SelenideElement answerTextEighthQuestion;

    //Методы MainPage для тестов сравнениея полученного текста с эталонным
    //Получить элемент коллекции области FAQ, прокруить то элемента и нажать на элемент. Коллекция состоит из 8 элементов [0-7]
    public MainPage clickCollectionStringQuestion(int number) {
        collectionStringQuestion.get(number).scrollTo().click();
        return this;
    }

    //Объявление констант с текстом ответа
    private final String FIRST_ANSWER = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String SECOND_ANSWER = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String THIRD_ANSWER = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String FOURTH_ANSWER = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String FIFTH_ANSWER = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String SIXTH_ANSWER = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String SEVEN_ANSWER = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String EIGTH_ANSWER = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //Сравнить текст в первом ответе FAQ с эталонным
    public SelenideElement getAssertTextFirstQuestion() {
        return answerTextFirstQuestion.shouldHave(exactText(FIRST_ANSWER));
    }

    //Сравнить текст во втором ответе FAQ с эталоном
    public SelenideElement getAssertTextSecondQuestion() {
        return answerTextSecondQuestion.shouldHave(exactText(SECOND_ANSWER));
    }

    //Сравнить текст в 3-v ответе FAQ с эталоном
    public SelenideElement getAssertTextThirdQuestion() {
        return answerTextThirdQuestion.shouldHave(exactText(THIRD_ANSWER));
    }

    //Сравнить текст в 4-м ответе FAQ с эталоном
    public SelenideElement getAssertTextFourthQuestion() {
        return answerTextFourthQuestion.shouldHave(exactText(FOURTH_ANSWER));
    }

    //Сравнить текст в 5-и ответе FAQ с эталоном
    public SelenideElement getAssertTextFifthQuestion() {
        return answerTextFifthQuestion.shouldHave(exactText(FIFTH_ANSWER));
    }

    //Сравнить текст в 6-м ответе FAQ с эталоном
    public SelenideElement getAssertTextSixthQuestion() {
        return answerTextSixthQuestion.shouldHave(exactText(SIXTH_ANSWER));
    }

    //Сравнить текст в 7-м ответе FAQ с эталоном
    public SelenideElement getAssertTextSeventhQuestion() {
        return answerTextSeventhQuestion.shouldHave(exactText(SEVEN_ANSWER));
    }

    //Сравнить текст в 8-м овтете FAQ с эталоном
    public SelenideElement getAssertTextEighthQuestion() {
        return answerTextEighthQuestion.shouldHave(exactText(EIGTH_ANSWER));
    }


}
