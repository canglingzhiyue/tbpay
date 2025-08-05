package com.taobao.android.meta.structure.list;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ivn;
import tb.ruk;

/* loaded from: classes6.dex */
public final class MetaListView$scrollToHelper$2 extends Lambda implements ruk<ivn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$scrollToHelper$2(g gVar) {
        super(0);
        this.this$0 = gVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final ivn mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivn) ipChange.ipc$dispatch("3b373fe6", new Object[]{this});
        }
        RecyclerView l = this.this$0.l();
        a presenter = (a) this.this$0.q();
        q.a((Object) presenter, "presenter");
        return new ivn(l, true, presenter.t());
    }
}
