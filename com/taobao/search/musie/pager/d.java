package com.taobao.search.musie.pager;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class d extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19265a;
    private int b;

    static {
        kge.a(-465773072);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f19265a;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f19265a = i;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
        } else if (rect == null || recyclerView == null) {
        } else {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (childLayoutPosition == 0) {
                rect.left = this.f19265a;
                rect.right = this.b;
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            q.a((Object) adapter, "parent.adapter");
            if (childLayoutPosition == adapter.getItemCount() - 1) {
                rect.right = this.f19265a;
            } else {
                rect.right = this.b;
            }
        }
    }
}
