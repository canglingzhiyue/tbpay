package com.taobao.android.detail.core.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9762a;
    public String b;
    public String c;
    public float d;
    public float e;
    public JSONObject f;

    static {
        kge.a(-432282735);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.DescGifViewModel";
    }

    public a(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f9762a = jSONObject.getString("thumbnail");
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

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f9762a) || StringUtils.isEmpty(this.b);
    }
}
