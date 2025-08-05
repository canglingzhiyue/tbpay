package com.taobao.tao.detail.uimodel;

import com.taobao.detail.domain.base.TipDO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ItemPriceVO implements Serializable {
    public static final int COMMON = 2;
    public static final int DEL = 3;
    public static final int HIGH_LIGHT = 1;
    public int displayType = 3;
    public String name;
    public String price;
    public Map<String, String> priceCss;
    public String promoName;
    public List<TipDO> tips;
    public List<TipDO> tips2;

    static {
        kge.a(1825410007);
        kge.a(1028243835);
    }

    public ItemPriceVO() {
        tpc.a("com.taobao.tao.detail.uimodel.ItemPriceVO");
    }
}
