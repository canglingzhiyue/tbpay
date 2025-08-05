package com.taobao.android.tbabilitykit.weex.pop.render;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class TAKWeex2Render$2 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f15365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAKWeex2Render$2(a aVar) {
        super(1);
        this.f15365a = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, bool});
        }
        invoke(bool.booleanValue());
        return t.INSTANCE;
    }

    public final void invoke(boolean z) {
        ViewGroup b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        a.a(this.f15365a, z);
        a aVar = this.f15365a;
        if (!a.$ipChange || (b = a.b(this.f15365a)) == null) {
            return;
        }
        b.requestDisallowInterceptTouchEvent(a.a(this.f15365a));
    }
}
