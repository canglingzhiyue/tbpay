package com.taobao.android.detail.alittdetail.share;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Price;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.share.globalmodel.e;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        void onUpdateShareContainer(View view);
    }

    static {
        kge.a(-501803699);
    }

    /* renamed from: com.taobao.android.detail.alittdetail.share.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0363b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9360a;
        public String b;
        public String c;
        public String d;
        public String e;
        public JSONObject f;

        static {
            kge.a(-1745791391);
        }

        public C0363b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("5030811e", new Object[]{this, str});
            }
            this.f9360a = str;
            return this;
        }

        public C0363b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("335c345f", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0363b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("1687e7a0", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public C0363b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("f9b39ae1", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0363b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("dcdf4e22", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public C0363b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0363b) ipChange.ipc$dispatch("c770ec74", new Object[]{this, jSONObject});
            }
            this.f = jSONObject;
            return this;
        }
    }

    public static void a(eyx eyxVar, JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3523f6", new Object[]{eyxVar, jSONObject, view});
        } else if (jSONObject == null || odg.o().a()) {
        } else {
            ShareContent a2 = a(eyxVar);
            String string = jSONObject.getString("bizId");
            if (!TextUtils.isEmpty(string)) {
                a2.businessId = string;
            } else {
                a2.businessId = "skublacklight";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("image");
            String string2 = jSONObject2 != null ? jSONObject2.getString("url") : "";
            if (TextUtils.isEmpty(string2)) {
                string2 = jSONObject2.getString("icon");
            }
            if (!TextUtils.isEmpty(string2)) {
                a2.imageUrl = string2;
            }
            Item item = (Item) eyxVar.a().a(Item.class);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("toolsFirst", (Object) "true");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", (Object) d.c(item, ""));
            jSONObject4.put("itemId", (Object) d.b(item, ""));
            jSONObject4.put(com.etao.feimagesearch.model.d.KEY_PIC_URL, (Object) string2);
            jSONObject4.put("sellerId", (Object) d.a((Seller) eyxVar.a().a(Seller.class), ""));
            jSONObject3.put("detailData", (Object) jSONObject4);
            a2.templateParams = jSONObject3;
            Context g = eyxVar.g();
            if (!(g instanceof Activity)) {
                return;
            }
            if (view != null && (g instanceof a)) {
                ((a) g).onUpdateShareContainer(view);
            }
            ShareBusiness.share((Activity) g, a2);
        }
    }

    public static void a(eyx eyxVar, C0363b c0363b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecbb428", new Object[]{eyxVar, c0363b});
        } else {
            a(eyxVar, c0363b, (View) null);
        }
    }

    public static void a(eyx eyxVar, C0363b c0363b, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51803aa", new Object[]{eyxVar, c0363b, view});
            return;
        }
        ShareContent a2 = a(eyxVar, c0363b != null ? c0363b.f : null);
        if (c0363b != null) {
            if (TextUtils.isEmpty(a2.businessId) && !TextUtils.isEmpty(c0363b.b)) {
                a2.businessId = c0363b.b;
            }
            if (!TextUtils.isEmpty(c0363b.e)) {
                List list = a2.snapshotImages;
                if (list == null) {
                    list = new ArrayList();
                    a2.snapshotImages = list;
                }
                list.remove(c0363b.e);
                list.add(0, c0363b.e);
                a2.imageUrl = c0363b.e;
            }
            if (!TextUtils.isEmpty(c0363b.f9360a)) {
                a2.isActivity = c0363b.f9360a;
            }
            if (!TextUtils.isEmpty(c0363b.d)) {
                a2.description = c0363b.d;
            }
        }
        if (odg.o().a()) {
            a2.businessId = "1_" + odg.o().b();
        }
        if (TextUtils.isEmpty(a2.businessId)) {
            a2.businessId = "1";
        }
        Context g = eyxVar.g();
        if (!(g instanceof Activity)) {
            return;
        }
        if (view != null && (g instanceof a)) {
            ((a) g).onUpdateShareContainer(view);
        }
        if (c0363b != null && !TextUtils.isEmpty(c0363b.c)) {
            ShareBusiness.share((Activity) g, c0363b.c, a2);
        } else {
            ShareBusiness.share((Activity) g, a2);
        }
    }

    public static ShareContent a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareContent) ipChange.ipc$dispatch("d5a0267a", new Object[]{eyxVar}) : a(eyxVar, (JSONObject) null);
    }

    private static ShareContent a(eyx eyxVar, JSONObject jSONObject) {
        String str;
        String str2;
        Map<String, String> a2;
        Resource.f share;
        Map<String, String> a3;
        Resource.f share2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("2eed3032", new Object[]{eyxVar, jSONObject});
        }
        Context g = eyxVar.g();
        if ((g instanceof Activity) && (g instanceof a)) {
            ((a) g).onUpdateShareContainer(((Activity) g).getWindow().getDecorView());
        }
        ShareContent shareContent = new ShareContent();
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        Resource resource = (Resource) eyxVar.a().a(Resource.class);
        if (resource != null && (share2 = resource.getShare()) != null) {
            shareContent.activityParams = share2.a();
        }
        Item item = (Item) eyxVar.a().a(Item.class);
        String b = d.b(item, "");
        String str3 = e.NAV_URL_DETAIL_BASE + b + ".htm";
        Price price = (Price) eyxVar.a().a(Price.class);
        if (price != null) {
            Price.a price2 = price.getPrice();
            str2 = price2 != null ? price2.b() : "";
            ArrayList<Price.a> extraPrices = price.getExtraPrices();
            if (extraPrices != null) {
                for (Price.a aVar : extraPrices) {
                    if (aVar.a() == 2) {
                        str = aVar.b();
                        break;
                    }
                }
            }
            str = "";
        } else {
            str = "";
            str2 = str;
        }
        if (item != null) {
            String shareItemLink = item.getShareItemLink();
            if (!TextUtils.isEmpty(shareItemLink)) {
                str3 = shareItemLink;
            }
        }
        Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("price", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("original_price", str);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                buildUpon.appendQueryParameter(entry.getKey(), value != null ? String.valueOf(value) : "");
            }
        }
        shareContent.url = buildUpon.toString();
        if (resource != null && (share = resource.getShare()) != null && (a3 = share.a()) != null) {
            String str4 = a3.get("bizId");
            if (!TextUtils.isEmpty(str4)) {
                shareContent.businessId = str4;
            }
        }
        String d = d.d(item, "");
        Vertical vertical = (Vertical) eyxVar.a().a(Vertical.class);
        if (vertical != null && vertical.getJhs() != null) {
            d = "这个#聚划算团购#宝贝不错:" + d + "(分享自@手机淘宝android客户端)";
        }
        shareContent.description = d;
        if (item != null) {
            String shareBizCode = item.getShareBizCode();
            if (!TextUtils.isEmpty(shareBizCode)) {
                shareContent.businessId = shareBizCode;
            }
        }
        if (item != null) {
            shareContent.snapshotImages = item.getImages();
            if (shareContent.snapshotImages != null && !shareContent.snapshotImages.isEmpty()) {
                shareContent.imageUrl = shareContent.snapshotImages.get(0);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("price", str2);
        hashMap.put("targetId", b);
        if (resource != null) {
            Resource.f share3 = resource.getShare();
            if (share3 != null && (a2 = share3.a()) != null) {
                hashMap.putAll(a2);
                hashMap.remove("iconFont");
            }
            if (item != null) {
                final String wxShareUrl = item.getWxShareUrl();
                if (!TextUtils.isEmpty(wxShareUrl)) {
                    hashMap.put("defineToolParams", new JSONArray() { // from class: com.taobao.android.detail.alittdetail.share.ShareUtils$1
                        {
                            add(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.share.ShareUtils$1.1
                                {
                                    put("type", "wxfriend");
                                    put("shareUrl", (Object) wxShareUrl);
                                }
                            });
                        }
                    }.toJSONString());
                }
            }
            Map<String, String> rsExtParams = resource.getRsExtParams();
            if (rsExtParams != null) {
                hashMap.putAll(rsExtParams);
            }
        }
        shareContent.extendParams = hashMap;
        return shareContent;
    }
}
