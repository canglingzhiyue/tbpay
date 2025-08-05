package tb;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes4.dex */
public class ewp {

    /* renamed from: a  reason: collision with root package name */
    public String f27615a;
    public String b;

    static {
        kge.a(-205461464);
    }

    public ewp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27615a = jSONObject.getString("weexUrl");
            this.b = jSONObject.getString("priority");
        }
        tpc.a("com.taobao.android.detail.sdk.structure.desc.DescWeexOpenData");
    }
}
