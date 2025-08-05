package com.taobao.android.dinamicx.widget.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f12143a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    static {
        kge.a(-1178632175);
    }

    public j(int i, int i2, int i3, int i4, boolean z) {
        this.f12143a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
        if (layoutParams2.isFullSpan()) {
            if (!this.e) {
                return;
            }
            rect.left = this.b;
            rect.right = this.c;
        } else if (this.d <= 0) {
        } else {
            int width = recyclerView.getWidth();
            int i = this.d;
            int i2 = width / i;
            int i3 = (((width - ((i - 1) * this.f12143a)) - this.b) - this.c) / i;
            int spanIndex = layoutParams2.getSpanIndex();
            if (spanIndex == 0) {
                rect.left = this.b;
            } else if (spanIndex == this.d - 1) {
                rect.left = (i2 - this.c) - i3;
            } else {
                int i4 = this.f12143a;
                rect.left = i4 - ((((i2 - i3) * spanIndex) - ((spanIndex - 1) * i4)) - this.b);
            }
        }
    }
}
