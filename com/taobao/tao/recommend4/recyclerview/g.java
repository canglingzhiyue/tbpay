package com.taobao.tao.recommend4.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.taobao.R;
import java.util.List;
import tb.fut;
import tb.kge;
import tb.osm;

/* loaded from: classes8.dex */
public class g extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<SectionModel> f20982a;
    private osm b;
    private int c;
    private boolean d;
    private int e;

    static {
        kge.a(-1028299413);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g(osm osmVar, List<SectionModel> list) {
        this.f20982a = list;
        this.b = osmVar;
        this.c = osmVar.p();
        this.d = com.taobao.homepage.utils.b.c() || com.taobao.homepage.utils.b.b();
    }

    public void a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f20982a = list;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getItemOffsets(android.graphics.Rect r11, android.view.View r12, android.support.v7.widget.RecyclerView r13, android.support.v7.widget.RecyclerView.State r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend4.recyclerview.g.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }

    private static int a(ViewGroup viewGroup) {
        DXWidgetNode widgetNode;
        DXRuntimeContext dXRuntimeContext;
        fut futVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a18609a", new Object[]{viewGroup})).intValue();
        }
        View childAt = viewGroup.getChildAt(0);
        int i = childAt.getLayoutParams().width;
        return (i > 0 || !(childAt instanceof DXButterRootView) || (widgetNode = ((DXButterRootView) childAt).getWidgetNode()) == null || (dXRuntimeContext = widgetNode.getDXRuntimeContext()) == null || (futVar = dXRuntimeContext.l().get(-8936854687533104177L)) == null) ? i : ((Integer) futVar.evalWithArgs(new Object[0], dXRuntimeContext)).intValue();
    }

    private void a(View view, Rect rect, int i, int i2, int i3, int i4, StaggeredGridLayoutManager.LayoutParams layoutParams, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe38fac", new Object[]{this, view, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), layoutParams, new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = i5 + i + i3;
        if (layoutParams.width != i7 && layoutParams.width != -1 && layoutParams.width != -2) {
            view.setTag(R.id.tag_recommend_decoration_width, Integer.valueOf(i5));
            layoutParams.width = i7;
        }
        int i8 = i6 + i2 + i4;
        if (layoutParams.height != i8 && layoutParams.height != -1 && layoutParams.height != -2) {
            view.setTag(R.id.tag_recommend_decoration_height, Integer.valueOf(i6));
            layoutParams.height = i8;
        }
        rect.set(i, i2, i3, i4);
    }

    private void a(View view, int i, int i2, int i3, int i4, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b47c2f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect});
        } else if (i4 <= 0) {
        } else {
            int i5 = this.c;
            int round = Math.round(((i - (i4 * i5)) - (i3 << 1)) / (i5 - 1));
            int i6 = i3 - round;
            int i7 = this.c;
            int i8 = (((i7 + 1) * round) + (i6 << 1)) / i7;
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
            int i9 = (((spanIndex + 1) * round) - (spanIndex * i8)) + i6;
            rect.set(i9, i2, i8 - i9, 0);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    private int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : view.getTag(i) == null ? i2 : ((Integer) view.getTag(i)).intValue();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }
}
