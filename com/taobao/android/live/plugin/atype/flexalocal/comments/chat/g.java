package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f13619a;
    private int b;

    static {
        kge.a(-531900927);
    }

    public g(int i, int i2) {
        this.f13619a = i;
        this.b = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
        } else if (recyclerView.getChildPosition(view) == 0) {
        } else {
            int i = this.b;
            if (i == 1) {
                rect.top = this.f13619a;
            } else if (i != 0) {
            } else {
                rect.left = this.f13619a;
            }
        }
    }
}
