package com.alipay.mobile.verifyidentity.rpc;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IRpcServiceInjector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IRpcServiceInjector b;

    /* renamed from: a  reason: collision with root package name */
    private IRpcService f6047a = null;

    private IRpcServiceInjector() {
    }

    public static IRpcServiceInjector getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcServiceInjector) ipChange.ipc$dispatch("f5e8f5f2", new Object[0]);
        }
        if (b == null) {
            synchronized (IRpcServiceInjector.class) {
                if (b == null) {
                    b = new IRpcServiceInjector();
                }
            }
        }
        return b;
    }

    public void inject(IRpcService iRpcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2306975a", new Object[]{this, iRpcService});
        } else {
            this.f6047a = iRpcService;
        }
    }

    public IRpcService getRpcService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRpcService) ipChange.ipc$dispatch("1ac199ab", new Object[]{this}) : this.f6047a;
    }
}
