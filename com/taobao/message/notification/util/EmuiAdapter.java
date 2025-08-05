package com.taobao.message.notification.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import tb.kge;

/* loaded from: classes7.dex */
public class EmuiAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EMUI_END_VERSION = "5.0";
    private static final String EMUI_START_VERSION = "3.1";
    private static final String EMUI_VERSION_SPLITER = "_";
    private static final String TAG = "EmuiAdapter";

    static {
        kge.a(-2069267953);
    }

    public static String getRawVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0768733", new Object[0]);
        }
        String str = "";
        try {
            str = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.build.version.emui").getInputStream())).readLine();
            TLog.logd(TAG, "emui version: " + str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getNumVersion() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd31e191", new Object[0]);
        }
        String rawVersion = getRawVersion();
        if (!TextUtils.isEmpty(rawVersion)) {
            String[] split = rawVersion.split("_");
            if (split.length > 1) {
                str = split[1];
                TLog.logd(TAG, "emui num version:" + str);
                return str;
            }
        }
        str = "";
        TLog.logd(TAG, "emui num version:" + str);
        return str;
    }

    public static boolean isOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebba7cb4", new Object[0])).booleanValue();
        }
        String numVersion = getNumVersion();
        return !TextUtils.isEmpty(numVersion) && versionCompare("3.1", numVersion) <= 0 && versionCompare("5.0", numVersion) > 0;
    }

    public static int versionCompare(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf5c25fb", new Object[]{str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i < split.length && i < split2.length) {
            return Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
        }
        return Integer.signum(split.length - split2.length);
    }
}
