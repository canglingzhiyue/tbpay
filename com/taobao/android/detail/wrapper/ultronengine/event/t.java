package com.taobao.android.detail.wrapper.ultronengine.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.request.jhs.RemindResult;
import com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Collections;
import tb.emu;
import tb.eob;
import tb.kge;

/* loaded from: classes5.dex */
public class t extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "addJhsWaiting";

    static {
        kge.a(1204026725);
    }

    public t() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.RemindJhsUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("RemindJhsUltronSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) com.taobao.prefork.a.a(eVar.a());
        com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b bVar = new com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b(detailCoreActivity);
        final JSONObject c = c();
        if (detailCoreActivity != null && detailCoreActivity.C() != null) {
            c.put("itemId", (Object) detailCoreActivity.C().i());
        }
        bVar.a(new eob(c));
        bVar.a(new b.a() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.t.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b.a
            public void a(RemindResult remindResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("359db738", new Object[]{this, remindResult});
                } else if (remindResult == null) {
                } else {
                    com.alibaba.android.ultron.event.base.f d = eVar.h().d();
                    com.alibaba.android.ultron.event.base.e a2 = d.a();
                    a2.a("adjustState");
                    a2.a(eVar.d());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putAll(c);
                    JSONArray jSONArray = new JSONArray(2);
                    try {
                        JSONObject jSONObject2 = c.getJSONObject(s.WRITE_BACK_ROUTES);
                        JSONObject jSONObject3 = new JSONObject(1);
                        jSONObject3.put("sourcePath", (Object) "btnTitle");
                        jSONObject3.put("targetPath", (Object) jSONObject2.getString("btnTitle"));
                        jSONArray.add(jSONObject3);
                        JSONObject jSONObject4 = new JSONObject(1);
                        jSONObject4.put("sourcePath", (Object) "status");
                        jSONObject4.put("targetPath", (Object) jSONObject2.getString("status"));
                        jSONArray.add(jSONObject4);
                    } catch (Throwable th) {
                        com.taobao.android.detail.core.utils.i.a("RemindJhsUltronSubscriber", "dataMergeParams", th);
                    }
                    jSONObject.put("dataMergeParams", (Object) jSONArray);
                    jSONObject.put("subType", "jhsRemind");
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("status", (Object) Boolean.valueOf(remindResult.btnDisable).toString());
                    jSONObject5.put("btnTitle", (Object) c.getString("disabledTitle"));
                    jSONObject5.putAll(c);
                    jSONObject.put("payload", (Object) jSONObject5);
                    a2.a(new DMEvent("adjustState", jSONObject, Collections.singletonList(eVar.d())));
                    d.a(a2);
                }
            }
        });
    }
}
