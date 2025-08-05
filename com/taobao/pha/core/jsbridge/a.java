package com.taobao.pha.core.jsbridge;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.c;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.taobao.pha.core.jsbridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0751a {
        void a(JSONObject jSONObject);

        void a(PHAErrorType pHAErrorType, String str);
    }

    void a(AppController appController, c.a aVar, String str, String str2, JSONArray jSONArray, InterfaceC0751a interfaceC0751a);

    void a(AppController appController, c.a aVar, String str, String str2, JSONObject jSONObject, InterfaceC0751a interfaceC0751a);
}
