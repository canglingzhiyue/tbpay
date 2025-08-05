package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class kuk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_HOME_PAGE = "PageTaoHome";
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public String f30328a = "PageTaoHome";
    private JSONObject c = new JSONObject();

    static {
        kge.a(717987425);
    }

    public static kuk a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kuk) ipChange.ipc$dispatch("7c71b5f3", new Object[]{str}) : new kuk(str);
    }

    public kuk(String str) {
        this.b = str;
    }

    public kuk b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuk) ipChange.ipc$dispatch("7d1e6192", new Object[]{this, str});
        }
        this.f30328a = str;
        return this;
    }

    public kuk a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuk) ipChange.ipc$dispatch("953c4d69", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return this;
        }
        this.c.put(str, (Object) str2);
        return this;
    }

    public kuk a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuk) ipChange.ipc$dispatch("290339dd", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && jSONObject.size() != 0) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.c.put(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            new kup(this).a();
        }
    }

    public static void a(llh llhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30282f0", new Object[]{llhVar});
        } else if (llhVar == null || TextUtils.isEmpty(llhVar.f30693a) || TextUtils.isEmpty(llhVar.b)) {
        } else {
            a(llhVar.b).b(llhVar.f30693a).a(llhVar.a()).b();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "pageName:" + this.f30328a + " eventName:" + this.b + " params" + this.c.toJSONString();
    }
}
