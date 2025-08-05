package com.taobao.taobaoavsdk.cache.library;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.io.Serializable;
import tb.kge;
import tb.oyu;

/* loaded from: classes8.dex */
public final class StorageUtils implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INDIVIDUAL_DIR_NAME = "video-cache";
    private static volatile boolean mDeleting;

    static {
        kge.a(1194477026);
        kge.a(1028243835);
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        mDeleting = z;
        return z;
    }

    public static File getIndividualCacheDirectory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d4d0ee86", new Object[]{context});
        }
        File file = new File(getCacheDirectory(context, true), INDIVIDUAL_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File getCacheDirectory(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ded39579", new Object[]{context, new Boolean(z)});
        }
        File file = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        if (z && "mounted".equals(str)) {
            file = getExternalCacheDir(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    private static File getExternalCacheDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9b648098", new Object[]{context});
        }
        File file = new File(new File(new File(new File(oyu.e(), "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static void clearVideoCache(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c3fbad", new Object[]{context});
        } else if (mDeleting) {
        } else {
            try {
                mDeleting = true;
                final String absolutePath = getIndividualCacheDirectory(context).getAbsolutePath();
                Coordinator.execute(new Runnable() { // from class: com.taobao.taobaoavsdk.cache.library.StorageUtils.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        StorageUtils.deleteFolder(absolutePath);
                        StorageUtils.access$002(false);
                    }
                });
            } catch (Throwable unused) {
                mDeleting = false;
            }
        }
    }

    public static void deleteFolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e4ebca", new Object[]{str});
            return;
        }
        File[] listFiles = new File(str).listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            try {
                if (listFiles[i].isDirectory()) {
                    deleteFolder(str + "/" + listFiles[i].getName());
                }
                listFiles[i].delete();
            } catch (Exception unused) {
                return;
            }
        }
    }
}
