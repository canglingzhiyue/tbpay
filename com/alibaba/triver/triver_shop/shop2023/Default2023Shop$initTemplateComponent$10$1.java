package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class Default2023Shop$initTemplateComponent$10$1 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$10$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ t mo2421invoke(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9923577", new Object[]{this, num});
        }
        invoke(num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.this$0;
        int f = a.$ipChange.f(i, 0);
        EnhancedViewPager a2 = a.a(this.this$0);
        if (a2 != null) {
            a2.setCurrentItem(f, false);
        } else {
            q.b("contentViewPager");
            throw null;
        }
    }
}
