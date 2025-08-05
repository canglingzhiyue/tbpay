package com.taobao.android.live.plugin.proxy.bclink;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public class BCLinkProxy extends g<IBCLinkProxy> implements IBCLinkProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BCLinkProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final BCLinkProxy f14091a;

        static {
            kge.a(289701284);
            f14091a = new BCLinkProxy();
        }

        public static /* synthetic */ BCLinkProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BCLinkProxy) ipChange.ipc$dispatch("c522404d", new Object[0]) : f14091a;
        }
    }

    static {
        kge.a(-1703939124);
        kge.a(-1246653935);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IBCLinkProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.BCLinkProxyX";
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "BC 连麦";
    }

    public static BCLinkProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BCLinkProxy) ipChange.ipc$dispatch("b43826f7", new Object[0]) : a.a();
    }

    private BCLinkProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[BCLinkProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableLinkLive3() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f05635", new Object[]{this})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableLinkLive3();
        }
        e.c("[BCLinkProxy#enableLinkLive3]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableLiveLink(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180ee2d2", new Object[]{this, aVar, tBLiveDataModel})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableLiveLink(aVar, tBLiveDataModel);
        }
        e.c("[BCLinkProxy#enableLiveLink]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public boolean enableJianBao(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed81dba", new Object[]{this, aVar, tBLiveDataModel})).booleanValue();
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            z = real.enableJianBao(aVar, tBLiveDataModel);
        }
        e.c("[BCLinkProxy#enableJianBao]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Class<? extends BaseFrame> getLiveLinkFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("efb88aca", new Object[]{this});
        }
        IBCLinkProxy real = getReal();
        Class<? extends BaseFrame> liveLinkFrame3Class = real != null ? real.getLiveLinkFrame3Class() : null;
        e.c("[BCLinkProxy#getLiveLinkFrame3Class]  value: " + liveLinkFrame3Class);
        return liveLinkFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public BaseFrame createLiveLinkFrame3AndCreateView(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("cf734931", new Object[]{this, context, aVar, tBLiveDataModel, viewStub});
        }
        IBCLinkProxy real = getReal();
        BaseFrame createLiveLinkFrame3AndCreateView = real != null ? real.createLiveLinkFrame3AndCreateView(context, aVar, tBLiveDataModel, viewStub) : null;
        e.c("[BCLinkProxy#createLiveLinkFrame3AndCreateView]  value: " + createLiveLinkFrame3AndCreateView);
        return createLiveLinkFrame3AndCreateView;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void liveLinkFrame3ShowStopLinkDialog(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8c14f0", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.liveLinkFrame3ShowStopLinkDialog(obj);
        }
        e.c("[BCLinkProxy#liveLinkFrame3ShowStopLinkDialog]");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Object createSEIDispatcher(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c604196", new Object[]{this, aVar});
        }
        IBCLinkProxy real = getReal();
        Object createSEIDispatcher = real != null ? real.createSEIDispatcher(aVar) : null;
        e.c("[BCLinkProxy#createSEIDispatcher]");
        return createSEIDispatcher;
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherInitialize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea43eb1", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.seiDispatcherInitialize(obj);
        }
        e.c("[BCLinkProxy#seiDispatcherInitialize]");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherDispatch(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee6eca5", new Object[]{this, obj, str});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real == null) {
            return;
        }
        real.seiDispatcherDispatch(obj, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public void seiDispatcherQuit(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8012a2b0", new Object[]{this, obj});
            return;
        }
        IBCLinkProxy real = getReal();
        if (real != null) {
            real.seiDispatcherQuit(obj);
        }
        e.c("[BCLinkProxy#seiDispatcherQuit]");
    }

    @Override // com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy
    public Class<? extends BaseFrame> getLiveLinkEntranceFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8fcc48ef", new Object[]{this});
        }
        IBCLinkProxy real = getReal();
        Class<? extends BaseFrame> liveLinkEntranceFrame = real != null ? real.getLiveLinkEntranceFrame() : null;
        e.c("[BCLinkProxy#getLiveLinkEntranceFrame]  value: " + liveLinkEntranceFrame);
        return liveLinkEntranceFrame;
    }
}
