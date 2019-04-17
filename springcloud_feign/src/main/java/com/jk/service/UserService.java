package com.jk.service;

import com.jk.util.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:12
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:12
 * 修改备注：
 * @version </pre>
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface UserService extends UserServiceApi{


}
