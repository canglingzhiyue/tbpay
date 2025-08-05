package com.taobao.android.meta.structure.childpage;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaChildPageView$createView$1 extends Lambda implements rul<com.taobao.android.searchbaseframe.meta.uikit.c, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaChildPageView$createView$1(f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(com.taobao.android.searchbaseframe.meta.uikit.c cVar) {
        invoke2(cVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.taobao.android.searchbaseframe.meta.uikit.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36a7328", new Object[]{this, cVar});
        } else {
            f.a(this.this$0).setScrollListener(cVar);
        }
    }
}
