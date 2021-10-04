package com.khoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.entity.Khoa;
import com.khoa.repository.KhoaRepository;

@Service
public class KhoaServiceImpl implements KhoaService{
	@Autowired
	private KhoaRepository khoaRepository;

	@Override
	public List<Khoa> findAll() {
		// TODO Auto-generated method stub
		return khoaRepository.findAll();
	}

	@Override
	public void saveSinhVien(Khoa khoa) {
		// TODO Auto-generated method stub
		khoaRepository.save(khoa);
	}

	@Override
	public Khoa findById(int id) {
		// TODO Auto-generated method stub
		Optional<Khoa> rs= khoaRepository.findById(id);
		Khoa khoa = null;
		if(rs.isPresent()) {
			khoa = rs.get();
		}
		return khoa;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		khoaRepository.deleteById(id);
		
	}

}
