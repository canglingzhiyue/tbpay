package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import tb.hgw;
import tb.jwg;

/* loaded from: classes6.dex */
public interface h extends hgw {
    jwg getAdapter();

    CloseRecyclerView getRecyclerView();

    void hideEmptyView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar);

    void hideErrorView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar);

    void showEmptyView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar);

    void showErrorView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar);
}
