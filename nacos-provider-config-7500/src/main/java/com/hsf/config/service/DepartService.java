package com.hsf.config.service;


import java.util.List;

import com.hsf.config.bean.Depart;


/**
 * @author hsfxuebao
 * Created on 2022-10-11
 */
public interface DepartService {

    boolean saveDepart(Depart depart);

    boolean removeDepartById(int id);

    boolean modifyDepart(Depart depart);

    Depart getDepartById(int id);

    List<Depart> listAllDeparts();

}
