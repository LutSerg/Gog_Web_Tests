package gmail.asteroster.tests;

import gmail.asteroster.pages.BrowserTests;
import gmail.asteroster.pages.ForGamesMenu;
import gmail.asteroster.pages.ForSupportMenu;
import gmail.asteroster.pages.SearchPanel;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("gogtests")
public class GogWebTests extends TestBase {

    @Test
    @Description("Title Tests")
    @DisplayName("Проверка на название в хедере тайтла")
    void titleTest() {
        BrowserTests.titleNameTest();
    }


    @Test
    @Description("Консоль")
    @DisplayName("В консоли не должны быть ошибки")
    void consoleShouldNotHaveErrorsTest() {
        BrowserTests.consoleErrorsTest();
    }

    @Test
    @Description("Раздел Магазин")
    @DisplayName("Открыть раздел Магазин")
    void fullGamesMenu() {
        ForGamesMenu.openFullGamesMenu();
        ForGamesMenu.checkFullGamesMenu();
    }

    @Test
    @Description("Раздел Магазин")
    @DisplayName("Открыть раздел Новые игры")
    void openNewGamesTab () {
        ForGamesMenu.newGamesMenu();
        ForGamesMenu.checkNewGamesMenu();
    }

    @Test
    @Description("Раздел Магазин")
    @DisplayName("Раскрывающееся окно с играми в подразделе Приключения")
    void gamesSubWindow () {
        ForGamesMenu.adventuresShortMenu();
        ForGamesMenu.checkAdventuresShortMenu();
    }

    @Test
    @Description("Раздел Поддержка")
    @DisplayName("Зайти в раздел Заказы и оплата")
    void ordersAndPaymentTab () {
        ForSupportMenu.openSupportMenu();
        ForSupportMenu.openOrdersAndPayments();
        ForSupportMenu.checkopenOrdersAndPayments();


    }
    @Test
    @Description("Поиск")
    @DisplayName("Проверить работу поиска после ввода названия игры")
    void someGameSearch () {
        SearchPanel.openSearchPanel();
        SearchPanel.enterSomeGameName();
        SearchPanel.checkTabWithTheGameName();
    }
}