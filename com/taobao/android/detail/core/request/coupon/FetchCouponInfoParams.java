package com.taobao.android.detail.core.request.coupon;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponInfoParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String asac;
    public String displayType;
    private String from;
    private String lotteryId;
    private String sellerId;
    private String sellerType;
    private String ttid;
    private int type;
    private String uuid;

    static {
        kge.a(447206064);
        kge.a(-1214933880);
    }

    public FetchCouponInfoParams() {
        emu.a("com.taobao.android.detail.core.request.coupon.FetchCouponInfoParams");
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
        } else {
            this.ttid = str;
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public void setAsac(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68987967", new Object[]{this, str});
        } else {
            this.asac = str;
        }
    }

    public void setSellerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708075ac", new Object[]{this, str});
        } else {
            this.sellerType = str;
        }
    }

    public void setLotteryId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c167d113", new Object[]{this, str});
        } else {
            this.lotteryId = str;
        }
    }

    public void setDisplayType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefc006b", new Object[]{this, str});
        } else {
            this.displayType = str;
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ttid", this.ttid);
        hashMap.put("uuid", this.uuid);
        hashMap.put("couponType", this.type + "");
        hashMap.put("sellerId", this.sellerId);
        if (!TextUtils.isEmpty(this.asac)) {
            hashMap.put("asac", this.asac);
        }
        if (!TextUtils.isEmpty(this.sellerType)) {
            hashMap.put("sellerType", this.sellerType);
        }
        if (!TextUtils.isEmpty(this.from)) {
            hashMap.put("from", this.from);
        }
        if (!TextUtils.isEmpty(this.lotteryId)) {
            hashMap.put("lotteryId", this.lotteryId);
        }
        if (!TextUtils.isEmpty(this.displayType)) {
            hashMap.put("displayType", this.displayType);
        }
        return hashMap;
    }
}
