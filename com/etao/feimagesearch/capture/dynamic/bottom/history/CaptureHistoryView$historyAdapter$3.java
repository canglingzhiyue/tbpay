package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ads;
import tb.rul;

/* loaded from: classes3.dex */
public final class CaptureHistoryView$historyAdapter$3 extends Lambda implements rul<ads, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView$historyAdapter$3(d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(ads adsVar) {
        invoke2(adsVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ads it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c351bf", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        d.i(this.this$0).add(it);
    }
}
