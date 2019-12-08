/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.controller;

import com.suixingpay.service.activityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:33
 * @version: V1.0
 */
@RestController
@RequestMapping("/activitys")
public class activityController {

    @Autowired
    private activityService activityService;

}
