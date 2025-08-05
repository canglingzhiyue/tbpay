package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel;

/* loaded from: classes5.dex */
public interface g {
    void bindModel(SubItemModel subItemModel);

    f getViewHolder();

    void onAppeared();

    void onCreate();

    void onDestroy();

    void onDisappeared();

    void onPause(boolean z, boolean z2);

    void onResume();

    void reRenderViewHolder(f fVar);

    void setParentModelUtils(MultiMediaViewModel.a aVar);

    void willAppear();

    void willDisappear();
}
