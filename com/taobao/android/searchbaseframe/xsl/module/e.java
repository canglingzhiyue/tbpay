package com.taobao.android.searchbaseframe.xsl.module;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import tb.inx;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements inx.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f15035a;
    private static final int b;

    static {
        kge.a(924145898);
        kge.a(943299042);
        f15035a = j.a(4.5f);
        b = j.a(7.5f);
    }

    @Override // tb.inx.b
    public RecyclerView.ItemDecoration b(int i, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("6ae01726", new Object[]{this, new Integer(i), aVar}) : new g(i);
    }

    @Override // tb.inx.b
    public void a(ListStyle listStyle, int i, com.taobao.android.searchbaseframe.datasource.impl.a aVar, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760c33ae", new Object[]{this, listStyle, new Integer(i), aVar, recyclerView, itemDecoration});
            return;
        }
        g gVar = (g) itemDecoration;
        if (listStyle == ListStyle.WATERFALL) {
            int a2 = gVar.a();
            int b2 = gVar.b();
            if (a2 < 0 || b2 < 0) {
                gVar.a(f15035a);
                gVar.b(-b);
                int i2 = b;
                recyclerView.setPadding(i2, 0, i2, 0);
                return;
            }
            int i3 = b2 / 2;
            int i4 = a2 - i3;
            gVar.a(i3);
            gVar.b(-i4);
            recyclerView.setPadding(i4, 0, i4, 0);
            return;
        }
        gVar.a(0);
        gVar.b(0);
        recyclerView.setPadding(0, 0, 0, 0);
    }

    @Override // tb.inx.b
    public void a(RecyclerView.ItemDecoration itemDecoration, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9db13", new Object[]{this, itemDecoration, new Integer(i), new Integer(i2)});
        } else {
            ((g) itemDecoration).a(i, i2);
        }
    }
}
