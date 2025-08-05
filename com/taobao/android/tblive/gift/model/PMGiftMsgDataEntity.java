package com.taobao.android.tblive.gift.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class PMGiftMsgDataEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GiftInfoDataEntity giftEffectInfo;

    static {
        kge.a(618667038);
        kge.a(1028243835);
    }

    public GiftInfoDataEntity getGiftEffectInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GiftInfoDataEntity) ipChange.ipc$dispatch("2393262f", new Object[]{this}) : this.giftEffectInfo;
    }

    public void setGiftEffectInfo(GiftInfoDataEntity giftInfoDataEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d3acdb", new Object[]{this, giftInfoDataEntity});
        } else {
            this.giftEffectInfo = giftInfoDataEntity;
        }
    }
}
