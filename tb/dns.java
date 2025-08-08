package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* loaded from: classes4.dex */
public class dns extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMREMOVECOMPONENT = "-3524620025611868571";

    static {
        kge.a(-60169395);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext h;
        bny b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        dla dlaVar = new dla();
        if (lVar == null || dlhVar == null || (b = Util.b((h = lVar.h()))) == null) {
            return dlaVar;
        }
        Object a2 = h.a();
        if (a2 instanceof Map) {
            IDMComponent iDMComponent = (IDMComponent) ((Map) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
            String c = dlhVar.c("componentKey");
            if (!StringUtils.isEmpty(c)) {
                iDMComponent = b.d().a().b(c);
            }
            if (iDMComponent == null || "true".equals(dlhVar.c("noNeedReload"))) {
                return dlaVar;
            }
            try {
                a(JSON.parseObject("{\n    \"container\": {\n        \"data\": []\n    },\n    \"endpoint\": {},\n    \"reload\": \"true\",\n    \"data\": {},\n    \"hierarchy\": {\n        \"structure\": {},\n        \"delta\": [\n        ]\n    },\n    \"global\": {},\n    \"linkage\": {}\n}").getJSONObject("hierarchy").getJSONArray("delta"), iDMComponent.getKey());
                b.a(127);
            } catch (Exception unused) {
            }
        }
        return dlaVar;
    }

    public static void a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb8b5a", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) "delete");
        jSONObject.put("target", (Object) str);
        jSONArray.add(jSONObject);
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-686613212);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public dns a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dns) ipChange.ipc$dispatch("16ba0fb9", new Object[]{this, obj}) : new dns();
        }
    }
}
