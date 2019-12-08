/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.controller;

import com.suixingpay.entity.Activity;
import com.suixingpay.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
@RestController
@RequestMapping("/activitys")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping("add")
    public Integer add(Activity activity){
        return activityService.insertSelective(activity);
    }
    @RequestMapping("delete")
    public Integer delete(Integer id){
        return activityService.deleteByPrimaryKey(id);
    }
    @RequestMapping("findById")
    public Activity findById(Integer id){
        return activityService.selectById(id);
    }
    @RequestMapping("findAll")
    public Map findAll(){
        Map<String,List<Activity>> map = new HashMap<>();
        map.put("activitys",activityService.selectAll());
        return map;
    }
    @RequestMapping("findByCity")
    public Map findAll(String city){
        Map<String,List<Activity>> map = new HashMap<>();
        map.put("activitys",activityService.selectByCity(city));
        return map;
    }
    @RequestMapping("findValid")
    public Map findValid(){
        Map<String,List<Activity>> map = new HashMap<>();
        map.put("activitys",activityService.selectValidActivity());
        return map;
    }


}
