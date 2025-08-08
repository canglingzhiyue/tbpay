package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.ado;
import tb.cgl;
import tb.ddw;
import tb.jzn;
import tb.kge;
import tb.pmd;
import tb.poy;
import tb.tfu;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_CART_REQUEST_CODE = 10000;
    public static final int DETAIL_BULK_REQUEST_CODE = 20001;
    public static final int DETAIL_REQUEST_CODE = 20000;
    public static final String SCREENTYPE_HALF_PORTRAIT = "halfPortrait";
    public static final String SCREENTYPE_LANDSCAPE = "landscape";
    public static final String SCREENTYPE_PORTRAIT = "portrait";
    public static final int SKU_RESULT_ADDCART_SUCCESS = 1;
    public static final int SKU_RESULT_QUERAYDATA_FAIL = 8;

    static {
        kge.a(1743336957);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String str3 = "https://huodong.m.taobao.com/act/talent/live.html?id=" + str + "&type=508&screenOrientation=landscape";
        if (StringUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + "&wh_cid=" + str2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "https://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        String str3 = "https://huodong.m.taobao.com/act/talent/live.html?id=" + str + "&type=508";
        if (StringUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + "&wh_cid=" + str2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (aa.c() && poy.ag(n.a())) {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=a2141.23201685&source=taolive";
        } else if (com.taobao.taolive.room.controller2.j.f()) {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=" + com.taobao.taolive.room.controller2.j.e() + "&source=taolive";
        } else {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=a2141.8001249&source=taolive";
        }
    }

    public static void a(Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1989ce74", new Object[]{activity, liveItem, str, hashMap});
            return;
        }
        cgl.k().a(n.b(), activity, liveItem, str, hashMap);
        jzn.a(n.a(), tfu.GOTO_DETAIL, liveItem != null ? liveItem.itemId : 0L);
        if (!StringUtils.isEmpty(str)) {
            ai.a(n.a(), str, liveItem.itemId, liveItem.clickSource, v.e(liveItem.extendVal.isBulk), liveItem.extendVal != null ? liveItem.extendVal.tradeParams : "", hashMap);
        }
        if (!poy.s(n.b())) {
            com.taobao.taolive.room.service.e.a(liveItem.itemUrl);
        }
        ddw.a().a("com.taobao.taolive.room.gotoDetail", Long.valueOf(liveItem.itemId), n.c());
        ai.c(n.a());
        ai.b(n.a());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", liveItem.itemUrl);
        hashMap2.put("itemH5TaokeUrl", liveItem.itemH5TaokeUrl);
        hashMap2.put("itemId", liveItem.itemId + "");
        ai.a(n.a(), "gotoDetailForTaoke", (Map<String, String>) hashMap2);
    }

    public static void b(Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a04e413", new Object[]{activity, liveItem, str, hashMap});
        } else if (liveItem == null) {
        } else {
            com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
            String valueOf = String.valueOf(liveItem.itemId);
            ai.a(a2, "showDetail", "", valueOf, "itemId=" + liveItem.itemId);
            a(activity, liveItem, str, hashMap);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        cgl.k().a(context, str);
        ddw.a().a("com.taobao.taolive.room.gotoShop", str, n.c());
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe20e13", new Object[]{activity, str, str2, str3, str4, new Boolean(z), map});
            return;
        }
        pmd.a().p().a(activity, "直播", str, str2, str3, str4, z, map);
        ddw.a().a("com.taobao.taolive.room.share.click", null, n.c());
    }

    public static void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
        } else {
            a(activity, z, (Map<String, String>) null);
        }
    }

    public static void a(Activity activity, boolean z, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6e17eb", new Object[]{activity, new Boolean(z), map});
            return;
        }
        VideoInfo u = poy.u(n.a());
        if (u == null) {
            return;
        }
        String str2 = "";
        String str3 = u.broadCaster != null ? u.broadCaster.accountName : str2;
        String str4 = null;
        String str5 = map != null ? map.get("desc") : null;
        if (StringUtils.isEmpty(str5)) {
            str = StringUtils.isEmpty(aa.ae()) ? activity.getString(R.string.taolive_share_live, new Object[]{str3, u.title}) : String.format(aa.ae(), str3, u.title);
            String str6 = map != null ? map.get("invite_code") : null;
            if (!StringUtils.isEmpty(str6)) {
                str = str + "\n\n" + str6;
            }
        } else {
            str = str5;
        }
        if (!z) {
            a(activity, str, u.coverImg, u.liveId, u.topic, map);
        } else {
            a(activity, str, u.coverImg, u.liveId, u.topic, true, map);
        }
        jzn.a(n.a(), "share", 0L);
        if (map != null) {
            str4 = map.get(aw.PARAM_TRACK_LIVEOPRT_ID);
        }
        if (map != null) {
            str2 = map.get("sharelive_location");
        }
        ai.a(n.a(), "ShareLive", "liveoprt_id=" + str4, "sharelive_location = " + str2);
        ai.b(n.a(), "share", new String[0]);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        FandomInfo H = poy.H(n.a());
        String str2 = (H == null || H.broadCaster == null) ? "" : H.broadCaster.accountName;
        return StringUtils.isEmpty(aa.af()) ? context.getString(R.string.taolive_share_live, str2, str) : String.format(aa.af(), str2);
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634ef63", new Object[]{activity, str, str2, str3, str4, map});
            return;
        }
        pmd.a().p().a(activity, "直播", str, str2, str3, null, false, map);
        ddw.a().a("com.taobao.taolive.room.share.click", null, n.c());
    }

    public static void a(Activity activity, int i, LiveItem liveItem, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86da104f", new Object[]{activity, new Integer(i), liveItem, hashMap});
            return;
        }
        poy.b(true, n.a());
        if (liveItem != null) {
            com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
            String valueOf = String.valueOf(liveItem.itemId);
            ai.a(a2, tfu.ADD_CART, "", valueOf, "itemId=" + liveItem.itemId);
        }
        cgl.k().a(n.b(), activity, liveItem, i, hashMap);
        jzn.a(n.a(), tfu.ADD_CART, liveItem != null ? liveItem.itemId : 0L);
        VideoInfo u = poy.u(n.a());
        if (u == null || u.broadCaster == null) {
            return;
        }
        String str = u.topic;
        if (aa.J() && !StringUtils.isEmpty(str)) {
            com.taobao.taolive.sdk.business.g.a(u.liveId, u.broadCaster.accountId, str, 10010, null, null, null, com.taobao.taolive.sdk.core.j.e(null));
        }
        ai.c(n.a());
        ai.a(n.a(), ag.CLICK_GOODS_BUY, liveItem.itemId, liveItem.clickSource, false, liveItem.extendVal != null ? liveItem.extendVal.tradeParams : "", hashMap);
        ddw.a().a("com.taobao.taolive.room.addcarting", Long.valueOf(liveItem.itemId), n.c());
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5bded401", new Object[]{str, str2}) : a(str, "livesource", str2);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        if (str.contains("?" + str2 + "=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2 + "=" + str3;
        }
        return str + "?" + str2 + "=" + str3;
    }
}
