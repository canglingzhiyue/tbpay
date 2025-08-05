package com.taobao.android.detail.datasdk.model.datamodel.sku;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.eqg;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10056a;
    public long b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public Map<String, String> g;

    static {
        kge.a(1243534315);
    }

    public a() {
        this(null);
    }

    public a(Map<String, String> map) {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.H5SkuModel");
        this.b = 1L;
        if (eqg.a(map)) {
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
            this.f10056a = map.get("skuId");
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
        if (eqg.a(map)) {
            return;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.putAll(map);
    }
}
