package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;
import tb.rva;

/* loaded from: classes3.dex */
public final class DefaultFragmentViewProvider$getFragmentView$6 extends Lambda implements rva<ruk<? extends t>, ruk<? extends t>, rul<? super Integer, ? extends t>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFragmentViewProvider$getFragmentView$6(a aVar, Context context) {
        super(3);
        this.this$0 = aVar;
        this.$context = context;
    }

    @Override // tb.rva
    public /* bridge */ /* synthetic */ t invoke(ruk<? extends t> rukVar, ruk<? extends t> rukVar2, rul<? super Integer, ? extends t> rulVar) {
        invoke2((ruk<t>) rukVar, (ruk<t>) rukVar2, (rul<? super Integer, t>) rulVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ruk<t> initFinishCallback, ruk<t> initFailedCallback, rul<? super Integer, t> progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc08516", new Object[]{this, initFinishCallback, initFailedCallback, progressCallback});
            return;
        }
        q.d(initFinishCallback, "initFinishCallback");
        q.d(initFailedCallback, "initFailedCallback");
        q.d(progressCallback, "progressCallback");
        a aVar = this.this$0;
        com.alibaba.triver.triver_shop.newShop.data.d g = a.$ipChange.g();
        l.a("shopWidgetContainer", g == null ? null : g.T(), this.$context, initFinishCallback, initFailedCallback, progressCallback);
    }
}
