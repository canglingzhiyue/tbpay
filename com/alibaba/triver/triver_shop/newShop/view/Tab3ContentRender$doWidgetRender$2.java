package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruw;

/* loaded from: classes3.dex */
public final class Tab3ContentRender$doWidgetRender$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Tab3ContentRender$doWidgetRender$2 INSTANCE = new Tab3ContentRender$doWidgetRender$2();

    public Tab3ContentRender$doWidgetRender$2() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str});
        }
        invoke(num.intValue(), str);
        return t.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("request shop tab3 widget info error : " + i + " , " + ((Object) str));
    }
}
