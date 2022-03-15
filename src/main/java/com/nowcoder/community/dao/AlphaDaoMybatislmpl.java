package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybatislmpl implements AlphaDao{
    @Override
    public String selet() {
        return "Mybatis";
    }
}
