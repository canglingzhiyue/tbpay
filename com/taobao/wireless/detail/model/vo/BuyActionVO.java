package com.taobao.wireless.detail.model.vo;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;
import tb.rjq;

/* loaded from: classes9.dex */
public class BuyActionVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String buyUrl;
    public BaseControl controlVO;
    public String itemId;
    public Map<String, String> options;
    public String skuId;
    public boolean useV3Trade = false;

    static {
        kge.a(275294725);
        kge.a(1028243835);
    }

    public boolean isH5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dca554a2", new Object[]{this})).booleanValue() : !rjq.a(this.buyUrl);
    }

    public boolean isCartSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b7fef10", new Object[]{this})).booleanValue() : this.controlVO.cartSupport;
    }

    public boolean isBuySupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b76b063e", new Object[]{this})).booleanValue() : this.controlVO.buySupport;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : rjq.a(this.controlVO.msgTip) ? "暂不支持" : this.controlVO.msgTip;
    }
}
