package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: NewsController
 * @Author: wangl585
 * @Date: 2019/5/31 9:04
 * @Discription: TODO
 */
@RestController
@RequestMapping(value = "news")
public class NewsController {
    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aaa","ccccc");
        News news2 = new News(2,"aaa11","ccccc11");
        News news3 = new News(3,"aaa22","ccccc112c");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;

    }
}
