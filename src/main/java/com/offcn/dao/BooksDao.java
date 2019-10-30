package com.offcn.dao;


import com.offcn.pojo.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksDao extends JpaRepository<Books,String> {
}
