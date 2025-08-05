package com.taobao.taobao.scancode.huoyan.util;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import java.util.Calendar;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f21285a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            if (str.length() > 6 && str.substring(0, 7).equalsIgnoreCase(k.HTTP_PREFIX)) {
                return true;
            }
            if (str.length() > 7 && str.substring(0, 8).equalsIgnoreCase(k.HTTPS_PREFIX)) {
                return true;
            }
        }
        String str2 = "#" + str + "#is not http";
        return false;
    }

    static {
        kge.a(963254161);
        f21285a = null;
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        long time = (Calendar.getInstance().getTime().getTime() - j) / 3600000;
        if (0 == time) {
            return b.a(R.string.taobao_app_1007_1_18639);
        }
        return time < 24 ? String.format(b.a(R.string.taobao_app_1007_1_18643), Long.valueOf(time)) : time < 168 ? String.format(b.a(R.string.taobao_app_1007_1_18641), Long.valueOf(time / 24)) : String.format(b.a(R.string.taobao_app_1007_1_18634), Long.valueOf(time / 168));
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        return a(k.HTTPS_PREFIX + str3 + str.substring(str.indexOf(str2) + str2.length(), str.length()), "xdomain=" + str2);
    }

    public static String a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        int lastIndexOf = str.lastIndexOf(35);
        if (lastIndexOf > 0) {
            String substring = str.substring(0, lastIndexOf);
            str3 = str.substring(lastIndexOf);
            str = substring;
        } else {
            str3 = "";
        }
        return b(str, str2) + str3;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (str == null) {
            return str;
        }
        if (str.indexOf("?") != -1) {
            return str + "&" + str2;
        }
        return str + "?" + str2;
    }
}
