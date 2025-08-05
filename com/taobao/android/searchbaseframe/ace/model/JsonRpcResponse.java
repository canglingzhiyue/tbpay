package com.taobao.android.searchbaseframe.ace.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class JsonRpcResponse implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private String jsonrpc;
    private JSONObject result;

    static {
        kge.a(933520510);
        kge.a(479390342);
    }

    public String getJsonrpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c735a192", new Object[]{this}) : this.jsonrpc;
    }

    public void setJsonrpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2682198c", new Object[]{this, str});
        } else {
            this.jsonrpc = str;
        }
    }

    @Override // com.taobao.android.searchbaseframe.ace.model.b
    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public JSONObject getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ce08713a", new Object[]{this}) : this.result;
    }

    public void setResult(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7db8a", new Object[]{this, jSONObject});
        } else {
            this.result = jSONObject;
        }
    }
}
