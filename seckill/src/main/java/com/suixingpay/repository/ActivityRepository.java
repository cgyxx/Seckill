/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.repository;

import com.suixingpay.entity.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
@Mapper
@Repository
public interface ActivityRepository {
    int insertSelective(Activity activity);
    Integer deleteByPrimaryKey(int id);
    Activity selectById(int id);
    List<Activity> selectAll();
    List<Activity> selectValidActivity(String time);
    List<Activity> selectByCity(String city);

}
