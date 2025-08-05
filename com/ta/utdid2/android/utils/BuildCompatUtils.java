package com.ta.utdid2.android.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class BuildCompatUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1283229192);
    }

    public static boolean isAtLeastQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2398b670", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 29 || (Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'Q' && Build.VERSION.CODENAME.charAt(0) <= 'Z');
    }

    public static boolean isAtLeastM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2360586c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23;
    }
}
