package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.aq;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.WangxinChatSubscriber;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.NavUrls;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.util.HashMap;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class z implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openWW";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_ww";

    /* renamed from: a  reason: collision with root package name */
    private Context f10732a;
    private eyx b;

    static {
        kge.a(2056689169);
        kge.a(1967244270);
    }

    public z(Context context, eyx eyxVar) {
        this.f10732a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null || (jSONObject = b.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) == null) {
            return false;
        }
        String string = jSONObject.getString("nick");
        String string2 = jSONObject.getString("itemid");
        String string3 = jSONObject.getString("saleCount");
        HashMap hashMap = new HashMap();
        hashMap.put("from", "Page_Detail");
        try {
            if (Long.parseLong(string3) > 0) {
                hashMap.put(WangxinChatSubscriber.K_QUANTITY, string3);
            }
        } catch (Throwable unused) {
        }
        hashMap.putAll(aq.a(jSONObject));
        a(this.f10732a, string, string2, null, JSONObject.toJSONString(hashMap), this.b);
        return true;
    }

    private static void a(Context context, String str, String str2, String str3, String str4, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564f634", new Object[]{context, str, str2, str3, str4, eyxVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WXConstantsOut.TOUSER, str);
        bundle.putString("itemid", str2);
        bundle.putString(WXConstantsOut.ORDERID, str3);
        bundle.putString("extraParams", str4);
        if (com.taobao.android.detail.ttdetail.utils.j.af()) {
            Seller seller = (Seller) eyxVar.a().a(Seller.class);
            if (seller != null) {
                String sellerId = seller.getSellerId();
                String shopName = seller.getShopName();
                bundle.putString("targetUid", sellerId);
                bundle.putString("shopName", shopName);
                com.taobao.android.detail.ttdetail.utils.i.a("OpenWW", "targetUid: " + sellerId + " shopName: " + shopName);
            } else {
                com.taobao.android.detail.ttdetail.utils.i.a("OpenWW", "can not get seller data");
            }
        } else {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenWW", "Switch is off");
        }
        com.taobao.android.detail.ttdetail.utils.l.a(context, bundle, NavUrls.NAV_URL_WANGXIN);
    }
}
