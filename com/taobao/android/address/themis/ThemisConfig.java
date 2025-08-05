package com.taobao.android.address.themis;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.f;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.efe;
import tb.gvl;

/* loaded from: classes4.dex */
public class ThemisConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_CART = "cart";
    public static final String SCENE_CHANGE = "change";
    public static final String SCENE_LBS_LIST = "lbs_list";
    public static final String SCENE_MANAGER = "manager";
    public static final String SCENE_PURCHASE = "purchase";
    public static final String SCENE_SELECT = "select";
    public static final String SCENE_TMALLMARKET = "tmallMarket";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Scene {
    }

    public static boolean a(String str) {
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) {
            c = efe.c("isAddressMgrUseWeex2");
        } else if (TextUtils.equals(str, "change")) {
            c = efe.c("isAddressChangeUserWeex");
        } else if (TextUtils.equals(str, "cart")) {
            c = efe.c("isAddressCartUseWeex2");
        } else if (TextUtils.equals(str, SCENE_LBS_LIST)) {
            c = efe.c("isAddressLbsUserWeex2");
        } else if (TextUtils.equals(str, "purchase")) {
            c = efe.c("isAddressPurchaseWeex2");
        } else if (TextUtils.equals(str, SCENE_TMALLMARKET)) {
            c = efe.c("isAddressTmallMarketWeex2");
        } else {
            return efe.c("isAddressUseWeex2_" + str);
        }
        return efe.c("isAddressUseWeex2") && c;
    }

    public static String a(Activity activity, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4755764b", new Object[]{activity, str, str2, new Integer(i)}) : a(activity, str, str2, i, null);
    }

    private static String a(Activity activity, String str, String str2, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cbf62c1", new Object[]{activity, str, str2, new Integer(i), bundle});
        }
        String a2 = a(str, str2);
        if (!TextUtils.isEmpty(a2)) {
            Nav.from(activity).withFlags(i).withExtras(bundle).toUri(gvl.a(activity, a2));
            if ((TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) && efe.e()) {
                activity.overridePendingTransition(R.anim.address_slide_in_from_right, R.anim.address_fade_out);
            }
        }
        return a2;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k.HTTPS_PREFIX);
        if (f.b()) {
            sb.append("bp.wapa.taobao.com/");
        } else {
            sb.append("bp.m.taobao.com/");
        }
        sb.append("app/vip/receiver-address-weex2/");
        if (TextUtils.equals(str, SCENE_MANAGER)) {
            sb.append("lists?voiceMode=true&isUnfrequent=true&pageType=1");
        } else if (TextUtils.equals(str, SCENE_SELECT)) {
            sb.append("lists?voiceMode=true&isUnfrequent=true&pageType=0");
        } else if (TextUtils.equals(str, "change")) {
            sb.append("change?wx_opaque=0&is_loading=0");
        } else if (TextUtils.equals(str, SCENE_LBS_LIST)) {
            sb.append("lbs-list?voiceMode=true");
        } else if (TextUtils.equals(str, "cart")) {
            sb.append("lists?wx_statusbar_hidden=true&wx_opaque=0&is_loading=0&isNewBuy=true&uniVessel=true&bizId=iCart");
        } else {
            sb.append("lists?wx_statusbar_hidden=true&wx_opaque=0&is_loading=0&isUnfrequent=true&pageType=0&bizId=");
            sb.append(str);
        }
        sb.append("&wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&x-ssr=true");
        String b = efe.b(str, sb.toString());
        String c = efe.c(b, "addressClientScene=" + str + "&" + str2);
        return (TextUtils.equals(str, SCENE_MANAGER) || TextUtils.equals(str, SCENE_SELECT)) ? efe.a(f.a(), c) : c;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        String c = c(str);
        return TextUtils.equals("iCart", c) || TextUtils.equals("purchase", c) || TextUtils.equals(SCENE_TMALLMARKET, c);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            return parse != null ? parse.getQueryParameter("bizId") : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
