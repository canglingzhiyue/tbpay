package com.taobao.android.detail.sdk.model.sku;

import com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SkuRadioBoxData extends BaseSkuInputComponent {
    public ArrayList<BaseSkuInputComponent.Element> elements;

    static {
        kge.a(1989381855);
    }

    public SkuRadioBoxData() {
        this.type = 2;
        tpc.a("com.taobao.android.detail.sdk.model.sku.SkuRadioBoxData");
    }
}
