package com.taobao.android.detail.datasdk.event.params;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.emv;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9948a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public int g;
    public double h;
    public Map<String, String> i;

    static {
        kge.a(-749640561);
    }

    public a(SkuPageModel.SkuTradeVO skuTradeVO, Map<String, String> map) {
        this.f9948a = skuTradeVO.skuId;
        this.b = skuTradeVO.itemId;
        this.c = skuTradeVO.buyNum;
        this.d = skuTradeVO.unitBuy;
        this.e = skuTradeVO.serviceId;
        this.f = skuTradeVO.areaId;
        this.g = skuTradeVO.installmentPlan;
        this.h = skuTradeVO.installmentRate;
        this.i = map;
        a();
        emu.a("com.taobao.android.detail.datasdk.event.params.BaseTradeParams");
    }

    public a(C0382a c0382a) {
        this.f9948a = c0382a.f9949a;
        this.b = c0382a.b;
        this.c = c0382a.c;
        this.d = c0382a.d;
        this.e = c0382a.e;
        this.f = c0382a.f;
        this.g = c0382a.g;
        this.h = c0382a.h;
        this.i = c0382a.i;
        a();
        emu.a("com.taobao.android.detail.datasdk.event.params.BaseTradeParams");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        if (this.g <= 0) {
            return;
        }
        this.i.put("installmentPay", "true");
        Map<String, String> map = this.i;
        map.put("installmentNum", "" + this.g);
        Map<String, String> map2 = this.i;
        String str = emv.f27447a;
        map2.put(str, "" + this.h);
    }

    /* renamed from: com.taobao.android.detail.datasdk.event.params.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0382a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9949a;
        public String b;
        public long c;
        public long d;
        public String e;
        public String f;
        public int g;
        public double h;
        public Map<String, String> i;

        static {
            kge.a(-1936835482);
        }

        public C0382a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0382a) ipChange.ipc$dispatch("9ed3f77f", new Object[]{this, str});
            }
            this.f9949a = str;
            return this;
        }

        public C0382a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0382a) ipChange.ipc$dispatch("b944f09e", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0382a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0382a) ipChange.ipc$dispatch("913c2015", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public C0382a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0382a) ipChange.ipc$dispatch("b4f9c7b4", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("68f9f366", new Object[]{this}) : new a(this);
        }
    }
}
