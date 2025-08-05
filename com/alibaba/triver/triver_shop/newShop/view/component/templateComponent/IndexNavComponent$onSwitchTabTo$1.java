package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.alibaba.triver.triver_shop.newShop.ext.j;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class IndexNavComponent$onSwitchTabTo$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $index;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexNavComponent$onSwitchTabTo$1(d dVar, int i) {
        super(0);
        this.this$0 = dVar;
        this.$index = i;
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
        com.alibaba.triver.triver_shop.newShop.data.d a2 = this.this$0.a();
        d dVar = this.this$0;
        j.a(a2, d.$ipChange, this.$index, "swipe");
    }
}
