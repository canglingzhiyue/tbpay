package com.taobao.android.gateway.datastructure;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class GatewayActionInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String actionName;
    private JSONObject actionParam;
    private JSONObject callbackConfig;
    private a targetComponent;
    private b triggerEvent;

    static {
        kge.a(937872324);
        kge.a(1028243835);
    }

    public GatewayActionInfo(String str, a aVar, b bVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.actionName = str;
        this.targetComponent = aVar;
        this.triggerEvent = bVar;
        this.actionParam = jSONObject;
        this.callbackConfig = jSONObject2;
    }

    public void updateActionParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416f6c9b", new Object[]{this, jSONObject});
        } else {
            this.actionParam = jSONObject;
        }
    }

    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue() : (this.actionName == null || this.targetComponent == null || this.triggerEvent == null) ? false : true;
    }

    public String getActionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd957182", new Object[]{this}) : this.actionName;
    }

    public void setActionName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c024634", new Object[]{this, str});
        } else {
            this.actionName = str;
        }
    }

    public a getTargetComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6cb3856b", new Object[]{this}) : this.targetComponent;
    }

    public void setTargetComponent(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96eb47e3", new Object[]{this, aVar});
        } else {
            this.targetComponent = aVar;
        }
    }

    public b getTriggerEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f075c748", new Object[]{this}) : this.triggerEvent;
    }

    public void setTriggerEvent(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf183dc", new Object[]{this, bVar});
        } else {
            this.triggerEvent = bVar;
        }
    }

    public JSONObject getActionParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("15e629e8", new Object[]{this}) : this.actionParam;
    }

    public void setActionParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307bfa34", new Object[]{this, jSONObject});
        } else {
            this.actionParam = jSONObject;
        }
    }

    public JSONObject getCallbackConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("91be3e04", new Object[]{this}) : this.callbackConfig;
    }

    public void setCallbackConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6af400", new Object[]{this, jSONObject});
        } else {
            this.callbackConfig = jSONObject;
        }
    }
}
