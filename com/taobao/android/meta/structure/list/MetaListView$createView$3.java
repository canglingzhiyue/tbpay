package com.taobao.android.meta.structure.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$createView$3 extends Lambda implements rul<Boolean, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PartnerRecyclerView $recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$createView$3(PartnerRecyclerView partnerRecyclerView) {
        super(1);
        this.$recyclerView = partnerRecyclerView;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Boolean bool) {
        invoke2(bool);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec80bee", new Object[]{this, bool});
            return;
        }
        PartnerRecyclerView partnerRecyclerView = this.$recyclerView;
        if (bool == null) {
            q.a();
        }
        partnerRecyclerView.setPreserveFocusAfterLayout(!bool.booleanValue());
    }
}
