import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserServiceTest {
    @Test
    void testCreateUser_whenUserDetailsProvided_returnUserObject() {
        //arrange
        UserService userService = new UserServiceImpl();
        String firstName = "sergio";
        String lastName = "rivera";
        String email = "jr@gmail.com";
        String password = "1234";
        //act

        User user = userService.createUser(firstName, lastName, email, password);
        //assert
        assertNotNull(user, "user not null");
        assertEquals(firstName, user.getFirstName(), "user first name is incorrect");
        assertEquals(lastName, user.getLastName(), "user last name is incorrect");
        assertEquals(email,user.getEmail(),"email not valid");
    }

    @Test
    void testCreateUser_whenFirstNameIsEmpty_returnIllegalArgumentException() {
        //arrange
        UserService userService = new UserServiceImpl();
        String firstName = "";
        String lastName = "rivera";
        String email = "jr@gmail.com";
        String password = "1234";
        //act

        //assert
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            User user = userService.createUser(firstName, lastName, email, password);
        },"empty first name should throws an illegal exception");
    }
}
