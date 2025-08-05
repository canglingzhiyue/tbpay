package com.taobao.infoflow.protocol.subservice.base;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.Map;

/* loaded from: classes.dex */
public interface IJsBridgeService extends ISubService {
    public static final String SERVICE_NAME = "JsBridgeService";

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: com.taobao.infoflow.protocol.subservice.base.IJsBridgeService$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public interface InterfaceC0670a {
            void a(String str);

            void a(Map<String, Object> map);
        }

        String a();

        void a(JSONObject jSONObject, InterfaceC0670a interfaceC0670a);
    }

    void registerJsNativeFeature(a aVar);

    void unRegisterJsNativeFeature(a aVar);
}
