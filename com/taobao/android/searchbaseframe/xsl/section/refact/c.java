package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.g;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends RecyclerView.ItemDecoration implements com.taobao.android.searchbaseframe.xsl.section.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.searchbaseframe.xsl.section.c f15055a;
    private g.a b;
    private boolean c = false;

    static {
        kge.a(1423227190);
        kge.a(995371509);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(RecyclerView recyclerView, com.taobao.android.searchbaseframe.xsl.section.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66ac18", new Object[]{this, recyclerView, cVar});
            return;
        }
        this.f15055a = cVar;
        if (this.c) {
            return;
        }
        this.c = true;
        recyclerView.addItemDecoration(this);
    }

    public void a(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06f0289", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    private com.taobao.android.searchbaseframe.business.weex.multiplelist.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.business.weex.multiplelist.a) ipChange.ipc$dispatch("9de9980c", new Object[]{this});
        }
        g.a aVar = this.b;
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        com.taobao.android.searchbaseframe.business.weex.multiplelist.a a2 = a();
        if (a2 == null || a2.f() <= 0) {
            return;
        }
        boolean z = recyclerView instanceof PartnerRecyclerView;
        int headerViewsCount = z ? ((PartnerRecyclerView) recyclerView).getHeaderViewsCount() : 0;
        int footerViewsCount = z ? ((PartnerRecyclerView) recyclerView).getFooterViewsCount() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < headerViewsCount || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - footerViewsCount) {
            return;
        }
        int i = childAdapterPosition - headerViewsCount;
        ListStyle c = this.f15055a.c();
        if (i != 0 && (c != ListStyle.WATERFALL || i != 1 || this.f15055a.g(0))) {
            return;
        }
        rect.set(0, a2.f(), 0, 0);
    }
}
