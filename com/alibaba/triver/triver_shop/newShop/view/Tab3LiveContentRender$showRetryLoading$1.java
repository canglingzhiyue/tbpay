package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$showRetryLoading$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$showRetryLoading$1(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
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
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        View view = Tab3LiveContentRender.$ipChange;
        if ((view == null ? null : view.getParent()) == null) {
            return;
        }
        Tab3LiveContentRender tab3LiveContentRender2 = this.this$0;
        if (Tab3LiveContentRender.$ipChange != Tab3LiveContentRender.LiveStatus.RETRY_LOADING) {
            return;
        }
        this.this$0.l();
    }
}
