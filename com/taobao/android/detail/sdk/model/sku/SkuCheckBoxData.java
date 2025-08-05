package com.taobao.android.detail.sdk.model.sku;

import com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SkuCheckBoxData extends BaseSkuInputComponent {
    public ArrayList<BaseSkuInputComponent.Element> elements;

    static {
        kge.a(-258611918);
    }

    public SkuCheckBoxData() {
        this.type = 1;
        tpc.a("com.taobao.android.detail.sdk.model.sku.SkuCheckBoxData");
    }
}
