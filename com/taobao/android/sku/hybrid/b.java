package com.taobao.android.sku.hybrid;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15179a;
    public long b;
    public String c;
    public Map<String, String> d;
    public String e;

    static {
        kge.a(1852934047);
    }

    public b() {
        this(null);
    }

    public b(Map<String, String> map) {
        this.b = 1L;
        this.d = new HashMap();
        if (!b(map)) {
            a(map);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f15179a = null;
        this.b = 1L;
        this.c = null;
        this.d.clear();
        this.e = null;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map.containsKey("skuId")) {
            this.f15179a = map.get("skuId");
            map.remove("skuId");
        }
        if (map.containsKey("quantity")) {
            try {
                this.b = Long.parseLong(map.get("quantity"));
            } catch (Throwable unused) {
                this.b = 1L;
            }
            map.remove("quantity");
        }
        if (map.containsKey("skuViewText")) {
            this.e = map.get("skuViewText");
            map.remove("skuViewText");
        }
        if (map.containsKey("serviceId")) {
            this.c = map.get("serviceId");
        }
        if (b(map)) {
            return;
        }
        this.d.putAll(map);
    }

    private boolean b(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue() : map == null || map.isEmpty();
    }
}
