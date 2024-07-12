package com.doranco.amasbooking;

import com.doranco.amasbooking.model.entity.User;
import com.doranco.amasbooking.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    public void testCreateUser(){
        User user = new User();
        user.setEmail("tmariama84@gmail.com");
        user.setPassword("Mariama");
        user.setFirstName("Mariama");
        user.setLastName("Tunkara");
        user.setCivility("F");

        User saveUser = repo.save(user);
        User existUser = entityManager.find(User.class, saveUser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }

//    @Test
//    public void testFindUserByEmail() {
//        String email = "marion@.com";
//
//        User user = repo.findByEmail(email);
//
//        assertThat(user).isNotNull();
//    }
}
