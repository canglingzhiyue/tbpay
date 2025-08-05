package com.alilive.adapter.uikit;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* loaded from: classes3.dex */
public interface b {

    /* loaded from: classes3.dex */
    public interface a {
    }

    boolean addFeature(com.alilive.adapter.uikit.a<? super RecyclerView> aVar);

    void addFooterView(View view);

    void addHeaderView(View view);

    void clearFeatures();

    RecyclerView.ViewHolder findViewHolderForAdapterPosition(int i);

    int getHeaderViewsCount();

    int getItemCount();

    void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener);

    void setOnItemClickListener(a aVar);
}
