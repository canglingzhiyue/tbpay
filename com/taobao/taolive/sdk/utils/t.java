package com.taobao.taolive.sdk.utils;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_BACKGROUND_PLAY = "enableBackgroundPlay";

    static {
        kge.a(-69806904);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !pmd.a().a("closeBgVideoPlay") && u.u();
    }

    public static boolean b() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (pmd.a().u() != null && pmd.a().u().c() != null && (sharedPreferences = pmd.a().u().c().getSharedPreferences("taolive", 0)) != null) {
            return sharedPreferences.getBoolean(KEY_ENABLE_BACKGROUND_PLAY, u.v());
        }
        return false;
    }
}
