package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class Default2023Shop$initTemplateComponent$9$1 extends Lambda implements ruw<Integer, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$9$1(a aVar) {
        super(2);
        this.f4037a = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, num2});
        }
        invoke(num.intValue(), num2.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.f4037a;
        int f = a.$ipChange.f(i, i2);
        EnhancedViewPager a2 = a.a(this.f4037a);
        if (a2 != null) {
            a2.setCurrentItem(f, false);
        } else {
            q.b("contentViewPager");
            throw null;
        }
    }
}
