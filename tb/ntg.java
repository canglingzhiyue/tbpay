package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ntg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31751a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    static {
        kge.a(-1446946510);
    }

    public static ntg a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntg) ipChange.ipc$dispatch("290492bd", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        ntg ntgVar = new ntg();
        ntgVar.f31751a = jSONObject.getString("normalTextColor");
        ntgVar.b = jSONObject.getString("selectedTextColor");
        ntgVar.c = jSONObject.getString("backgroundImage");
        ntgVar.d = jSONObject.getString("backgroundColor");
        String string = jSONObject.getString("statusBarStyle");
        if (TextUtils.equals(string, "light")) {
            ntgVar.f = 10002;
        } else if (TextUtils.equals(string, "dark")) {
            ntgVar.f = 10001;
        } else {
            ntgVar.f = 10000;
        }
        ntgVar.e = jSONObject.getString("atmosphereLogoImage");
        return ntgVar;
    }
}
