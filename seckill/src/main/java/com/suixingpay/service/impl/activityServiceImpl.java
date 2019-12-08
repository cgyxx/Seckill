/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suixingpay.repository.activityRepository;
import com.suixingpay.service.activityService;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
@Service
public class activityServiceImpl implements activityService {

    @Autowired
    private activityRepository activityRepository;

}