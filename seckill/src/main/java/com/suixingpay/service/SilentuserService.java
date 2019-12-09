/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:34
 * @Copyright: 2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.service;


import com.suixingpay.entity.Silentuser;

import java.util.List;

/**
 * @description:
 * @author: jiangyuanchu<jiang_yc@suixingpay.com>
 * @date: 2019/12/08 14:34
 * @version: V1.0
 */
public interface SilentuserService {
    Silentuser selectById(Integer id);//根据id查询沉默用户的信息
    List<Silentuser> selectAllSilentuser();//查询所有沉默用户的所有信息
    Silentuser selectSilentUserBySlaesid(Integer slaesid);//根据所属商户id查询沉默用户
    Silentuser selectSilentUserById(Integer id);//根据查询沉默用户
    Integer selectSilentUserIsSilentuer();//查询状态为1的沉默用户的数量
    Integer selectSilentUserActiveuer();//查询状态为2的沉默用户的数量
    Integer selectSilentUserIsDeaduer();//查询状态为3的沉默用户的数量
}