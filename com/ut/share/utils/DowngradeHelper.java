package com.ut.share.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes9.dex */
public class DowngradeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2112666547);
    }

    public static boolean isDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d78b3ac0", new Object[]{str})).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", str + "Downgrade" + Build.VERSION.SDK_INT, "0"));
    }
}
