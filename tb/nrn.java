package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile nrn f31698a;
    private final Map<Integer, JSONObject> b = new HashMap();
    private final Map<Integer, JSONObject> c = new HashMap();
    private final Map<Integer, JSONObject> d = new HashMap();

    static {
        kge.a(-2114465060);
        f31698a = null;
    }

    private nrn() {
    }

    public static nrn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrn) ipChange.ipc$dispatch("f085f34", new Object[0]);
        }
        if (f31698a == null) {
            synchronized (nrn.class) {
                if (f31698a == null) {
                    f31698a = new nrn();
                }
            }
        }
        return f31698a;
    }

    public void a(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb77c0f", new Object[]{this, num, jSONObject});
        } else {
            this.d.put(num, jSONObject);
        }
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.d.remove(num);
        }
    }

    public JSONObject b(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("329d81dc", new Object[]{this, num}) : this.d.get(num);
    }

    public void b(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a583e90", new Object[]{this, num, jSONObject});
        } else {
            this.c.put(num, jSONObject);
        }
    }

    public void c(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e1e2cd", new Object[]{this, num});
        } else {
            this.c.remove(num);
        }
    }

    public JSONObject d(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b876549a", new Object[]{this, num}) : this.c.get(num);
    }

    public void c(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f90111", new Object[]{this, num, jSONObject});
        } else {
            this.b.put(num, jSONObject);
        }
    }

    public void e(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce5008b", new Object[]{this, num});
        } else {
            this.b.remove(num);
        }
    }

    public JSONObject f(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3e4f2758", new Object[]{this, num}) : this.b.get(num);
    }
}
