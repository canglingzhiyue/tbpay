package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class EmbedSecondFloorView$getView$5 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedSecondFloorView$getView$5(a aVar) {
        super(0);
        this.this$0 = aVar;
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
        b m = this.this$0.m();
        if (m != null) {
            m.willAppear();
        }
        b m2 = this.this$0.m();
        if (m2 != null) {
            m2.didAppear();
        }
        b m3 = this.this$0.m();
        if (m3 == null) {
            return;
        }
        m3.play();
    }
}
