package com.taobao.android.detail.sdk.vmodel.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public abstract class WidgetViewModel extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-661201071);
    }

    public abstract int getMiniWidth();

    public abstract double getWeight();

    public WidgetViewModel(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel");
    }
}
