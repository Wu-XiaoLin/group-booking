package cn.wxingzou.groupbooking.allocation;

import cn.wxingzou.groupbooking.base.ConditionConfig;
import org.springframework.beans.factory.BeanFactory;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @author wuxiaolin
 * @version 1.0
 * @date 2019/11/8 16:56
 **/
public interface ConditionAssemble {

    ConcurrentMap<String, ConditionChainContext> createConditionChain();

}
