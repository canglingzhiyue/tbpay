package com.taobao.android.dinamicx.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes5.dex */
public interface e {
    void a(int i, boolean z);

    int b(int i);

    List<Integer> b();

    void b(RecyclerView.ViewHolder viewHolder, int i);

    boolean c(int i);

    boolean d(int i);

    int e(int i);

    int getItemViewType(int i);

    int j();

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);
}
