package com.khoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khoa.entity.Khoa;
import com.khoa.service.KhoaService;



@RestController
@RequestMapping("/khoa")
public class SinhVienRestController {
	@Autowired
	private KhoaService khoaService;
	
	@GetMapping("")
	public List<Khoa> findAll(){
		return khoaService.findAll();
	}
	
	@GetMapping("{id}")
	public Khoa findAll(@PathVariable int id){
		return khoaService.findById(id);
	}
	
	@PostMapping("")
	public void saveSinhVien(@RequestBody Khoa khoa) {
		khoaService.saveSinhVien(khoa);
	}
	
	@PutMapping("")
	public void updateSinhVien(@RequestBody Khoa khoa) {
		khoaService.saveSinhVien(khoa);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		khoaService.deleteById(id);
	}
	
}
