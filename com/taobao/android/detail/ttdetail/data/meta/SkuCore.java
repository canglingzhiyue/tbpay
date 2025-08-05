package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

@MappingKey(key = SkuCoreNode.TAG)
/* loaded from: classes4.dex */
public class SkuCore extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean isNoSkuId;
    private final b skuItem;
    private final Map<String, c> zeroSku2info;

    static {
        kge.a(-1878331708);
    }

    public SkuCore(JSONObject jSONObject) {
        super(jSONObject);
        this.skuItem = b.a(jSONObject.getJSONObject("skuItem"));
        this.zeroSku2info = initSku2Info(jSONObject);
        this.isNoSkuId = isNoSkuId(jSONObject, this.zeroSku2info);
    }

    private Map<String, c> initSku2Info(JSONObject jSONObject) {
        final c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b64acab", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sku2info");
        if (jSONObject2 != null && (a2 = c.a(jSONObject2.getJSONObject("0"))) != null) {
            return new HashMap<String, c>() { // from class: com.taobao.android.detail.ttdetail.data.meta.SkuCore.1
                {
                    put("0", a2);
                }
            };
        }
        return null;
    }

    private boolean isNoSkuId(JSONObject jSONObject, Map<String, c> map) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("451daded", new Object[]{this, jSONObject, map})).booleanValue() : (map == null || (jSONObject2 = jSONObject.getJSONObject("sku2info")) == null || jSONObject2.size() != 1) ? false : true;
    }

    public b getSkuItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a0b21702", new Object[]{this}) : this.skuItem;
    }

    public boolean isNoSkuId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bec0c358", new Object[]{this})).booleanValue() : this.isNoSkuId;
    }

    public Map<String, c> getZeroSku2info() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bb466e5d", new Object[]{this}) : this.zeroSku2info;
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10632a;
        private final String b;
        private final String c;
        private final boolean d;
        private final a e;
        private final a f;
        private final String g;

        static {
            kge.a(-1994676272);
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7176cbb", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject);
        }

        private b(JSONObject jSONObject) {
            this.f10632a = jSONObject.getString("skuH5Url");
            this.b = jSONObject.getString("skuWeexUrl");
            this.g = jSONObject.getString("skuV3WeexUrl");
            this.c = jSONObject.getString("skuId");
            this.d = jSONObject.getBooleanValue("showAddressTaobao");
            this.e = a.a(jSONObject.getJSONObject("skuClientCache"));
            this.f = a.a(jSONObject.getJSONObject("skuV3ClientCache"));
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10632a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
        }

        public a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2847e1d9", new Object[]{this}) : this.e;
        }

        public a e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2e4bad38", new Object[]{this}) : this.f;
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10631a;
        private final String b;

        static {
            kge.a(-1711531419);
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7176c9c", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new a(jSONObject);
        }

        private a(JSONObject jSONObject) {
            this.f10631a = jSONObject.getString("cacheName");
            this.b = jSONObject.getString("cacheUrl");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10631a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10633a;
        private final String b;

        static {
            kge.a(-679362460);
        }

        public static c a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("7176cda", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new c(jSONObject);
        }

        public c(JSONObject jSONObject) {
            this.f10633a = jSONObject.getString("asac");
            this.b = jSONObject.getString("itemApplyParams");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10633a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }
}
