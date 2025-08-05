package com.taobao.themis.open.ability.audio;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\n"}, d2 = {"notifyAttr", "", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "playerId", "", "key", "value", "", "notifyInvalidParam", "notifySuccess", "themis_open_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1303081025);
    }

    public static final void a(BridgeCallback notifySuccess, String playerId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa2229e", new Object[]{notifySuccess, playerId});
            return;
        }
        q.d(notifySuccess, "$this$notifySuccess");
        q.d(playerId, "playerId");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "audioPlayerID", playerId);
        notifySuccess.sendJSONResponse(jSONObject);
    }

    public static final void a(BridgeCallback notifyInvalidParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2b45d4", new Object[]{notifyInvalidParam});
            return;
        }
        q.d(notifyInvalidParam, "$this$notifyInvalidParam");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) false);
        jSONObject2.put((JSONObject) "errorCode", "INVALID_PARAM");
        jSONObject2.put((JSONObject) "errorMessage", "INVALID_PARAM");
        notifyInvalidParam.sendJSONResponse(jSONObject);
    }

    public static final void a(BridgeCallback notifyAttr, String playerId, String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702fa6c4", new Object[]{notifyAttr, playerId, key, value});
            return;
        }
        q.d(notifyAttr, "$this$notifyAttr");
        q.d(playerId, "playerId");
        q.d(key, "key");
        q.d(value, "value");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "audioPlayerID", playerId);
        jSONObject2.put((JSONObject) key, (String) value);
        notifyAttr.sendJSONResponse(jSONObject);
    }
}
