package com.taobao.android.live.plugin.proxy.usertask;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import tb.kge;

/* loaded from: classes6.dex */
public class UserTaskProxy extends com.taobao.android.live.plugin.proxy.g<IUserTaskProxy> implements IUserTaskProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UserTaskProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final UserTaskProxy f14131a;

        static {
            kge.a(-1165515036);
            f14131a = new UserTaskProxy();
        }

        public static /* synthetic */ UserTaskProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UserTaskProxy) ipChange.ipc$dispatch("60cfa8d", new Object[0]) : f14131a;
        }
    }

    static {
        kge.a(1205645964);
        kge.a(-1530485241);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IUserTaskProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.UserTaskProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installUserTaskPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "平台任务";
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public g createUserController(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("299de01a", new Object[]{this, str, str2});
        }
        IUserTaskProxy real = getReal();
        g createUserController = real != null ? real.createUserController(str, str2) : null;
        e.c("[UserTaskProxy#createUserController]  value: " + createUserController);
        return createUserController;
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public i createWVPluginClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("bf21730b", new Object[]{this});
        }
        IUserTaskProxy real = getReal();
        i createWVPluginClass = real != null ? real.createWVPluginClass() : null;
        e.c("[UserTaskProxy#createWVPluginClass ]  value: " + createWVPluginClass);
        return createWVPluginClass;
    }

    public static UserTaskProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserTaskProxy) ipChange.ipc$dispatch("151b7c37", new Object[0]) : a.a();
    }

    private UserTaskProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[UserTaskProxy<init>] error: " + th.getMessage());
        }
    }
}
