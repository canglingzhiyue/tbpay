package com.taobao.android.gateway.msgcenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class Message implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String channelId;
    private JSONObject params;

    static {
        kge.a(2043177840);
        kge.a(1028243835);
    }

    public String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this}) : this.channelId;
    }

    public void setChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800868cd", new Object[]{this, str});
        } else {
            this.channelId = str;
        }
    }

    public JSONObject getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this}) : this.params;
    }

    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            this.params = jSONObject;
        }
    }
}
