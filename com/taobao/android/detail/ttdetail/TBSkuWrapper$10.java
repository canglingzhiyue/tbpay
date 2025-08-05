package com.taobao.android.detail.ttdetail;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import tb.xiz;

/* loaded from: classes4.dex */
public class TBSkuWrapper$10 extends JSONObject {
    public final /* synthetic */ c this$0;
    public final /* synthetic */ String val$bottomMode;
    public final /* synthetic */ boolean val$isDonate;
    public final /* synthetic */ String val$skuId;

    public TBSkuWrapper$10(c cVar, String str, boolean z, String str2) {
        this.this$0 = cVar;
        this.val$bottomMode = str;
        this.val$isDonate = z;
        this.val$skuId = str2;
        c cVar2 = this.this$0;
        String str3 = this.val$bottomMode;
        boolean z2 = this.val$isDonate;
        putAll(c.$ipChange);
        if (!TextUtils.isEmpty(this.val$skuId)) {
            put("id_biz_property", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$10.1
                {
                    put("skuId", (Object) TBSkuWrapper$10.this.val$skuId);
                }
            });
        }
        put("storedData", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$10.2
            {
                put("transparent_map", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper.10.2.1
                    {
                        c cVar3 = TBSkuWrapper$10.this.this$0;
                        put("addCartSource", (Object) c.$ipChange.a());
                    }
                });
            }
        });
        c cVar3 = this.this$0;
        String str4 = c.$ipChange;
        if (!TextUtils.isEmpty(str4)) {
            put("quantity", (Object) str4);
        }
        put(xiz.NAME, new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$10.3
            {
                c cVar4 = TBSkuWrapper$10.this.this$0;
                put("UniqueId", (Object) c.$ipChange);
                put("SKULayerId", (Object) String.valueOf(c.i(TBSkuWrapper$10.this.this$0)));
            }
        });
    }
}
