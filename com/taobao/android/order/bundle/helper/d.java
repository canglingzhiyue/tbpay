package com.taobao.android.order.bundle.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.tao.util.NavUrls;
import tb.bxb;
import tb.hyk;
import tb.hyn;
import tb.hyo;
import tb.ibm;
import tb.kge;

/* loaded from: classes6.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_LIST_URI = "http://taobao.com/order_search_result.htm";

    static {
        kge.a(2109506695);
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa971818", new Object[]{activity, str, str2, str3});
        } else if (activity == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(CoreConstants.IN_PARAM_BIZ_ORDER_ID, str);
            bundle.putString("downgradeType", str3);
            if (activity.getIntent() != null) {
                bundle.putBoolean(CoreConstants.FROM_ORDER_LIST, "OrderListActivity".equals(g.b(activity.getIntent())));
            }
            bundle.putString("from", activity.getClass().getSimpleName());
            Nav.from(activity).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
        }
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
        } else if (activity == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("tabCode", str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            Nav.from(activity).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_LIST[0]);
        }
    }

    public static void b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fe0a0f", new Object[]{activity, str, str2});
        } else if (activity == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("searchKey", str);
            if (!StringUtils.isEmpty(str2)) {
                bundle.putString("downgradeType", str2);
            }
            bundle.putString("from", activity.getClass().getSimpleName());
            if (!Nav.from(activity).withExtras(bundle).toUri("http://taobao.com/order_search_result.htm")) {
                bxb.a(OrderBizCode.orderSearch, "NavToSearchResultFailed", "searchKey=" + str);
            }
            hyn.a("NavigateHelper", "navigate2OrderSearch", "searchKey:" + str);
        }
    }

    public static void c(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8d8e50", new Object[]{activity, str, str2});
        } else if (activity == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(CoreConstants.IN_PARAM_BIZ_ORDER_ID, str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CoreConstants.IN_PARAM_BIZ_ORDER_ID, (Object) str);
            Nav.from(activity).withExtras(bundle).toUri(ibm.a(hyk.e(), jSONObject));
        }
    }

    public static void d(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1d1291", new Object[]{activity, str, str2});
        } else if (activity == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("tabCode", str);
            bundle.putString("downgradeType", str2);
            bundle.putString("from", activity.getClass().getSimpleName());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabCode", (Object) str);
            Nav.from(activity).withExtras(bundle).toUri(ibm.a(hyk.g(), jSONObject));
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (StringUtils.isEmpty(str) || context == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shop_id", (Object) str);
            String a2 = ibm.a(NavUrls.nav_urls_shop[0], jSONObject);
            Nav.from(context).toUri(a2);
            hyn.a("NavigateHelper", "navigate2ShopByShopId", a2);
        }
    }

    public static void a(Context context, Intent intent) {
        Uri data;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
        } else if (intent == null || intent.getData() == null || (queryParameter = (data = intent.getData()).getQueryParameter("jumpParams")) == null) {
        } else {
            intent.setData(Uri.parse(data.toString().replaceAll("&jumpParams=[^&]*$", "")));
            try {
                JSONObject parseObject = JSONObject.parseObject(queryParameter);
                String string = parseObject.getString("url");
                parseObject.remove("url");
                Nav.from(context).toUri(hyo.a(string, parseObject));
            } catch (Exception unused) {
            }
        }
    }
}
