/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.service;


import com.suixingpay.entity.Activity;

import java.util.List;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
public interface ActivityService {
    /**
     * 添加活动
     * @param activity
     * @return
     */
    int insertSelective(Activity activity);

    /**
     * 删除活动
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(int id);

    /**
     * 查看指定活动
     * @param id
     * @return
     */
    Activity selectById(int id);

    /**
     * 管理员查看所有活动
     * @return
     */
    List<Activity> selectAll();

    /**
     * 通过城市活动
     * @param city
     * @return
     */
    List<Activity> selectByCity(String city);

    /**
     * 查看有效活动
     * @param time
     * @return
     */
    List<Activity> selectValidActivity();
}