package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f2145a = new AURAGlobalData();

    static {
        kge.a(1807420082);
    }

    public AURAGlobalData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("818197e", new Object[]{this}) : this.f2145a;
    }

    public synchronized AURAGlobalData a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("cce32633", new Object[]{this, map});
        }
        this.f2145a = this.f2145a.copyOnWrite(map);
        return this.f2145a;
    }
}
