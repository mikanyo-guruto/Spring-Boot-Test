package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/*
 * テーブルへアクセスする為の基本的な処理を呼び出すことができる
 */

@Repository
public interface UserRepositoty extends JpaRepository<User, Long> {

}
