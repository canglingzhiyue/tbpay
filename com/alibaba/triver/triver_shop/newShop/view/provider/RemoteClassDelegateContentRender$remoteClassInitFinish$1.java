package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class RemoteClassDelegateContentRender$remoteClassInitFinish$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteClassDelegateContentRender$remoteClassInitFinish$1(d dVar) {
        super(0);
        this.this$0 = dVar;
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
        d.a(this.this$0, true);
        d dVar = this.this$0;
        FrameLayout frameLayout = d.$ipChange;
        d dVar2 = this.this$0;
        frameLayout.removeView(d.$ipChange);
        d.a(this.this$0, (com.alibaba.triver.triver_shop.newShop.view.h) d.$ipChange.mo2427invoke());
        d.d(this.this$0);
        d dVar3 = this.this$0;
        FrameLayout frameLayout2 = d.$ipChange;
        com.alibaba.triver.triver_shop.newShop.view.h e = d.e(this.this$0);
        View b = e == null ? null : e.b();
        if (b == null) {
            return;
        }
        o.a(frameLayout2, b);
    }
}
