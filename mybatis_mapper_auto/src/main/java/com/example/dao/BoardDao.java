package com.example.dao;

import org.springframework.stereotype.Repository;

import com.example.model.Board;

@Repository
public interface BoardDao 
{
	public int insert(Board board);
}
