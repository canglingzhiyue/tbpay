package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes5.dex */
public class OpenSkuImplementor$1 extends JSONObject {
    public final /* synthetic */ String val$mode;
    public final /* synthetic */ String val$silentAction;

    public OpenSkuImplementor$1(String str, String str2) {
        this.val$mode = str;
        this.val$silentAction = str2;
        put("type", "openSKU");
        put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor$1.1
            {
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor.1.1.1
                    {
                        put("skuBottomMode", (Object) OpenSkuImplementor$1.this.val$mode);
                        put("silentAction", (Object) OpenSkuImplementor$1.this.val$silentAction);
                    }
                });
            }
        });
    }
}
