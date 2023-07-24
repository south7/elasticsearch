package com.my.elasticsearch;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.my.elasticsearch.dao.NBAPlayerDao;
import com.my.elasticsearch.model.NBAPlayer;
import com.my.elasticsearch.service.NBAPlayerService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

    @Resource
    private NBAPlayerDao nbaPlayerDao;

    @Autowired
    private NBAPlayerService nbaPlayerService;

    @Test
    public void selectAll(){
        System.out.println(JSONObject.toJSON(nbaPlayerDao.selectAll()));
    }

    @Test
    public void addPlayer() throws IOException {
        NBAPlayer player = new NBAPlayer();
        player.setId(999);
        player.setDisplayName("杨超越");
        nbaPlayerService.addPlayer(player,"999");
    }

    @Test
    public void getPlayer() throws IOException {
        Map<String, Object> player =  nbaPlayerService.getPlayer("999");
        System.out.println(JSONObject.toJSON(player));
    }

}
