package com.etao.feimagesearch.capture.dynamic.bottom.history;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.history.object.ScanDo;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class CaptureHistoryView$historyAdapter$2 extends Lambda implements rul<ScanDo, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureHistoryView$historyAdapter$2(d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(ScanDo scanDo) {
        invoke2(scanDo);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScanDo it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6702988", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        c h = d.h(this.this$0);
        if (h == null) {
            return;
        }
        h.a(it);
    }
}
