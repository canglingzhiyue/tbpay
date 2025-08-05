package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class dnr extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMBATCHUPDATECOMPONENT = "132066586199278145";

    static {
        kge.a(-1160411495);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext h;
        final bny b;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        dla dlaVar = new dla();
        if (lVar == null || dlhVar == null || (b = Util.b((h = lVar.h()))) == null) {
            return dlaVar;
        }
        JSONObject jSONObject = null;
        if (dlhVar == null) {
            a2 = null;
        } else {
            try {
                a2 = dlhVar.a("updateFields");
            } catch (Throwable unused) {
            }
        }
        if (a2 == null) {
            return dlaVar;
        }
        if (dlhVar != null) {
            jSONObject = dlhVar.a("updatePrefixFields");
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                for (IDMComponent iDMComponent : b.d().a().b()) {
                    if (iDMComponent.getKey().startsWith(entry.getKey())) {
                        a2.put(iDMComponent.getKey(), entry.getValue());
                    }
                }
            }
        }
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry2 : a2.entrySet()) {
            String key = entry2.getKey();
            JSONObject jSONObject2 = a2.getJSONObject(key);
            IDMComponent b2 = b.d().a().b(key);
            Util.a(b2.getFields(), jSONObject2);
            arrayList.add(b2);
        }
        h.s().post(new Runnable() { // from class: tb.dnr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    b.a(arrayList);
                } catch (Throwable unused2) {
                }
            }
        });
        return dlaVar;
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1854098320);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public dnr a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dnr) ipChange.ipc$dispatch("16ba0f9a", new Object[]{this, obj}) : new dnr();
        }
    }
}
