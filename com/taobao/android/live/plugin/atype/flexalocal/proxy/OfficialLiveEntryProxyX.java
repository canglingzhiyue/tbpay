package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.a;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class OfficialLiveEntryProxyX implements IOfficialLiveEntryProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(997874136);
        kge.a(-1424045423);
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Class<? extends BaseFrame> getOfficialLiveEntryFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("635734a4", new Object[]{this}) : OfficialLiveEntryFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Pair<Long, bn> getOfficialLiveEntryDXHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("58681682", new Object[]{this}) : Pair.create(Long.valueOf((long) a.DX_EVENT_TAOLIVEOFFICIALENTRYCLICK), new a());
    }
}
