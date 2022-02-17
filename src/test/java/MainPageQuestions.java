import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPageQuestions {

   /* @Before
    public void openPage() {
        //Открывается страница и создаётся экземпляр класса страницы
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
    }*/

    @Test //Получить кол-во строк с вопросами FAQ
    public void test() {

        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);


        /*String countAccordion = mainPage.koko(0);
        System.out.println(countAccordion);*/

//        MainPage countAccordion = mainPage.getCollectionStringQuestion(0);
//        Integer countAccordion = $$(byClassName("accordion__button")).size();
//        System.out.println(countAccordion);

        MainPage countAccordion = mainPage.getCollectionStringQuestion(0);
        MainPage textOne = mainPage.text();
        System.out.println(textOne);


    }
}