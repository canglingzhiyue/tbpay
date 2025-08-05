package com.taobao.android.meta.structure.list;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.iru;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListPresenter$initItemBackground$1 extends Lambda implements rul<com.taobao.android.searchbaseframe.meta.uikit.d, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListPresenter$initItemBackground$1(f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(com.taobao.android.searchbaseframe.meta.uikit.d dVar) {
        invoke2(dVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.taobao.android.searchbaseframe.meta.uikit.d dVar) {
        com.taobao.android.searchbaseframe.meta.uikit.f a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ae787", new Object[]{this, dVar});
            return;
        }
        h widget = (h) this.this$0.getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
        if (!(d instanceof com.taobao.android.meta.data.b)) {
            d = null;
        }
        com.taobao.android.meta.data.b bVar = (com.taobao.android.meta.data.b) d;
        if (bVar == null) {
            return;
        }
        f.a(this.this$0, (dVar == null || (a2 = dVar.a(bVar.getIndex())) == null) ? null : new com.taobao.android.searchbaseframe.business.weex.multiplelist.a(a2.c(), a2.d(), a2.b(), a2.e(), a2.f(), a2.a()));
    }
}
