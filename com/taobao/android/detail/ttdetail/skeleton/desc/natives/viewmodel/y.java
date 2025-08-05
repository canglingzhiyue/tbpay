package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eby;
import tb.kge;

/* loaded from: classes5.dex */
public class y extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10898a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(1190049173);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString(eby.KEY_PIC_URL);
        this.b = jSONObject.getString("jumpUrl");
        this.f10898a = jSONObject.getString("itemId");
        this.d = jSONObject.getString("videoCount");
        this.e = jSONObject.getString("videoTagUrl");
    }
}
