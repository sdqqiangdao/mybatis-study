package org.mybatis.study.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.study.web.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BlogMapperTest {

    @Autowired
    private BlogMapper blogMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setName("哈哈");
        blogMapper.insert(blog);
    }

    @Test
    public void selectByPrimaryKey() {
        blogMapper.selectByPrimaryKey(1L);
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}