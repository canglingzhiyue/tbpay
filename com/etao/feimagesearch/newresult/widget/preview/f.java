package com.etao.feimagesearch.newresult.widget.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.i;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6864a;
    private i b;

    static {
        kge.a(-1195201036);
    }

    public f(String locateValue, i regionDigestModel) {
        q.c(locateValue, "locateValue");
        q.c(regionDigestModel, "regionDigestModel");
        this.f6864a = locateValue;
        this.b = regionDigestModel;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6864a;
    }

    public final i b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("dee4c1ae", new Object[]{this}) : this.b;
    }
}
