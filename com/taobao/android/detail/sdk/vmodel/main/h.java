package com.taobao.android.detail.sdk.vmodel.main;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class h extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10427a;
    private JSONObject b;
    private String c;

    static {
        kge.a(-673081322);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_ASK_ALL;
    }

    public h(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.DetailAskViewModel");
        if (componentModel == null || nodeBundle == null || componentModel.mapping == null) {
            return;
        }
        this.b = componentModel.mapping.getJSONObject("data");
        this.c = componentModel.mapping.getString("pageName");
        this.f10427a = componentModel.mapping.getString("itemId");
    }
}
