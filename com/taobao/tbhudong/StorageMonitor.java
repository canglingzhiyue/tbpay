package com.taobao.tbhudong;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.qif;
import tb.qoe;
import tb.qof;

/* loaded from: classes8.dex */
public class StorageMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class StorageData implements Serializable {
        @JSONField(name = "isDirectory")
        public boolean isDirectory;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "totalSize")
        public long totalSize;

        private StorageData() {
        }
    }

    private static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : qof.b(qoe.STORAGE_MONITOR_MIN_SIZE_KEY, 5120L);
    }

    public static void a(Context context) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                if (c.a().a("isFullNewInstall", false)) {
                    qif.a("StorageMonitor.trackJson.isFullNewInstall.return.", new Object[0]);
                    return;
                }
                File parentFile = context.getCacheDir().getParentFile();
                Map<String, String> a2 = a(context, parentFile, "inner", "/InnerStorage");
                if (a2 == null) {
                    return;
                }
                String str = a2.get("innerTotalUsedSize");
                long j = 0;
                long parseLong = (!TextUtils.isEmpty(str) ? Long.parseLong(str) : 0L) + 0;
                qif.a("StorageMonitor.trackJson.innerTrackMap === %s", a2.toString());
                HashMap hashMap = new HashMap(a2);
                if (a()) {
                    Map<String, String> a3 = a(context, context.getExternalCacheDir(), "externalCache", "/ExternalCacheDir");
                    if (a3 == null) {
                        return;
                    }
                    String str2 = a3.get("externalCacheTotalUsedSize");
                    long parseLong2 = parseLong + (!TextUtils.isEmpty(str2) ? Long.parseLong(str2) : 0L);
                    qif.a("StorageMonitor.trackJson.externalCacheTrackMap === %s", a3.toString());
                    hashMap.putAll(a3);
                    Map<String, String> a4 = a(context, context.getExternalFilesDir(null), "externalFiles", "/ExternalFilesDir");
                    if (a4 == null) {
                        return;
                    }
                    String str3 = a4.get("externalFilesTotalUsedSize");
                    if (!TextUtils.isEmpty(str3)) {
                        j = Long.parseLong(str3);
                    }
                    parseLong = parseLong2 + j;
                    qif.a("StorageMonitor.trackJson.externalFilesTrackMap === %s", a4.toString());
                    hashMap.putAll(a4);
                }
                hashMap.put("totalUsedSize", String.valueOf(parseLong));
                long blockSize = new StatFs(parentFile.getAbsolutePath()).getBlockSize();
                hashMap.put("storageTotalSpace", String.valueOf((statFs.getBlockCount() * blockSize) / 1024));
                hashMap.put("storageFreeSpace", String.valueOf((statFs.getAvailableBlocks() * blockSize) / 1024));
                hashMap.put("userId", Login.getUserId());
                hashMap.put("utdid", UTDevice.getUtdid(context));
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("storage_monitor");
                uTCustomHitBuilder.setEventPage("storage_monitor");
                uTCustomHitBuilder.setProperties(hashMap);
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            } catch (Throwable th) {
                qif.a("StorageMonitor.trackStorage.error.", th);
            }
        }
    }

    private static Map<String, String> a(Context context, File file, String str, String str2) {
        String str3;
        HashMap hashMap;
        File[] fileArr;
        int i;
        int i2;
        long length;
        boolean z;
        String str4;
        HashMap hashMap2;
        File[] fileArr2;
        int i3;
        int i4;
        long length2;
        boolean z2;
        long length3;
        String str5;
        String str6 = str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a6ed660", new Object[]{context, file, str, str6});
        }
        if (context == null || file == null) {
            return null;
        }
        try {
            HashMap hashMap3 = new HashMap(2);
            JSONObject jSONObject = new JSONObject();
            long b = b();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            int length4 = listFiles.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length4) {
                File file2 = listFiles[i5];
                boolean isDirectory = file2.isDirectory();
                if (isDirectory) {
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null) {
                        int length5 = listFiles2.length;
                        long j = 0;
                        int i7 = 0;
                        z = false;
                        while (i7 < length5) {
                            int i8 = length5;
                            File file3 = listFiles2[i7];
                            File[] fileArr3 = listFiles2;
                            boolean isDirectory2 = file3.isDirectory();
                            if (isDirectory2) {
                                fileArr2 = listFiles;
                                File[] listFiles3 = file3.listFiles();
                                if (listFiles3 != null) {
                                    i3 = length4;
                                    int length6 = listFiles3.length;
                                    hashMap2 = hashMap3;
                                    long j2 = 0;
                                    int i9 = 0;
                                    z2 = false;
                                    while (i9 < length6) {
                                        int i10 = length6;
                                        File file4 = listFiles3[i9];
                                        File[] fileArr4 = listFiles3;
                                        StorageData storageData = new StorageData();
                                        if (file4.isDirectory()) {
                                            storageData.isDirectory = true;
                                            length3 = a(file4) / 1024;
                                        } else {
                                            storageData.isDirectory = false;
                                            length3 = file4.length() / 1024;
                                        }
                                        long j3 = length3;
                                        j2 += j3;
                                        int i11 = i5;
                                        storageData.name = file4.getName();
                                        storageData.totalSize = j3;
                                        if (j3 > b) {
                                            str5 = str2;
                                            jSONObject.put(a(file4, file, str5), (Object) JSON.toJSONString(storageData));
                                            z2 = true;
                                        } else {
                                            str5 = str2;
                                        }
                                        i9++;
                                        str6 = str5;
                                        length6 = i10;
                                        listFiles3 = fileArr4;
                                        i5 = i11;
                                    }
                                    str4 = str6;
                                    i4 = i5;
                                    length2 = j2;
                                } else {
                                    str4 = str6;
                                    hashMap2 = hashMap3;
                                    i3 = length4;
                                    i4 = i5;
                                    i7++;
                                    length5 = i8;
                                    str6 = str4;
                                    listFiles2 = fileArr3;
                                    listFiles = fileArr2;
                                    length4 = i3;
                                    hashMap3 = hashMap2;
                                    i5 = i4;
                                }
                            } else {
                                str4 = str6;
                                hashMap2 = hashMap3;
                                fileArr2 = listFiles;
                                i3 = length4;
                                i4 = i5;
                                length2 = file3.length() / 1024;
                                z2 = false;
                            }
                            j += length2;
                            if (length2 > b) {
                                if (!z2) {
                                    StorageData storageData2 = new StorageData();
                                    storageData2.name = file3.getName();
                                    storageData2.totalSize = length2;
                                    storageData2.isDirectory = isDirectory2;
                                    jSONObject.put(a(file3, file, str4), (Object) JSON.toJSONString(storageData2));
                                }
                                z = true;
                            }
                            i7++;
                            length5 = i8;
                            str6 = str4;
                            listFiles2 = fileArr3;
                            listFiles = fileArr2;
                            length4 = i3;
                            hashMap3 = hashMap2;
                            i5 = i4;
                        }
                        str3 = str6;
                        hashMap = hashMap3;
                        fileArr = listFiles;
                        i = length4;
                        i2 = i5;
                        length = j;
                    } else {
                        str3 = str6;
                        hashMap = hashMap3;
                        fileArr = listFiles;
                        i = length4;
                        i2 = i5;
                        i5 = i2 + 1;
                        str6 = str3;
                        listFiles = fileArr;
                        length4 = i;
                        hashMap3 = hashMap;
                    }
                } else {
                    str3 = str6;
                    hashMap = hashMap3;
                    fileArr = listFiles;
                    i = length4;
                    i2 = i5;
                    length = file2.length() / 1024;
                    z = false;
                }
                if (length > b && !z) {
                    StorageData storageData3 = new StorageData();
                    storageData3.name = file2.getName();
                    storageData3.totalSize = length;
                    storageData3.isDirectory = isDirectory;
                    jSONObject.put(a(file2, file, str3), (Object) JSON.toJSONString(storageData3));
                }
                i6 = (int) (i6 + length);
                i5 = i2 + 1;
                str6 = str3;
                listFiles = fileArr;
                length4 = i;
                hashMap3 = hashMap;
            }
            HashMap hashMap4 = hashMap3;
            hashMap4.put(str + "Storage", jSONObject.toJSONString());
            hashMap4.put(str + "TotalUsedSize", String.valueOf(i6));
            return hashMap4;
        } catch (Throwable th) {
            qif.a("StorageMonitor.trackStorageInPath.error.", th);
            return null;
        }
    }

    private static String a(File file, File file2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2afd940", new Object[]{file, file2, str});
        }
        String str2 = "";
        if (file == null || !file.exists()) {
            return str2;
        }
        String absolutePath = file.getAbsolutePath();
        if (file2 != null && file2.exists()) {
            str2 = file2.getAbsolutePath();
        }
        if (TextUtils.isEmpty(absolutePath) || TextUtils.isEmpty(str2) || !absolutePath.startsWith(str2)) {
            return absolutePath;
        }
        return str + absolutePath.substring(str2.length());
    }

    private static long a(File file) {
        long a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{file})).longValue();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                a2 = file2.length();
            } else {
                a2 = a(file2);
            }
            j += a2;
        }
        return j;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "mounted".equals(Environment.getExternalStorageState());
    }
}
