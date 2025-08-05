package com.taobao.weex.ui.component.list;

import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.listview.adapter.RecyclerViewBaseAdapter;

/* loaded from: classes9.dex */
public interface ListComponentView {
    WXRecyclerView getInnerView();

    RecyclerViewBaseAdapter getRecyclerViewBaseAdapter();

    void notifyStickyRemove(IWXCell iWXCell);

    void notifyStickyShow(IWXCell iWXCell);

    void setRecyclerViewBaseAdapter(RecyclerViewBaseAdapter recyclerViewBaseAdapter);

    void updateStickyView(int i);
}
