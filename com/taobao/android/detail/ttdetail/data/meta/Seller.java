package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@MappingKey(key = "seller")
/* loaded from: classes4.dex */
public class Seller extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String sellerId;
    private final String sellerNick;
    private final String sellerType;
    private final String shopIcon;
    private final String shopId;
    private final String shopName;
    private final int shopType;
    private final String shopTypeOriginal;
    private final String shopUrl;
    private final String userId;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TAOBAO = 1;
        public static final int TMALL = 2;

        static {
            kge.a(272506717);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : "B".equalsIgnoreCase(str) ? 2 : 1;
        }
    }

    static {
        kge.a(1734753815);
    }

    public Seller(JSONObject jSONObject) {
        super(jSONObject);
        this.sellerId = jSONObject.getString("sellerId");
        this.shopId = jSONObject.getString("shopId");
        this.shopIcon = jSONObject.getString("shopIcon");
        this.userId = jSONObject.getString("userId");
        this.sellerType = jSONObject.getString("sellerType");
        this.shopName = jSONObject.getString("shopName");
        this.shopUrl = jSONObject.getString(g.KEY_APM_SHOP_URL);
        this.shopTypeOriginal = jSONObject.getString("shopType");
        this.shopType = a.a(jSONObject.getString("shopType"));
        this.sellerNick = jSONObject.getString("sellerNick");
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("822c6289", new Object[]{this}) : this.sellerId;
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this}) : this.shopId;
    }

    public String getShopIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("132e3614", new Object[]{this}) : this.shopIcon;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public String getSellerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3157730a", new Object[]{this}) : this.sellerType;
    }

    public String getShopName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6105d742", new Object[]{this}) : this.shopName;
    }

    public String getShopUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("935d5876", new Object[]{this}) : this.shopUrl;
    }

    public int getShopType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7e96240", new Object[]{this})).intValue() : this.shopType;
    }

    public String getShopTypeOriginal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8ce1ea2", new Object[]{this}) : this.shopTypeOriginal;
    }

    public String getSellerNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("baba4e81", new Object[]{this}) : this.sellerNick;
    }
}
