package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class BaseContentComponent$setAllItemCountIconVisibleFunction$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $enable;
    public final /* synthetic */ int $iconBottomPadding;
    public final /* synthetic */ int $iconRightPadding;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$setAllItemCountIconVisibleFunction$1(boolean z, a aVar, int i, int i2) {
        super(0);
        this.$enable = z;
        this.this$0 = aVar;
        this.$iconBottomPadding = i;
        this.$iconRightPadding = i2;
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
        if (this.$enable) {
            if (this.this$0.au().getParent() == null) {
                this.this$0.d().addView(this.this$0.au(), o.b(0, 0, 0, this.$iconBottomPadding, 0, this.$iconRightPadding, 8388693, 23, null));
            }
            o.b(this.this$0.au());
        } else {
            o.d(this.this$0.au());
        }
        o.d(this.this$0.au(), this.$iconBottomPadding);
        o.f(this.this$0.au(), this.$iconRightPadding);
    }
}
