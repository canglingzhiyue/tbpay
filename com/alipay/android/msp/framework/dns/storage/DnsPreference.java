package com.alipay.android.msp.framework.dns.storage;

import com.alipay.android.msp.framework.storage.PrefUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DnsPreference {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IPS = "ips";
    public static final String KEY_LAST_SYNC_TIME = "last_sync_time";
    public static final String KEY_TRADE = "trade";
    public static final String PREF_FILE_NAME = "cashier_amdc_cache";

    public static void putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else {
            PrefUtils.putString(PREF_FILE_NAME, str, str2);
        }
    }

    public static void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{str});
        } else {
            PrefUtils.remove(PREF_FILE_NAME, str);
        }
    }

    public static String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2}) : PrefUtils.getString(PREF_FILE_NAME, str, str2);
    }

    public static void putLong(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e506bb", new Object[]{str, l});
        } else {
            PrefUtils.putLong(PREF_FILE_NAME, str, l);
        }
    }

    public static Long getLong(String str, Long l) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("e8825293", new Object[]{str, l}) : PrefUtils.getLong(PREF_FILE_NAME, str, l);
    }
}
