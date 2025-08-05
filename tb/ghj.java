package tb;

import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ghj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28331a;
    public String b = "switchVersion";
    public ghp c;

    static {
        kge.a(-1430426155);
    }

    private ghj() {
    }

    public static ghj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghj) ipChange.ipc$dispatch("f050a95", new Object[0]) : new ghj();
    }

    public ghj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghj) ipChange.ipc$dispatch("7c6fb38b", new Object[]{this, str});
        }
        this.f28331a = str;
        return this;
    }

    public ghj a(ghp ghpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghj) ipChange.ipc$dispatch("35f9eb14", new Object[]{this, ghpVar});
        }
        this.c = ghpVar;
        return this;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ParamsConstants.Key.PARAM_SCENE_CODE, (Object) this.f28331a);
        jSONObject.put("type", (Object) this.b);
        ghp ghpVar = this.c;
        if (ghpVar != null) {
            jSONObject.put("targetVersion", (Object) ghpVar.b());
        }
        return jSONObject;
    }
}
