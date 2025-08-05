package com.taobao.taolive.room.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.kge;
import tb.plx;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUFF_SIZE = 4096;

    static {
        kge.a(-216962313);
    }

    public static void a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        String substring = name.substring(0, name.length() - 1);
                        new File(str2 + File.separator + substring).mkdirs();
                    } else {
                        Log.e(com.alibaba.security.realidentity.f.f3394a, str2 + File.separator + name);
                        File file = new File(str2 + File.separator + name);
                        if (!file.exists()) {
                            Log.e(com.alibaba.security.realidentity.f.f3394a, "Create the file:" + str2 + File.separator + name);
                            file.getParentFile().mkdirs();
                            file.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        fileOutputStream.close();
                    }
                }
            } else {
                zipInputStream.close();
                fileInputStream.close();
                return;
            }
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = Environment.getDownloadCacheDirectory().getAbsolutePath();
        }
        if (str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    public static String a(Context context, String str) {
        String absolutePath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        try {
            if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && externalFilesDir != null) {
                absolutePath = externalFilesDir.getAbsolutePath();
            } else {
                absolutePath = context.getFilesDir().getAbsolutePath();
            }
        } catch (Exception e) {
            absolutePath = context.getFilesDir().getAbsolutePath();
            plx.b(com.alibaba.security.realidentity.f.f3394a, "getDiskFileDir EXP :" + e.getMessage());
        }
        return absolutePath + File.separator + str;
    }

    public static void a(String str, String str2, String str3) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            Log.e(com.alibaba.security.realidentity.f.f3394a, "文件夹创建失败");
            return;
        }
        File file2 = new File(str + File.separator + str2);
        if (!file2.exists() && !file2.createNewFile()) {
            Log.e(com.alibaba.security.realidentity.f.f3394a, "文件创建失败");
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(str3.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static String b(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        File file = new File(str + File.separator + str2);
        if (!file.exists()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context.getExternalCacheDir() != null) {
            return context.getExternalCacheDir().getPath();
        }
        return context.getCacheDir().getPath();
    }
}
