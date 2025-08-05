package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ove {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, ovd> f32449a = new HashMap<>();

    static {
        kge.a(1775682296);
    }

    public void a(String str, ovd ovdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38969c25", new Object[]{this, str, ovdVar});
        } else {
            this.f32449a.put(str, ovdVar);
        }
    }

    public ova a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ova) ipChange.ipc$dispatch("2615dbae", new Object[]{this, str, jSONObject});
        }
        ovd ovdVar = this.f32449a.get(str);
        if (ovdVar == null) {
            return null;
        }
        try {
            return ovdVar.a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
