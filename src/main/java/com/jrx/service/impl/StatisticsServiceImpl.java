package com.jrx.service.impl;

import com.jrx.pojo.Statistics;
import com.jrx.repository.StatisticsMapper;
import com.jrx.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsMapper statisticsMapper;

    @Override
    public List<Statistics> queryAllStatistics() {
        List<Statistics> list = statisticsMapper.queryAllStatistics();
        return list;
    }

    @Override
    public List<Statistics> queryByCustomerId(int id) {
        List<Statistics> list = statisticsMapper.queryByCustomerId(id);
        return list;
    }

    @Override
    public List<Statistics> queryBySurname(String name) {
        List<Statistics> list = statisticsMapper.queryBySurname(name);
        return list;
    }

    @Override
    public Statistics queryByIdAndDate(Map<String, Object> map) {
        Statistics statistics = statisticsMapper.queryByIdAndDate(map);
        return statistics;
    }

    @Override
    public void insertStatistics(Map<String, Object> map) {
             statisticsMapper.insertStatistics(map);
    }

    @Override
    public void updateStatistics(Map<String, Object> map) {
            statisticsMapper.updateStatistics(map);
    }

    @Override
    public void deleteStatisticsByCustomerId(int id) {
        statisticsMapper.deleteStatisticsByCustomerId(id);
    }

    @Override
    public List<Map> countTransCnt(int id) {
        List<Map> list = statisticsMapper.countTransCnt(id);
        return list;
    }

    @Override
    public List<Map> selectPayAndTran(int id) {
        List<Map> list = statisticsMapper.selectPayAndTran(id);
        return list;
    }


}
