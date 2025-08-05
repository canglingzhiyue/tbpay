package com.alibaba.triver.triver_shop.newShop.ext;

import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-302214108);
    }

    public static final Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{uri});
        }
        if (uri == null) {
            ceg.Companion.b("intent or intent.data is null , downgrade failed , will finish activity");
            return null;
        }
        Uri.Builder buildUpon = Uri.parse("https://shop.m.taobao.com/shop/shop_index.htm").buildUpon();
        String queryParameter = uri.getQueryParameter("shopId");
        if (queryParameter != null) {
            buildUpon.appendQueryParameter("shopId", queryParameter);
            z = true;
        }
        String queryParameter2 = uri.getQueryParameter("sellerId");
        if (queryParameter2 != null) {
            buildUpon.appendQueryParameter("sellerId", queryParameter2);
            z = true;
        }
        if (!z) {
            return null;
        }
        buildUpon.appendQueryParameter("downgradeFrom", ShopView.SP_NAMESPACE);
        buildUpon.appendQueryParameter("shopNavIgnore", "true");
        buildUpon.appendQueryParameter(com.taobao.tao.shop.d.SHOP_RULE_PROCESSED, "true");
        return buildUpon.build();
    }

    public static final DXTemplateItem a(JSONObject dxJsonConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("44f25f37", new Object[]{dxJsonConfig});
        }
        q.d(dxJsonConfig, "dxJsonConfig");
        com.alibaba.triver.triver_shop.newShop.data.b bVar = new com.alibaba.triver.triver_shop.newShop.data.b();
        Object obj = dxJsonConfig.get("url");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        bVar.c = (String) obj;
        bVar.b = Long.parseLong(String.valueOf(dxJsonConfig.get("version")));
        Object obj2 = dxJsonConfig.get("name");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        bVar.f11925a = (String) obj2;
        return bVar;
    }

    public static final void a(e eVar, View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75737c37", new Object[]{eVar, view, str, obj});
            return;
        }
        q.d(eVar, "<this>");
        q.d(view, "view");
        h.a(eVar.b(), view, str, obj);
    }

    public static final void a(e eVar, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122dbb7f", new Object[]{eVar, view, jSONObject});
            return;
        }
        q.d(eVar, "<this>");
        q.d(view, "view");
        h.a(eVar.b(), view, jSONObject);
    }
}
