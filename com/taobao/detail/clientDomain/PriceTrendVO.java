package com.taobao.detail.clientDomain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PriceTrendVO implements Serializable {
    public int buyerAmount;
    public List<BRatioVO> buyerRatios;
    public int saleAmount;
    public Map<String, List<DatePrice>> skuDatePricesMap;
    public List<RatioVO> skuRatios;
    public int tmallbuyerAmount;

    /* loaded from: classes7.dex */
    public static class DatePrice implements Serializable {
        public String date;
        public int dateIndex;
        public String price;
        public String sales;
        public long skuId;

        static {
            kge.a(1868687161);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(162863938);
        kge.a(1028243835);
    }

    /* loaded from: classes7.dex */
    public static class RatioVO implements Serializable, Comparable<RatioVO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int amount = 0;
        public int level;
        public String txt;

        static {
            kge.a(798106754);
            kge.a(1028243835);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public int compareTo(RatioVO ratioVO) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64639d0b", new Object[]{this, ratioVO})).intValue() : ratioVO.getAmount() - this.amount;
        }

        public int getAmount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9940a0c8", new Object[]{this})).intValue() : this.amount;
        }
    }

    /* loaded from: classes7.dex */
    public static class BRatioVO implements Serializable, Comparable<BRatioVO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int amount = 0;
        public int buyAmount = 0;
        public int level;

        static {
            kge.a(189708420);
            kge.a(1028243835);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public int compareTo(BRatioVO bRatioVO) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecbfa7e5", new Object[]{this, bRatioVO})).intValue() : bRatioVO.getLevel() - this.level;
        }

        public int getLevel() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ca32f48", new Object[]{this})).intValue() : this.level;
        }
    }
}
