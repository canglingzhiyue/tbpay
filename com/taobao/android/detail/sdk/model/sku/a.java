package com.taobao.android.detail.sdk.model.sku;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ewu;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10301a;
    public long b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public Map<String, String> g;

    static {
        kge.a(457399665);
    }

    public a() {
        this(null);
        tpc.a("com.taobao.android.detail.sdk.model.sku.H5SkuModel");
    }

    public a(Map<String, String> map) {
        this.b = 1L;
        tpc.a("com.taobao.android.detail.sdk.model.sku.H5SkuModel");
        if (ewu.a(map)) {
            return;
        }
        a(map);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map.containsKey("skuId")) {
            this.f10301a = map.get("skuId");
            map.remove("skuId");
        }
        if (map.containsKey("quantity")) {
            try {
                this.b = Long.parseLong(map.get("quantity"));
            } catch (Exception unused) {
                this.b = 1L;
            }
            map.remove("quantity");
        }
        if (map.containsKey("skuViewText")) {
            this.c = map.get("skuViewText");
            map.remove("skuViewText");
        }
        if (map.containsKey("isConfirmed")) {
            try {
                this.f = Boolean.parseBoolean(map.get("isConfirmed"));
            } catch (Exception unused2) {
                this.f = false;
            }
            map.remove("isConfirmed");
        }
        if (map.containsKey("viewNames")) {
            this.d = map.get("viewNames");
            map.remove("viewNames");
        }
        if (map.containsKey("serviceId")) {
            this.e = map.get("serviceId");
        }
        if (ewu.a(map)) {
            return;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.putAll(map);
    }
}
