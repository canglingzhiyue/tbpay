package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class kts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30313a;
    private int b;
    private Map<String, String[]> c;

    static {
        kge.a(-56459716);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : ((int) (i * 1.4d)) + 1;
    }

    public abstract Object a(String str, String[] strArr);

    public abstract void a();

    public kts(String str, JSONObject jSONObject) {
        this.b = Integer.MAX_VALUE;
        this.f30313a = str;
        try {
            this.b = jSONObject.getInteger(a.ATOM_length).intValue();
            JSONObject jSONObject2 = jSONObject.getJSONObject("key");
            this.c = new HashMap(a(jSONObject2.size()));
            for (String str2 : jSONObject2.keySet()) {
                this.c.put(str2, a(jSONObject2.getString(str2)));
            }
        } catch (Exception unused) {
            TLog.loge("BaseBizParamsCollector", str + "BizParams collector init error");
        }
    }

    private String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.split("\\s*,\\s*");
        }
        return null;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.c == null || this.f30313a == null || b(jSONObject)) {
        } else {
            a();
        }
    }

    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        for (String str : this.c.keySet()) {
            Object a2 = a(str, this.c.get(str));
            if (a(a2)) {
                jSONObject.put(str, a2);
            }
        }
        return true;
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            a();
            return false;
        }
        int length = obj.toString().length();
        if (length == 0) {
            return false;
        }
        if (length <= this.b) {
            return true;
        }
        a();
        return false;
    }
}
