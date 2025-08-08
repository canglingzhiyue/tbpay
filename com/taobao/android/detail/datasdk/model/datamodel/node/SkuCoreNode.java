package com.taobao.android.detail.datasdk.model.datamodel.node;

import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.gbk;
import tb.kge;

/* loaded from: classes4.dex */
public class SkuCoreNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "skuCore";
    public HashMap<String, SkuAttribute> sku2info;
    public SkuBuy skuBuy;
    public SkuItem skuItem;

    /* loaded from: classes4.dex */
    public static class SkuBuy implements Serializable {
        public BuyPattern buyPattern;

        /* loaded from: classes4.dex */
        public static class BuyPattern implements Serializable {
            public String spm;
            public String title;
            public List<BuyType> types;

            /* loaded from: classes4.dex */
            public static class BuyType implements Serializable {
                public String bizId;
                public JSONObject buyParams;
                public String buyUrl;
                public String desc;
                public boolean hideInstallment;
                public Introduce introduce;
                public int limit;
                public String okBtnText;
                public boolean selected;

                /* loaded from: classes4.dex */
                public static class Introduce {
                    public String icon;
                    public String linkUrl;
                    public String name;
                    public String spm;
                    public String writing;

                    static {
                        kge.a(2147204361);
                    }

                    public Introduce(JSONObject jSONObject) {
                        if (jSONObject == null) {
                            return;
                        }
                        this.name = epw.a(jSONObject.getString("name"));
                        this.writing = epw.a(jSONObject.getString("writing"));
                        this.linkUrl = epw.a(jSONObject.getString("linkUrl"));
                        this.icon = epw.a(jSONObject.getString("icon"));
                        this.spm = epw.a(jSONObject.getString("spm"));
                    }
                }

                static {
                    kge.a(-1486861010);
                    kge.a(1028243835);
                }

                public BuyType(JSONObject jSONObject) {
                    this.selected = false;
                    this.limit = Integer.MAX_VALUE;
                    this.hideInstallment = false;
                    if (jSONObject == null) {
                        return;
                    }
                    this.desc = epw.a(jSONObject.getString("desc"));
                    this.bizId = epw.a(jSONObject.getString("bizId"));
                    this.buyUrl = epw.a(jSONObject.getString("buyUrl"));
                    this.okBtnText = epw.a(jSONObject.getString("okBtnText"));
                    if (StringUtils.isEmpty(this.okBtnText)) {
                        this.okBtnText = ILocalizationService.CONFIRM;
                    }
                    try {
                        this.limit = Integer.parseInt(epw.a(jSONObject.getString("limit")).equals("") ? "0" : jSONObject.getString("limit"));
                        String str = "false";
                        this.selected = Boolean.parseBoolean(epw.a(jSONObject.getString(gbk.TYPE_SELECTED)).equals("") ? str : jSONObject.getString(gbk.TYPE_SELECTED));
                        if (!epw.a(jSONObject.getString("hideInstallment")).equals("")) {
                            str = jSONObject.getString("hideInstallment");
                        }
                        this.hideInstallment = Boolean.parseBoolean(str);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    this.buyParams = jSONObject.getJSONObject("buyParams");
                    this.introduce = new Introduce(jSONObject.getJSONObject("introduce"));
                }
            }

            static {
                kge.a(-1930704622);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(-1404348708);
            kge.a(1028243835);
        }

        public SkuBuy(JSONObject jSONObject) {
            JSONObject jSONObject2;
            if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("buyPattern")) == null) {
                return;
            }
            this.buyPattern = new BuyPattern();
            this.buyPattern.title = epw.a(jSONObject2.getString("title"));
            this.buyPattern.types = new ArrayList();
            this.buyPattern.spm = epw.a(jSONObject2.getString("spm"));
            JSONArray jSONArray = jSONObject2.getJSONArray("type");
            if (jSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    this.buyPattern.types.add(new BuyPattern.BuyType((JSONObject) obj));
                }
            }
        }
    }

    static {
        kge.a(-1292570255);
    }

    public SkuCoreNode(JSONObject jSONObject) {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("skuItem");
        if (jSONObject2 != null) {
            this.skuItem = new SkuItem(jSONObject2);
        } else {
            this.skuItem = new SkuItem(new JSONObject());
        }
        this.sku2info = initSkuAttributeData(jSONObject.getJSONObject("sku2info"));
        this.skuBuy = new SkuBuy(jSONObject.getJSONObject("skuBuy"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode");
    }

    public SkuCoreNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode");
    }

    private HashMap<String, SkuAttribute> initSkuAttributeData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9c7870d3", new Object[]{this, jSONObject}) : epw.a(jSONObject, new epy<SkuAttribute>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode$SkuAttribute] */
            @Override // tb.epy
            public /* synthetic */ SkuAttribute b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuAttribute a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuAttribute) ipChange2.ipc$dispatch("12f47243", new Object[]{this, obj}) : new SkuAttribute((JSONObject) obj);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class SkuItem implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String buttonIcon;
        public String buttonText;
        public boolean hideQuantity;
        public boolean isElecVoucher;
        public String recommendSize;
        public String recommendTip;
        public boolean showAddress;
        public boolean showAddressTaobao;
        public String skuH5Url;
        public String skuId;
        public String skuWeexUrl;
        public int unitBuy;

        static {
            kge.a(-584929923);
            kge.a(1028243835);
        }

        public SkuItem() {
        }

        public SkuItem(JSONObject jSONObject) {
            this.showAddress = jSONObject.getBooleanValue("showAddress");
            this.showAddressTaobao = jSONObject.getBooleanValue("showAddressTaobao");
            this.hideQuantity = jSONObject.getBooleanValue("hideQuantity");
            this.skuH5Url = jSONObject.getString("skuH5Url");
            this.isElecVoucher = jSONObject.getBooleanValue("elecVoucher");
            this.unitBuy = initUnitBuy(jSONObject);
            this.recommendSize = epw.a(jSONObject.getString("recommendSize"));
            this.recommendTip = epw.a(jSONObject.getString("recommendTip"));
            this.buttonText = epw.a(jSONObject.getString("buttonText"));
            this.buttonIcon = epw.a(jSONObject.getString("buttonIcon"));
            this.skuId = epw.a(jSONObject.getString("skuId"));
            this.skuWeexUrl = epw.a(jSONObject.getString("skuWeexUrl"));
        }

        public int initUnitBuy(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c27bab4a", new Object[]{this, jSONObject})).intValue();
            }
            Integer integer = jSONObject.getInteger("unitBuy");
            if (integer != null && integer.intValue() > 0) {
                return integer.intValue();
            }
            return 1;
        }
    }

    /* loaded from: classes4.dex */
    public static class SkuAttribute implements Serializable {
        public String asac;
        public String buyText;
        public boolean isShowTag;
        public String itemApplyParams;
        public long limit;
        public String limitText;
        public String logisticsTime;
        public PriceNode.PriceData priceData;
        public long quantity;
        public String quantityText;
        public String skuPromTip;
        public PriceNode.PriceData subPrice;
        public String subTitle;
        public String subTitleColor;

        static {
            kge.a(-1717081486);
            kge.a(1028243835);
        }

        public SkuAttribute() {
        }

        public SkuAttribute(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("price");
            if (jSONObject2 != null) {
                this.priceData = new PriceNode.PriceData(jSONObject2);
            } else {
                this.priceData = new PriceNode.PriceData(new JSONObject());
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("subPrice");
            if (jSONObject3 != null) {
                this.subPrice = new PriceNode.PriceData(jSONObject3);
            }
            Long l = jSONObject.getLong("quantity");
            long j = Long.MAX_VALUE;
            this.quantity = l != null ? l.longValue() : Long.MAX_VALUE;
            Long l2 = jSONObject.getLong("limit");
            this.limit = l2 != null ? l2.longValue() : j;
            this.limitText = epw.a(jSONObject.getString("limitText"));
            this.asac = epw.a(jSONObject.getString("asac"));
            this.quantityText = epw.a(jSONObject.getString("quantityText"));
            this.isShowTag = jSONObject.getBooleanValue("showTag");
            this.subTitle = epw.a(jSONObject.getString("depositText"));
            this.subTitleColor = epw.a(jSONObject.getString("depositTextColor"));
            this.logisticsTime = epw.a(jSONObject.getString("logisticsTime"));
            this.skuPromTip = epw.a(jSONObject.getString("skuPromTip"));
            this.itemApplyParams = epw.a(jSONObject.getString("itemApplyParams"));
            this.buyText = epw.a(jSONObject.getString("buyText"));
        }
    }
}
