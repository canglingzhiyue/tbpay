package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10870a;
    public String b;
    public String c;
    public float d;
    public float e;
    public JSONObject f;

    static {
        kge.a(401444286);
    }

    public d(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f10870a = jSONObject.getString("thumbnail");
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

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f10870a) || TextUtils.isEmpty(this.b);
    }
}
