package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ghp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28334a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        kge.a(-1952906336);
    }

    private ghp() {
    }

    public static ghp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghp) ipChange.ipc$dispatch("f050b4f", new Object[0]) : new ghp();
    }

    public static ghp a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("2901382f", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return a().c(jSONObject);
        }
        return null;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataVersion", (Object) this.f28334a);
        jSONObject.put("groupCode", (Object) this.b);
        jSONObject.put("versionCode", (Object) this.c);
        jSONObject.put("activeType", (Object) this.d);
        jSONObject.put("bizParams", (Object) this.e);
        return jSONObject;
    }

    public ghp a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("7c6fb445", new Object[]{this, str});
        }
        this.f28334a = str;
        return this;
    }

    public ghp b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("7d1c5fe4", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public ghp c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("7dc90b83", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public ghp d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("7e75b722", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public ghp b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("c3a1fab0", new Object[]{this, jSONObject});
        }
        this.e = jSONObject;
        return this;
    }

    public ghp a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghp) ipChange.ipc$dispatch("2f85ed69", new Object[]{this, str, obj});
        }
        if (this.e == null) {
            this.e = new JSONObject();
        }
        this.e.put(str, obj);
        return this;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : TextUtils.equals(str, this.b);
    }

    public ghp c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghp) ipChange.ipc$dispatch("5e42bd31", new Object[]{this, jSONObject}) : jSONObject == null ? this : a(jSONObject.getString("dataVersion")).c(jSONObject.getString("versionCode")).b(jSONObject.getString("groupCode")).d(jSONObject.getString("activeType")).b(jSONObject.getJSONObject("bizParams"));
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof ghp)) {
            return false;
        }
        ghp ghpVar = (ghp) obj;
        return TextUtils.equals(ghpVar.f28334a, this.f28334a) && TextUtils.equals(ghpVar.b, this.b) && TextUtils.equals(ghpVar.c, this.c);
    }
}
