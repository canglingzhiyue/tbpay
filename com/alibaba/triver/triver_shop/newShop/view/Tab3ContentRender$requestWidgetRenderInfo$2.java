package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class Tab3ContentRender$requestWidgetRenderInfo$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ruw<Integer, String, t> $failure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Tab3ContentRender$requestWidgetRenderInfo$2(ruw<? super Integer, ? super String, t> ruwVar) {
        super(2);
        this.$failure = ruwVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str}) : invoke(num.intValue(), str);
    }

    public final t invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("adb173f1", new Object[]{this, new Integer(i), str});
        }
        ruw<Integer, String, t> ruwVar = this.$failure;
        if (ruwVar == null) {
            return null;
        }
        ruwVar.mo2423invoke(Integer.valueOf(i), str);
        return t.INSTANCE;
    }
}
