package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopWidgetContentRender$onViewSelectedByViewPager$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWidgetContentRender$onViewSelectedByViewPager$1(m mVar) {
        super(0);
        this.this$0 = mVar;
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
        StringBuilder sb = new StringBuilder();
        sb.append("a2141.b61969235.");
        m mVar = this.this$0;
        sb.append((Object) m.$ipChange);
        sb.append(".0");
        String sb2 = sb.toString();
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        m mVar2 = this.this$0;
        defaultTracker.pageAppearDonotSkip(m.$ipChange);
        UTTracker defaultTracker2 = UTAnalytics.getInstance().getDefaultTracker();
        m mVar3 = this.this$0;
        defaultTracker2.updatePageName(m.$ipChange, "Page_Shop_brandshop_tab3");
        UTTracker defaultTracker3 = UTAnalytics.getInstance().getDefaultTracker();
        m mVar4 = this.this$0;
        Context context = m.$ipChange;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("spm-cnt", sb2);
        m mVar5 = this.this$0;
        com.alibaba.triver.triver_shop.newShop.data.d g = m.$ipChange.g();
        String str = null;
        pairArr[1] = kotlin.j.a("seller_id", g == null ? null : g.U());
        m mVar6 = this.this$0;
        com.alibaba.triver.triver_shop.newShop.data.d g2 = m.$ipChange.g();
        if (g2 != null) {
            str = g2.T();
        }
        pairArr[2] = kotlin.j.a("shop_id", str);
        defaultTracker3.updatePageProperties(context, ai.c(pairArr));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(ai.a(kotlin.j.a("spm-url", sb2)));
    }
}
