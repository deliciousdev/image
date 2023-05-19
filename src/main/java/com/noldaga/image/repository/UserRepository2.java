package com.noldaga.image.repository;

import com.noldaga.image.domain.User;
import com.noldaga.image.domain.User2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<User2,Long> {

}
