package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.rul;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$bottomBarComponent$1 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$bottomBarComponent$1(d dVar) {
        super(1);
        this.this$0 = dVar;
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
        ceg.Companion.b(q.a("flag ship , bottom bar changed : ", (Object) Integer.valueOf(i)));
        d dVar = this.this$0;
        com.alibaba.triver.triver_shop.newShop.manager.d dVar2 = d.$ipChange;
        if (dVar2 == null) {
            q.b("newBottomBarAndIndexNavManager");
            throw null;
        }
        dVar2.a(i, false);
        d.z(this.this$0);
    }
}
