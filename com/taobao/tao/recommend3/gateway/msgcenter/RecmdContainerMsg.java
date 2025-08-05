package com.taobao.tao.recommend3.gateway.msgcenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.msgcenter.Message;
import tb.kge;

/* loaded from: classes8.dex */
public class RecmdContainerMsg extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1942916427);
    }

    @Override // com.taobao.android.gateway.msgcenter.Message
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this}) : "recmd.container";
    }

    private RecmdContainerMsg() {
    }

    public static RecmdContainerMsg getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecmdContainerMsg) ipChange.ipc$dispatch("b5d0b79e", new Object[0]) : new RecmdContainerMsg();
    }

    public static RecmdContainerMsg getMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdContainerMsg) ipChange.ipc$dispatch("d69fdde", new Object[]{jSONObject});
        }
        RecmdContainerMsg recmdContainerMsg = new RecmdContainerMsg();
        if (jSONObject != null) {
            recmdContainerMsg.setParams(jSONObject);
        }
        return recmdContainerMsg;
    }
}
