package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.eby;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ResourceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String MAP_KEY_CHIMA;
    public static String MAP_KEY_ENDORSEMENT;
    public static String MAP_KEY_THREED;
    public static String MAP_KEY_TIMETUNNEL;
    public CouponNode couponNode;
    public HashMap<String, Entry> entrances;
    public String fmcgRecommendAppId;
    public BigPromotion newBigPromotion;
    public List<RelatedProduction> relatedProductionList;
    public String relatedProductionTitle;
    public SalePromotion salePromotion;
    public Share share;
    public ArrayList<ShopPromotion> shopPromotions;
    public ArrayList<ResourceItem> shopResources;
    public SizeChart sizeChart;
    public TmallFeatureNode tmallFeatureNode;
    public WangWang wangWang;
    public Object yingkebao;

    /* loaded from: classes4.dex */
    public static class BigPromotion {
        public String bgIcon;
        public Long endTime;
        public String logo;
        public String logoLink;
        public String memo;
        public String memoColor;
        public Long startTime;
        public String textColor;

        static {
            kge.a(-1982601264);
        }

        public BigPromotion(JSONObject jSONObject) {
            this.textColor = c.a(jSONObject.getString("textColor"));
            this.bgIcon = c.a(jSONObject.getString("bgIcon"));
            this.logo = c.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO));
            this.memo = c.a(jSONObject.getString("memo"));
            this.memoColor = c.a(jSONObject.getString("memoColor"));
            this.startTime = jSONObject.getLong("startTime");
            this.endTime = jSONObject.getLong("endTime");
            this.logoLink = c.a(jSONObject.getString("logoLink"));
        }
    }

    /* loaded from: classes4.dex */
    public static class Entry {
        public String icon;
        public String link;
        public String linkText;
        public String scm;
        public String spm;
        public String text;

        static {
            kge.a(1203924165);
        }

        public Entry(JSONObject jSONObject) {
            this.icon = c.a(jSONObject.getString("icon"));
            this.text = c.a(jSONObject.getString("text"));
            this.link = c.a(jSONObject.getString("link"));
            this.linkText = c.a(jSONObject.getString("linkText"));
            this.spm = c.a(jSONObject.getString("spm"));
            this.scm = c.a(jSONObject.getString("scm"));
        }
    }

    /* loaded from: classes4.dex */
    public static class GiftItem {
        public String itemId;
        public String picUrl;
        public String title;

        static {
            kge.a(1775703856);
        }

        public GiftItem(JSONObject jSONObject) {
            this.itemId = c.a(jSONObject.getString("itemId"));
            this.picUrl = c.a(jSONObject.getString(eby.KEY_PIC_URL));
            this.title = c.a(jSONObject.getString("title"));
        }
    }

    /* loaded from: classes4.dex */
    public static class GiftOfContent {
        public int index;
        public ArrayList<GiftItem> items;

        static {
            kge.a(-2075378523);
        }

        public GiftOfContent(JSONObject jSONObject) {
            this.index = jSONObject.getIntValue("index");
            this.items = c.a(jSONObject.getJSONArray("items"), new g<GiftItem>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.GiftOfContent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ResourceNode$GiftItem] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ GiftItem b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public GiftItem a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (GiftItem) ipChange.ipc$dispatch("6e875d91", new Object[]{this, obj}) : new GiftItem((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class LogParam {
        public String activityId;
        public String resourceChannelType;
        public String sellerId;

        static {
            kge.a(-1368996234);
        }

        public LogParam(JSONObject jSONObject) {
            this.activityId = c.a(jSONObject.getString("activityId"));
            this.resourceChannelType = c.a(jSONObject.getString("resourceChannelType"));
            this.sellerId = c.a(jSONObject.getString("sellerId"));
        }
    }

    /* loaded from: classes4.dex */
    public static class RelatedProduction {
        public boolean current;
        public String itemId;
        public List<String> itemNameList;
        public String price;

        static {
            kge.a(1265233687);
        }

        public RelatedProduction(JSONObject jSONObject) {
            this.itemId = jSONObject.getString("itemId");
            this.current = jSONObject.getBoolean("current").booleanValue();
            this.itemNameList = c.a(jSONObject.getJSONArray("itemNameList"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.RelatedProduction.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.sdk.utils.g
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
    public static class ResourceItem {
        public String linkUrl;
        public LogParam logParam;
        public String picUrl;

        static {
            kge.a(-574905202);
        }

        public ResourceItem(JSONObject jSONObject) {
            this.linkUrl = c.a(jSONObject.getString("linkUrl"));
            this.picUrl = c.a(jSONObject.getString(eby.KEY_PIC_URL));
            JSONObject jSONObject2 = jSONObject.getJSONObject("logParam");
            if (jSONObject2 != null) {
                this.logParam = new LogParam(jSONObject2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class SalePromotion {
        public String bgPicUrl;
        public String logo;
        public ArrayList<Memo> memoList;
        public String navBgColor;
        public String navBgPic;
        public String naviIconUrl;
        public String promotionId;
        public String promotionType;
        public String url;

        /* loaded from: classes4.dex */
        public static class Memo {
            public String text;
            public String textColor;

            static {
                kge.a(2012792687);
            }

            public Memo(JSONObject jSONObject) {
                this.text = c.a(jSONObject.getString("text"));
                this.textColor = c.a(jSONObject.getString("textColor"));
            }
        }

        static {
            kge.a(687545711);
        }

        public SalePromotion(JSONObject jSONObject) {
            this.promotionId = c.a(jSONObject.getString("promotionId"));
            this.logo = c.a(jSONObject.getString(eby.KEY_PIC_URL));
            this.url = c.a(jSONObject.getString("link"));
            this.bgPicUrl = c.a(jSONObject.getString("bgPicUrl"));
            this.promotionType = c.a(jSONObject.getString("promotionType"));
            this.naviIconUrl = c.a(jSONObject.getString("naviIconUrl"));
            this.navBgColor = c.a(jSONObject.getString("navBgColor"));
            this.navBgPic = c.a(jSONObject.getString("navBgPic"));
            this.memoList = c.a(jSONObject.getJSONArray("memo"), new g<Memo>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.SalePromotion.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$SalePromotion$Memo, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ Memo b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public Memo a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Memo) ipChange.ipc$dispatch("91b7c5b2", new Object[]{this, obj}) : new Memo((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class Share {
        public int iconType;
        public String iconUrl;
        public String name;
        public HashMap<String, String> params;

        static {
            kge.a(1216656434);
        }

        public Share(JSONObject jSONObject) {
            this.name = c.a(jSONObject.getString("name"));
            Integer integer = jSONObject.getInteger("iconType");
            this.iconType = integer == null ? 1 : integer.intValue();
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null) {
                this.params = c.a(jSONObject2, new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.Share.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.sdk.utils.g
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
            this.iconUrl = c.a(jSONObject.getString("iconUrl"));
        }
    }

    /* loaded from: classes4.dex */
    public static class ShopPromotion {
        public String actionUrl;
        public String activityId;
        public ArrayList<String> content;
        public ArrayList<GiftOfContent> giftOfContents;
        public String iconText;
        public String period;
        public String title;
        public String type;

        static {
            kge.a(-1666410592);
        }

        public ShopPromotion(JSONObject jSONObject) {
            this.title = c.a(jSONObject.getString("title"));
            this.period = c.a(jSONObject.getString("period"));
            this.activityId = c.a(jSONObject.getString("activityId"));
            this.type = c.a(jSONObject.getString("type"));
            this.actionUrl = c.a(jSONObject.getString("actionUrl"));
            this.iconText = c.a(jSONObject.getString("iconText"));
            this.content = c.a(jSONObject.getJSONArray("content"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.ShopPromotion.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
            this.giftOfContents = c.a(jSONObject.getJSONArray("giftOfContent"), new g<GiftOfContent>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.ShopPromotion.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$GiftOfContent, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ GiftOfContent b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public GiftOfContent a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (GiftOfContent) ipChange.ipc$dispatch("d171ed70", new Object[]{this, obj}) : new GiftOfContent((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class SizeChart {
        public String recommendTip;

        static {
            kge.a(-867507408);
        }

        public SizeChart(JSONObject jSONObject) {
            this.recommendTip = c.a(jSONObject.getString("recommendTip"));
        }
    }

    static {
        kge.a(1371405143);
        MAP_KEY_CHIMA = "sizeCalculator";
        MAP_KEY_THREED = "threeD";
        MAP_KEY_TIMETUNNEL = "headTimeTunnel";
        MAP_KEY_ENDORSEMENT = "endorsement";
    }

    public ResourceNode(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2;
        tpc.a("com.taobao.android.detail.sdk.model.node.ResourceNode");
        this.shopResources = initShopResources();
        JSONObject jSONObject3 = jSONObject.getJSONObject("entrances");
        this.entrances = initEntrances(jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("bigPromotion");
        if (jSONObject4 != null) {
            this.salePromotion = new SalePromotion(jSONObject4);
        } else {
            this.salePromotion = new SalePromotion(new JSONObject());
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("newBigPromotion");
        if (jSONObject5 != null && jSONObject5.size() != 0) {
            this.newBigPromotion = new BigPromotion(jSONObject5);
        }
        JSONObject jSONObject6 = jSONObject.getJSONObject("share");
        if (jSONObject6 != null) {
            this.share = new Share(jSONObject6);
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("wangWang");
        if (jSONObject7 != null) {
            this.wangWang = new WangWang(jSONObject7);
        }
        this.fmcgRecommendAppId = c.a(jSONObject.getString("fmcgRecommendAppId"));
        this.yingkebao = jSONObject.getJSONObject("yingkebao");
        JSONObject jSONObject8 = jSONObject.getJSONObject("sizeChart");
        if (jSONObject8 != null) {
            this.sizeChart = new SizeChart(jSONObject8);
        } else {
            this.sizeChart = new SizeChart(new JSONObject());
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
    }

    private ArrayList<ShopPromotion> initShopPromotions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b21185d7", new Object[]{this}) : c.a(this.root.getJSONArray("shopProm"), new g<ShopPromotion>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$ShopPromotion, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ShopPromotion b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ShopPromotion a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ShopPromotion) ipChange2.ipc$dispatch("c51cf1d5", new Object[]{this, obj}) : new ShopPromotion((JSONObject) obj);
            }
        });
    }

    private ArrayList<ResourceItem> initShopResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4a132e80", new Object[]{this}) : c.a(this.root.getJSONArray("shopResource"), new g<ResourceItem>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ResourceNode$ResourceItem] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ResourceItem b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ResourceItem a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ResourceItem) ipChange2.ipc$dispatch("1a1dc8f3", new Object[]{this, obj}) : new ResourceItem((JSONObject) obj);
            }
        });
    }

    private HashMap<String, Entry> initEntrances(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3c528c7f", new Object[]{this, jSONObject}) : c.a(jSONObject, new g<Entry>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ResourceNode$Entry] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ Entry b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public Entry a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Entry) ipChange2.ipc$dispatch("d1f9b50", new Object[]{this, obj}) : new Entry((JSONObject) obj);
            }
        });
    }

    private List<RelatedProduction> initRelatedProductions(JSONObject jSONObject) {
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
        this.relatedProductionList = c.a(jSONArray, new g<RelatedProduction>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.ResourceNode$RelatedProduction] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ RelatedProduction b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public RelatedProduction a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RelatedProduction) ipChange2.ipc$dispatch("19e95c3e", new Object[]{this, obj}) : new RelatedProduction((JSONObject) obj);
            }
        });
        return null;
    }

    /* loaded from: classes4.dex */
    public static class WangWang {
        public HashMap<String, String> params;

        static {
            kge.a(1303229811);
        }

        public WangWang() {
            this.params = new HashMap<>();
        }

        public WangWang(JSONObject jSONObject) {
            try {
                this.params = (HashMap) JSONObject.parseObject(jSONObject.getJSONObject("params").toJSONString(), new TypeReference<HashMap<String, String>>() { // from class: com.taobao.android.detail.sdk.model.node.ResourceNode.WangWang.1
                }, new Feature[0]);
            } catch (Exception e) {
                e.printStackTrace();
                this.params = new HashMap<>();
            }
        }
    }
}
