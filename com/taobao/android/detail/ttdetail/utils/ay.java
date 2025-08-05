package com.taobao.android.detail.ttdetail.utils;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class ay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-174019494);
    }

    public static boolean a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(UUID.randomUUID().hashCode());
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        Uri a2 = l.a(data);
        if ("true".equalsIgnoreCase(a2.getQueryParameter("hybrid"))) {
            return false;
        }
        JSONObject p = j.p();
        if (j.b(p) || !j.a(null, p)) {
            return false;
        }
        if (l.b(intent)) {
            return true;
        }
        if (e.b()) {
            a2 = a2.buildUpon().appendQueryParameter(e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
        }
        Uri a3 = an.a(a2);
        av.a(valueOf);
        com.taobao.android.detail.ttdetail.performance.d.b(valueOf);
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        if (longExtra >= 0) {
            av.c(valueOf, "userClick", longExtra);
        }
        av.c(valueOf, "nav", currentTimeMillis);
        intent.putExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV_ORIGINAL_HOST, a3.getAuthority());
        intent.setData(l.b(a3));
        l.a(intent);
        intent.putExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV, valueOf);
        i.a("NavOnClickUtils", "nav token=" + valueOf);
        if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sDisableStreamingNetwork))) {
            com.taobao.android.detail.ttdetail.request.a.a(valueOf);
            if (!odg.o().a()) {
                com.taobao.android.detail.ttdetail.request.b.a(intent);
            }
            com.taobao.android.detail.ttdetail.request.b.b(intent);
        }
        com.taobao.android.detail.ttdetail.performance.d.a(valueOf).a((ViewGroup) null);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "onNavClicked2TTDetail(): " + (currentTimeMillis2 - currentTimeMillis));
        return true;
    }
}
