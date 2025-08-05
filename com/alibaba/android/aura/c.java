package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends com.alibaba.android.aura.datamodel.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AURAFlowData f2121a;
    private final AURAGlobalData b;

    static {
        kge.a(1420418944);
    }

    public c(String str, String str2, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        super(str, str2);
        this.f2121a = aURAFlowData;
        this.b = aURAGlobalData;
    }

    public AURAFlowData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAFlowData) ipChange.ipc$dispatch("40f9fed3", new Object[]{this}) : this.f2121a;
    }

    public AURAGlobalData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("a2b8dbff", new Object[]{this}) : this.b;
    }
}
