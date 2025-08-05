package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class FarmShop$initComponent$4 extends FunctionReferenceImpl implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FarmShop$initComponent$4(d dVar) {
        super(1, dVar, d.class, "canPullDownSplitHeader", "canPullDownSplitHeader(Z)V", 0);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            d.a((d) this.receiver, z);
        }
    }
}
