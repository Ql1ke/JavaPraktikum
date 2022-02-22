import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainPageQuestionsTest {

    MainPage mainPage = page(MainPage.class);
    private final String URL = "https://qa-scooter.praktikum-services.ru/";
    //Открывается страница и создаётся экземпляр класса главной страницы

    @Before
    public void setBrowser() {
        open(URL);
    }

    @Test //Открыть первую строку FAQ и сравнить текст с эталонным
    public void testFirstText() {
        mainPage.clickCollectionStringQuestion(0);
        mainPage.getAssertTextFirstQuestion();
    }

    @Test //Открыть вторую строку FAQ и сравнить текст с эталонным
    public void testSecondText() {
        mainPage.clickCollectionStringQuestion(1);
        mainPage.getAssertTextSecondQuestion();
    }

    @Test //Открыть 3-ю строку FAQ и сравнить текст с эталоном
    public void testThirdText() {
        mainPage.clickCollectionStringQuestion(2);
        mainPage.getAssertTextThirdQuestion();
    }

    @Test //Открыть 4-ю строку FAQ и сравнить текст с эталоном
    public void testFourth() {
        mainPage.clickCollectionStringQuestion(3);
        mainPage.getAssertTextFourthQuestion();
    }

    @Test //Открыть 5-ю строку FAQ и сравнить текст с эталоном
    public void testFifth() {
        mainPage.clickCollectionStringQuestion(4);
        mainPage.getAssertTextFifthQuestion();
    }

    @Test //Открыть 6-ю строку FAQ и сравнить текст с эталоном
    public void testSixth() {
        mainPage.clickCollectionStringQuestion(5);
        mainPage.getAssertTextSixthQuestion();
    }

    @Test //Открыть 7-ю строку FAQ и сравнить текст с эталоном
    public void testSeventh() {
        mainPage.clickCollectionStringQuestion(6);
        mainPage.getAssertTextSeventhQuestion();
    }

    @Test //Открыть 8-ю строку FAQ и сравнить текст с эталоном
    public void testEight() {
        mainPage.clickCollectionStringQuestion(7);
        mainPage.getAssertTextEighthQuestion();
    }


}