package tb;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes5.dex */
public class fhv extends fij {
    public static final String EVENT_KEY = "openUrl";

    /* renamed from: a  reason: collision with root package name */
    public String f27961a;

    static {
        kge.a(-1474085840);
    }

    public fhv(JSONObject jSONObject, Object obj) {
        super(obj);
        if (jSONObject == null) {
            return;
        }
        this.f27961a = jSONObject.getString("url");
    }
}
