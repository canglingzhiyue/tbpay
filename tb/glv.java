package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class glv extends glr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-342436567);
    }

    @Override // tb.glr, tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        Object c = gmfVar.c();
        if (!(c instanceof JSONObject)) {
            return null;
        }
        try {
            return a((String) list.get(0), ((JSONObject) c).getJSONObject("eventParam"));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
