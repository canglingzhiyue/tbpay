package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.Iterator;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class PriceNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "price";
    public String add;
    public PriceData depositPrice;
    public ArrayList<PriceData> extraPrices;
    public long limit;
    public String limitText;
    public ArrayList<PriceData> newExtraPrices;
    public PriceData price;
    public ArrayList<b> priceTags;
    public long quantity;
    public ArrayList<ResourceNode.j> shopPromotions;
    public PriceData subPrice;
    public PriceData sugPromPrice;
    public PriceData transmitPrice;
    public ArrayList<a> wholePriceDescs;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9986a;
        public String b;

        static {
            kge.a(-1173518690);
        }

        public a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9986a = jSONObject.getString("text");
                this.b = jSONObject.getString("color");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f9987a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(421051639);
        }

        public b(JSONObject jSONObject) {
            this.f9987a = epw.a(jSONObject.getString("text"));
            this.c = epw.a(jSONObject.getString(e.KEY_BG_COLOR));
            this.d = epw.a(jSONObject.getString("icon"));
            this.b = epw.a(jSONObject.getString("textColor"));
        }
    }

    static {
        kge.a(1431796382);
    }

    public PriceNode(JSONObject jSONObject) {
        super(jSONObject);
        this.add = epw.a(jSONObject.getString("add"));
        this.limitText = epw.a(jSONObject.getString("limitText"));
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
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode");
    }

    public PriceData getExtraPriceByType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriceData) ipChange.ipc$dispatch("db59a97c", new Object[]{this, new Integer(i)});
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
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("32f0462b", new Object[]{this}) : epw.a(this.data.getJSONArray("extraPrices"), new epy<PriceData>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode$PriceData, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ PriceData b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceData a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PriceData) ipChange2.ipc$dispatch("f8281574", new Object[]{this, obj}) : new PriceData((JSONObject) obj);
            }
        });
    }

    private ArrayList<PriceData> initPriceDatasByKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f8d0dae3", new Object[]{this, str}) : epw.a(this.data.getJSONArray(str), new epy<PriceData>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode$PriceData, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ PriceData b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PriceData a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PriceData) ipChange2.ipc$dispatch("f8281574", new Object[]{this, obj}) : new PriceData((JSONObject) obj);
            }
        });
    }

    private ArrayList<b> initPriceTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("712902b3", new Object[]{this}) : epw.a(this.data.getJSONArray("priceTag"), new epy<b>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode$b, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ b b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public b a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (b) ipChange2.ipc$dispatch("8f6b8765", new Object[]{this, obj}) : new b((JSONObject) obj);
            }
        });
    }

    private ArrayList<ResourceNode.j> initShopPromotions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b21185d7", new Object[]{this}) : epw.a(this.data.getJSONArray("shopProm"), new epy<ResourceNode.j>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode$j, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ ResourceNode.j b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ResourceNode.j a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ResourceNode.j) ipChange2.ipc$dispatch("b7eda732", new Object[]{this, obj}) : new ResourceNode.j((JSONObject) obj);
            }
        });
    }

    private long initLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c47fe786", new Object[]{this})).longValue();
        }
        Long l = this.data.getLong("limit");
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    private ArrayList<a> initWholePriceDescs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1bf4ed01", new Object[]{this}) : epw.a(this.data.getJSONArray("wholePriceDescs"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("8f6b8746", new Object[]{this, obj});
                }
                if (obj != null) {
                    return new a((JSONObject) obj);
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
            kge.a(167222765);
        }

        public PriceData(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, boolean z, String str7) {
            this.priceText = str;
            this.priceTitle = str2;
            this.priceDesc = str4;
            this.priceMoney = j;
            this.priceType = i;
            this.lineThrough = z;
            this.priceUnit = epw.a(str5, "元");
            this.priceChar = epw.a(str6, "¥");
            this.priceColor = epw.a(str3);
            this.priceTitleColor = epw.a(str7);
        }

        public PriceData() {
        }

        public PriceData(JSONObject jSONObject) {
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.priceText = epw.a(jSONObject.getString("priceText"));
            this.priceTitle = epw.a(jSONObject.getString("priceTitle"));
            this.priceDesc = epw.a(jSONObject.getString("priceDesc"));
            try {
                this.priceMoney = jSONObject.getLongValue("priceMoney");
            } catch (Exception unused) {
                this.priceMoney = 0L;
            }
            this.priceType = jSONObject.getIntValue("type");
            this.lineThrough = jSONObject.getBooleanValue("lineThrough");
            this.priceUnit = epw.a(jSONObject.getString("priceUnit"), "元");
            this.priceChar = epw.a(jSONObject.getString("priceChar"), "¥");
            this.priceColor = epw.a(jSONObject.getString("priceColor"));
            this.priceTitleColor = epw.a(jSONObject.getString("priceTitleColor"));
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
