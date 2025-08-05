package com.taobao.detail.domain.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PriceUnit implements Serializable {
    public Integer display = 3;
    public String name;
    public String preName;
    public String prePayName;
    public String prePayPrice;
    public String price;
    public Map<String, String> priceCss;
    public String priceTitle;
    public String rangePrice;
    public Map<String, String> rangePriceCss;
    public List<TipDO> tips;
    public List<TipDO> tips2;

    static {
        kge.a(-1544042065);
        kge.a(1028243835);
    }
}
