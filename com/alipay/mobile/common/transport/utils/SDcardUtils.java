package com.alipay.mobile.common.transport.utils;

import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class SDcardUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "SDcardUtils";

    public static boolean IsCanUseSdCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e3896d", new Object[0])).booleanValue();
        }
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSDcardAvailableSpace(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d378f9", new Object[]{new Long(j)})).booleanValue();
        }
        if (IsCanUseSdCard()) {
            return isAppAvailableSpace(j, Environment.getExternalStorageDirectory());
        }
        return false;
    }

    @Deprecated
    public static boolean isAppAvailableSpace(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f64a536d", new Object[]{new Long(j)})).booleanValue();
        }
        try {
            return isAppAvailableSpace(j, Environment.getDataDirectory());
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isAppAvailableSpace error", th);
            return true;
        }
    }

    public static boolean isAppAvailableSpace(long j, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b70b124", new Object[]{new Long(j), file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            long blockSize = statFs.getBlockSize() * statFs.getAvailableBlocks();
            if (j < blockSize) {
                return true;
            }
            String str = TAG;
            LogCatUtil.warn(str, "isAppAvailableSpace.  (space:" + j + ") < (availableSpare:" + blockSize + ")  file=" + file.getAbsolutePath());
            return false;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "isAppAvailableSpace error.", th);
            return true;
        }
    }

    public static boolean isDataDirAvailableSpace(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6b2a4cb", new Object[]{new Long(j)})).booleanValue() : isAppAvailableSpace(j);
    }
}
