package com.alibaba.triver.triver_shop.newShop.manager;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class BottomBarAndIndexNavManager$indexNavComponent$1 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomBarAndIndexNavManager$indexNavComponent$1(a aVar) {
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
        com.alibaba.triver.triver_shop.newShop.data.d dVar = a.$ipChange;
        a aVar2 = this.this$0;
        int f = dVar.f(a.$ipChange, i);
        a aVar3 = this.this$0;
        ruw ruwVar = a.$ipChange;
        if (ruwVar != null) {
            ruwVar.mo2423invoke(Integer.valueOf(f), true);
        }
        a.a(this.this$0, i);
    }
}
