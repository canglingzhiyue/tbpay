package com.taobao.tao.recommend3.newface.gateway.action;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.gkc;
import tb.gke;
import tb.kge;

/* loaded from: classes.dex */
public class j implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "gateway2.postMsg";

    static {
        kge.a(212993146);
        kge.a(1464465151);
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            Object obj = jSONObject.get("widgetNode");
            if (!(obj instanceof DXWidgetNode)) {
                return;
            }
            DXWidgetNode dXWidgetNode = (DXWidgetNode) obj;
            JSONObject jSONObject2 = jSONObject.getJSONObject("widgetParams");
            if (jSONObject2 == null) {
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
            String[] strArr = new String[2];
            strArr[0] = "post msg to widget, operation=";
            strArr[1] = jSONObject3 == null ? "null" : jSONObject3.getString("videoOperation");
            com.taobao.android.home.component.utils.e.c("gateway2.postMsg", strArr);
            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
            dXMsgCenterEvent.setType(jSONObject2.getString("type"));
            dXMsgCenterEvent.setParams(jSONObject3);
            dXWidgetNode.postEvent(dXMsgCenterEvent);
        }
    }
}
