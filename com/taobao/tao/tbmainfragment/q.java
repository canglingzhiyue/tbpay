package com.taobao.tao.tbmainfragment;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1232177834);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : a(str, "1");
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("spm");
            if (!StringUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split("\\.");
                if (split.length >= 2) {
                    String str3 = split[1];
                    if (!StringUtils.isEmpty(str2)) {
                        String[] split2 = str2.trim().split(",");
                        if (split2.length == 1 && "*".equals(split2[0])) {
                            return true;
                        }
                        if (Arrays.asList(split2).contains(str3)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
