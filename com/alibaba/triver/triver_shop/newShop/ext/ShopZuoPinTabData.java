package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopZuoPinTabData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int aDayCount;
    private HashMap<String, Integer> aDayShopListCounts = new HashMap<>();
    private long lastUpdateTime;

    static {
        kge.a(-1173306663);
        kge.a(1028243835);
    }

    public final long getLastUpdateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1977eedd", new Object[]{this})).longValue() : this.lastUpdateTime;
    }

    public final void setLastUpdateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cb246f", new Object[]{this, new Long(j)});
        } else {
            this.lastUpdateTime = j;
        }
    }

    public final int getADayCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1852918", new Object[]{this})).intValue() : this.aDayCount;
    }

    public final void setADayCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2716d68a", new Object[]{this, new Integer(i)});
        } else {
            this.aDayCount = i;
        }
    }

    public final HashMap<String, Integer> getADayShopListCounts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("4a357ad3", new Object[]{this}) : this.aDayShopListCounts;
    }

    public final void setADayShopListCounts(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ebeab7", new Object[]{this, hashMap});
            return;
        }
        q.d(hashMap, "<set-?>");
        this.aDayShopListCounts = hashMap;
    }
}
