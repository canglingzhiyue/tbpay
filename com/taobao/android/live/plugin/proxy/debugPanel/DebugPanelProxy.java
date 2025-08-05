package com.taobao.android.live.plugin.proxy.debugPanel;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class DebugPanelProxy extends g<IDebugPanelProxy> implements IDebugPanelProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DebugPanelProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final DebugPanelProxy f14096a;

        static {
            kge.a(38825700);
            f14096a = new DebugPanelProxy();
        }

        public static /* synthetic */ DebugPanelProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DebugPanelProxy) ipChange.ipc$dispatch("8c12e38d", new Object[0]) : f14096a;
        }
    }

    static {
        kge.a(-1998263668);
        kge.a(-962944347);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IDebugPanelProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.DebugPanelProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveDebugPanelPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "算法debug面板";
    }

    private DebugPanelProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[DebugPanelProxy<init>] error: " + th.getMessage());
        }
    }

    public static DebugPanelProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DebugPanelProxy) ipChange.ipc$dispatch("87548037", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public Object createDebugPanel(Context context, ViewGroup viewGroup, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e724fddb", new Object[]{this, context, viewGroup, bVar, new Boolean(z)});
        }
        IDebugPanelProxy real = getReal();
        Object createDebugPanel = real != null ? real.createDebugPanel(context, viewGroup, bVar, z) : null;
        e.c("[DebugPanelProxy#initDebugPanel] " + createDebugPanel);
        return createDebugPanel;
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public void destroyDebugPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9dd1f6", new Object[]{this, context});
            return;
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            real.destroyDebugPanel(context);
        }
        e.c("[DebugPanelProxy#removeDebugPanel]");
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public com.taobao.android.live.plugin.proxy.debugPanel.a createDisplayView(Context context, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.live.plugin.proxy.debugPanel.a) ipChange.ipc$dispatch("2846d540", new Object[]{this, context, viewGroup, new Boolean(z)});
        }
        IDebugPanelProxy real = getReal();
        com.taobao.android.live.plugin.proxy.debugPanel.a createDisplayView = real != null ? real.createDisplayView(context, viewGroup, z) : null;
        e.c("[DebugPanelProxy#createDisplayView] " + createDisplayView);
        return createDisplayView;
    }

    @Override // com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy
    public void destroyDisplayView(Context context, com.taobao.android.live.plugin.proxy.debugPanel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8cb71d", new Object[]{this, context, aVar});
            return;
        }
        IDebugPanelProxy real = getReal();
        if (real != null) {
            real.destroyDisplayView(context, aVar);
        }
        e.c("[DebugPanelProxy#removeDisplayView]");
    }
}
