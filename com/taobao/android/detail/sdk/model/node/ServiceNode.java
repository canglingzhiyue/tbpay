package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ServiceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<ServiceItem> allServices;
    public boolean isMultiSelect;
    public boolean isMustSelect;
    public int serviceType;
    public HashMap<String, List<ServicePrice>> sku2ServiceMap;

    /* loaded from: classes4.dex */
    public static class ServiceItem {
        public final boolean autoSelect;
        public final boolean mustSelect;
        public String name;
        public String serviceId;
        public List<SubServiceItem> subServiceItems;

        /* loaded from: classes4.dex */
        public static class SubServiceItem {
            public final boolean autoSelect;
            public String id;
            public String name;

            static {
                kge.a(-1162637864);
            }

            public SubServiceItem(JSONObject jSONObject) {
                if (jSONObject != null) {
                    this.id = c.a(jSONObject.getString("uniqueId"));
                    this.name = c.a(jSONObject.getString("name"));
                    this.autoSelect = jSONObject.getBooleanValue("autoSelect");
                    return;
                }
                throw new IllegalArgumentException();
            }
        }

        static {
            kge.a(-2080842252);
        }

        public ServiceItem(JSONObject jSONObject) {
            this.serviceId = jSONObject.getString("serviceId");
            this.autoSelect = jSONObject.getBooleanValue("autoSelect");
            this.mustSelect = jSONObject.getBooleanValue("mustSelect");
            this.name = c.a(jSONObject.getString("name"));
            this.subServiceItems = c.a(jSONObject.getJSONArray("uniqueServices"), new g<SubServiceItem>() { // from class: com.taobao.android.detail.sdk.model.node.ServiceNode.ServiceItem.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ServiceNode$ServiceItem$SubServiceItem] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ SubServiceItem b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public SubServiceItem a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SubServiceItem) ipChange.ipc$dispatch("136cbb9d", new Object[]{this, obj}) : new SubServiceItem((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class ServicePrice {
        public String extraDisplayText;
        public double price;
        public String serviceId;
        public ArrayList<SubServicePrice> subServicePrices;

        /* loaded from: classes4.dex */
        public static class SubServicePrice {
            public String extraDisplayText;
            public double price;
            public String uniqueId;

            static {
                kge.a(-1664607304);
            }

            public SubServicePrice(JSONObject jSONObject) {
                this.uniqueId = c.a(jSONObject.getString("uniqueId"));
                this.extraDisplayText = c.a(jSONObject.getString("extraDisplayText"));
                this.price = jSONObject.getDoubleValue("price");
            }
        }

        static {
            kge.a(-75191672);
        }

        public ServicePrice(JSONObject jSONObject) {
            this.serviceId = c.a(jSONObject.getString("serviceId"));
            this.extraDisplayText = c.a(jSONObject.getString("extraDisplayText"));
            this.price = jSONObject.getDoubleValue("price");
            this.subServicePrices = c.a(jSONObject.getJSONArray("serviceSkuPrices"), new g<SubServicePrice>() { // from class: com.taobao.android.detail.sdk.model.node.ServiceNode.ServicePrice.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ServiceNode$ServicePrice$SubServicePrice] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ SubServicePrice b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public SubServicePrice a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SubServicePrice) ipChange.ipc$dispatch("427f433d", new Object[]{this, obj}) : new SubServicePrice((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int BUILD = 3;
        public static final int HOUSE = 2;
        public static final int THREE_C = 1;
        public static final int UNKNOWN = 0;

        static {
            kge.a(-2080509413);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
            }
            if ("3c".equals(str)) {
                return 1;
            }
            if ("house".equals(str)) {
                return 2;
            }
            return CartRecommendRefreshScene.build.equals(str) ? 3 : 0;
        }
    }

    static {
        kge.a(-1317725872);
    }

    public ServiceNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.ServiceNode");
        this.isMultiSelect = jSONObject.getBooleanValue("multiSelect");
        this.isMustSelect = jSONObject.getBooleanValue("mustSelect");
        this.serviceType = initServiceType();
        this.allServices = initAllServices();
        this.sku2ServiceMap = initSku2ServiceMap();
    }

    private int initServiceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e11d59", new Object[]{this})).intValue() : a.a(this.root.getString("serviceType"));
    }

    private ArrayList<ServiceItem> initAllServices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("5d4bf7d0", new Object[]{this}) : c.a(this.root.getJSONArray("allServices"), new g<ServiceItem>() { // from class: com.taobao.android.detail.sdk.model.node.ServiceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ServiceNode$ServiceItem, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ServiceItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ServiceItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ServiceItem) ipChange2.ipc$dispatch("27f4e5cd", new Object[]{this, obj}) : new ServiceItem((JSONObject) obj);
            }
        });
    }

    private HashMap<String, List<ServicePrice>> initSku2ServiceMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("dde84556", new Object[]{this}) : c.a(this.root.getJSONObject("sku2serviceMap"), new g<List<ServicePrice>>() { // from class: com.taobao.android.detail.sdk.model.node.ServiceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.taobao.android.detail.sdk.model.node.ServiceNode$ServicePrice>, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ List<ServicePrice> b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public List<ServicePrice> a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("18196f83", new Object[]{this, obj}) : c.a((JSONArray) obj, new g<ServicePrice>() { // from class: com.taobao.android.detail.sdk.model.node.ServiceNode.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ServiceNode$ServicePrice, java.lang.Object] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ ServicePrice b(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("eeb6464d", new Object[]{this, obj2}) : a(obj2);
                    }

                    public ServicePrice a(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (ServicePrice) ipChange3.ipc$dispatch("e27f426d", new Object[]{this, obj2}) : new ServicePrice((JSONObject) obj2);
                    }
                });
            }
        });
    }
}
