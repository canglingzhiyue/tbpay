package com.alibaba.appmonitor.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes2.dex */
public class g implements com.alibaba.appmonitor.pool.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2886a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;

    static {
        kge.a(-1993129103);
        kge.a(1105107017);
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.f2886a = null;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        Map<String, String> map = this.f;
        if (map == null) {
            return;
        }
        map.clear();
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        } else if (this.f != null) {
        } else {
            this.f = new HashMap();
        }
    }
}
