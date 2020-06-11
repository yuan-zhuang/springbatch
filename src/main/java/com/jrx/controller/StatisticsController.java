package com.jrx.controller;

import com.jrx.pojo.Statistics;
import com.jrx.service.StatisticsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class StatisticsController {

    private static final Logger log = LogManager.getLogger(StatisticsController.class);

    @Autowired
    private StatisticsService statisticsService;

    /**
     * 查询所有每日统计金额
     * @return
     */
    //@GetMapping("/show")
    @RequestMapping("/show")
    @ResponseBody
    public List<Statistics> queryAllStatistics(Model model){
        List<Statistics> list = statisticsService.queryAllStatistics();
        return list;
    }

    /**
     * 根据id查询每日统计金额
     * @param id
     * @return
     */
    //@GetMapping("queryByCustomerId/{id}")
    @RequestMapping("queryByCustomerId")
    @ResponseBody
    public List<Statistics> queryByCustomerId(@PathVariable int id){
        List<Statistics> list = statisticsService.queryByCustomerId(id);
        return list;
    }

    @GetMapping("queryBySurname/{name}")
    public List<Statistics> queryBySurname(@PathVariable String name){
        List<Statistics> list = statisticsService.queryBySurname(name);
        return list;
    }

    @GetMapping("deleteStatisticsByCustomerId/{id}")
    public void deleteStatisticsByCustomerId(@PathVariable int id){
        statisticsService.deleteStatisticsByCustomerId(id);
    }

    /**
     * 查询折线图所需要的数据
     * @param id
     * @return
     */
    @GetMapping("/countTransCnt")
    @ResponseBody
    public List<Map> countTransCnt(int id){
        log.info("查询一个月每天的消费总金额");
        List<Map> list = statisticsService.countTransCnt(id);
        System.out.println(list);
        return list;
    }

    //展示折线图
    @RequestMapping( "/line")
    public String show4() {
        return "line";
    }

    /**
     * 查询饼图所需要的数据
     * @param id
     * @return
     */
    @GetMapping("/selectPayAndTran")
    @ResponseBody
    public List<Map> selectPayAndTran(int id) {
        log.info("比较消费金额和还款金额比重");
        List<Map> list = statisticsService.selectPayAndTran(id);
        return list;
    }
    //展示饼图
    @RequestMapping("/pie")
    public String show3() {

        return "pie";
    }

}
