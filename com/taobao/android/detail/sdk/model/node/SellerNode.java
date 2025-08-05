package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SellerNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String allItemCount;
    public String certIcon;
    public String fans;
    public String newItemCount;
    public String sellerNick;
    public String shopCardText;
    public ArrayList<ShopDsrInfo> shopDsrInfoList;
    public String shopIcon;
    public String shopId;
    public int shopLevel;
    public String shopName;
    public String shopTitleIcon;
    public int shopType;
    public String tagIcon;
    public String userId;

    /* loaded from: classes4.dex */
    public static class ShopDsrInfo {
        public int level;
        public String score;
        public String title;
        public int type;

        /* loaded from: classes4.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final int DESCRIPTION = 1;
            public static final int SERVICE = 2;
            public static final int SHIPPING = 3;
            public static final int UNKNOWN = 0;

            static {
                kge.a(199600728);
            }

            public static int a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
                }
                if ("desc".equals(str)) {
                    return 1;
                }
                if ("serv".equals(str)) {
                    return 2;
                }
                return "post".equals(str) ? 3 : 0;
            }
        }

        static {
            kge.a(-464076161);
        }

        public ShopDsrInfo(JSONObject jSONObject) {
            this.title = c.a(jSONObject.getString("title"));
            this.score = c.a(jSONObject.getString("score"));
            this.type = a.a(jSONObject.getString("type"));
            this.level = jSONObject.getIntValue("level");
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TAOBAO = 1;
        public static final int TMALL = 2;

        static {
            kge.a(-99731316);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : "B".equalsIgnoreCase(str) ? 2 : 1;
        }
    }

    static {
        kge.a(336544776);
    }

    public SellerNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.SellerNode");
        this.userId = c.a(jSONObject.getString("userId"));
        this.shopId = c.a(jSONObject.getString("shopId"));
        this.shopName = c.a(jSONObject.getString("shopName"));
        this.sellerNick = c.a(jSONObject.getString("sellerNick"));
        this.shopIcon = c.a(jSONObject.getString("shopIcon"));
        this.tagIcon = c.a(jSONObject.getString("tagIcon"));
        this.fans = c.a(jSONObject.getString("fans"));
        this.certIcon = c.a(jSONObject.getString("certIcon"));
        this.allItemCount = c.a(jSONObject.getString("allItemCount"));
        this.newItemCount = c.a(jSONObject.getString("newItemCount"));
        this.shopLevel = jSONObject.getIntValue("creditLevel");
        this.shopTitleIcon = c.a(jSONObject.getString("shopTitleIcon"));
        this.shopType = a.a(jSONObject.getString("shopType"));
        this.shopDsrInfoList = initShopDsrInfoList();
        this.shopCardText = c.a(jSONObject.getString("shopCard"));
    }

    private ArrayList<ShopDsrInfo> initShopDsrInfoList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9396d52a", new Object[]{this}) : c.a(this.root.getJSONArray("evaluates"), new g<ShopDsrInfo>() { // from class: com.taobao.android.detail.sdk.model.node.SellerNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.SellerNode$ShopDsrInfo, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ShopDsrInfo b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ShopDsrInfo a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ShopDsrInfo) ipChange2.ipc$dispatch("b877cfd6", new Object[]{this, obj}) : new ShopDsrInfo((JSONObject) obj);
            }
        });
    }
}
