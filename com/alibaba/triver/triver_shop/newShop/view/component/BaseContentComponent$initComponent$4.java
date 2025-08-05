package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class BaseContentComponent$initComponent$4 extends FunctionReferenceImpl implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaseContentComponent$initComponent$4(a aVar) {
        super(1, aVar, a.class, "switchTabToNextPrePage", "switchTabToNextPrePage(Ljava/lang/String;)V", 0);
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
        q.d(p0, "p0");
        ((a) this.receiver).b(p0);
    }
}
