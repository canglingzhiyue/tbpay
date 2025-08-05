package com.taobao.mytaobao.ultron.event;

import android.util.Log;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.ultron.fatigue.a;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class l implements com.alibaba.android.ultron.event.base.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addOrderIdToFatigueParam";

    static {
        kge.a(1790615724);
        kge.a(-750523774);
    }

    @Override // com.alibaba.android.ultron.event.base.d
    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
            return;
        }
        Object i = eVar.i();
        if (!(i instanceof JSONObject)) {
            return;
        }
        try {
            a.a(Login.getUserId()).a(((JSONObject) i).getJSONObject("fields").getString("id"));
        } catch (Exception e) {
            TLog.loge("TBMyTaobaoAddOrderFatigueSubscriber", Log.getStackTraceString(e));
        }
    }
}
