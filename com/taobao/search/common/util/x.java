package com.taobao.search.common.util;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes7.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-693540741);
    }

    public static boolean a(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53a5b208", new Object[]{str, activity})).booleanValue();
        }
        if (!str.startsWith(k.HTTP_PREFIX) && !str.startsWith(k.HTTPS_PREFIX)) {
            q.i("SearchUrlNavUtil", "搜索内容非URL，进行关键词搜索");
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (StringUtils.isEmpty(host)) {
                q.h("SearchUrlNavUtil", "host为空");
                return false;
            } else if (!host.endsWith(".taobao.com") && !host.endsWith(".tmall.com") && !host.endsWith(k.ALIBABA_INC_HOST)) {
                return false;
            } else {
                Nav.from(activity).toUri(str);
                return true;
            }
        } catch (Exception e) {
            q.c("SearchUrlNavUtil", "获取host失败：" + str, e);
            return false;
        }
    }
}
