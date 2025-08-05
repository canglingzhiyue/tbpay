package com.taobao.android.dinamicx.widget.recycler;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.cl;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f12145a = -1;
    private DXRecyclerView b;
    private a c;
    private int d;

    static {
        kge.a(535874798);
    }

    public static /* synthetic */ a a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e3fc488d", new Object[]{lVar}) : lVar.c;
    }

    public static /* synthetic */ int b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3532cc97", new Object[]{lVar})).intValue();
        }
        int i = lVar.f12145a;
        lVar.f12145a = i - 1;
        return i;
    }

    public static /* synthetic */ int c(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("630b66f6", new Object[]{lVar})).intValue() : lVar.f12145a;
    }

    public static /* synthetic */ DXRecyclerView d(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerView) ipChange.ipc$dispatch("29412289", new Object[]{lVar}) : lVar.b;
    }

    public l(DXRecyclerView dXRecyclerView, a aVar, int i) {
        this.d = 6;
        this.b = dXRecyclerView;
        this.c = aVar;
        this.d = i;
        dXRecyclerView.setIgnoreMotionEvent(true);
    }

    public void a(final RecyclerView.ViewHolder viewHolder, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19487e", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (this.f12145a == -1) {
            if (this.c.getItemCount() < this.d) {
                this.d = this.c.getItemCount();
            }
            this.f12145a = this.d;
        }
        if (this.b != null && this.f12145a > 0) {
            cl.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.recycler.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    l.a(l.this).a(i, viewHolder);
                    l.b(l.this);
                    if (l.c(l.this) != 0 || l.d(l.this) == null) {
                        return;
                    }
                    l.d(l.this).setIgnoreMotionEvent(false);
                }
            }, new long[0]);
        } else {
            this.c.a(i, viewHolder);
        }
    }
}
