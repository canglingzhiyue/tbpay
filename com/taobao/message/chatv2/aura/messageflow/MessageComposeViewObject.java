package com.taobao.message.chatv2.aura.messageflow;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageComposeViewObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> data;
    public String identifier;
    public LayoutInfo info;

    static {
        kge.a(-629216683);
    }

    public static MessageComposeViewObject copy(MessageComposeViewObject messageComposeViewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageComposeViewObject) ipChange.ipc$dispatch("f992c24c", new Object[]{messageComposeViewObject});
        }
        MessageComposeViewObject messageComposeViewObject2 = new MessageComposeViewObject();
        messageComposeViewObject2.info = messageComposeViewObject.info;
        messageComposeViewObject2.data = new HashMap(messageComposeViewObject.data);
        messageComposeViewObject2.identifier = messageComposeViewObject.identifier;
        return messageComposeViewObject2;
    }

    public static JSONObject copy(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72bbc414", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject.getJSONObject("info");
        if (jSONObject4 != null) {
            jSONObject3.putAll(jSONObject4);
        }
        jSONObject2.put("info", (Object) jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = jSONObject.getJSONObject("data");
        if (jSONObject6 != null) {
            jSONObject5.putAll(jSONObject6);
        }
        jSONObject2.put("data", (Object) jSONObject5);
        jSONObject2.put("identifier", (Object) jSONObject.getString("identifier"));
        return jSONObject2;
    }
}
