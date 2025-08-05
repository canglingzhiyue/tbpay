package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Long f6543a = -1L;
    private Object b;

    static {
        kge.a(-1789530123);
    }

    public final Long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("c9b62fad", new Object[]{this}) : this.f6543a;
    }

    public final void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            this.f6543a = l;
        }
    }

    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    public final Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }
}
