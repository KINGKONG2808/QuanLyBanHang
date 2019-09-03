package Controller;

import java.util.InputMismatchException;

public class Control_Menu {
    public static void mainMenu() {
        do {
            Control_ListMenu.mainMenu();
            int n = Data_Input.choose(3);
            Control_Switch.mainMenu(n);
        } while (true);
    }
}
