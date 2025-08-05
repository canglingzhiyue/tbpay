package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class SellerNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "seller";
    public String allItemCount;
    public String certIcon;
    public String fans;
    public String newItemCount;
    public String sellerNick;
    public String shopCardText;
    public ArrayList<a> shopDsrInfoList;
    public String shopIcon;
    public String shopId;
    public int shopLevel;
    public String shopName;
    public String shopTitleIcon;
    public int shopType;
    public String shopTypeOriginal;
    public String tagIcon;
    public String userId;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10024a;
        public String b;
        public int c;
        public int d;

        /* renamed from: com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0385a {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final int DESCRIPTION = 1;
            public static final int SERVICE = 2;
            public static final int SHIPPING = 3;
            public static final int UNKNOWN = 0;

            static {
                kge.a(61531166);
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
            kge.a(-805494203);
        }

        public a(JSONObject jSONObject) {
            this.f10024a = epw.a(jSONObject.getString("title"));
            this.b = epw.a(jSONObject.getString("score"));
            this.c = C0385a.a(jSONObject.getString("type"));
            this.d = jSONObject.getIntValue("level");
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TAOBAO = 1;
        public static final int TMALL = 2;

        static {
            kge.a(-225747322);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : "B".equalsIgnoreCase(str) ? 2 : 1;
        }
    }

    static {
        kge.a(-1063084850);
    }

    public SellerNode(JSONObject jSONObject) {
        super(jSONObject);
        this.userId = epw.a(jSONObject.getString("userId"));
        this.shopId = epw.a(jSONObject.getString("shopId"));
        this.shopName = epw.a(jSONObject.getString("shopName"));
        this.sellerNick = epw.a(jSONObject.getString("sellerNick"));
        this.shopIcon = epw.a(jSONObject.getString("shopIcon"));
        this.tagIcon = epw.a(jSONObject.getString("tagIcon"));
        this.fans = epw.a(jSONObject.getString("fans"));
        this.certIcon = epw.a(jSONObject.getString("certIcon"));
        this.allItemCount = epw.a(jSONObject.getString("allItemCount"));
        this.newItemCount = epw.a(jSONObject.getString("newItemCount"));
        this.shopLevel = jSONObject.getIntValue("creditLevel");
        this.shopTitleIcon = epw.a(jSONObject.getString("shopTitleIcon"));
        this.shopType = b.a(jSONObject.getString("shopType"));
        this.shopTypeOriginal = jSONObject.getString("shopType");
        this.shopDsrInfoList = initShopDsrInfoList();
        this.shopCardText = epw.a(jSONObject.getString("shopCard"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode");
    }

    private ArrayList<a> initShopDsrInfoList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9396d52a", new Object[]{this}) : epw.a(this.data.getJSONArray("evaluates"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("f79cb0ca", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }
}
