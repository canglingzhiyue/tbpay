package com.taobao.alilive.aliliveframework.frame;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes4.dex */
public interface IComponent extends IComponentLifeCycle2 {
    void addComponent(IComponent iComponent);

    void clearComponent();

    void createView(ViewGroup viewGroup);

    boolean createView(ViewStub viewStub);

    void deleteComponent(IComponent iComponent);

    IComponent getComponentByName(String str);

    String getComponentName();

    View getComponentView();

    TBLiveDataModel getLiveDataModel();

    View getViewByName(String str);

    int getViewStatus();

    void hide();

    void onBindData(TBLiveDataModel tBLiveDataModel);

    void onVideoStatusChanged(int i);

    void show();
}
