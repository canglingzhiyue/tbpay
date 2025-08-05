package com.taobao.android.detail.datasdk.model.datamodel.sku;

import com.taobao.android.detail.datasdk.model.datamodel.sku.BaseSkuInputComponent;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class SkuRadioBoxData extends BaseSkuInputComponent {
    public ArrayList<BaseSkuInputComponent.Element> elements;

    static {
        kge.a(-2069818203);
    }

    public SkuRadioBoxData() {
        this.type = 2;
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.SkuRadioBoxData");
    }
}
