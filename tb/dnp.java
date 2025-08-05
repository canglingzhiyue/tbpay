package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.adam.common.b;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class dnp extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<dnm> f26872a;
    private dna b;
    private JSONObject l = Util.a();

    static {
        kge.a(-926774557);
    }

    public static /* synthetic */ Object ipc$super(dnp dnpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            String b = eVar.b();
            if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b.trim())) {
                return;
            }
            HashMap hashMap = new HashMap();
            Object d = eVar.d("extraParams");
            hashMap.put("originArgs", d);
            hashMap.put("global_adam_config", this.l);
            JSONObject jSONObject = new JSONObject();
            Util.a(d, jSONObject);
            hashMap.put("event_adam_config", jSONObject);
            if (this.b == null) {
                this.b = new dna();
            }
            dmz dmzVar = new dmz();
            dmzVar.a(hashMap);
            try {
                DXEvent dXEvent = (DXEvent) eVar.d(f.KEY_DXEVENT);
                HashMap hashMap2 = (HashMap) eVar.d("bizParams");
                DXRuntimeContext dXRuntimeContext = hashMap2 == null ? null : (DXRuntimeContext) hashMap2.get(b.PARSER_KEY_DX_RUNTIMECONTEXT);
                dmzVar.a(dXRuntimeContext);
                HashMap<String, String> a2 = Util.a("ultron", b, dXRuntimeContext);
                hashMap.put("utParams", a2);
                this.b.a(e(), dXEvent, new Object[]{b, b.a(eVar)}, dmzVar);
                Util.a("exposure_transUtrToEvChain", a2);
            } catch (Throwable th) {
                AppMonitor.Counter.commit("ADAM_MONITOR", "HandleEvent-ERROR", "msg = " + th.toString(), 1.0d);
                TLog.logi(null, "LOG_ADAM", "execute evChain from ultron error: " + th.getMessage());
            }
        }
    }

    private List<dnm> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        if (this.f26872a == null) {
            this.f26872a = new ArrayList();
            this.f26872a.add(new dnq());
        }
        return this.f26872a;
    }
}
