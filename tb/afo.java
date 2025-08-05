package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class afo extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1934402252);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : ((String) list.get(0)).split(",")) {
            if (str.contains("=")) {
                String[] split2 = str.split("=");
                jSONObject.put(split2[0], (Object) split2[1]);
            }
        }
        return jSONObject;
    }
}
