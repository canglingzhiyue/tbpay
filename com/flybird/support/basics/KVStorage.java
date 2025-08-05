package com.flybird.support.basics;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cun;

/* loaded from: classes4.dex */
public final class KVStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static SharedPreferences a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
        }
        Context context = AppContextHolder.f7228a;
        cun.a(context, "no app ctx");
        return context.getSharedPreferences(str, 0);
    }

    public static void deleteKeysWithPrefix(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28c75b2", new Object[]{str, str2});
            return;
        }
        SharedPreferences a2 = a(str);
        SharedPreferences.Editor edit = a2.edit();
        for (String str3 : a2.getAll().keySet()) {
            if (str3.startsWith(str2)) {
                edit.remove(str3);
            }
        }
        edit.apply();
    }

    public static String getKeyValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5bd91d", new Object[]{str, str2}) : a(str).getString(str2, null);
    }

    public static byte[] getKeyValueData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("61420ad0", new Object[]{str, str2});
        }
        String string = a(str).getString(str2, null);
        if (string == null) {
            return null;
        }
        try {
            return Base64.decode(string, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setKeyValue(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b28ef9", new Object[]{str, str2, str3});
        } else {
            a(str).edit().putString(str2, str3).apply();
        }
    }

    public static void setKeyValueData(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a061540", new Object[]{str, str2, bArr});
        } else {
            a(str).edit().putString(str2, bArr != null ? Base64.encodeToString(bArr, 0) : null).apply();
        }
    }
}
