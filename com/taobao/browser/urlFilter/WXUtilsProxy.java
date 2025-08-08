package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.net.Uri;
import android.taobao.util.a;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.b;
import com.taobao.tao.util.Constants;
import com.taobao.wangxin.proxy.WangxinControlerProxy;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.io.UnsupportedEncodingException;
import tb.kge;

/* loaded from: classes6.dex */
public class WXUtilsProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(860934912);
    }

    public static boolean parseWwURl(Activity activity, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("959863c3", new Object[]{activity, str})).booleanValue();
        }
        BrowserUtil.a("WXUtilsProxy", "parseWwURl", null, str, null);
        Uri parse = Uri.parse(str);
        String fragment = parse.getFragment();
        String str6 = "";
        if ("h5.m.taobao.com".equals(parse.getHost()) && fragment != null && fragment.indexOf("dialog") >= 0) {
            try {
                String[] split = fragment.split("-");
                if (split != null) {
                    String b = (split.length < 2 || split[1] == null) ? str6 : b.b(split[1].getBytes());
                    String str7 = (split.length < 3 || split[2].length() <= 1) ? str6 : split[2];
                    String str8 = (split.length < 4 || split[3].length() <= 1) ? str6 : split[3];
                    if (split.length >= 5 && split[4].length() > 1) {
                        str6 = split[4];
                    }
                    String str9 = "toNick " + b;
                    str4 = str7;
                    str5 = str8;
                    str3 = b;
                } else {
                    str3 = str6;
                    str4 = str3;
                    str5 = str4;
                }
                if (!StringUtils.isEmpty(str3)) {
                    WangxinControlerProxy.gotoWangxinChatWithFengliu(activity, str3, str4, str6, str5, null);
                    BrowserUtil.a("WXUtilsProxy", "parseWwURl", "wx_h5", str, null);
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
        if ("im.m.taobao.com".equals(parse.getHost()) && parse.getPath() != null && parse.getPath().indexOf("ww_dialog") >= 0) {
            String queryParameter = parse.getQueryParameter(WXConstantsOut.TOUSER);
            String queryParameter2 = parse.getQueryParameter("shop_id");
            String queryParameter3 = parse.getQueryParameter("pay_order_id");
            try {
                str2 = new String(a.b(queryParameter.getBytes()), Constants.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                str2 = str6;
            }
            String queryParameter4 = parse.getQueryParameter("item_num_id");
            String str10 = "toNick " + str2;
            if (!StringUtils.isEmpty(str2)) {
                WangxinControlerProxy.gotoWangxinChatWithFengliu(activity, str2, queryParameter4, queryParameter3, queryParameter2, null);
                BrowserUtil.a("WXUtilsProxy", "parseWwURl", "wx_im", str, null);
                return true;
            }
        }
        return false;
    }
}
