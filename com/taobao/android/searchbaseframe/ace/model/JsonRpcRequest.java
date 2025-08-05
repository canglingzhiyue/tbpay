package com.taobao.android.searchbaseframe.ace.model;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.UUID;
import tb.kge;

/* loaded from: classes6.dex */
public class JsonRpcRequest implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String id;
    private final String jsonrpc = "2.0";
    private String method;
    private JSON params;

    static {
        kge.a(1552426674);
        kge.a(1028243835);
        kge.a(1814871978);
    }

    public String getJsonrpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c735a192", new Object[]{this}) : "2.0";
    }

    @Override // com.taobao.android.searchbaseframe.ace.model.a
    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    @Override // com.taobao.android.searchbaseframe.ace.model.a
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

    public JSON getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSON) ipChange.ipc$dispatch("5cf85ee2", new Object[]{this}) : this.params;
    }

    public void setParams(JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47683180", new Object[]{this, json});
        } else {
            this.params = json;
        }
    }

    public static JsonRpcRequest obtainRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("3c551d7a", new Object[]{str});
        }
        JsonRpcRequest jsonRpcRequest = new JsonRpcRequest();
        jsonRpcRequest.setId(UUID.randomUUID().toString());
        jsonRpcRequest.setMethod(str);
        return jsonRpcRequest;
    }

    public static JsonRpcRequest obtainMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("f10dfcf2", new Object[]{str});
        }
        JsonRpcRequest jsonRpcRequest = new JsonRpcRequest();
        jsonRpcRequest.setMethod(str);
        return jsonRpcRequest;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : JSON.toJSONString(this);
    }
}
