package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class BaseTemplateComponent$renderTemplate$1 extends FunctionReferenceImpl implements rul<View, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaseTemplateComponent$renderTemplate$1(a aVar) {
        super(1, aVar, a.class, "createViewCallback", "createViewCallback(Landroid/view/View;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(View view) {
        invoke2(view);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View p0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, p0});
            return;
        }
        q.d(p0, "p0");
        ((a) this.receiver).b(p0);
    }
}
