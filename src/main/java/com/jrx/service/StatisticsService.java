package com.jrx.service;

import com.jrx.pojo.Statistics;

import java.util.List;
import java.util.Map;

public interface StatisticsService {

    public List<Statistics> queryAllStatistics();

    public List<Statistics> queryByCustomerId(int id);

    public List<Statistics> queryBySurname(String name);

    public Statistics queryByIdAndDate(Map<String,Object> map);

    public void insertStatistics(Map<String, Object> map);

    public void updateStatistics(Map<String, Object> map);

    public void deleteStatisticsByCustomerId(int id);

    public List<Map> countTransCnt(int id);

    public List<Map> selectPayAndTran(int id);

}
