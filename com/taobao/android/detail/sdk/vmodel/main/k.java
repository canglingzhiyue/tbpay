package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class k extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10431a;
    public int b;

    static {
        kge.a(1285706333);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_H5;
    }

    public k(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.H5ViewModel");
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.f10431a = jSONObject.getString("url");
        this.b = jSONObject.getIntValue("height");
        JSONObject jSONObject2 = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.f10431a = com.taobao.android.detail.sdk.utils.m.a(this.f10431a, key, value.toString());
            }
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f10431a);
    }
}
