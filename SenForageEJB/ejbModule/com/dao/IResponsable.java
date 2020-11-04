package com.dao;

import java.util.List;

import com.entitie.bean.Responsables;


public interface IResponsable {
	public List<Responsables> liste();
	public int add(Responsables Responsables);

}
