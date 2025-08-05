package com.taobao.android.meta.structure.list;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.inx;
import tb.rul;

/* loaded from: classes6.dex */
public final class MetaListView$applyListProperties$8 extends Lambda implements rul<Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListView$applyListProperties$8(g gVar) {
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
        g gVar = this.this$0;
        inx.b bVar = g.$ipChange;
        if (bVar != null) {
            g gVar2 = this.this$0;
            RecyclerView.ItemDecoration itemDecoration = g.$ipChange;
            if (num == null) {
                q.a();
            }
            int intValue = num.intValue();
            Integer a2 = g.e(this.this$0).P().a();
            if (a2 == null) {
                q.a();
            }
            bVar.a(itemDecoration, intValue, a2.intValue());
        }
        g gVar3 = this.this$0;
        ListStyle mStyle = g.h(gVar3);
        q.a((Object) mStyle, "mStyle");
        gVar3.b(mStyle);
    }
}
