package com.taobao.android.live.plugin.proxy.multiLink;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class MultiLinkProxy extends g<IMultiLinkProxy> implements IMultiLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MultiLinkProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final MultiLinkProxy f14117a;

        static {
            kge.a(-995000020);
            f14117a = new MultiLinkProxy();
        }

        public static /* synthetic */ MultiLinkProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MultiLinkProxy) ipChange.ipc$dispatch("bab0cb55", new Object[0]) : f14117a;
        }
    }

    static {
        kge.a(1757698372);
        kge.a(749102939);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IMultiLinkProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.MultiLinkProxyX";
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "多人连麦";
    }

    public static MultiLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiLinkProxy) ipChange.ipc$dispatch("40258a7f", new Object[0]) : a.a();
    }

    private MultiLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[MultiLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.multiLink.IMultiLinkProxy
    public Class<? extends BaseFrame> getMultiLinkFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b481813c", new Object[]{this});
        }
        IMultiLinkProxy real = getReal();
        Class<? extends BaseFrame> multiLinkFrameClass = real != null ? real.getMultiLinkFrameClass() : null;
        e.c("[MultiLinkProxy#getMultiLinkFrameClass]  clazz: " + multiLinkFrameClass);
        return multiLinkFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.multiLink.IMultiLinkProxy
    public BaseFrame getMultiLinkFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("93f1370e", new Object[]{this, context, aVar});
        }
        IMultiLinkProxy real = getReal();
        BaseFrame multiLinkFrame = real != null ? real.getMultiLinkFrame(context, aVar) : null;
        e.c("[MultiLinkProxy#getMultiLinkFrame]  clazz: " + multiLinkFrame);
        return multiLinkFrame;
    }
}
