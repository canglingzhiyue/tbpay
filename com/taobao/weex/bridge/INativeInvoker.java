package com.taobao.weex.bridge;

import com.alibaba.fastjson.JSONArray;

/* loaded from: classes9.dex */
public interface INativeInvoker {
    Object invoke(Object obj, Invoker invoker, JSONArray jSONArray) throws Exception;

    void setDispatchCallback(Boolean bool);
}
