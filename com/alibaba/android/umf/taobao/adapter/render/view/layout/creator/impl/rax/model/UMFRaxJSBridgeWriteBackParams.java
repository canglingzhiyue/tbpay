package com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRaxJSBridgeWriteBackParams implements Serializable {
    @JSONField(name = "data")
    public Map<String, UMFRaxJSBridgeWriteBackParamsData> data;

    static {
        kge.a(-864385092);
        kge.a(1028243835);
    }
}
