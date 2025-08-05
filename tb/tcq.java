package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class tcq implements oqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-454308966);
        kge.a(912575439);
    }

    @Override // tb.oqa
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.oqa
    public void b(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3219415b", new Object[]{this, opeVar, jSONObject});
        }
    }
}
