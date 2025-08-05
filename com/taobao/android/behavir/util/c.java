package com.taobao.android.behavir.util;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2023138418);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (com.taobao.android.behavix.d.b() == null) {
            return "";
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.taobao.android.behavix.d.b());
        String string = defaultSharedPreferences.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
        return TextUtils.isEmpty(string) ? defaultSharedPreferences.getString("PREF_KEY_CHECKED_COUNTRY_CODE", "CN") : string;
    }
}
