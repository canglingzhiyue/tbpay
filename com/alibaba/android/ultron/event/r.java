package com.alibaba.android.ultron.event;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkt;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

/* loaded from: classes2.dex */
public class r extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-279158868);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        JSONObject fields = b.getFields();
        dkt dktVar = new dkt();
        Object b2 = b("triggerView");
        Context a2 = eVar.a();
        dlr dlrVar = new dlr();
        dlrVar.a(a2);
        if (b2 instanceof View) {
            dlrVar.a((View) b2);
            dktVar.a(new dlh(fields), dlrVar, (dll) null);
            return;
        }
        if (a2 instanceof Activity) {
            Activity activity = (Activity) a2;
            if (activity.getWindow() != null) {
                dlrVar.a(activity.getWindow().getDecorView());
                dktVar.a(new dlh(fields), dlrVar, (dll) null);
                return;
            }
        }
        Log.e("UltronOpenPopSubscriber", "view is null");
    }
}
