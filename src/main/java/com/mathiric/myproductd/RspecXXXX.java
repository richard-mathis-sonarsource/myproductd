package com.mathiric.myproductd;

import com.mathiric.common.Person;
import com.mathiric.common.ZipCode;

import java.util.ArrayList;
import java.util.List;

public class RspecXXXX {

    public interface UserRepository extends JpaRepository<User, Long> {

        @Query("select u from User u where u.emailAddress = ?1")
        User findByEmailAddress(String emailAddress);
    }    @Query()
    List<Person> findByAddress_ZipCode(ZipCode zipCode) {
        return new ArrayList<>();
    }
}
