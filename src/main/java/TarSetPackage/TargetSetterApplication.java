package TarSetPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;

@SpringBootApplication(exclude = CassandraAutoConfiguration.class)
public class TargetSetterApplication implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(TargetSetterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Вставляем тестового пользователя
        PersonalData testUser = new PersonalData();
        testUser.setUsername("settre");
        testUser.setEmail("setter");
        testUser.setPassword("testpassword");
        testUser.setFirstName("Setter");
        testUser.setLastName("Setter");
        testUser.setAvatarUrl("https://example.com/avatar.jpg");
        userDao.insertUser(testUser);

        // Выводим всех пользователей
        userDao.printAllUsers();
    }
}
