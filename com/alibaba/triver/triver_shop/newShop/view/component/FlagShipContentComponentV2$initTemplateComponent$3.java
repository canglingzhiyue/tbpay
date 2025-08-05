package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$initTemplateComponent$3 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$initTemplateComponent$3(d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        Pair<Integer, Integer> a2 = h.a("impression", this.this$0.b().I());
        ceg.a aVar = ceg.Companion;
        aVar.a("ggg honorNativeComponent " + a2 + ' ');
        if (a2.getFirst().intValue() == 0 && a2.getSecond().intValue() == 0) {
            return null;
        }
        this.this$0.a(a2.getFirst().intValue(), a2.getSecond().intValue(), "impression");
        return 1;
    }
}
