package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bku extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e b;

    static {
        kge.a(25201225);
    }

    public static /* synthetic */ Object ipc$super(bku bkuVar, String str, Object... objArr) {
        if (str.hashCode() == 2042063747) {
            return new Boolean(super.e((e) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bkt
    public boolean e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b76b83", new Object[]{this, eVar})).booleanValue();
        }
        this.b = eVar;
        return super.e(eVar);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV3");
        jSONObject2.put("fields", (Object) h.a(jSONObject));
        b(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        h.a(jSONObject3, h.a(jSONObject));
        jSONObject3.remove("mtopConfig");
        a(jSONObject2, "success", "alipayV3", jSONObject3);
        return jSONObject2;
    }

    private void b(JSONObject jSONObject) {
        IDMComponent d;
        JSONObject data;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        e eVar = this.b;
        if (eVar == null || (d = eVar.d()) == null || (data = d.getData()) == null || (jSONObject2 = data.getJSONObject("fields")) == null || (jSONObject3 = jSONObject.getJSONObject("fields")) == null || (jSONObject4 = jSONObject3.getJSONObject("mtopConfig")) == null) {
            return;
        }
        h.a(jSONObject4, jSONObject2, "native$next");
    }
}
