package com.jrx.repository;

import com.jrx.pojo.Statistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StatisticsMapper {

    public List<Statistics> queryAllStatistics();

    public List<Statistics> queryByCustomerId(int id);

    public List<Statistics> queryBySurname(String name);

    public Statistics queryByIdAndDate(Map<String,Object> map);

    public Statistics queryByTransDate(String date);

    public void insertStatistics(Map<String, Object> map);

    public void updateStatistics(Map<String, Object> map);

    public void deleteStatisticsByCustomerId(int id);

    public List<Map> countTransCnt(int id);

    public List<Map> selectPayAndTran(int id);




}
