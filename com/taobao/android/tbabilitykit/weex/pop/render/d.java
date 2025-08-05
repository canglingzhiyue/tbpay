package com.taobao.android.tbabilitykit.weex.pop.render;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class d implements com.taobao.android.weex.config.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Rect f15370a = new Rect();

    static {
        kge.a(1660708540);
        kge.a(403609124);
    }

    public final void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        q.d(rect, "<set-?>");
        this.f15370a = rect;
    }

    @Override // com.taobao.android.weex.config.a
    public Rect a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("ef387fb1", new Object[]{this}) : this.f15370a;
    }
}
