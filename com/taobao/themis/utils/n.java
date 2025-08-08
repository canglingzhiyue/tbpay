package com.taobao.themis.utils;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import tb.kge;

/* loaded from: classes9.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1711357516);
    }

    public static String a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7b3081c", new Object[]{activity, str});
        }
        try {
            String queryParameter = o.b(str).getQueryParameter("spm");
            return (!StringUtils.isEmpty(queryParameter) || activity == null) ? queryParameter : UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity);
        } catch (Throwable th) {
            Log.e("UserTrackerUtils", th.getLocalizedMessage());
            return "";
        }
    }
}
