import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordvalidierungTest {

    @Test
    void PasswortvalidierungTestForLengthPasswords7() {
        // GIVEN
        String password = "Hamburg";

        // WHEN
        String conclusion = Passwordvalidierung.PasswordvalidierungForLengthPasswords("Hamburg");

        // THEN
        assertEquals("Die Lange des Passwordes ist zu kurz", conclusion);
    }

    @Test
    void PasswortvalidierungTestForLengthPasswords16() {
        // GIVEN
        String password = "HamburgUndBerlin";

        // WHEN
        String conclusion = Passwordvalidierung.PasswordvalidierungForLengthPasswords("HamburgUndBerlin");

        // THEN
        assertEquals("Die Lange des Passwordes passt gut, Gut gemacht!", conclusion);
    }


    @Test
    void PasswortvalidierungTestForPresenceOfNumberWith() {
        // GIVEN
        String password = "Hamburg123";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungTestForPresenceOfNumber("Hamburg123");

        // THEN
        assertEquals("Ja, Ihr Password hat die Zahle und wurde sicher, Gut gemacht!", conclusion);
    }



    @Test
    void PasswortvalidierungTestForPresenceOfNumberWithout() {
        // GIVEN
        String password = "Hamburg";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungTestForPresenceOfNumber("Hamburg");

        // THEN
        assertEquals("Ihr Password hat keine Zahle!", conclusion);
    }


    @Test
    void PasswortvalidierungTestForPresenceOfCapitalLettersWith() {
        // GIVEN
        String password = "Hamburg";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungForPresenceOfCapitalLetters("Hamburg");

        // THEN
        assertEquals("Ihr Password hat grosse Buchstaben", conclusion);
    }


    @Test
    void PasswortvalidierungTestForPresenceOfCapitalLettersWithout() {
        // GIVEN
        String password = "hamburg";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungForPresenceOfCapitalLetters("hamburg");

        // THEN
        assertEquals("Ihr Password hat keine grosse Buchstaben", conclusion);
    }


    @Test
    void PasswortvalidierungTestForPresenceOfBadPasswordNotBad() {
        // GIVEN
        String password = "Hamburg1!*";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungForBadPassword("Hamburg1!*");

        // THEN
        assertEquals("Great! Your password is very good, Gut gemacht!", conclusion);
    }

    @Test
    void PasswortvalidierungTestForPresenceOfBadPasswordYesBad() {
        // GIVEN
        String password = "Password1";

        // WHEN
        String conclusion = Passwordvalidierung.PasswortvalidierungForBadPassword("Password1");

        // THEN
    assertEquals("Sorry, but your password is very weak. Please add at least 1 number, 1 capital letter and 1 special character", conclusion);
    }



}
