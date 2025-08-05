package com.taobao.tao.shop.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.g;
import com.ut.mini.UTAnalytics;
import java.net.URL;
import java.util.Iterator;
import tb.kge;
import tb.ouu;

/* loaded from: classes8.dex */
public class ShopUrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(512628262);
    }

    public boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        if (!com.taobao.tao.shop.rule.a.a() || TextUtils.isEmpty(str) || a(str)) {
            return false;
        }
        boolean a2 = g.a().a(com.taobao.tao.shop.rule.b.f21093a, str, e.b);
        if (a2 && (context instanceof Activity)) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            NotifyApm.a().a((Activity) context);
        }
        return a2;
    }

    public boolean a(String str, Context context, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c70d3b2", new Object[]{this, str, context, bVar})).booleanValue();
        }
        if (!com.taobao.tao.shop.rule.a.a() || TextUtils.isEmpty(str) || a(str)) {
            return false;
        }
        try {
            if (com.taobao.tao.shop.fetcher.adapter.b.a().o()) {
                z = EVO.isSwitchOpened(context, "delete_page");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Log.e("tbsr", "enable delete page : " + z);
        ouu.c("enable delete page : " + z);
        boolean a2 = g.a().a(com.taobao.tao.shop.rule.b.f21093a, str, e.b, bVar);
        if (a2 && (context instanceof Activity)) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            Activity activity = (Activity) context;
            NotifyApm.a().a(activity);
            if (!z) {
                activity.finish();
            }
        }
        return a2;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String str2 = null;
        try {
            str2 = new URL(str).getHost();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str2 == null) {
            return false;
        }
        Iterator<Object> it = com.taobao.tao.shop.fetcher.adapter.b.a().w().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof String) && str2.equals((String) next)) {
                return true;
            }
        }
        return false;
    }
}
