package com.alibaba.analytics.core.sync;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class g implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f2100a;
    private boolean b = false;

    static {
        kge.a(-12896830);
        kge.a(-2114741388);
    }

    public static synchronized g a() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("165ef960", new Object[0]);
            }
            if (f2100a == null) {
                f2100a = new g();
            }
            return f2100a;
        }
    }

    private g() {
        a(com.alibaba.analytics.core.config.f.a().a("ut_sample_nw"));
        com.alibaba.analytics.core.config.f.a().a("ut_sample_nw", this);
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        apr.b("SampleNetworkLogListener", "ut_sample_nw", str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if ("1".equalsIgnoreCase(str)) {
            this.b = true;
        } else {
            this.b = false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }
}
