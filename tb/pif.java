package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class pif extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_SCREEN_TYPE = "mainScreen";
    private qpk g;
    private Map<String, eyy> h;

    static {
        kge.a(2106745040);
    }

    public static /* synthetic */ Map a(pif pifVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("53412120", new Object[]{pifVar}) : pifVar.h;
    }

    public pif(JSONObject jSONObject) {
        super(jSONObject);
        this.h = new HashMap(0);
        b(jSONObject, null);
    }

    public pif(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        this.h = new HashMap(0);
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                if (jSONObject3 != null) {
                    if (TextUtils.equals("headerPic", str)) {
                        this.h.put(str, new eze(jSONObject3, ezoVar));
                    } else {
                        this.h.put(str, new eyy(jSONObject3, ezoVar));
                    }
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("layoutInfo");
        if (jSONObject4 == null) {
            return;
        }
        this.g = new qpk(jSONObject4, new plc() { // from class: tb.pif.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.plc
            public eyy a(String[] strArr) {
                Object obj;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    obj = ipChange2.ipc$dispatch("4801d94a", new Object[]{this, strArr});
                } else if (pif.a(pif.this).isEmpty() || strArr == null || strArr.length <= 0) {
                    return null;
                } else {
                    obj = pif.a(pif.this).get(strArr[0]);
                }
                return (eyy) obj;
            }
        });
    }

    public qpk h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpk) ipChange.ipc$dispatch("44e53a0b", new Object[]{this}) : this.g;
    }
}
