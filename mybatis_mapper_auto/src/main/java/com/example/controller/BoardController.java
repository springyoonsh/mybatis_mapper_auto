package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Board;
import com.example.service.BoardService;

@Controller
public class BoardController 
{
	@Autowired
	private BoardService service;
	
	@RequestMapping("/")
	public String list()
	{
		Board board = new Board("stormrt", "test7");
		
		int rst = service.insert(board);
		
		System.out.println(rst);		
		
		return "list";
	}
}
