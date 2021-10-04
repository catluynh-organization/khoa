package com.khoa.service;

import java.util.List;

import com.khoa.entity.Khoa;


public interface KhoaService {
	public List<Khoa> findAll();
	public void saveSinhVien(Khoa khoa);
	public Khoa findById(int id);
	public void deleteById(int id);
}
