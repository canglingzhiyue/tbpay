package com.lsjwzh.widget.recyclerviewpager;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class c<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView.Adapter<VH> f7860a;
    private final RecyclerViewPager b;

    public c(RecyclerViewPager recyclerViewPager, RecyclerView.Adapter<VH> adapter) {
        this.f7860a = adapter;
        this.b = recyclerViewPager;
        setHasStableIds(this.f7860a.hasStableIds());
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7860a.getItemCount();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f7860a.getItemId(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f7860a.getItemViewType(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        this.f7860a.onBindViewHolder(vh, i);
        View view = vh.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams() == null ? new ViewGroup.LayoutParams(-1, -1) : view.getLayoutParams();
        if (this.b.getLayoutManager().canScrollHorizontally()) {
            layoutParams.width = (this.b.getWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight();
        } else {
            layoutParams.height = (this.b.getHeight() - this.b.getPaddingTop()) - this.b.getPaddingBottom();
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public VH mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f7860a.mo1596onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f7860a.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f7860a.setHasStableIds(z);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f7860a.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
