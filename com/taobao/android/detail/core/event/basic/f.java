package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class f implements com.taobao.android.trade.event.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f9701a;
    public boolean b = true;

    static {
        kge.a(-1483549995);
        kge.a(789613348);
    }

    public f() {
        emu.a("com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEventResult");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }
}
