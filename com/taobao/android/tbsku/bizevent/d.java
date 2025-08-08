package com.taobao.android.tbsku.bizevent;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends com.taobao.android.sku.bizevent.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_jhs_join_request";

    /* renamed from: a  reason: collision with root package name */
    private Object f15405a;

    static {
        kge.a(-687111246);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        } else if (hashCode != -1347517107) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.a((MtopResponse) objArr[0]);
        }
    }

    @Override // com.taobao.android.sku.bizevent.e, com.alibaba.android.ultron.event.i, com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject jSONObject;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        JSONObject fields = b().getFields();
        if (fields == null || (jSONObject = fields.getJSONObject("mtopConfig")) == null || (obj = jSONObject.get("tradeExParams")) == null) {
            return;
        }
        this.f15405a = obj;
    }

    @Override // com.alibaba.android.ultron.event.i
    public JSONObject a(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        JSONObject a2 = super.a(mtopResponse);
        if (a2 == null) {
            a2 = new JSONObject();
        }
        if (this.f15405a == null) {
            this.f15405a = new JSONObject().toJSONString();
        }
        a2.put("tradeExParams", this.f15405a);
        JSONObject jSONObject2 = a2.getJSONObject("data");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("params")) == null) {
            return a2;
        }
        String string = jSONObject.getString("tgKey");
        if (!StringUtils.isEmpty(string)) {
            try {
                jSONObject.put("tgKey", (Object) URLDecoder.decode(string, "utf-8"));
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = new JSONObject(JSONObject.parseObject(this.f15405a.toString()));
        jSONObject3.putAll(jSONObject);
        a2.put("tradeExParams", (Object) jSONObject3.toJSONString());
        return a2;
    }
}
