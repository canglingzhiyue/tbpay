package com.taobao.tao.recommend3.gateway.msgcenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.gateway.msgcenter.Message;
import com.taobao.android.home.component.utils.e;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class RecmdGatewayMsg extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-993026200);
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
            return (RecmdGatewayMsg) ipChange.ipc$dispatch("124a5a12", new Object[]{list});
        }
        if (list != null && !list.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("events", (Object) list);
                RecmdGatewayMsg recmdGatewayMsg = new RecmdGatewayMsg();
                recmdGatewayMsg.setParams(jSONObject);
                return recmdGatewayMsg;
            } catch (Throwable th) {
                e.a("gateway2.msg", th, "generateGatewayMsg failed");
            }
        }
        return null;
    }
}
