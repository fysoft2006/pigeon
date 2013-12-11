/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.remoting.invoker.process;

import com.dianping.pigeon.remoting.common.component.invocation.InvocationResponse;
import com.dianping.pigeon.remoting.invoker.Client;

public interface ResponseProcessor {

	public void stop();

	public void processResponse(final InvocationResponse response, final Client client);

}
