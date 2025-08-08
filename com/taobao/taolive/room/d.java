package com.taobao.taolive.room;

import android.app.Application;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.adapterimpl.network.a;
import com.taobao.taolive.room.afccoldlunch.PreSimpleRequestParams;
import com.taobao.taolive.room.afccoldlunch.b;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.u;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21618a;

    static {
        kge.a(-801034987);
        f21618a = d.class.getSimpleName();
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        String valueOf = String.valueOf(hashMap.get("startupUrl"));
        String valueOf2 = String.valueOf(hashMap.get("startIntent"));
        a(f21618a + "_APM", "InitTaoLiveColdLaunch init " + valueOf + " " + valueOf2);
        m.c();
        a(valueOf2);
    }

    public static void a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{application, str});
            return;
        }
        a(f21618a + "_APM", "InitTaoLiveColdLaunch init " + str);
        m.c();
        b(str);
    }

    private static void a(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || parse.isOpaque()) {
        } else {
            b(parse.getQueryParameter("h5Url"));
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            a(f21618a + "_APM", "InitTaoLiveColdLaunch preStartRequestDetail " + str);
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return;
            }
            a(u.b(parse), str);
        }
    }

    private static boolean a(PreSimpleRequestParams preSimpleRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c64db40", new Object[]{preSimpleRequestParams, str})).booleanValue();
        }
        if (!l.d(preSimpleRequestParams.needRecommend) && (!StringUtils.isEmpty(preSimpleRequestParams.timeMovingItemId) || RecModel.MEDIA_TYPE_TIMEMOVE.equals(preSimpleRequestParams.productType) || (StringUtils.isEmpty(preSimpleRequestParams.userId) && StringUtils.isEmpty(preSimpleRequestParams.feedId)))) {
            return false;
        }
        a(f21618a + "_APM", "InitTaoLiveColdLaunch preStartRequestDetail start");
        b.a().a(new a(), preSimpleRequestParams, str);
        return true;
    }

    private static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            return;
        }
        Log.e("TBLive_" + str, String.valueOf(obj));
        TLog.loge(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
    }
}
