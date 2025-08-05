package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b<INPUT, OUTPUT> implements k<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NetConfig f6888a;

    static {
        kge.a(-1370418083);
        kge.a(1246702639);
    }

    @Override // com.etao.feimagesearch.nn.k
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "";
    }

    public b(NetConfig netConfig) {
        this.f6888a = netConfig;
    }
}
