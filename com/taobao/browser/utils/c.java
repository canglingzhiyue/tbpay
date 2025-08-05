package com.taobao.browser.utils;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1290425693);
    }

    @Deprecated
    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        return parse != null && parse.isHierarchical() && "302".equals(parse.getQueryParameter("utpscode"));
    }

    public static boolean a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d04957b1", new Object[]{str, strArr})).booleanValue();
        }
        if (str != null && strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (strArr[i] != null && str.indexOf(strArr[i]) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
