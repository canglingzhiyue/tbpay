package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class gjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private gkj b;
    private String c;
    private String d;

    /* renamed from: a  reason: collision with root package name */
    private gkm f28359a = new gkm(this);
    private Map<String, JSONObject> e = new HashMap();

    static {
        kge.a(-1476380134);
    }

    public gjz(String str, String str2, String str3, boolean z) {
        this.c = str;
        this.d = str2;
        this.b = new gkj(str, str2, str3, z);
        a();
    }

    public gjz(String str, JSONObject jSONObject) {
        this.c = str;
        this.b = new gkj(str, jSONObject);
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f28359a.a(this);
        }
    }

    public gkm b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gkm) ipChange.ipc$dispatch("16b6bb94", new Object[]{this}) : this.f28359a;
    }

    public gkj c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gkj) ipChange.ipc$dispatch("1e686096", new Object[]{this}) : this.b;
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = this.e.get(str);
        if (jSONObject == null) {
            synchronized (gjz.class) {
                jSONObject = new JSONObject();
                this.e.put(str, jSONObject);
            }
        }
        return jSONObject;
    }
}
