package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.euy;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class o extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10385a;
    public String b;
    public float c;
    public float d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-1679729180);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_NB_VIDEO;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.b) || !euy.b();
    }

    public o(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.NBVideoModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f10385a = jSONObject.getString("thumbnail");
        this.b = jSONObject.getString("videoUrl");
        this.e = jSONObject.getString("videoId");
        this.f = jSONObject.getString("title");
        this.g = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.c = jSONObject2.getFloatValue("height");
                this.d = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.c != 0.0f && this.d != 0.0f) {
            return;
        }
        this.c = 9.0f;
        this.d = 16.0f;
    }
}
