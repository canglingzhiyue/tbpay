package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class afn extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-520869934);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "tlMap";
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < list.size(); i += 2) {
            jSONObject.put(String.valueOf(list.get(i)), list.get(i + 1));
        }
        return jSONObject;
    }
}
