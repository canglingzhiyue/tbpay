package com.taobao.android.ultron.datamodel.imp.delta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import tb.jok;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "reload";
    public static final String TAG = "OperateReload";

    static {
        kge.a(-276711573);
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
            return;
        }
        bVar.b();
        String string = jSONObject.getString("target");
        DMComponent dMComponent = bVar.u().get(string);
        if (dMComponent == null) {
            UnifyLog.a(bVar.h(), TAG, "reload target is null", new String[0]);
        }
        JSONObject jSONObject2 = bVar.o().getJSONObject(string).getJSONObject("events");
        dMComponent.onReloadEvent(com.taobao.android.ultron.datamodel.imp.a.a(bVar, jSONObject2));
        dMComponent.setEvents(jSONObject2);
    }
}
