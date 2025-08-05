package com.taobao.android.live.plugin.proxy.pklink;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class PkLinkProxy extends g<IPkLinkProxy> implements IPkLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PKLinkProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final PkLinkProxy f14122a;

        static {
            kge.a(-2038810492);
            f14122a = new PkLinkProxy();
        }

        public static /* synthetic */ PkLinkProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PkLinkProxy) ipChange.ipc$dispatch("d875a32d", new Object[0]) : f14122a;
        }
    }

    static {
        kge.a(800371948);
        kge.a(1770876669);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IPkLinkProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.PkLinkProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "新连麦 PK";
    }

    public static PkLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PkLinkProxy) ipChange.ipc$dispatch("c78b89d7", new Object[0]) : a.a();
    }

    private PkLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[PKLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy
    public Class<? extends BaseFrame> getPkLinkFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2d02862a", new Object[]{this});
        }
        IPkLinkProxy real = getReal();
        Class<? extends BaseFrame> pkLinkFrameClass = real != null ? real.getPkLinkFrameClass() : null;
        e.c("[PKLinkProxy#getPkLinkFrameClass]  clazz: " + pkLinkFrameClass);
        return pkLinkFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy
    public BaseFrame getPkLinkFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("5028bee0", new Object[]{this, context, aVar});
        }
        IPkLinkProxy real = getReal();
        BaseFrame pkLinkFrame = real != null ? real.getPkLinkFrame(context, aVar) : null;
        e.c("[PKLinkProxy#getPkLinkFrame]  value: " + pkLinkFrame);
        return pkLinkFrame;
    }
}
