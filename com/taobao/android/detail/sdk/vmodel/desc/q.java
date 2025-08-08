package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.eby;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class q extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f10389a;
    public int b;
    public String c;

    static {
        kge.a(255484624);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_PIC_CONTAINER;
    }

    public q(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.PicContainerModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString(eby.KEY_PIC_URL);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            this.b = jSONObject2.getIntValue("height");
            this.f10389a = jSONObject2.getIntValue("width");
        }
        if (this.b > 0 && this.f10389a > 0) {
            return;
        }
        this.b = 1;
        this.f10389a = 1;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.c);
    }
}
