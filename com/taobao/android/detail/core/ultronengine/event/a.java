package com.taobao.android.detail.core.ultronengine.event;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.ultronengine.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import tb.bpk;
import tb.ehs;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1719691404);
    }

    public a() {
        emu.a("com.taobao.android.detail.core.ultronengine.event.DefaultUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        i.a("DefaultUltronSubscriber", "onHandleEvent ultronEvent:" + eVar.b());
        try {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) eVar.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) eVar.b());
            if (eVar.i() instanceof com.taobao.android.ultron.common.model.b) {
                jSONObject.put("params", (Object) ((com.taobao.android.ultron.common.model.b) eVar.i()).getFields());
            }
            Event a2 = ehs.a(detailCoreActivity, new ActionModel(jSONObject), detailCoreActivity.y().t.f10055a, null, new HashMap());
            if (a2 == null) {
                return;
            }
            if (!f.a(detailCoreActivity).b(a2.getEventId())) {
                UnifyLog.d("DefaultUltronSubscriber", "事件未找到", eVar.b());
                bpk.b(eVar);
            }
            h.a(eVar);
            f.a(detailCoreActivity, a2);
        } catch (Throwable th) {
            i.a("DefaultUltronSubscriber", "onHandleEvent", th);
        }
    }
}
