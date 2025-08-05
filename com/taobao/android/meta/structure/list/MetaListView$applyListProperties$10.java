package com.taobao.android.meta.structure.list;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$applyListProperties$10 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$applyListProperties$10(g gVar) {
        super(1);
        this.this$0 = gVar;
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
        if (num == null) {
            q.a();
        }
        int intValue = num.intValue();
        if (intValue <= 0) {
            return;
        }
        PartnerRecyclerView mRecycler = g.i(this.this$0);
        q.a((Object) mRecycler, "mRecycler");
        if (!(mRecycler.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
            return;
        }
        PartnerRecyclerView mRecycler2 = g.i(this.this$0);
        q.a((Object) mRecycler2, "mRecycler");
        RecyclerView.LayoutManager layoutManager = mRecycler2.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
        }
        ((StaggeredGridLayoutManager) layoutManager).setSpanCount(intValue);
    }
}
