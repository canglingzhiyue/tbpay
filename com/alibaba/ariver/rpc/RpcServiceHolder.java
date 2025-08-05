package com.alibaba.ariver.rpc;

import android.app.Application;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.remoterpc.MpaasRemoteRpcServiceImpl;
import com.alipay.mobile.framework.service.common.MpaasRpcService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RpcServiceHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MpaasRpcService f2917a;

    static {
        kge.a(419946857);
        f2917a = null;
    }

    public static MpaasRpcService get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasRpcService) ipChange.ipc$dispatch("5c8624b", new Object[0]);
        }
        if (f2917a == null) {
            synchronized (RpcServiceHolder.class) {
                if (f2917a == null) {
                    Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
                    if (ProcessUtils.isMainProcess()) {
                        f2917a = new MpaasRpcServiceImpl(applicationContext);
                    } else {
                        f2917a = new MpaasRemoteRpcServiceImpl(applicationContext);
                    }
                }
            }
        }
        return f2917a;
    }
}
