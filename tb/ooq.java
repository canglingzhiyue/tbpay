package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class ooq extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1377777216);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        JSONObject jSONObject = null;
        if (list != null && list.size() != 0) {
            if (list.size() % 2 != 0) {
                return null;
            }
            jSONObject = new JSONObject();
            while (i < list.size()) {
                int i2 = i + 1;
                jSONObject.put((String) list.get(i), list.get(i2));
                i = i2 + 1;
            }
        }
        return jSONObject;
    }
}
