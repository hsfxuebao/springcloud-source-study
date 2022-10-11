package com.hsf.eureka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.hsf.eureka.bean.Depart;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hsfxuebao
 * Created on 2022-10-11
 */
@Service
@Slf4j
public class DepartServiceImpl implements DepartService {

    @Override
    public boolean saveDepart(Depart depart) {
        log.info("DepartService saveDepart depart = {}", depart.toString());
        return true;
    }

    @Override
    public boolean removeDepartById(int id) {
        log.info("DepartService removeDepartById depart = {}", id);
        return true;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        log.info("DepartService modifyDepart depart = {}", depart.toString());
        return true;
    }

    @Override
    public Depart getDepartById(int id) {
        return Depart.builder().id(id).name(id + "desc").build();
    }

    @Override
    public List<Depart> listAllDeparts() {

        Depart depart1 = Depart.builder().id(1).name("1").build();
        Depart depart2 = Depart.builder().id(2).name("2").build();
        ArrayList<Depart> departs = Lists.newArrayListWithCapacity(2);
        departs.add(depart1);
        departs.add(depart2);
        return departs;
    }
}
