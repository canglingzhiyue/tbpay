package com.taobao.uikit.actionbar.behavior;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.kge;

/* loaded from: classes9.dex */
public class ItemClickedStorageBehavior {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String STORAGE_NAME = "uikit_action_bar_storage";

    static {
        kge.a(322674724);
    }

    public static SharedPreferences getStorage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("d2ec52d0", new Object[]{context});
        }
        if (context.getApplicationContext() != null) {
            return context.getApplicationContext().getSharedPreferences(STORAGE_NAME, 0);
        }
        return context.getSharedPreferences(STORAGE_NAME, 0);
    }

    public static void setItemClicked(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379eee99", new Object[]{context, str});
            return;
        }
        SharedPreferences storage = getStorage(context);
        String storageKey = getStorageKey(str);
        if (storage.getBoolean(storageKey, false)) {
            return;
        }
        SharedPreferences.Editor edit = storage.edit();
        edit.putBoolean(storageKey, true);
        edit.apply();
    }

    public static boolean isItemClicked(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8062997", new Object[]{context, str, new Boolean(z)})).booleanValue() : getStorage(context).getBoolean(getStorageKey(str), z);
    }

    private static String getStorageKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7afc4715", new Object[]{str});
        }
        return Login.getUserId() + "_" + str;
    }
}
