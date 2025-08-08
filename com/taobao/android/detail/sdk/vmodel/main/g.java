package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class g extends com.taobao.android.detail.sdk.vmodel.desc.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10426a;
    public String b;
    public String c;
    public float d;
    public float e;
    public JSONObject f;

    static {
        kge.a(-1704719381);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 90001;
    }

    public g(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.DescGifViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f10426a = jSONObject.getString("thumbnail");
            this.b = jSONObject.getString("videoUrl");
            this.c = jSONObject.getString("videoId");
            this.f = jSONObject.getJSONObject("utParams");
            JSONObject jSONObject2 = jSONObject.getJSONObject("size");
            if (jSONObject2 != null) {
                try {
                    this.d = jSONObject2.getFloatValue("height");
                    this.e = jSONObject2.getFloatValue("width");
                } catch (Exception unused) {
                }
            }
            if (this.d != 0.0f && this.e != 0.0f) {
                return;
            }
            this.d = 480.0f;
            this.e = 640.0f;
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f10426a) || StringUtils.isEmpty(this.b);
    }
}
