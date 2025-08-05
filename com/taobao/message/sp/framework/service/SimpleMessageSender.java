package com.taobao.message.sp.framework.service;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleMessageSender;", "", "()V", "buildImageMessageBody", "", "buildTextMessageBody", "", "text", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleMessageSender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleMessageSender INSTANCE;

    public final void buildImageMessageBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c834cf03", new Object[]{this});
        }
    }

    static {
        kge.a(65302664);
        INSTANCE = new SimpleMessageSender();
    }

    private SimpleMessageSender() {
    }

    public final String buildTextMessageBody(String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d1bbe1", new Object[]{this, text});
        }
        q.c(text, "text");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "text", text);
        JSONObject jSONObject3 = jSONObject;
        jSONObject3.put((JSONObject) "templateId", "101");
        jSONObject3.put((JSONObject) "templateData", (String) jSONObject2);
        String jSONString = jSONObject.toJSONString();
        q.a((Object) jSONString, "body.toJSONString()");
        return jSONString;
    }
}
