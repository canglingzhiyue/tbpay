package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class c implements com.taobao.android.trade.event.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f10221a;
    public boolean b = true;

    static {
        kge.a(1210332986);
        kge.a(789613348);
    }

    public c() {
        tpc.a("com.taobao.android.detail.sdk.event.basic.GetCommonTrackArgsEventResult");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }
}
