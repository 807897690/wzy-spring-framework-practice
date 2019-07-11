package com.wzy.autowire;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author wzy
 * @title: PrototypeDaoImpl
 * @description: TODO
 * @date 2019/7/1 17:48
 */
@Repository
@Scope("prototype")
public class PrototypeDaoImpl implements PrototypeDao{
}
