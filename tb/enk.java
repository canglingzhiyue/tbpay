package tb;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes4.dex */
public class enk {

    /* renamed from: a  reason: collision with root package name */
    public String f27469a;
    public String b;

    static {
        kge.a(-2122937083);
    }

    public enk(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27469a = jSONObject.getString("weexUrl");
            this.b = jSONObject.getString("priority");
        }
        emu.a("com.taobao.android.detail.datasdk.engine.structure.desc.DescWeexOpenData");
    }
}
