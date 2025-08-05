package com.taobao.android.live.plugin.proxy.topbar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class TopBarProxy extends g<ITopBarProxy> implements ITopBarProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopBarProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final TopBarProxy f14129a;

        static {
            kge.a(509561892);
            f14129a = new TopBarProxy();
        }

        public static /* synthetic */ TopBarProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TopBarProxy) ipChange.ipc$dispatch("3819eecd", new Object[0]) : f14129a;
        }
    }

    static {
        kge.a(713585996);
        kge.a(-295681237);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : ITopBarProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.TopBarProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveTopBarPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "顶部头像";
    }

    public static TopBarProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TopBarProxy) ipChange.ipc$dispatch("272fd577", new Object[0]) : a.a();
    }

    private TopBarProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[TopBarProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getTopBarFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("481e3ed2", new Object[]{this});
        }
        ITopBarProxy real = getReal();
        Class<? extends BaseFrame> topBarFrame3Class = real != null ? real.getTopBarFrame3Class() : null;
        e.c("[TopBarProxy#getTopBarFrame3Class]  clazz: " + topBarFrame3Class);
        return topBarFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getAnchorInfoFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b082e318", new Object[]{this});
        }
        ITopBarProxy real = getReal();
        Class<? extends BaseFrame> anchorInfoFrameClass = real != null ? real.getAnchorInfoFrameClass() : null;
        e.c("[TopBarProxy#getAnchorInfoFrameClass]  clazz: " + anchorInfoFrameClass);
        return anchorInfoFrameClass;
    }
}
