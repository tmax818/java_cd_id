package FundamentalsDay01.Assignments.AlfredBot;

/**
 * This class will hold all the AlfredQuotes functionality. This is where you will do your coding for this assignment.
 */
import java.util.Date;
public class AlfredQuotes {

    /**
     * You do not need to code here, this is an example method
     */
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    /**
     * use {@code String.format} for string interpolation in Java.
     * @param name The person being greeted.
     * @return Returns a greeting that includes the person's name.
     * @see <a href="https://login.codingdojo.com/m/315/9299/62843">Alfred Bot</a>
     */

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "place holder for guest greeting return string";
    }

    /**
     * @return Returns a polite announcement of the current date and time.
     * @see <a href="https://login.codingdojo.com/m/315/9299/62843">Alfred Bot</a>
     */
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return "place holder for date announcement return string";
    }

    /**
     *
     * @param conversation
     * @return
     * <ul>
     * <li>If "Alexis" appears in the conversation (in the string) return a snarky response, such as, "Right away, sir. She certainly isn't sophisticated enough for that.</li>
     * <li>If "Alfred" is in the conversation return an obliging response, for example, "At your service. As you wish, naturally."</li>
     * <li>If neither name is found, return an appropriate response, for instance, "Right. And with that I shall retire." </li>
     * </ul>
     */

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

