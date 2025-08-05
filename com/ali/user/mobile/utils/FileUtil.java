package com.ali.user.mobile.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;
import java.io.File;
import java.text.SimpleDateFormat;
import tb.kge;

/* loaded from: classes2.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(631361156);
    }

    public static String getExtensionName(String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab49fbfb", new Object[]{str}) : (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) ? str : str.substring(lastIndexOf + 1);
    }

    public static void deleteFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807b73c5", new Object[]{file});
        } else if (!file.exists()) {
        } else {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void writeFileData(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.utils.FileUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r6
            java.lang.String r4 = "d9fc5e10"
            r0.ipc$dispatch(r4, r1)
            return
        L18:
            r4 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3b
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L48
            byte[] r4 = r6.getBytes(r4)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L48
            r5.write(r4)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L48
            r5.close()     // Catch: java.lang.Exception -> L33
        L33:
            return
        L34:
            r4 = move-exception
            goto L3f
        L36:
            r5 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
            goto L49
        L3b:
            r5 = move-exception
            r3 = r5
            r5 = r4
            r4 = r3
        L3f:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.lang.Exception -> L47
        L47:
            return
        L48:
            r4 = move-exception
        L49:
            if (r5 == 0) goto L4e
            r5.close()     // Catch: java.lang.Exception -> L4e
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.FileUtil.writeFileData(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readFileData(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.utils.FileUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "57a44251"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.String r4 = ""
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            int r0 = r5.available()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            if (r0 <= 0) goto L38
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            r5.read(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            r4 = r1
        L38:
            r5.close()     // Catch: java.lang.Exception -> L4b
            goto L4b
        L3c:
            r0 = move-exception
            goto L45
        L3e:
            r4 = move-exception
            r5 = r0
            goto L4d
        L41:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L45:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L4b
            goto L38
        L4b:
            return r4
        L4c:
            r4 = move-exception
        L4d:
            if (r5 == 0) goto L52
            r5.close()     // Catch: java.lang.Exception -> L52
        L52:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.FileUtil.readFileData(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void writeSdcardFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e28957", new Object[]{str, str2});
            return;
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        String str3 = DataProviderFactory.getApplicationContext().getFilesDir().getPath() + "/device/";
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        writeFileData(applicationContext, str3 + str, str2);
    }

    public static String getSdcardFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c89d0dc", new Object[]{str});
        }
        String str2 = DataProviderFactory.getApplicationContext().getFilesDir().getPath() + "/device/";
        if (!new File(str2).exists()) {
            return "";
        }
        return readFileData(DataProviderFactory.getApplicationContext(), str2 + str);
    }

    public static String getEaDeviceId() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8166016", new Object[0]);
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 3) {
            str = "ONLINE";
        } else {
            str = DataProviderFactory.getDataProvider().getEnvType() == 2 ? "PRE" : "TEST";
        }
        return DataProviderFactory.getApplicationContext().getSharedPreferences("onesdk_device", 0).getString(str + "_sdkDeviceId", null);
    }

    public static int getLaunchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff14c017", new Object[0])).intValue();
        }
        int i = 1;
        try {
            SharedPreferences sharedPreferences = (DataProviderFactory.getApplicationContext() != null ? DataProviderFactory.getApplicationContext() : SessionManager.getContext()).getSharedPreferences("aliuser_bootcount", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (!sharedPreferences.getString("todaytime", "").equals(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())))) {
                edit.putString("todaytime", simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            int i2 = sharedPreferences.getInt("bootcountnum", 0);
            if (i2 > 0) {
                int i3 = i2 + 1;
                edit.putInt("bootcountnum", i3);
                i = i3;
            } else {
                edit.putInt("bootcountnum", 1);
            }
            edit.apply();
        } catch (Exception unused) {
        }
        return i;
    }
}
