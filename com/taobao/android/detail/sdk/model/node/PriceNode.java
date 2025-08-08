package com.taobao.android.detail.sdk.model.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class PriceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String add;
    public PriceData depositPrice;
    public ArrayList<PriceData> extraPrices;
    public long limit;
    public String limitText;
    public ArrayList<PriceData> newExtraPrices;
    public PriceData price;
    public ArrayList<PriceTag> priceTags;
    public long quantity;
    public ArrayList<ResourceNode.ShopPromotion> shopPromotions;
    public PriceData subPrice;
    public PriceData sugPromPrice;
    public PriceData transmitPrice;
    public ArrayList<PriceDescData> wholePriceDescs;

    /* loaded from: classes4.dex */
    public static class PriceDescData {
        public String color;
        public String text;

        static {
            kge.a(820506020);
        }

        public PriceDescData(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.text = jSONObject.getString("text");
                this.color = jSONObject.getString("color");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class PriceTag {
        public String bgColor;
        public String icon;
        public String text;
        public String textColor;

        static {
            kge.a(2087684657);
        }

        public PriceTag(JSONObject jSONObject) {
            this.text = c.a(jSONObject.getString("text"));
            this.bgColor = c.a(jSONObject.getString(e.KEY_BG_COLOR));
            this.icon = c.a(jSONObject.getString("icon"));
            this.textColor = c.a(jSONObject.getString("textColor"));
        }
    }

    static {
        kge.a(645661732);
    }

    public PriceNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.PriceNode");
        this.add = c.a(jSONObject.getString("add"));
        this.limitText = c.a(jSONObject.getString("limitText"));
        try {
            this.quantity = jSONObject.getLongValue("quantity");
        } catch (Exception unused) {
            this.quantity = 0L;
        }
        this.transmitPrice = new PriceData(jSONObject.getJSONObject("transmitPrice"));
        this.depositPrice = new PriceData(jSONObject.getJSONObject("depositPrice"));
        this.price = new PriceData(jSONObject.getJSONObject("price"));
        this.subPrice = new PriceData(jSONObject.getJSONObject("subPrice"));
        this.sugPromPrice = new PriceData(jSONObject.getJSONObject("sugPromPrice"));
        this.extraPrices = initExtraPrices();
        this.newExtraPrices = initPriceDatasByKey("newExtraPrices");
        this.priceTags = initPriceTags();
        this.shopPromotions = initShopPromotions();
        this.limit = initLimit();
        this.wholePriceDescs = initWholePriceDescs();
    }

    public PriceData getExtraPriceByType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriceData) ipChange.ipc$dispatch("335fc0b6", new Object[]{this, new Integer(i)});
        }
        Iterator<PriceData> it = this.extraPrices.iterator();
        while (it.hasNext()) {
            PriceData next = it.next();
            if (next.priceType == i) {
                return next;
            }
        }
        return null;
    }

    private ArrayList<PriceData> initExtraPrices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("32f0462b", new Object[]{this}) : c.a(this.root.getJSONArray("extraPrices"), new g<PriceData>() { // from class: com.taobao.android.detail.sdk.model.node.PriceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.PriceNode$PriceData, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PriceData b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceData a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PriceData) ipChange2.ipc$dispatch("53cdfeae", new Object[]{this, obj}) : new PriceData((JSONObject) obj);
            }
        });
    }

    private ArrayList<PriceData> initPriceDatasByKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f8d0dae3", new Object[]{this, str}) : c.a(this.root.getJSONArray(str), new g<PriceData>() { // from class: com.taobao.android.detail.sdk.model.node.PriceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.PriceNode$PriceData, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PriceData b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceData a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PriceData) ipChange2.ipc$dispatch("53cdfeae", new Object[]{this, obj}) : new PriceData((JSONObject) obj);
            }
        });
    }

    private ArrayList<PriceTag> initPriceTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("712902b3", new Object[]{this}) : c.a(this.root.getJSONArray("priceTag"), new g<PriceTag>() { // from class: com.taobao.android.detail.sdk.model.node.PriceNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.PriceNode$PriceTag, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PriceTag b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceTag a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PriceTag) ipChange2.ipc$dispatch("6e162b64", new Object[]{this, obj}) : new PriceTag((JSONObject) obj);
            }
        });
    }

    private ArrayList<ResourceNode.ShopPromotion> initShopPromotions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b21185d7", new Object[]{this}) : c.a(this.root.getJSONArray("shopProm"), new g<ResourceNode.ShopPromotion>() { // from class: com.taobao.android.detail.sdk.model.node.PriceNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$ShopPromotion, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ResourceNode.ShopPromotion b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ResourceNode.ShopPromotion a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ResourceNode.ShopPromotion) ipChange2.ipc$dispatch("c51cf1d5", new Object[]{this, obj}) : new ResourceNode.ShopPromotion((JSONObject) obj);
            }
        });
    }

    private long initLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c47fe786", new Object[]{this})).longValue();
        }
        Long l = this.root.getLong("limit");
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    private ArrayList<PriceDescData> initWholePriceDescs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1bf4ed01", new Object[]{this}) : c.a(this.root.getJSONArray("wholePriceDescs"), new g<PriceDescData>() { // from class: com.taobao.android.detail.sdk.model.node.PriceNode.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.PriceNode$PriceDescData, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PriceDescData b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceDescData a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (PriceDescData) ipChange2.ipc$dispatch("18e7cc1d", new Object[]{this, obj});
                }
                if (obj != null) {
                    return new PriceDescData((JSONObject) obj);
                }
                return null;
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class PriceData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean bold;
        public boolean lineThrough;
        public String priceChar;
        public String priceColor;
        public String priceDesc;
        public long priceMoney;
        public String priceText;
        public String priceTextSize;
        public String priceTitle;
        public String priceTitleColor;
        public int priceType;
        public String priceUnit;

        static {
            kge.a(293238771);
        }

        public PriceData(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, boolean z, String str7) {
            this.priceText = str;
            this.priceTitle = str2;
            this.priceDesc = str4;
            this.priceMoney = j;
            this.priceType = i;
            this.lineThrough = z;
            this.priceUnit = c.a(str5, "元");
            this.priceChar = c.a(str6, "¥");
            this.priceColor = c.a(str3);
            this.priceTitleColor = c.a(str7);
        }

        public PriceData() {
        }

        public PriceData(JSONObject jSONObject) {
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.priceText = c.a(jSONObject.getString("priceText"));
            this.priceTitle = c.a(jSONObject.getString("priceTitle"));
            this.priceDesc = c.a(jSONObject.getString("priceDesc"));
            try {
                this.priceMoney = jSONObject.getLongValue("priceMoney");
            } catch (Exception unused) {
                this.priceMoney = 0L;
            }
            this.priceType = jSONObject.getIntValue("type");
            this.lineThrough = jSONObject.getBooleanValue("lineThrough");
            this.priceUnit = c.a(jSONObject.getString("priceUnit"), "元");
            this.priceChar = c.a(jSONObject.getString("priceChar"), "¥");
            this.priceColor = c.a(jSONObject.getString("priceColor"));
            this.priceTitleColor = c.a(jSONObject.getString("priceTitleColor"));
            this.bold = jSONObject.getBooleanValue("bold");
            this.priceTextSize = jSONObject.getString("priceTextSize");
        }

        public String getPriceText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c477b99", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(StringUtils.isEmpty(this.priceChar) ? str : this.priceChar);
            if (!StringUtils.isEmpty(this.priceText)) {
                str = this.priceText;
            }
            sb.append(str);
            return sb.toString();
        }
    }
}
