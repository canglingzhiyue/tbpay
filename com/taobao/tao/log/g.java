package com.taobao.tao.log;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import tb.kge;
import tb.rfx;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f20690a;

    static {
        kge.a(-787081802);
        f20690a = "yyyyMMdd";
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED;
    }

    public static boolean c(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue();
        }
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                z &= a(file2);
            }
        }
        return z;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    z &= a(file2);
                }
            }
            file.delete();
            return z;
        }
        return file.delete();
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        if (a(file) && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static String[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f4bbd6aa", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[i];
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = currentTimeMillis - (i2 * 86400000);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f20690a);
            for (int i3 = 0; i3 < jArr.length; i3++) {
                strArr[i3] = simpleDateFormat.format(new Date(jArr[i3]));
            }
            return strArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)}) : new SimpleDateFormat(f20690a).format(new Date(j));
    }

    public static Map<String, LogLevel> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("off")) {
            return null;
        }
        String[] split = str.split(",");
        if (split != null) {
            hashMap = new HashMap();
            for (String str2 : split) {
                String[] split2 = str2.split("@");
                if (split2 != null && split2.length > 0) {
                    if (split2.length == 1) {
                        hashMap.put(split2[0], LogLevel.N);
                    } else if (split2.length == 2) {
                        hashMap.put(split2[0], b(split2[1]));
                    }
                }
            }
        }
        return hashMap;
    }

    public static LogLevel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("9cdc7cd9", new Object[]{str});
        }
        LogLevel logLevel = LogLevel.L;
        if ("ERROR".equalsIgnoreCase(str)) {
            return LogLevel.E;
        }
        if ("WARN".equalsIgnoreCase(str)) {
            return LogLevel.W;
        }
        if ("INFO".equalsIgnoreCase(str)) {
            return LogLevel.I;
        }
        if ("DEBUG".equalsIgnoreCase(str)) {
            return LogLevel.D;
        }
        return "VERBOSE".equalsIgnoreCase(str) ? LogLevel.V : logLevel;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            FileChannel channel = fileOutputStream.getChannel();
            try {
                channel.write(Charset.forName("utf8").encode(str2));
                if (channel != null) {
                    channel.close();
                }
                fileOutputStream.close();
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        bufferedReader.close();
                        fileInputStream.close();
                        return sb2;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(List<File> list, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bc66314", new Object[]{list, file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            WritableByteChannel newChannel = Channels.newChannel(zipOutputStream);
            for (File file2 : list) {
                a(file2, null, zipOutputStream, newChannel);
            }
            if (newChannel != null) {
                newChannel.close();
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (file.exists()) {
                file.delete();
            }
            return false;
        }
    }

    private static void a(File file, String str, ZipOutputStream zipOutputStream, WritableByteChannel writableByteChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19823339", new Object[]{file, str, zipOutputStream, writableByteChannel});
        } else if (file != null) {
            String name = TextUtils.isEmpty(str) ? file.getName() : str + file.getName();
            try {
                if (file.isDirectory()) {
                    String str2 = name + "/";
                    zipOutputStream.putNextEntry(new ZipEntry(str2));
                    zipOutputStream.closeEntry();
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return;
                    }
                    for (File file2 : listFiles) {
                        a(file2, str2, zipOutputStream, writableByteChannel);
                    }
                    return;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileChannel channel = fileInputStream.getChannel();
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(name));
                        channel.transferTo(0L, file.length(), writableByteChannel);
                        zipOutputStream.closeEntry();
                        if (channel != null) {
                            channel.close();
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static List<File> a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f286b33e", new Object[]{file, str});
        }
        ArrayList arrayList = null;
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    List<File> a2 = a(file2, str);
                    if (a2 != null && !a2.isEmpty()) {
                        arrayList.addAll(a2);
                    }
                } else if (file2.exists() && file2.getName().matches(str)) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    public static boolean c(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (context != null && (sharedPreferences = context.getSharedPreferences(rfx.INNER_USER_CONFIG, 0)) != null) {
            return sharedPreferences.getBoolean("is_inner_user", false);
        }
        return false;
    }
}
