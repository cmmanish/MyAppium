package Screens;

/**
 * Created by skloaner on 10/25/17.
 */

public class CreateAccountScreen extends Screen {

    public static boolean typeEmail(String email) {

        try {
            System.out.println(email + ": Typed");
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean typePassword(String password) {

        try {
            System.out.println(password + ": Typed");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean tapButton() {

        try {
            System.out.println("Tapped Button");
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
