package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SCNetworkAsyncTaskExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SCNetworkAsyncTaskExecutor f5118a;

    public static final SCNetworkAsyncTaskExecutor getInstance() {
        SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor = f5118a;
        if (sCNetworkAsyncTaskExecutor != null) {
            return sCNetworkAsyncTaskExecutor;
        }
        synchronized (SCNetworkAsyncTaskExecutorFactory.class) {
            if (f5118a != null) {
                return f5118a;
            } else if (PlatformUtil.isAndroidMPaaSPlatform()) {
                SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor2 = (SCNetworkAsyncTaskExecutor) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.integrated.threadpool.MPaaSNetworkAsyncTaskExecutor").newInstance();
                f5118a = sCNetworkAsyncTaskExecutor2;
                return sCNetworkAsyncTaskExecutor2;
            } else {
                if (f5118a == null) {
                    f5118a = new DefaultSCNetworkAsyncTaskExecutor();
                }
                return f5118a;
            }
        }
    }
}
