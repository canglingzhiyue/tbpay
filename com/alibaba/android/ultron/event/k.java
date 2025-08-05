package com.alibaba.android.ultron.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class k extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1527430907);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            Object d = d();
            if (!(d instanceof JSONObject) || (jSONArray = ((JSONObject) d).getJSONArray(Constants.KEY_EVENT_LIST)) == null) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                this.e.d().a(a(jSONArray.getJSONObject(i)));
            }
        } catch (Throwable th) {
            UnifyLog.d("CommonServerEventSubscriber", th.toString());
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonServerEventSubscriber.onHandleEvent", th);
        }
    }

    private com.alibaba.android.ultron.event.base.e a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("795fe5e3", new Object[]{this, jSONObject});
        }
        com.alibaba.android.ultron.event.base.e a2 = this.e.d().a();
        String string = jSONObject.getString("type");
        a2.a(string);
        a2.a(new DMEvent(string, jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
        return a2;
    }
}
