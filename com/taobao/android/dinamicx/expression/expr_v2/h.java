package com.taobao.android.dinamicx.expression.expr_v2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXEvent f11871a;

    static {
        kge.a(1164365311);
    }

    public DXEvent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEvent) ipChange.ipc$dispatch("49b730b0", new Object[]{this}) : this.f11871a;
    }

    public void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
        } else {
            this.f11871a = dXEvent;
        }
    }
}
