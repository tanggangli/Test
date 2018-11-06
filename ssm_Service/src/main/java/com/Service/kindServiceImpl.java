package com.Service;

import com.dao.kindDao;
import com.domain.Kind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class kindServiceImpl implements kindService{

    @Autowired
    private kindDao kinddao;

    public List<Kind> findAll() {
        System.out.println("Service执行");
        List<Kind> all = kinddao.findAll();
        return all;
    }
}
