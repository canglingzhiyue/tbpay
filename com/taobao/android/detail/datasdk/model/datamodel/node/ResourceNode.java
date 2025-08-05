package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.eby;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class ResourceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String MAP_KEY_CHIMA = null;
    public static String MAP_KEY_ENDORSEMENT = null;
    public static String MAP_KEY_THREED = null;
    public static String MAP_KEY_TIMETUNNEL = null;
    public static final String TAG = "resource";
    public CouponNode couponNode;
    public HashMap<String, b> entrances;
    public String fmcgRecommendAppId;
    public a newBigPromotion;
    public List<f> relatedProductionList;
    public String relatedProductionTitle;
    public h salePromotion;
    public i share;
    public ArrayList<j> shopPromotions;
    public ArrayList<g> shopResources;
    public k sizeChart;
    public TmallFeatureNode tmallFeatureNode;
    public l wangWang;
    public Object yingkebao;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10000a;
        public String b;
        public String c;
        public Long d;
        public Long e;
        public String f;
        public String g;
        public String h;

        static {
            kge.a(1610033738);
        }

        public a(JSONObject jSONObject) {
            this.f10000a = epw.a(jSONObject.getString("textColor"));
            this.b = epw.a(jSONObject.getString("bgIcon"));
            this.c = epw.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
            this.f = epw.a(jSONObject.getString("memo"));
            this.g = epw.a(jSONObject.getString("memoColor"));
            this.d = jSONObject.getLong("startTime");
            this.e = jSONObject.getLong("endTime");
            this.h = epw.a(jSONObject.getString("logoLink"));
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10001a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        static {
            kge.a(-462708853);
        }

        public b(JSONObject jSONObject) {
            this.f10001a = epw.a(jSONObject.getString("icon"));
            this.b = epw.a(jSONObject.getString("text"));
            this.c = epw.a(jSONObject.getString("link"));
            this.d = epw.a(jSONObject.getString("linkText"));
            this.e = epw.a(jSONObject.getString("spm"));
            this.f = epw.a(jSONObject.getString("scm"));
        }
    }

    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f10002a;
        public String b;
        public String c;

        static {
            kge.a(933406378);
        }

        public c(JSONObject jSONObject) {
            this.f10002a = epw.a(jSONObject.getString("itemId"));
            this.b = epw.a(jSONObject.getString(eby.KEY_PIC_URL));
            this.c = epw.a(jSONObject.getString("title"));
        }
    }

    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f10003a;
        public ArrayList<c> b;

        static {
            kge.a(1922124139);
        }

        public d(JSONObject jSONObject) {
            this.f10003a = jSONObject.getIntValue("index");
            this.b = epw.a(jSONObject.getJSONArray("items"), new epy<c>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$c] */
                @Override // tb.epy
                public /* synthetic */ c b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public c a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b7eda659", new Object[]{this, obj}) : new c((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f10005a;
        public String b;
        public String c;

        static {
            kge.a(2083673584);
        }

        public e(JSONObject jSONObject) {
            this.f10005a = epw.a(jSONObject.getString("activityId"));
            this.b = epw.a(jSONObject.getString("resourceChannelType"));
            this.c = epw.a(jSONObject.getString("sellerId"));
        }
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10006a;
        public String b;
        public List<String> c;

        static {
            kge.a(1127164125);
        }

        public f(JSONObject jSONObject) {
            this.b = jSONObject.getString("itemId");
            this.f10006a = jSONObject.getBoolean("current").booleanValue();
            this.c = epw.a(jSONObject.getJSONArray("itemNameList"), new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.epy
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public String f10008a;
        public String b;
        public e c;

        static {
            kge.a(-1277237496);
        }

        public g(JSONObject jSONObject) {
            this.f10008a = epw.a(jSONObject.getString("linkUrl"));
            this.b = epw.a(jSONObject.getString(eby.KEY_PIC_URL));
            JSONObject jSONObject2 = jSONObject.getJSONObject("logParam");
            if (jSONObject2 != null) {
                this.c = new e(jSONObject2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public String f10009a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public ArrayList<a> i;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f10011a;
            public String b;

            static {
                kge.a(2027603561);
            }

            public a(JSONObject jSONObject) {
                this.f10011a = epw.a(jSONObject.getString("text"));
                this.b = epw.a(jSONObject.getString("textColor"));
            }
        }

        static {
            kge.a(390081077);
        }

        public h(JSONObject jSONObject) {
            this.f10009a = epw.a(jSONObject.getString("promotionId"));
            this.b = epw.a(jSONObject.getString(eby.KEY_PIC_URL));
            this.d = epw.a(jSONObject.getString("link"));
            this.c = epw.a(jSONObject.getString("bgPicUrl"));
            this.e = epw.a(jSONObject.getString("promotionType"));
            this.f = epw.a(jSONObject.getString("naviIconUrl"));
            this.g = epw.a(jSONObject.getString("navBgColor"));
            this.h = epw.a(jSONObject.getString("navBgPic"));
            this.i = epw.a(jSONObject.getJSONArray("memo"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$h$a] */
                @Override // tb.epy
                public /* synthetic */ a b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public a a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("731f6f97", new Object[]{this, obj}) : new a((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public String f10012a;
        public int b;
        public HashMap<String, String> c;
        public String d;

        static {
            kge.a(-449976584);
        }

        public i(JSONObject jSONObject) {
            this.f10012a = epw.a(jSONObject.getString("name"));
            Integer integer = jSONObject.getInteger("iconType");
            this.b = integer == null ? 1 : integer.intValue();
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null) {
                this.c = epw.a(jSONObject2, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // tb.epy
                    public /* synthetic */ String b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                    }
                });
            }
            this.d = epw.a(jSONObject.getString("iconUrl"));
        }
    }

    /* loaded from: classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public String f10014a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public ArrayList<String> g;
        public ArrayList<d> h;

        static {
            kge.a(-1963875226);
        }

        public j(JSONObject jSONObject) {
            this.f10014a = epw.a(jSONObject.getString("title"));
            this.b = epw.a(jSONObject.getString("period"));
            this.c = epw.a(jSONObject.getString("activityId"));
            this.d = epw.a(jSONObject.getString("type"));
            this.e = epw.a(jSONObject.getString("actionUrl"));
            this.f = epw.a(jSONObject.getString("iconText"));
            this.g = epw.a(jSONObject.getJSONArray("content"), new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.epy
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
            this.h = epw.a(jSONObject.getJSONArray("giftOfContent"), new epy<d>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$d] */
                @Override // tb.epy
                public /* synthetic */ d b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public d a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b7eda678", new Object[]{this, obj}) : new d((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public String f10017a;

        static {
            kge.a(-1208925450);
        }

        public k(JSONObject jSONObject) {
            this.f10017a = epw.a(jSONObject.getString("recommendTip"));
        }
    }

    static {
        kge.a(652098205);
        MAP_KEY_CHIMA = "sizeCalculator";
        MAP_KEY_THREED = "threeD";
        MAP_KEY_TIMETUNNEL = "headTimeTunnel";
        MAP_KEY_ENDORSEMENT = "endorsement";
    }

    public ResourceNode(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2;
        this.shopResources = initShopResources();
        JSONObject jSONObject3 = jSONObject.getJSONObject("entrances");
        this.entrances = initEntrances(jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("bigPromotion");
        if (jSONObject4 != null) {
            this.salePromotion = new h(jSONObject4);
        } else {
            this.salePromotion = new h(new JSONObject());
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("newBigPromotion");
        if (jSONObject5 != null && jSONObject5.size() != 0) {
            this.newBigPromotion = new a(jSONObject5);
        }
        JSONObject jSONObject6 = jSONObject.getJSONObject("share");
        if (jSONObject6 != null) {
            this.share = new i(jSONObject6);
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("wangWang");
        if (jSONObject7 != null) {
            this.wangWang = new l(jSONObject7);
        }
        this.fmcgRecommendAppId = epw.a(jSONObject.getString("fmcgRecommendAppId"));
        this.yingkebao = jSONObject.getJSONObject("yingkebao");
        JSONObject jSONObject8 = jSONObject.getJSONObject("sizeChart");
        if (jSONObject8 != null) {
            this.sizeChart = new k(jSONObject8);
        } else {
            this.sizeChart = new k(new JSONObject());
        }
        JSONObject jSONObject9 = jSONObject.getJSONObject("relatedAuctions");
        if (jSONObject9 != null) {
            initRelatedProductions(jSONObject9);
        }
        JSONObject jSONObject10 = jSONObject.getJSONObject("coupon");
        if (jSONObject10 != null) {
            try {
                this.couponNode = new CouponNode(jSONObject10);
            } catch (Throwable unused) {
                this.couponNode = new CouponNode(new JSONObject());
            }
        }
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("tmallFeature")) != null) {
            try {
                this.tmallFeatureNode = new TmallFeatureNode(jSONObject2);
            } catch (Throwable unused2) {
                this.tmallFeatureNode = new TmallFeatureNode(new JSONObject());
            }
        }
        this.shopPromotions = initShopPromotions();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode");
    }

    private ArrayList<j> initShopPromotions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b21185d7", new Object[]{this}) : epw.a(this.data.getJSONArray("shopProm"), new epy<j>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$j, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ j b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public j a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (j) ipChange2.ipc$dispatch("b7eda732", new Object[]{this, obj}) : new j((JSONObject) obj);
            }
        });
    }

    private ArrayList<g> initShopResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4a132e80", new Object[]{this}) : epw.a(this.data.getJSONArray("shopResource"), new epy<g>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$g, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ g b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public g a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (g) ipChange2.ipc$dispatch("b7eda6d5", new Object[]{this, obj}) : new g((JSONObject) obj);
            }
        });
    }

    private HashMap<String, b> initEntrances(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3c528c7f", new Object[]{this, jSONObject}) : epw.a(jSONObject, new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$b, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ b b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("b7eda63a", new Object[]{this, obj}) : new b((JSONObject) obj);
            }
        });
    }

    private List<f> initRelatedProductions(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e4d0293d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        this.relatedProductionTitle = jSONObject.getString("title");
        if (jSONArray == null) {
            return null;
        }
        this.relatedProductionList = epw.a(jSONArray, new epy<f>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$f, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ f b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public f a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (f) ipChange2.ipc$dispatch("b7eda6b6", new Object[]{this, obj}) : new f((JSONObject) obj);
            }
        });
        return null;
    }

    /* loaded from: classes4.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public HashMap<String, String> f10018a;

        static {
            kge.a(460932333);
        }

        public l() {
            this.f10018a = new HashMap<>();
        }

        public l(JSONObject jSONObject) {
            try {
                this.f10018a = (HashMap) JSONObject.parseObject(jSONObject.getJSONObject("params").toJSONString(), new TypeReference<HashMap<String, String>>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode.l.1
                }, new Feature[0]);
            } catch (Exception e) {
                e.printStackTrace();
                this.f10018a = new HashMap<>();
            }
        }
    }
}
