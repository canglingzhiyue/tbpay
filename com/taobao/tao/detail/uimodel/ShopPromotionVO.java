package com.taobao.tao.detail.uimodel;

import com.taobao.detail.domain.component.BaseComponent;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ShopPromotionVO implements Serializable {
    public List<BaseComponent> components;
    @Deprecated
    public List<String> descriptions;
    @Deprecated
    public String title;

    static {
        kge.a(327039598);
        kge.a(1028243835);
    }

    public ShopPromotionVO() {
        tpc.a("com.taobao.tao.detail.uimodel.ShopPromotionVO");
    }
}
