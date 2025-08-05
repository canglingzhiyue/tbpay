package com.etao.feimagesearch.ui.coordinatorcard;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ctl;
import tb.ctm;
import tb.ctq;
import tb.rul;

/* loaded from: classes3.dex */
public final class CoordinatorCardView$attachCard$1 extends Lambda implements rul<ctq, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ctm $action;
    public final /* synthetic */ CoordinatorCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView$attachCard$1(CoordinatorCardView coordinatorCardView, ctm ctmVar) {
        super(1);
        this.this$0 = coordinatorCardView;
        this.$action = ctmVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(ctq ctqVar) {
        invoke2(ctqVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ctq it) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0d924f", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        String g = this.$action.g();
        CoordinatorCardView coordinatorCardView = this.this$0;
        CoordinatorCardView.$ipChange.put(g, it);
        ctl b = this.$action.b();
        if (b != null && !b.c()) {
            i = 4;
        }
        it.a(i);
        CoordinatorCardView coordinatorCardView2 = this.this$0;
        CoordinatorCardView.$ipChange.put(g, this.$action.b());
        View c = it.c();
        c.setTag(g);
        if (this.$action.e() < 0 || it.g() != 0) {
            this.this$0.addView(c);
        } else {
            CoordinatorCardView.access$addViewWithAnim(this.this$0, this.$action.e(), it);
        }
    }
}
