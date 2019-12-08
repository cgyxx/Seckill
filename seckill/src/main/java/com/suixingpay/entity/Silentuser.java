/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:34
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.lang.Integer;
import java.lang.String;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:34
 * @version: V1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Silentuser {
    /**  **/
    private Integer id;
    /** 商户编号 **/
    private String number;
    /** 姓名 **/
    private String name;
    /** 性别 **/
    private String sex;
    /** 手机号 **/
    private String phone;
    /** 省份 **/
    private String city;
    /** 0正常用户 1剩余用户 **/
    private Integer surplus;
    /** 状态（1沉默用户  2活跃用户  3死寂用户） **/
    private Integer status;
    /** 所属鑫管家id **/
    private Integer slaesid;
    /** 备用字段 **/
    private String info;
}
