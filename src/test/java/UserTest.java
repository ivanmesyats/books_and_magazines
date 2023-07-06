import org.example.Main;
import org.example.User;
import org.example.UsrMngt;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    static ArrayList<User> users = new ArrayList();

    @BeforeAll
    public static void createUsersList() {

        Random random = new Random();
        int maxAge = 17;
        int numberOfUsers = 12;

        for (int i = 0; i < numberOfUsers; i++) {
            User user = new User();

            user.firstName = "firstName";
            user.secondName = "secondName";
            user.age = random.nextInt(9, maxAge);

            users.add(user);
        }
    }

    @BeforeEach
    public void someText() {
        System.out.println("some text before each test");
    }


    @Test
    public void lessThen18Test() {

        Assertions.assertEquals(true, UsrMngt.lessThen18(users));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 18, 80})
    void ageExists(int age) {
        assertFalse(UsrMngt.ageExists(users, age));
    }

    @Test
    public void moreThen18Test() {

        Assertions.assertEquals(false, UsrMngt.lessThen18(users));

    }

    @Test
    public void containseSorA() {

        Assertions.assertEquals(true, UsrMngt.sOrAinTheName(users));

    }


    @RepeatedTest(10)
    public void moreThen18TestRep() {
        Assertions.assertEquals(true, UsrMngt.lessThen18(users));
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    public void first() throws Exception {
        Assertions.assertEquals(true, UsrMngt.lessThen18(users));
        Thread.sleep(500);
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    public void second() throws Exception {
        Assertions.assertEquals(true, UsrMngt.sOrAinTheName(users));
        Thread.sleep(500);
    }
}



