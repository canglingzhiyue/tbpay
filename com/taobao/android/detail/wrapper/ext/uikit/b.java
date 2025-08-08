package com.taobao.android.detail.wrapper.ext.uikit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import tb.dyx;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f11376a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;

    static {
        kge.a(-1933192321);
        f11376a = e.REQUEST_ID;
        b = "type";
        c = "msg";
        d = "btnMsg";
        e = "targetUrl";
        f = "itemId";
        g = "sellerId";
        h = "sellerType";
        i = "linkUrl";
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : dyx.a(str);
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        if (intent != null && intent.getData() != null) {
            return intent.getData().getQueryParameter(b);
        }
        return null;
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        if (intent != null && intent.getData() != null) {
            return intent.getData().getQueryParameter(f11376a);
        }
        return null;
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            String queryParameter = intent.getData().getQueryParameter(i);
            if (!StringUtils.isEmpty(queryParameter) && context != null) {
                epj.f().navigateTo(context, queryParameter, null);
                return true;
            }
        }
        return false;
    }

    public static void c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{intent});
        } else if (intent != null && intent.getData() != null && (data = intent.getData()) != null) {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_Detail_Service_ShowPage");
            uTCustomHitBuilder.setEventPage("Page_Detail");
            uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2201");
            for (String str : data.getQueryParameterNames()) {
                if (!StringUtils.isEmpty(str)) {
                    String queryParameter = data.getQueryParameter(str);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        uTCustomHitBuilder.setProperty(str, queryParameter);
                    }
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }
}
