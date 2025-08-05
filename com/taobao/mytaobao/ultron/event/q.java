package com.taobao.mytaobao.ultron.event;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.ext.event.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class q extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "userTapSender";
    public static final String NEXT_TAG_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.ultron.model.c f18515a;

    static {
        kge.a(1235275463);
    }

    public q(com.taobao.mytaobao.ultron.model.c cVar) {
        this.f18515a = cVar;
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
        } else if (c() == null) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
        } else {
            List<String> a2 = this.f18515a.a();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                if (it.hasNext()) {
                    stringBuffer.append(",");
                }
            }
            this.f18515a.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userTaps", (Object) stringBuffer);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) jSONObject);
            a(eVar, "success", jSONObject2);
        }
    }
}
