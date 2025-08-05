package com.alibaba.triver.triver_shop.shop2023.template;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Shop2023SubTabTemplate$switchTabBySwipe$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $bottomIndex;
    public final /* synthetic */ int $index;
    public final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023SubTabTemplate$switchTabBySwipe$1(h hVar, int i, int i2) {
        super(0);
        this.this$0 = hVar;
        this.$bottomIndex = i;
        this.$index = i2;
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
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.j.a(this.this$0.a(), this.$bottomIndex, this.$index, "swipe");
        }
    }
}
