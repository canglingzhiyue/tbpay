package com.taobao.android.live.plugin.proxy.fullscreen;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class FullScreenProxy extends g<IFullScreenProxy> implements IFullScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final FullScreenProxy f14106a;

        static {
            kge.a(-919480124);
            f14106a = new FullScreenProxy();
        }

        public static /* synthetic */ FullScreenProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FullScreenProxy) ipChange.ipc$dispatch("cb41356d", new Object[0]) : f14106a;
        }
    }

    static {
        kge.a(-1548428116);
        kge.a(-409645711);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IFullScreenProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveFullScreenPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "直播间布局框架";
    }

    public static FullScreenProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FullScreenProxy) ipChange.ipc$dispatch("c682d217", new Object[0]) : a.a();
    }

    private FullScreenProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[FullScreenProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenLiveFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ecd109", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenLiveFrame2(obj);
        }
        e.c("[FullScreenProxy#isInstanceOfFullScreenLiveFrame2]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("829af46b", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar});
        }
        IFullScreenProxy real = getReal();
        BaseFrame createFullScreenLiveFrame2 = real != null ? real.createFullScreenLiveFrame2(context, z, tBLiveDataModel, aVar) : null;
        e.c("[FullScreenProxy#createFullScreenLiveFrame2]  value: " + createFullScreenLiveFrame2);
        return createFullScreenLiveFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenReplayFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c0e8944", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenReplayFrame2(obj);
        }
        e.c("[FullScreenProxy#isInstanceOfFullScreenReplayFrame2]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("1b9ccb50", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar});
        }
        IFullScreenProxy real = getReal();
        BaseFrame createFullScreenReplayFrame2 = real != null ? real.createFullScreenReplayFrame2(context, z, tBLiveDataModel, aVar) : null;
        e.c("[FullScreenProxy#createFullScreenReplayFrame2]  value: " + createFullScreenReplayFrame2);
        return createFullScreenReplayFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenFrame(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a6f1503", new Object[]{this, obj})).booleanValue();
        }
        IFullScreenProxy real = getReal();
        if (real != null) {
            z = real.isInstanceOfFullScreenFrame(obj);
        }
        e.c("[FullScreenProxy#isInstanceOfFullScreenFrame]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public Map<String, Integer> getRealRIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45ea97df", new Object[]{this});
        }
        IFullScreenProxy real = getReal();
        Map<String, Integer> realRIdMap = real != null ? real.getRealRIdMap() : null;
        e.c("[FullScreenProxy#getRealRIdMap]  value: " + realRIdMap);
        return realRIdMap;
    }
}
