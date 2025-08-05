package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class IrpV2Controller$finish$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpV2Controller$finish$1(e eVar) {
        super(0);
        this.this$0 = eVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        this.this$0.k().e();
        this.this$0.k().a(true, false);
        com.etao.feimagesearch.cip.capture.components.c.f6659a = false;
        if (e.a(this.this$0).f() || com.etao.feimagesearch.config.b.K()) {
            return;
        }
        com.etao.feimagesearch.cip.capture.components.c.f6659a = true;
    }
}
