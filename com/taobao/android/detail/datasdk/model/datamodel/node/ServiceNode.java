package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class ServiceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "services";
    public ArrayList<a> allServices;
    public boolean isMultiSelect;
    public boolean isMustSelect;
    public int serviceType;
    public HashMap<String, List<b>> sku2ServiceMap;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f10028a;
        public final boolean b;
        public String c;
        public String d;
        public List<C0386a> e;

        /* renamed from: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0386a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f10030a;
            public String b;
            public String c;

            static {
                kge.a(119382430);
            }

            public C0386a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    this.b = epw.a(jSONObject.getString("uniqueId"));
                    this.c = epw.a(jSONObject.getString("name"));
                    this.f10030a = jSONObject.getBooleanValue("autoSelect");
                    return;
                }
                throw new IllegalArgumentException();
            }
        }

        static {
            kge.a(220100334);
        }

        public a(JSONObject jSONObject) {
            this.c = jSONObject.getString("serviceId");
            this.f10028a = jSONObject.getBooleanValue("autoSelect");
            this.b = jSONObject.getBooleanValue("mustSelect");
            this.d = epw.a(jSONObject.getString("name"));
            this.e = epw.a(jSONObject.getJSONArray("uniqueServices"), new epy<C0386a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$a$a, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ C0386a b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public C0386a a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (C0386a) ipChange.ipc$dispatch("682106bd", new Object[]{this, obj}) : new C0386a((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10031a;
        public String b;
        public double c;
        public ArrayList<a> d;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f10033a;
            public String b;
            public double c;

            static {
                kge.a(1996248574);
            }

            public a(JSONObject jSONObject) {
                this.f10033a = epw.a(jSONObject.getString("uniqueId"));
                this.b = epw.a(jSONObject.getString("extraDisplayText"));
                this.c = jSONObject.getDoubleValue("price");
            }
        }

        static {
            kge.a(-1760415538);
        }

        public b(JSONObject jSONObject) {
            this.f10031a = epw.a(jSONObject.getString("serviceId"));
            this.b = epw.a(jSONObject.getString("extraDisplayText"));
            this.c = jSONObject.getDoubleValue("price");
            this.d = epw.a(jSONObject.getJSONArray("serviceSkuPrices"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$b$a, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ a b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public a a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("68217b1c", new Object[]{this, obj}) : new a((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int BUILD = 3;
        public static final int HOUSE = 2;
        public static final int THREE_C = 1;
        public static final int UNKNOWN = 0;

        static {
            kge.a(220433173);
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
        kge.a(-1756571318);
    }

    public ServiceNode(JSONObject jSONObject) {
        super(jSONObject);
        this.isMultiSelect = jSONObject.getBooleanValue("multiSelect");
        this.isMustSelect = jSONObject.getBooleanValue("mustSelect");
        this.serviceType = initServiceType();
        this.allServices = initAllServices();
        this.sku2ServiceMap = initSku2ServiceMap();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode");
    }

    private int initServiceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e11d59", new Object[]{this})).intValue() : c.a(this.data.getString("serviceType"));
    }

    private ArrayList<a> initAllServices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("5d4bf7d0", new Object[]{this}) : epw.a(this.data.getJSONArray("allServices"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("b296cf9a", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }

    private HashMap<String, List<b>> initSku2ServiceMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("dde84556", new Object[]{this}) : epw.a(this.data.getJSONObject("sku2serviceMap"), new epy<List<b>>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$b>, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ List<b> b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public List<b> a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("18196f83", new Object[]{this, obj}) : epw.a((JSONArray) obj, new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode$b, java.lang.Object] */
                    @Override // tb.epy
                    public /* synthetic */ b b(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("eeb6464d", new Object[]{this, obj2}) : a(obj2);
                    }

                    public b a(Object obj2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (b) ipChange3.ipc$dispatch("b296cfb9", new Object[]{this, obj2}) : new b((JSONObject) obj2);
                    }
                });
            }
        });
    }
}
