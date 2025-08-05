package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class BigCardWebContentRender$onViewSelectedByViewPager$1 extends FunctionReferenceImpl implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BigCardWebContentRender$onViewSelectedByViewPager$1(d dVar) {
        super(1, dVar, d.class, "sendWebEvent", "sendWebEvent(Ljava/lang/String;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, p0});
            return;
        }
        kotlin.jvm.internal.q.d(p0, "p0");
        d.a((d) this.receiver, p0);
    }
}
