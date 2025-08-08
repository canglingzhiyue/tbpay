package com.taobao.homepage.utils;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-829805674);
    }

    @Deprecated
    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!StringUtils.equals("poplayer", parse.getScheme()) || !StringUtils.equals("homepage_interest", parse.getHost())) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("sectionBizCode", str2).build();
        return buildUpon.toString();
    }
}
