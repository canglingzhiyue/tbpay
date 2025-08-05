package com.taobao.android.festival.utils;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1634093011);
    }

    public static File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{context});
        }
        File filesDir = context.getFilesDir();
        if (a(filesDir)) {
            return filesDir;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (a(externalFilesDir)) {
                return externalFilesDir;
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (a(externalCacheDir)) {
                return externalCacheDir;
            }
        }
        File cacheDir = context.getCacheDir();
        if (!a(cacheDir)) {
            return null;
        }
        return cacheDir;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue() : file != null && file.canWrite();
    }
}
