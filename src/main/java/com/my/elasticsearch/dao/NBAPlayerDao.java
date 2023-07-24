package com.my.elasticsearch.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.my.elasticsearch.model.NBAPlayer;

@Mapper
public interface NBAPlayerDao {

    @Select("select * from nba_player")
    public List<NBAPlayer> selectAll();
}
