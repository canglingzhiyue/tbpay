package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import tb.mfj;

/* loaded from: classes8.dex */
public class b extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_POS = -1;
    public static final int MAX_SPAN = 2;
    private static final String e = com.taobao.live.home.dinamic.view.c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f21979a;
    public int b;
    public int c;
    public int d = -1;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1263079482) {
            super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(int i, int i2, int i3) {
        this.f21979a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        DinamicDataObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.top = this.c;
        if ((recyclerView.getChildViewHolder(view) instanceof com.taobao.live.home.dinamic.view.b) && (b = ((com.taobao.live.home.dinamic.view.b) recyclerView.getChildViewHolder(view)).b()) != null && b.noLeftRightSpace) {
            rect.left = 0;
            rect.right = 0;
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.d;
        if (-1 != i && childAdapterPosition == i) {
            rect.left = 0;
            rect.right = 0;
        } else if (a(view)) {
            rect.left = this.f21979a;
            rect.right = this.b;
        } else {
            rect.left = this.b;
            rect.right = this.f21979a;
        }
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return true;
            }
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == 0) {
                z = true;
            }
            return z;
        } catch (Exception e2) {
            mfj.a(e, "isLeftItem exp.", e2);
            return true;
        }
    }
}
