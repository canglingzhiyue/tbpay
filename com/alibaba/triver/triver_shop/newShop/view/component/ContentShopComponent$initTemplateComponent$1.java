package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class ContentShopComponent$initTemplateComponent$1 extends FunctionReferenceImpl implements ruw<Integer, Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ContentShopComponent$initTemplateComponent$1(b bVar) {
        super(2, bVar, b.class, "switchTabToInViewPagerCallback", "switchTabToInViewPagerCallback(IZ)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, bool});
        }
        invoke(num.intValue(), bool.booleanValue());
        return t.INSTANCE;
    }

    public final void invoke(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0702970", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            b.a((b) this.receiver, i, z);
        }
    }
}
