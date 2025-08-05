package com.taobao.android.searchbaseframe.xsl.module;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f15036a;
    private int b;
    private int c = -1;
    private int d = -1;

    static {
        kge.a(150436763);
    }

    public g(int i) {
        this.f15036a = i;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f15036a = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        int i = this.f15036a;
        rect.left = i;
        rect.right = i;
    }

    public void b(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c545890", new Object[]{this, rect});
            return;
        }
        int i = this.b;
        rect.left = i;
        rect.right = i;
    }

    public void c(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d255fef", new Object[]{this, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void a(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87070612", new Object[]{this, viewGroup, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void b(ViewGroup viewGroup, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4dfa071", new Object[]{this, viewGroup, rect});
        } else {
            rect.bottom = 0;
        }
    }

    public void a(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bb17ef", new Object[]{this, view, rect});
        } else {
            rect.bottom = this.f15036a << 1;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                View childAt = frameLayout.getChildAt(0);
                int id = childAt.getId();
                if (id == R.id.libsf_srp_list_blank) {
                    c(rect);
                    b(rect);
                    return;
                } else if (id == R.id.libsf_srp_list_header_container) {
                    a((ViewGroup) ((FrameLayout) childAt), rect);
                    b(rect);
                    return;
                } else if (id == R.id.libsf_srp_list_footer_container) {
                    b((FrameLayout) childAt, rect);
                    b(rect);
                    return;
                }
            }
        }
        if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
            b(rect);
            return;
        }
        a(rect);
        a(view, rect);
    }
}
