package com.taobao.android.detail.sdk.vmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class z extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-708473670);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_SPLITABLE_CONTAINER;
    }

    public z(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.SplitableContainerModel");
    }
}
