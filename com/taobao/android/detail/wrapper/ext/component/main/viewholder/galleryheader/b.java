package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader;

import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;

/* loaded from: classes5.dex */
public interface b {
    void bindModel(SubItemModel subItemModel);

    a getViewHolder();

    void onAppeared();

    void onCreate();

    void onDestroy();

    void onDisappeared();

    void onPause(boolean z, boolean z2);

    void onResume();

    void reRenderViewHolder(a aVar);

    void setParentModelUtils(MultiMediaViewModel.a aVar);

    void willAppear();

    void willDisappear();
}
