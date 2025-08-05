package com.taobao.informationflowdataservice.dataservice.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.gateway.msgcenter.Message;
import java.util.List;
import tb.kge;
import tb.lxl;

/* loaded from: classes7.dex */
public class RecmdGatewayMsg extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1265275474);
    }

    @Override // com.taobao.android.gateway.msgcenter.Message
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this}) : "gateway";
    }

    private RecmdGatewayMsg() {
    }

    public static RecmdGatewayMsg getMessage(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdGatewayMsg) ipChange.ipc$dispatch("83261ee", new Object[]{list});
        }
        if (list != null && !list.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("events", (Object) list);
                RecmdGatewayMsg recmdGatewayMsg = new RecmdGatewayMsg();
                recmdGatewayMsg.setParams(jSONObject);
                return recmdGatewayMsg;
            } catch (Throwable th) {
                lxl.a("gateway2.msg", th, "generateGatewayMsg failed");
            }
        }
        return null;
    }
}
