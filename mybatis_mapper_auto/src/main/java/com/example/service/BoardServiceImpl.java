package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BoardDao;
import com.example.model.Board;

@Service
public class BoardServiceImpl implements BoardService 
{
	@Autowired
	private BoardDao dao;
	
	@Override
	public int insert(Board board) 
	{
		int rst = dao.insert(board);
		return rst;
	}
	
}
