package com.huawei.hms.framework.common;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public static void deleteSecure(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Logger.w(TAG, "deleteSecure exception");
    }

    public static void deleteSecure(String str) {
        if (!StringUtils.isEmpty(str)) {
            deleteSecure(newFile(str));
        }
    }

    public static String getCacheDirPath(Context context) {
        return context == null ? "" : ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        String str2;
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e) {
            e = e;
            str2 = "the canonicalPath has IOException";
            Logger.w(TAG, str2, e);
            return str;
        } catch (SecurityException e2) {
            e = e2;
            str2 = "the canonicalPath has securityException";
            Logger.w(TAG, str2, e);
            return str;
        } catch (Exception e3) {
            e = e3;
            str2 = "the canonicalPath has other Exception";
            Logger.w(TAG, str2, e);
            return str;
        }
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        return (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_FILE_NAME)) ? new File(str) : new ExternalStorageFile(str);
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
        if (str != null) {
            return (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_INPUTSTREAM_NAME)) ? new FileInputStream(str) : new ExternalStorageFileInputStream(str);
        }
        Logger.w(TAG, "newFileInputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
        if (file != null) {
            return (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_OUTPUTSTREAM_NAME)) ? new FileOutputStream(file) : new ExternalStorageFileOutputStream(file);
        }
        Logger.e(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str != null) {
            return (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(RANDOM_ACCESS_FILE_NAME)) ? new RandomAccessFile(str, str2) : new ExternalStorageRandomAccessFile(str, str2);
        }
        Logger.w(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }
}
