package com.taobao.android.meta.structure.list;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$applyListProperties$5 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PartnerRecyclerView $rv;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$applyListProperties$5(g gVar, PartnerRecyclerView partnerRecyclerView) {
        super(1);
        this.this$0 = gVar;
        this.$rv = partnerRecyclerView;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Integer num) {
        invoke2(num);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4143d718", new Object[]{this, num});
            return;
        }
        FrameLayout headerFrame = this.$rv.getHeaderFrame();
        q.a((Object) headerFrame, "rv.headerFrame");
        FrameLayout frameLayout = headerFrame;
        if (num == null) {
            q.a();
        }
        int intValue = num.intValue();
        Integer a2 = g.e(this.this$0).K().a();
        if (a2 == null) {
            q.a();
        }
        com.taobao.android.searchbaseframe.xsl.refact.f.b(frameLayout, intValue + a2.intValue());
    }
}
