package com.taobao.android.detail.core.performance;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final o f9786a;
    private Map<String, String> b;

    static {
        kge.a(613846629);
        f9786a = new o();
        emu.a("com.taobao.android.detail.core.performance.Timeline");
    }

    public static o a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("22e64b12", new Object[0]) : f9786a;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }
}
