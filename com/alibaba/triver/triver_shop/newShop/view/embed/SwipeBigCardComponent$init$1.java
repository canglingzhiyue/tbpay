package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alibaba.triver.triver_shop.newShop.view.provider.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cej;
import tb.ruk;

/* loaded from: classes3.dex */
public final class SwipeBigCardComponent$init$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeBigCardComponent$init$1(c cVar, FragmentActivity fragmentActivity) {
        super(0);
        this.this$0 = cVar;
        this.$fragmentActivity = fragmentActivity;
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
        h hVar = new h(this.this$0);
        FragmentManager supportFragmentManager = this.$fragmentActivity.getSupportFragmentManager();
        q.b(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        cej cejVar = new cej(supportFragmentManager);
        c cVar = this.this$0;
        cejVar.a(hVar);
        cVar.b().setAdapter(cejVar);
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new SwipeBigCardComponent$init$1$1$1(cVar));
    }
}
