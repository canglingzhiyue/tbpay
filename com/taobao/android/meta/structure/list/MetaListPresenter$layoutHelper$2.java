package com.taobao.android.meta.structure.list;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.isd;
import tb.ruk;

/* loaded from: classes6.dex */
public final class MetaListPresenter$layoutHelper$2 extends Lambda implements ruk<com.taobao.android.searchbaseframe.xsl.section.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListPresenter$layoutHelper$2(f fVar) {
        super(0);
        this.this$0 = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final com.taobao.android.searchbaseframe.xsl.section.a mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.xsl.section.a) ipChange.ipc$dispatch("5a89f17b", new Object[]{this});
        }
        f fVar = this.this$0;
        f fVar2 = fVar;
        isd c = fVar.c().c();
        q.a((Object) c, "c().config()");
        HandlerThread b = c.b();
        h widget = (h) this.this$0.getWidget();
        q.a((Object) widget, "widget");
        return new com.taobao.android.searchbaseframe.xsl.section.a(fVar2, b, (iru) widget.getModel());
    }
}
