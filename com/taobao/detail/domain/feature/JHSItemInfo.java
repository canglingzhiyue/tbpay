package com.taobao.detail.domain.feature;

import com.taobao.detail.domain.base.PriceUnit;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class JHSItemInfo implements Serializable {
    public String baseTime;
    public String btnText;
    public Boolean canBuy;
    public Boolean canCart;
    public Double discount;
    public Long endTimeMillis;
    public Boolean freePostage;
    public Boolean hasCollect;
    public Boolean isNeedJoin;
    public long itemId;
    public int limitNum;
    public String longName;
    public List<PriceUnit> priceUnits;
    public int remindCount;
    public String sellingPoints;
    public int soldCount;
    public Long startTime;
    public Long startTimeMillis;
    public String timeTip;

    static {
        kge.a(-1041662563);
        kge.a(1028243835);
    }
}
