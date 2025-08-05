package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class iag extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_UPDATE_FIELDS = "updateFields";

    /* renamed from: a  reason: collision with root package name */
    private final String f28873a = "batchUpdateComponentV2Subscriber";
    private Handler b = new Handler(Looper.getMainLooper());

    static {
        kge.a(351693417);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-3886977793003145152";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final e eVar) {
        IDMComponent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        try {
            JSONObject e = e(eVar);
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = e == null ? null : e.getJSONObject("updateFields");
            if (jSONObject2 == null) {
                return;
            }
            if (e != null) {
                jSONObject = e.getJSONObject("updatePrefixFields");
            }
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    for (IDMComponent iDMComponent : eVar.h().b().b()) {
                        if (iDMComponent.getKey().startsWith(entry.getKey())) {
                            jSONObject2.put(iDMComponent.getKey(), entry.getValue());
                        }
                    }
                }
            }
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                String key = entry2.getKey();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                if (jSONObject3 != null && (b = eVar.h().b().b(key)) != null) {
                    bkg.a(b.getFields(), jSONObject3);
                    arrayList.add(b);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (ibl.e()) {
                eVar.h().a(arrayList);
            } else {
                this.b.post(new Runnable() { // from class: tb.iag.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            eVar.h().a(arrayList);
                        } catch (Throwable th) {
                            iaa.a((Context) null, "batchUpdateComponentV2Subscriber", "BatchUpdateComponent-error = " + th.getMessage(), (Map<String, String>) null);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            String simpleName = getClass().getSimpleName();
            bkd.a(simpleName, "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "batchupdate error = " + th.getMessage());
            hzy.a("batchUpdateComponentV2Subscriber", "batchUpdateComponent", th);
        }
    }
}
