package com.mathiric.common;

import java.util.ArrayList;
import java.util.List;
//import org.springframework.data.jpa.repository;

public interface PersonRepository extends JpaRepository<Person, Long> {


        //@Query("select u from User u where u.emailAddress = ?1")
        //User findByEmailAddress(String emailAddress);
    @Query("select p from Person where p.address=?1 and p.zipcode=?2")
    List<Person> findByAddress_ZipCode(Address address, ZipCode zipCode);
}