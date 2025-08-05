package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fhn extends fjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1413014445);
    }

    public fhn(b bVar, fmd fmdVar, String str) {
        super(bVar, fmdVar, str);
    }

    @Override // tb.fjg
    public Map<String, String> a(Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("95b64768", new Object[]{this, map, dVar});
        }
        if (dVar instanceof fhi) {
            return a(map, (fhi) dVar);
        }
        return map == null ? new HashMap() : map;
    }

    public static Map<String, String> a(Map<String, String> map, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae745fb", new Object[]{map, fhiVar});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (fhiVar != null) {
            map.put("item_id", fhiVar.j());
            map.put("seller_id", fhiVar.e());
            try {
                map.putAll((Map) JSONObject.toJavaObject(fhiVar.c(), Map.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                map.putAll((Map) JSONObject.toJavaObject(fhiVar.d(), Map.class));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return map;
    }
}
