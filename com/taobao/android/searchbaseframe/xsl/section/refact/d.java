package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.xsl.section.g;
import com.taobao.android.searchbaseframe.xsl.section.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.itd;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends RecyclerView.ItemDecoration implements com.taobao.android.searchbaseframe.xsl.section.b, com.taobao.android.searchbaseframe.xsl.section.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Rect f15056a;
    private PartnerRecyclerView c;
    private com.taobao.android.searchbaseframe.xsl.section.c d;
    private XSectionLayout e;
    private int f;
    private int j;
    private View k;
    private final a b = new a(0, false);
    private final Map<BaseCellBean, itd<BaseCellBean, ?>> g = new HashMap();
    private final Set<BaseCellBean> h = new HashSet();
    private final SparseIntArray i = new SparseIntArray();
    private final g l = new g();
    private RecyclerView.RecycledViewPool m = new com.taobao.android.searchbaseframe.business.srp.list.uikit.b();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15059a;
        public boolean b;

        static {
            kge.a(-15399110);
        }

        public a(int i, boolean z) {
            this.f15059a = i;
            this.b = z;
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fc5de42", new Object[]{dVar})).intValue() : dVar.j;
    }

    public static /* synthetic */ int a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f65e87", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.j = i;
        return i;
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4044dee", new Object[]{dVar});
        } else {
            dVar.b();
        }
    }

    static {
        kge.a(-787578281);
        kge.a(654634829);
        kge.a(995371509);
        f15056a = new Rect();
    }

    public void a(PartnerRecyclerView partnerRecyclerView, XSectionLayout xSectionLayout, com.taobao.android.searchbaseframe.xsl.section.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb896ca", new Object[]{this, partnerRecyclerView, xSectionLayout, cVar});
            return;
        }
        this.e = xSectionLayout;
        this.c = partnerRecyclerView;
        partnerRecyclerView.addItemDecoration(this);
        this.d = cVar;
        xSectionLayout.setHeightChangeListener(this);
        this.c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.searchbaseframe.xsl.section.refact.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                d dVar = d.this;
                d.a(dVar, d.a(dVar) + i2);
            }
        });
        this.l.a(cVar);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        PartnerRecyclerView partnerRecyclerView = this.c;
        if (partnerRecyclerView == null) {
            return;
        }
        partnerRecyclerView.invalidateItemDecorations();
    }

    public void a(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06f0289", new Object[]{this, aVar});
        } else {
            this.l.a(aVar);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.k = view;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.invalidateItemDecorations();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910fe30a", new Object[]{this, canvas, recyclerView, state});
        } else {
            this.l.a(canvas, (PartnerRecyclerView) recyclerView);
        }
    }

    private itd<BaseCellBean, ?> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("d4e60f93", new Object[]{this, new Integer(i)});
        }
        itd<BaseCellBean, ?> itdVar = (itd) this.m.getRecycledView(i);
        return itdVar == null ? this.d.b(this.c, i) : itdVar;
    }

    private void a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
            return;
        }
        this.m.putRecycledView(viewHolder);
        if (!(viewHolder instanceof itd)) {
            return;
        }
        ((itd) viewHolder).q();
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        PartnerRecyclerView partnerRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
        } else if (this.d == null || (partnerRecyclerView = this.c) == null) {
        } else {
            int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
            int footerViewsCount = this.c.getFooterViewsCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1 || childAdapterPosition < headerViewsCount || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                return;
            }
            int i = childAdapterPosition - headerViewsCount;
            if (!d(i)) {
                return;
            }
            int measuredHeight = c(i).itemView.getMeasuredHeight();
            int i2 = measuredHeight / 2;
            rect.set(0, i2, 0, measuredHeight - i2);
        }
    }

    private RecyclerView.ViewHolder a(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("8d7fc777", new Object[]{this, baseCellBean}) : this.g.get(baseCellBean);
    }

    private RecyclerView.ViewHolder c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("34051f56", new Object[]{this, new Integer(i)});
        }
        BaseCellBean h = this.d.h(i);
        itd<BaseCellBean, ?> itdVar = this.g.get(h);
        if (itdVar == null) {
            if (h != null) {
                itdVar = b(this.d.getItemViewType(h.sectionPos));
            } else {
                itdVar = b(this.d.getItemViewType(i));
            }
            this.g.put(h, itdVar);
            this.d.a(itdVar, i, h);
        } else if (h != null && h.forceUpdate) {
            this.d.a(itdVar, i, h);
            h.forceUpdate = false;
        }
        itdVar.itemView.setVisibility(0);
        itdVar.itemView.setTag(h);
        if (itdVar.itemView.getParent() == null) {
            this.e.addSection(itdVar.itemView);
            b(itdVar);
            this.e.measureChild(itdVar.itemView);
        }
        return itdVar;
    }

    private void b(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
        } else {
            this.e.sectionAttached(viewHolder);
        }
    }

    private void c(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d875b4e3", new Object[]{this, viewHolder});
        } else {
            this.e.sectionDetached(viewHolder);
        }
    }

    private boolean d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue() : this.d.e(i);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a037ff16", new Object[]{this, canvas, recyclerView, state});
        } else if (this.d == null || this.c == null) {
        } else {
            int childCount = recyclerView.getChildCount();
            int headerViewsCount = this.c.getHeaderViewsCount();
            int footerViewsCount = this.c.getFooterViewsCount();
            int i4 = this.j;
            this.j = 0;
            this.h.clear();
            View view = this.k;
            int height = this.f + (view == null ? 0 : view.getHeight());
            int i5 = 0;
            boolean z2 = false;
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= headerViewsCount && childAdapterPosition < recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                    int i6 = childAdapterPosition - headerViewsCount;
                    boolean d = d(i6);
                    this.c.getDecoratedBoundsWithMargins(childAt, f15056a);
                    this.l.a(canvas, i6, childAt.getLeft(), childAt.getRight(), f15056a.top);
                    if ((d || !z2) && f15056a.top <= height && f15056a.bottom >= height) {
                        z = true;
                        z2 = true;
                    } else {
                        z = false;
                    }
                    if (d || (z && this.d.d(i6))) {
                        this.h.add(this.d.h(i6));
                        i = i5;
                        i2 = height;
                        i3 = i4;
                        a(i6, i, z, d, i4, i2, f15056a.top, f15056a.bottom);
                        i5 = i + 1;
                        i4 = i3;
                        height = i2;
                    }
                }
                i = i5;
                i2 = height;
                i3 = i4;
                i5 = i + 1;
                i4 = i3;
                height = i2;
            }
            c();
            if (this.h.size() <= 0) {
                return;
            }
            this.e.refreshSectionBackground();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<BaseCellBean, itd<BaseCellBean, ?>>> it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<BaseCellBean, itd<BaseCellBean, ?>> next = it.next();
            if (!this.h.contains(next.getKey())) {
                itd<BaseCellBean, ?> value = next.getValue();
                a(value);
                this.e.removeView(value.itemView);
                c(value);
                it.remove();
            }
        }
    }

    private a a(View view, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        View childAt;
        int i10 = i5;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5dc388d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Integer(i4), new Integer(i10), new Integer(i6)});
        }
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i6 - i10;
        int i12 = (!z2 || i11 <= measuredHeight) ? 0 : i11 - measuredHeight;
        if (!z2) {
            i10 -= measuredHeight;
        }
        h i13 = this.d.i(i);
        if (i13 != null) {
            i8 = i13.b();
            i7 = !i13.a() ? (-measuredHeight) + i8 : (-i13.d()) - i8;
        } else {
            i7 = 0;
            i8 = 0;
        }
        BaseCellBean h = this.d.h(i);
        if (z) {
            BaseCellBean h2 = this.d.h(h.nextSectionPos);
            if (h2 != null && a(h2) != null && (childAt = this.c.getChildAt(i2 + (h.nextSectionPos - i))) != null) {
                this.c.getDecoratedBoundsWithMargins(childAt, f15056a);
                int i14 = (f15056a.top - measuredHeight) - i3;
                if (i14 <= i7) {
                    a aVar = this.b;
                    aVar.f15059a = i14 + i3;
                    aVar.b = true;
                    return aVar;
                }
            }
            i10 = Math.max(i7, i10 + i12);
        }
        if (i8 <= 0 || !z) {
            int max = Math.max(i3 + i7, i10);
            if (!z) {
                max = i10 + i12;
            }
            a aVar2 = this.b;
            aVar2.f15059a = max;
            if (max > i3) {
                z3 = false;
            }
            aVar2.b = z3;
            return this.b;
        }
        int i15 = this.i.get(h.hashCode()) - i4;
        if ((z2 && (i4 >= 0 || i10 > i15)) || i15 <= (i9 = i8 + i7 + i3)) {
            i9 = i15;
        }
        if (i10 > i9) {
            i9 = i10;
        }
        int max2 = Math.max(i3 + i7, i9);
        int i16 = i3 + i12;
        if (max2 > i16) {
            max2 = i16;
        }
        if (!z2 || max2 <= measuredHeight + i10) {
            i10 = max2;
        }
        this.i.put(h.hashCode(), i10);
        a aVar3 = this.b;
        aVar3.f15059a = i10;
        aVar3.b = true;
        return aVar3;
    }

    private void a(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94956008", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        RecyclerView.ViewHolder c = c(i);
        View view = c.itemView;
        a a2 = a(view, i, i2, i4, z, z2, i3, i5, i6);
        if (a2.f15059a + view.getMeasuredHeight() < 0 || a2.f15059a > this.c.getMeasuredHeight()) {
            view.setVisibility(8);
            return;
        }
        if (a2.b && z) {
            this.e.sectionTurnSticky(c);
        }
        view.setTranslationY(a2.f15059a);
        view.setVisibility(0);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.d
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.searchbaseframe.xsl.section.refact.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.b(d.this);
                }
            }
        });
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h.clear();
        c();
    }
}
