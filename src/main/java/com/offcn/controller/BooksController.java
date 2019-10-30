package com.offcn.controller;

import com.offcn.dao.BooksDao;
import com.offcn.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/books",produces="text/plain;charset=UTF-8")
public class BooksController {

    @Autowired
    BooksDao booksDao;

    /**
     * 增加
     * */
    @PostMapping(path="/addBook")
    public void addBook(@RequestBody Books books){
        booksDao.save(books);
    }

    /**
     * 查询所有
     * */
    @GetMapping(path="/findAll")
    public List<Books> findAll(){
        return booksDao.findAll();
    }

    /**
     * 根据id查询单个
     * @return
     * */
    @GetMapping(path="/findOne")
    public Books findOne(@RequestParam String id){
        return booksDao.getOne(id);
    }

    /**
     * 根据id删除
     * */
    @DeleteMapping(path = "/removeById")
    public void removeById(@PathVariable String id){
        booksDao.deleteById(id);
    }

    /**
     * 根据id修改
     * */
    @PostMapping(path = "/update")
    public void update(@RequestBody Books books){
        booksDao.saveAndFlush(books);
    }
}
