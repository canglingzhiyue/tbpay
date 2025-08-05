package com.taobao.alimama.io;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class SharedPreferencesUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_FILE_NAME = "alimama_advertising";

    static {
        kge.a(1620505195);
    }

    private static synchronized SharedPreferences getSharedPreference() {
        synchronized (SharedPreferencesUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("586de5b1", new Object[0]);
            }
            return Global.getApplication().getSharedPreferences(SP_FILE_NAME, 0);
        }
    }

    private static SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[0]) : getSharedPreference().edit();
    }

    public static String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2}) : getSharedPreference().getString(str, str2);
    }

    public static int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue() : getSharedPreference().getInt(str, i);
    }

    public static void putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void putInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void putStringSet(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac6250c", new Object[]{str, set});
        } else if (set == null) {
        } else {
            SharedPreferences.Editor edit = edit();
            edit.putStringSet(str, set);
            edit.apply();
        }
    }

    public static Set<String> getStringSet(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7845431b", new Object[]{str}) : getSharedPreference().getStringSet(str, null);
    }

    public static void removeKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9b7b8c", new Object[]{str});
            return;
        }
        SharedPreferences.Editor edit = edit();
        edit.remove(str);
        edit.apply();
    }
}
