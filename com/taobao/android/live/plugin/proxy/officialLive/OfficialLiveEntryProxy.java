package com.taobao.android.live.plugin.proxy.officialLive;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class OfficialLiveEntryProxy extends g<OfficialLiveEntryProxy> implements IOfficialLiveEntryProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_INSTALL_LIVE_PLUGIN = "installLiveOfficialLiveEntryPlugin";
    private static final String TAG = "OfficialLiveEntryProxy";
    private static final String TRACK_NAME = "官方台节目单";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final OfficialLiveEntryProxy f14120a;

        static {
            kge.a(376641714);
            f14120a = new OfficialLiveEntryProxy();
        }

        public static /* synthetic */ OfficialLiveEntryProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (OfficialLiveEntryProxy) ipChange.ipc$dispatch("8d0290df", new Object[0]) : f14120a;
        }
    }

    static {
        kge.a(-1734898562);
        kge.a(-1424045423);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IOfficialLiveEntryProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.OfficialLiveEntryProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : ORANGE_INSTALL_LIVE_PLUGIN;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : TRACK_NAME;
    }

    public static OfficialLiveEntryProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OfficialLiveEntryProxy) ipChange.ipc$dispatch("a4959375", new Object[0]) : a.a();
    }

    private OfficialLiveEntryProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[OfficialLiveEntryProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Class<? extends BaseFrame> getOfficialLiveEntryFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("635734a4", new Object[]{this});
        }
        OfficialLiveEntryProxy real = getReal();
        Class<? extends BaseFrame> officialLiveEntryFrameClass = real != null ? real.getOfficialLiveEntryFrameClass() : null;
        e.c("[OfficialLiveEntryProxy#getOfficialLiveEntryFrameClass]: " + officialLiveEntryFrameClass);
        return officialLiveEntryFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Pair<Long, bn> getOfficialLiveEntryDXHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("58681682", new Object[]{this});
        }
        OfficialLiveEntryProxy real = getReal();
        Pair<Long, bn> officialLiveEntryDXHandler = real != null ? real.getOfficialLiveEntryDXHandler() : null;
        e.c("[OfficialLiveEntryProxy#getOfficialLiveEntryDXHandler]: " + officialLiveEntryDXHandler);
        return officialLiveEntryDXHandler;
    }
}
