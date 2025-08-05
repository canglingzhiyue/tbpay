package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ess {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final JSONObject f27548a;

    static {
        kge.a(-292251635);
        JSONObject jSONObject = new JSONObject();
        f27548a = jSONObject;
        jSONObject.put("ci_bucket", (Object) oeb.x());
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]) : f27548a;
    }
}
