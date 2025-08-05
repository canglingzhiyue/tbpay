package com.taobao.tao.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.config.a;
import tb.kge;

/* loaded from: classes8.dex */
public class SpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_VALID_TIME = "_cache_valid_time";
    public static final String CACHE_VERISON = "cache_verison";
    public static final String GUIDE = "share_new_menu_guide";
    private static final String PLAY_TOGETHER_KEY = "taopassword-shareplay-longtime";
    private static final String PLAY_TOGETHER_SHARE = "play_together_share";
    public static final String SHARE_CACHE_DATA = "share_cache_data";
    public static final String SHARE_DATA = "_share_data";
    public static final String SHARE_GUIDE = "share_guide";
    private static final String SHARE_KEY = "taopassword-show-timestamp";
    public static final String START_GUIDE_NEW = "start_guide_new";

    static {
        kge.a(-383935321);
    }

    public static void cacheSaveGuide(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d807a6", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = a.a().getSharedPreferences(GUIDE, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static boolean getGuide(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb3d22a9", new Object[]{context, str})).booleanValue() : context.getSharedPreferences(GUIDE, 0).getBoolean(str, false);
    }

    public static String getCacheShareData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c347d2", new Object[]{str});
        }
        SharedPreferences sharedPreferences = a.a().getSharedPreferences(SHARE_CACHE_DATA, 0);
        return sharedPreferences.getString(str + SHARE_DATA, "");
    }

    public static String getCacheDataValidTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6e144dc", new Object[]{str});
        }
        SharedPreferences sharedPreferences = a.a().getSharedPreferences(SHARE_CACHE_DATA, 0);
        return sharedPreferences.getString(str + CACHE_VALID_TIME, "");
    }

    public static void saveCacheData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd767b4", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences.Editor edit = a.a().getSharedPreferences(SHARE_CACHE_DATA, 0).edit();
        edit.putString(str + SHARE_DATA, str2);
        edit.putString(str + CACHE_VALID_TIME, str3);
        edit.apply();
    }

    public static void clearMtopCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8645d51e", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = a.a().getSharedPreferences(SHARE_CACHE_DATA, 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void saveCacheVerison(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d94e38", new Object[]{str});
            return;
        }
        SharedPreferences.Editor edit = a.a().getSharedPreferences(SHARE_CACHE_DATA, 0).edit();
        edit.putString(CACHE_VERISON, str);
        edit.apply();
    }

    public static String getCacheVerison() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0879bb9", new Object[0]) : a.a().getSharedPreferences(SHARE_CACHE_DATA, 0).getString(CACHE_VERISON, "true");
    }

    public static void saveShareShowingTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3cea3aa", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = a.a().getSharedPreferences(PLAY_TOGETHER_SHARE, 0).edit();
        edit.putLong(SHARE_KEY, j);
        edit.apply();
    }

    public static boolean getPlayTogetherIsShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3b9bca2", new Object[0])).booleanValue() : a.a().getSharedPreferences(PLAY_TOGETHER_SHARE, 0).getBoolean(PLAY_TOGETHER_KEY, false);
    }
}
