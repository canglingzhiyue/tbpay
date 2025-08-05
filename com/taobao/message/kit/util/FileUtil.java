package com.taobao.message.kit.util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.util.c;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import tb.kge;

/* loaded from: classes7.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtil";
    private static ILocalZipReader sLocalZipReader;

    /* loaded from: classes7.dex */
    public interface ILocalZipReader {
        String loadZipFromAsset(Context context, String str);
    }

    static {
        kge.a(-1599662889);
    }

    public static File createSDFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2a4ae613", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] readFile(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f08cf7fa", new Object[]{str});
        }
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (Exception unused2) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFile(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a348817", new Object[]{str, bArr})).booleanValue();
        }
        File createSDFile = createSDFile(str);
        FileOutputStream fileOutputStream2 = null;
        if (createSDFile != null) {
            try {
                fileOutputStream = new FileOutputStream(createSDFile);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream2 = fileOutputStream;
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Exception unused4) {
                    return false;
                }
            }
        }
        try {
            fileOutputStream2.close();
            return true;
        } catch (Exception unused5) {
            return false;
        }
    }

    public static String getDiskFileDir(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3f43b33", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if ((!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) || externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file = new File(externalFilesDir, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static String getDiskCacheDir(Context context, String str) {
        File externalCacheDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2c35c33", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && context.getExternalCacheDir() != null) {
            externalCacheDir = context.getExternalCacheDir();
        } else {
            externalCacheDir = context.getCacheDir();
        }
        File file = new File(externalCacheDir, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static float getFreeMSpace(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76e3db09", new Object[]{file})).floatValue();
        }
        if (file == null) {
            return 0.0f;
        }
        return (((float) file.getFreeSpace()) / 1024.0f) / 1024.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:75:0x00ae). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readTextFile(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.util.FileUtil.readTextFile(java.lang.String):java.lang.String");
    }

    public static long deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea11bd0c", new Object[]{str})).longValue();
        }
        try {
            return removeDir(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    private static long removeDir(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15f46b2e", new Object[]{str})).longValue() : removeFile(new File(str));
    }

    private static long removeFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfa94dd2", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isFile()) {
            long length = file.length();
            file.delete();
            return length;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            file.delete();
            return 0L;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                j += removeFile(listFiles[i]);
            } else {
                j += listFiles[i].length();
                listFiles[i].delete();
            }
        }
        file.delete();
        return j;
    }

    public static void copyFileFast(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1cb3942", new Object[]{file, file2});
            return;
        }
        File file3 = new File(file2.getParent());
        if (!file3.exists()) {
            file3.mkdirs();
        }
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        try {
            try {
                channel.transferTo(0L, channel.size(), channel2);
            } catch (IOException e) {
                throw e;
            }
        } finally {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    public static Bitmap readBitmap(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("b4f8ec14", new Object[]{str}) : readBitmap(str, null);
    }

    public static Bitmap readBitmap(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e006372", new Object[]{str, options});
        }
        Bitmap bitmap = null;
        if (str == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                bitmap = BitmapFactory.decodeStream(fileInputStream, null, options);
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
        return bitmap;
    }

    public static void writeBitmap(String str, Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717a93d4", new Object[]{str, bitmap, new Integer(i)});
        } else if (bitmap == null || str == null) {
        } else {
            boolean endsWith = str.endsWith(".png");
            File file = new File(str);
            if (file.exists()) {
                file = new File(str + ".tmp");
                file.delete();
                z = false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        if (endsWith) {
                            bitmap.compress(Bitmap.CompressFormat.PNG, i, fileOutputStream2);
                        } else {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream2);
                        }
                        try {
                            fileOutputStream2.close();
                            if (z) {
                                return;
                            }
                            file.renameTo(new File(str));
                        } catch (IOException unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream == null) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.FileInputStream] */
    public static String copyFile(String str, Uri uri, String str2, String str3, String str4) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b89a7bd", new Object[]{str, uri, str2, str3, str4});
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", c.a(str) + "." + str2);
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", str4 + "/taobao");
        }
        contentValues.put("mime_type", str3);
        contentValues.put("is_pending", (Boolean) false);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        String saveDirPath = getSaveDirPath();
        String absolutePath = new File(saveDirPath, c.a(str) + "." + str2).getAbsolutePath();
        ?? r9 = 0;
        r9 = 0;
        try {
            try {
                Uri insert = ApplicationUtil.getApplication().getContentResolver().insert(uri, contentValues);
                if (insert != null) {
                    uri = ApplicationUtil.getApplication().getContentResolver().openOutputStream(insert);
                } else {
                    uri = new FileOutputStream(absolutePath);
                }
                try {
                    fileInputStream = new FileInputStream(str);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (r9 != 0) {
                        try {
                            r9.close();
                        } catch (IOException e2) {
                            TLog.loge("FileUtil", e2.getMessage(), e2);
                        }
                    }
                    if (uri != 0) {
                        try {
                            uri.close();
                        } catch (IOException e3) {
                            TLog.loge("FileUtil", e3.getMessage(), e3);
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                uri = 0;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                uri = 0;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    uri.write(bArr, 0, read);
                }
                uri.flush();
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    TLog.loge("FileUtil", e5.getMessage(), e5);
                }
                if (uri != 0) {
                    try {
                        uri.close();
                    } catch (IOException e6) {
                        TLog.loge("FileUtil", e6.getMessage(), e6);
                    }
                }
                return absolutePath;
            } catch (Exception e7) {
                e = e7;
                TLog.loge("FileUtil", e.getMessage(), e);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        TLog.loge("FileUtil", e8.getMessage(), e8);
                    }
                }
                if (uri != 0) {
                    try {
                        uri.close();
                    } catch (IOException e9) {
                        TLog.loge("FileUtil", e9.getMessage(), e9);
                    }
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            r9 = saveDirPath;
        }
    }

    public static String getSaveDirPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c80b7a", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(Environment.getExternalStorageDirectory(), "ALIMP");
            if (!file.exists()) {
                file.mkdir();
            }
            if (file.canRead()) {
                return file.getAbsolutePath();
            }
        }
        return getDiskCacheDir(ApplicationUtil.getApplication(), "ALIMP");
    }

    public static String getImageType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d81894d0", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            if (!new File(str).exists()) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            String str2 = options.outMimeType;
            TLog.loge("image mime type -> ", str2);
            if (str2 == null) {
                return null;
            }
            String[] split = str2.split("/");
            if (split.length != 2) {
                return null;
            }
            return split[1].toLowerCase();
        } catch (Throwable th) {
            TLog.loge("FileUtil", Log.getStackTraceString(th));
            return null;
        }
    }

    public static boolean mkDirsIfNotExists(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fee5a3", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() || file.mkdirs();
    }

    public static boolean unzip(ZipFile zipFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80475771", new Object[]{zipFile, str})).booleanValue();
        }
        if (zipFile != null && zipFile.size() != 0 && !TextUtils.isEmpty(str) && mkDirsIfNotExists(str)) {
            try {
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    if (entries == null) {
                        return false;
                    }
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null) {
                            if (nextElement.isDirectory()) {
                                if (!mkDirsIfNotExists(str + File.separator + checkEntryName(nextElement.getName()))) {
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                String str2 = str + File.separator + checkEntryName(nextElement.getName());
                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                boolean saveFile = saveFile(inputStream, str2);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                if (!saveFile) {
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return true;
                } catch (Exception unused2) {
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } finally {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public static String checkEntryName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a33a29a", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static boolean saveFile(InputStream inputStream, String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a76ed01", new Object[]{inputStream, str})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                file = new File(str);
                new File(file.getParent()).mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e = e;
            }
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        Log.e("WxException", e2.getMessage(), e2);
                    }
                }
                return false;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
                fileOutputStream2.flush();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.e("WxException", e3.getMessage(), e3);
                    }
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    Log.e("WxException", e4.getMessage(), e4);
                }
                return true;
            } catch (IOException e5) {
                fileOutputStream = fileOutputStream2;
                e = e5;
                Log.e("WxException", e.getMessage(), e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        Log.e("WxException", e6.getMessage(), e6);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e7) {
                        Log.e("WxException", e7.getMessage(), e7);
                    }
                }
                return false;
            } catch (Throwable th) {
                fileOutputStream = fileOutputStream2;
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        Log.e("WxException", e8.getMessage(), e8);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e9) {
                        Log.e("WxException", e9.getMessage(), e9);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void setLocalZipReader(ILocalZipReader iLocalZipReader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2822e6fc", new Object[]{iLocalZipReader});
        } else {
            sLocalZipReader = iLocalZipReader;
        }
    }

    public static String loadZipFromAsset(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e7b12a0", new Object[]{context, str});
        }
        TLog.loge("FileUtil", "loadZipFromAsset Path: " + str);
        ILocalZipReader iLocalZipReader = sLocalZipReader;
        if (iLocalZipReader != null) {
            return iLocalZipReader.loadZipFromAsset(context, str);
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Looper.myLooper() == Looper.getMainLooper() && ApplicationUtil.isDebug()) {
                throw new IllegalStateException("loadZipFromAsset is time consuming, cannot running in mainThread!");
            }
            try {
                ZipInputStream zipInputStream = new ZipInputStream(AssetsDelegate.proxy_open(context.getAssets(), str));
                StringBuilder sb = new StringBuilder();
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    StringBuilder sb2 = new StringBuilder();
                    byte[] bArr = new byte[zipInputStream.available()];
                    while (zipInputStream.read(bArr) > 0) {
                        sb2.append(new String(bArr).trim());
                    }
                    sb.append(sb2.toString());
                }
                zipInputStream.close();
                return sb.toString();
            } catch (IOException e) {
                TLog.loge("FileUtil", Log.getStackTraceString(e));
            }
        }
        return null;
    }

    public static String loadZipFromAssetWithVersionCache(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a7af5a6", new Object[]{context, str, str2});
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && ApplicationUtil.isDebug()) {
            throw new IllegalStateException("loadZipFromAsset is time consuming, cannot running in mainThread!");
        }
        String msgFeatureVersion = BundleSplitUtil.INSTANCE.getMsgFeatureVersion();
        if (TextUtils.isEmpty(msgFeatureVersion)) {
            msgFeatureVersion = ApplicationBuildInfo.getAppVersionName();
        }
        String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference(str2, msgFeatureVersion, "");
        if (TextUtils.isEmpty(stringSharedPreference)) {
            String loadZipFromAsset = loadZipFromAsset(context, str);
            if (!TextUtils.isEmpty(loadZipFromAsset)) {
                clearFileSync(str2);
                SharedPreferencesUtil.addStringSharedPreference(str2, msgFeatureVersion, loadZipFromAsset);
                return loadZipFromAsset;
            }
        }
        return stringSharedPreference;
    }

    private static void clearFileSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6d0b35", new Object[]{str});
        } else {
            ApplicationUtil.getApplication().getSharedPreferences(str, 0).edit().clear().commit();
        }
    }
}
