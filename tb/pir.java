package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.utils.g;

/* loaded from: classes4.dex */
public class pir extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_META = "meta";
    public static final String KEY_MODEL = "model";
    private JSONObject g;
    private eyx h;

    static {
        kge.a(1797522012);
    }

    public pir(JSONObject jSONObject, eyx eyxVar) {
        super(jSONObject);
        a(jSONObject);
        this.h = eyxVar;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.g = g.a(jSONObject);
        }
    }

    public <L extends qpk> L h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (L) ipChange.ipc$dispatch("44e53a0b", new Object[]{this});
        }
        pif pifVar = (pif) this.h.a().a(pie.PARSER_ID);
        if (pifVar == null) {
            return null;
        }
        return (L) pifVar.h();
    }

    public <M extends Merged> M a(Class<M> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M) ipChange.ipc$dispatch("50def42", new Object[]{this, cls}) : (M) this.h.a().a(cls);
    }
}
