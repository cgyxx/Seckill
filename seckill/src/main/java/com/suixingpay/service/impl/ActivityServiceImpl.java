/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.service.impl;

import com.suixingpay.entity.Activity;
import com.suixingpay.repository.ActivityRepository;
import com.suixingpay.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public int insertSelective(Activity activity) {
        return activityRepository.insertSelective(activity);
    }

    @Override
    public Integer deleteByPrimaryKey(int id) {
        return activityRepository.deleteByPrimaryKey(id);
    }

    @Override
    public Activity selectById(int id) {
        return activityRepository.selectById(id);
    }

    @Override
    public List<Activity> selectAll() {
        return activityRepository.selectAll();
    }

    @Override
    public List<Activity> selectByCity(String city) {
        return activityRepository.selectByCity(city);
    }

    @Override
    public List<Activity> selectValidActivity() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time =simpleDateFormat.format(date);
        return activityRepository.selectValidActivity(time);
    }
}