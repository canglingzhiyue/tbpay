package com.taobao.detail.domain.feature;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class Wanrentuan implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String finalLevelPrice;
    private Long finalPayment;
    public String formatTime;
    private boolean fullPayment;
    private List<String> giftsList;
    private String groupUC;
    private String maxAmount;
    public String originalPrice;
    private Long price;
    private String purchasedAmount;
    private Long remainTime;
    private int status;
    public String totalPrice;
    private int type;
    private List<String> wrtLevelCoupons;
    private List<Integer> wrtLevelNeedCounts = new ArrayList();
    private List<Integer> wrtLevelFinalPrices = new ArrayList();

    static {
        kge.a(611182622);
        kge.a(1028243835);
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public boolean isFullPayment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c4e5af8", new Object[]{this})).booleanValue() : this.fullPayment;
    }

    public void setFullPayment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69f598", new Object[]{this, new Boolean(z)});
        } else {
            this.fullPayment = z;
        }
    }

    public Long getFinalPayment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("f53d5dc8", new Object[]{this}) : this.finalPayment;
    }

    public void setFinalPayment(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765e66f8", new Object[]{this, l});
        } else {
            this.finalPayment = l;
        }
    }

    public Long getPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("ef0f573b", new Object[]{this}) : this.price;
    }

    public void setPrice(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6ef74d", new Object[]{this, l});
        } else {
            this.price = l;
        }
    }

    public Long getRemainTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("7d6311ff", new Object[]{this}) : this.remainTime;
    }

    public void setRemainTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e30ca1", new Object[]{this, l});
        } else {
            this.remainTime = l;
        }
    }

    public String getGroupUC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bccdfa42", new Object[]{this}) : this.groupUC;
    }

    public void setGroupUC(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f4d6dc", new Object[]{this, str});
        } else {
            this.groupUC = str;
        }
    }

    public String getMaxAmount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f57a2a93", new Object[]{this}) : this.maxAmount;
    }

    public void setMaxAmount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c08e3ab", new Object[]{this, str});
        } else {
            this.maxAmount = str;
        }
    }

    public String getPurchasedAmount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1ef4894", new Object[]{this}) : this.purchasedAmount;
    }

    public void setPurchasedAmount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46219eca", new Object[]{this, str});
        } else {
            this.purchasedAmount = str;
        }
    }

    public List<Integer> getWrtLevelNeedCounts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7e03d725", new Object[]{this}) : this.wrtLevelNeedCounts;
    }

    public void setWrtLevelNeedCounts(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b327df", new Object[]{this, list});
        } else {
            this.wrtLevelNeedCounts = list;
        }
    }

    public List<Integer> getWrtLevelFinalPrices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("76f1e161", new Object[]{this}) : this.wrtLevelFinalPrices;
    }

    public void setWrtLevelFinalPrices(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac2de8b", new Object[]{this, list});
        } else {
            this.wrtLevelFinalPrices = list;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public List<String> getWrtLevelCoupons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("72ea0114", new Object[]{this}) : this.wrtLevelCoupons;
    }

    public void setWrtLevelCoupons(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ef8f38", new Object[]{this, list});
        } else {
            this.wrtLevelCoupons = list;
        }
    }

    public List<String> getGiftsList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f9243335", new Object[]{this}) : this.giftsList;
    }

    public void setGiftsList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685f4837", new Object[]{this, list});
        } else {
            this.giftsList = list;
        }
    }
}
