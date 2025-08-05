package com.taobao.wangxin.proxy;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.util.NavUrls;
import com.taobao.wangxin.utils.WXConstantsOut;
import tb.kge;

/* loaded from: classes9.dex */
public class WangxinControlerProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1002597685);
    }

    public static void gotoWangxin(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b4b4aa", new Object[]{context});
        } else {
            Nav.from(context).toUri(NavUrls.NAV_URL_WANGXIN);
        }
    }

    public static void gotoWangxinChatWithFengliu(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c22053e", new Object[]{context, str, str2, str3, str4});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WXConstantsOut.TOUSER, str);
        bundle.putString("itemid", str2);
        bundle.putString(WXConstantsOut.ORDERID, str3);
        bundle.putString("extraParams", str4);
        Nav.from(context).withExtras(bundle).toUri(NavUrls.NAV_URL_WANGXIN);
    }

    public static void gotoWangxinChatWithFengliu(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd939b88", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(WXConstantsOut.TOUSER, str);
        bundle.putString("itemid", str2);
        bundle.putString(WXConstantsOut.ORDERID, str3);
        bundle.putString(WXConstantsOut.SHOPID, str4);
        bundle.putString("extraParams", str5);
        Nav.from(context).withExtras(bundle).toUri(NavUrls.NAV_URL_WANGXIN);
    }
}
