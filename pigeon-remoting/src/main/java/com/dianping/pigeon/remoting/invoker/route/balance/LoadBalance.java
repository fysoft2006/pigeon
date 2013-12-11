/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.remoting.invoker.route.balance;

import java.util.List;

import com.dianping.pigeon.remoting.common.component.invocation.InvocationRequest;
import com.dianping.pigeon.remoting.invoker.Client;

/**
 * 负载均衡策略接口, 负责分派请求到指定的服务端
 * 
 * @author danson.liu
 * 
 */
public interface LoadBalance {

	Client select(List<Client> clients, InvocationRequest request);
}
