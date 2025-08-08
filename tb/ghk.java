package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ghk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28332a;
    public String b;
    public String c;
    public String d;
    public ghp e;
    public List<ghp> f;

    static {
        kge.a(-1340603973);
    }

    public static ghk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghk) ipChange.ipc$dispatch("f050ab4", new Object[0]) : new ghk();
    }

    public static ghk a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghk) ipChange.ipc$dispatch("29013794", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return a().b(jSONObject);
        }
        return null;
    }

    public ghk b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghk) ipChange.ipc$dispatch("c3a1fa15", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        this.f28332a = jSONObject.getString("type");
        this.b = jSONObject.getString("success");
        this.d = jSONObject.getString("errCode");
        this.c = jSONObject.getString("errMsg");
        this.e = ghp.a(jSONObject.getJSONObject("switchedVersion"));
        JSONArray jSONArray = jSONObject.getJSONArray("versionLists");
        if (jSONArray != null && jSONArray.size() > 0) {
            this.f = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                this.f.add(ghp.a().c(jSONArray.getJSONObject(i)));
            }
        }
        return this;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : StringUtils.equals("true", this.b);
    }
}
