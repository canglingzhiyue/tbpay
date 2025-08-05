package com.taobao.tao.detail.uimodel;

import com.taobao.detail.domain.base.ActionUnit;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class SellerVO implements Serializable {
    public String bailAmount;
    public String certify;
    public List<ActionUnit> counts;
    public String distance;
    public EvaluateItemVO[] evaluateInfo;
    @Deprecated
    public String fansCount;
    public String fansCountText;
    public String goldSellerLogo;
    public String goodRatePercentage;
    public String headUrl;
    public String hideWangwang;
    public String itemId;
    public int level;
    @Deprecated
    public String location;
    public String logo;
    @Deprecated
    public String mobile;
    public String nick;
    public String o2oMapUrl;
    @Deprecated
    public String phone;
    public String shopBrand;
    public String shopId;
    public String shopLocation;
    public String shopTitle;
    public String shopType;
    public String type;
    public String userNumId;
    public String userRegDate;
    public boolean visuable = true;

    static {
        kge.a(370215632);
        kge.a(1028243835);
    }

    public SellerVO() {
        tpc.a("com.taobao.tao.detail.uimodel.SellerVO");
    }
}
