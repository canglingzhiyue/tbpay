package com.taobao.android.detail.core.request.coupon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponInfoListParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String from;
    private String itemId;
    private String sellerId;
    private String sellerType;
    private String ttid;

    static {
        kge.a(291244572);
        kge.a(-1214933880);
    }

    public CouponInfoListParams() {
        emu.a("com.taobao.android.detail.core.request.coupon.CouponInfoListParams");
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
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

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
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

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
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
        hashMap.put("itemId", this.itemId);
        hashMap.put("sellerId", this.sellerId);
        hashMap.put("from", "detail");
        String str = this.from;
        if (str != null && !"".equals(str)) {
            hashMap.put("from", this.from);
        }
        String str2 = this.sellerType;
        if (str2 != null && !"".equals(str2)) {
            hashMap.put("sellerType", this.sellerType);
        }
        return hashMap;
    }
}
