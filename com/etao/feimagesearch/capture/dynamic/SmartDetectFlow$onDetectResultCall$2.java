package com.etao.feimagesearch.capture.dynamic;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cpl;
import tb.rul;

/* loaded from: classes3.dex */
public final class SmartDetectFlow$onDetectResultCall$2 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul $processEnd;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartDetectFlow$onDetectResultCall$2(a aVar, rul rulVar) {
        super(1);
        this.this$0 = aVar;
        this.$processEnd = rulVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Boolean bool) {
        invoke2(bool);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec80bee", new Object[]{this, it});
            return;
        }
        rul rulVar = this.$processEnd;
        q.a((Object) it, "it");
        rulVar.mo2421invoke(it);
        if (!it.booleanValue()) {
            cpl h = this.this$0.h().h();
            q.a((Object) h, "paiPresenter.view");
            h.j().A();
        }
        this.this$0.g();
    }
}
