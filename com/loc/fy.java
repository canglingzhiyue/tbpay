package com.loc;

import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.DPoint;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import org.json.JSONObject;
import tb.mto;

/* loaded from: classes4.dex */
public final class fy {

    /* renamed from: a  reason: collision with root package name */
    static WifiManager f7807a;
    private static int b;
    private static String[] c;
    private static String d;

    public static double a(double d2) {
        return b(d2);
    }

    public static float a(float f) {
        return (float) (((long) (f * 100.0d)) / 100.0d);
    }

    public static float a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        return a(new double[]{aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
    }

    public static float a(DPoint dPoint, DPoint dPoint2) {
        return a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), dPoint2.getLatitude(), dPoint2.getLongitude()});
    }

    public static float a(double[] dArr) {
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo.getType();
        }
        return -1;
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static Object a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationContext().getSystemService(str);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getServ");
            return null;
        }
    }

    public static String a(int i) {
        if (i != 33) {
            switch (i) {
                case 0:
                    return "success";
                case 1:
                    return "重要参数为空";
                case 2:
                    return "WIFI信息不足";
                case 3:
                    return "请求参数获取出现异常";
                case 4:
                    return "网络连接异常";
                case 5:
                    return "解析数据异常";
                case 6:
                    return "定位结果错误";
                case 7:
                    return "KEY错误";
                case 8:
                    return "其他错误";
                case 9:
                    return "初始化异常";
                case 10:
                    return "定位服务启动失败";
                case 11:
                    return "错误的基站信息，请检查是否插入SIM卡";
                case 12:
                    return "缺少定位权限";
                case 13:
                    return "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
                case 14:
                    return "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
                case 15:
                    return "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
                default:
                    switch (i) {
                        case 18:
                            return "定位失败，飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关";
                        case 19:
                            return "定位失败，没有检查到SIM卡，并且关闭了WIFI开关，请打开WIFI开关或者插入SIM卡";
                        case 20:
                            return "模糊定位失败，具体可查看错误信息/详细信息描述";
                        default:
                            return "其他错误";
                    }
            }
        }
        return "补偿定位失败，未命中缓存";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(long r4, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L9
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
        L9:
            r0 = 0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L17
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L17
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L17
            r1.applyPattern(r6)     // Catch: java.lang.Throwable -> L15
            goto L20
        L15:
            r6 = move-exception
            goto L19
        L17:
            r6 = move-exception
            r1 = r0
        L19:
            java.lang.String r0 = "Utils"
            java.lang.String r2 = "formatUTC"
            com.loc.fr.a(r6, r0, r2)
        L20:
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L2a
            long r4 = a()
        L2a:
            if (r1 != 0) goto L2f
            java.lang.String r4 = "NULL"
            return r4
        L2f:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r1.format(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.a(long, java.lang.String):java.lang.String");
    }

    public static String a(Context context, TelephonyManager telephonyManager) {
        int i = 0;
        if (telephonyManager != null) {
            try {
                if (context.getApplicationInfo().targetSdkVersion < 29 && Build.VERSION.SDK_INT < 30) {
                    i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        switch (i) {
            case 0:
                return "UNKWN";
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return "UNKWN";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.util.List<java.lang.String> a(java.io.File r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r4 = b(r4)     // Catch: java.lang.Throwable -> L52
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L36
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L54
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54
        L18:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L22
            r0.add(r1)     // Catch: java.lang.Throwable -> L2f
            goto L18
        L22:
            r3.close()     // Catch: java.io.IOException -> L5a
            r2.close()     // Catch: java.io.IOException -> L5a
            r4.close()     // Catch: java.io.IOException -> L5a
            goto L6a
        L2c:
            r0 = move-exception
            r1 = r3
            goto L3b
        L2f:
            r1 = r3
            goto L54
        L31:
            r0 = move-exception
            goto L3b
        L33:
            r0 = move-exception
            r2 = r1
            goto L3b
        L36:
            r2 = r1
            goto L54
        L38:
            r0 = move-exception
            r4 = r1
            r2 = r4
        L3b:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L41
            goto L43
        L41:
            r4 = move-exception
            goto L4e
        L43:
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.io.IOException -> L41
        L48:
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L41
            goto L51
        L4e:
            r4.printStackTrace()
        L51:
            throw r0
        L52:
            r4 = r1
            r2 = r4
        L54:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5c
        L5a:
            r4 = move-exception
            goto L67
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5a
        L61:
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.io.IOException -> L5a
            goto L6a
        L67:
            r4.printStackTrace()
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.a(java.io.File):java.util.List");
    }

    public static void a(File file, String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = c(file);
                if (str != null) {
                    fileOutputStream.write(str.getBytes());
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return c() < 17 ? d(context, "android.provider.Settings$System") : d(context, "android.provider.Settings$Global");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r2.getInt(0) > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.database.sqlite.SQLiteDatabase r13, java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "2.0.201501131131"
            java.lang.String r2 = "."
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            r2 = 0
            if (r13 == 0) goto L6b
            r3 = 1
            boolean r4 = r13.isOpen()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L1d
            goto L6b
        L1d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "type = 'table' AND name = '"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = r14.trim()     // Catch: java.lang.Throwable -> L67
            r4.append(r14)     // Catch: java.lang.Throwable -> L67
            r4.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r14 = "'"
            r4.append(r14)     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "sqlite_master"
            java.lang.String r14 = "count(*) as c"
            java.lang.String[] r7 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L67
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r13
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L59
            boolean r13 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L67
            if (r13 == 0) goto L59
            int r13 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L67
            if (r13 <= 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            if (r2 == 0) goto L6a
        L5c:
            r2.close()
            goto L6a
        L60:
            r13 = move-exception
            if (r2 == 0) goto L66
            r2.close()
        L66:
            throw r13
        L67:
            if (r2 == 0) goto L6a
            goto L5c
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[Catch: Throwable -> 0x0040, TRY_ENTER, TryCatch #1 {Throwable -> 0x0040, blocks: (B:3:0x0001, B:12:0x0011, B:14:0x0017, B:19:0x0024, B:21:0x002e, B:23:0x0037), top: B:32:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.location.Location r7, int r8) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L40
            r2 = 18
            if (r1 < r2) goto Lc
            boolean r1 = r7.isFromMockProvider()     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r2 = 1
            if (r1 == 0) goto L11
            return r2
        L11:
            android.os.Bundle r1 = r7.getExtras()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L1e
            java.lang.String r3 = "satellites"
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L40
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 > 0) goto L22
            return r2
        L22:
            if (r8 != 0) goto L40
            double r3 = r7.getAltitude()     // Catch: java.lang.Throwable -> L40
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L40
            float r8 = r7.getBearing()     // Catch: java.lang.Throwable -> L40
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L40
            float r7 = r7.getSpeed()     // Catch: java.lang.Throwable -> L40
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L40
            return r2
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.a(android.location.Location, int):boolean");
    }

    public static boolean a(AMapLocation aMapLocation) {
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0) {
            return b(aMapLocation);
        }
        return false;
    }

    public static boolean a(ew ewVar) {
        if (ewVar != null && !"8".equals(ewVar.d()) && !"5".equals(ewVar.d()) && !"6".equals(ewVar.d())) {
            return b(ewVar);
        }
        return false;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str) && !"02:00:00:00:00:00".equals(str) && !str.contains(" :");
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList<String> b2 = b(str);
            String[] split = str2.toString().split("#");
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].contains(",nb") || split[i3].contains(",access")) {
                    i++;
                    if (b2.contains(split[i3])) {
                        i2++;
                    }
                }
            }
            if ((i2 << 1) >= (b2.size() + i) * 0.618d) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return x.a(jSONObject, str);
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
        return bArr;
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j >> (i << 3)) & 255);
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        return x.b(bArr);
    }

    public static String[] a(TelephonyManager telephonyManager) {
        int i;
        String[] strArr;
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String[] strArr2 = {"0", "0"};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr2[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr2[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = Integer.parseInt(strArr2[0]);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr2[0] = "0";
        }
        if (!"0".equals(strArr2[0]) && !"0".equals(strArr2[1])) {
            c = strArr2;
        } else if ("0".equals(strArr2[0]) && "0".equals(strArr2[1]) && (strArr = c) != null) {
            return strArr;
        }
        return strArr2;
    }

    public static double b(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static int b(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= (bArr[i2] & 255) << ((1 - i2) * 8);
        }
        return i;
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }

    private static FileInputStream b(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static String b(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(fr.j)) {
            return fr.j;
        }
        CharSequence charSequence = null;
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(l.c(context), 64);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(fr.k)) {
                fr.k = null;
            }
        } catch (Throwable th2) {
            fr.a(th2, "Utils", "getAppName");
        }
        StringBuilder sb = new StringBuilder();
        if (packageInfo != null) {
            if (packageInfo.applicationInfo != null) {
                charSequence = packageInfo.applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                sb.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        String c2 = l.c(context);
        if (!TextUtils.isEmpty(c2)) {
            sb.append(",");
            sb.append(c2);
        }
        if (!TextUtils.isEmpty(fr.k)) {
            sb.append(",");
            sb.append(fr.k);
        }
        String sb2 = sb.toString();
        fr.j = sb2;
        return sb2;
    }

    public static ArrayList<String> b(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("#");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(",nb") || split[i].contains(",access")) {
                    arrayList.add(split[i]);
                }
            }
        }
        return arrayList;
    }

    public static boolean b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str, 256);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean b(AMapLocation aMapLocation) {
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        return !(longitude == mto.a.GEO_NOT_SUPPORT && latitude == mto.a.GEO_NOT_SUPPORT) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }

    public static byte[] b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (i >> (i2 << 3));
        }
        return bArr;
    }

    public static double c(double d2) {
        return ((long) (d2 * 100.0d)) / 100.0d;
    }

    public static double c(String str) throws NumberFormatException {
        return Double.parseDouble(str);
    }

    public static int c() {
        int i = b;
        if (i > 0) {
            return i;
        }
        try {
            try {
                return fu.b("android.os.Build$VERSION", "SDK_INT");
            } catch (Throwable unused) {
                return Integer.parseInt(fu.a("android.os.Build$VERSION", "SDK").toString());
            }
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public static NetworkInfo c(Context context) {
        try {
            return o.k(context);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getNetWorkInfo");
            return null;
        }
    }

    private static FileOutputStream c(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException("Directory '" + parentFile + "' could not be created");
                }
                file.createNewFile();
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, false);
    }

    public static boolean c(Context context, String str) {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT < 23 ? !(context == null || context.checkCallingOrSelfPermission(x.c(str)) != 0) : !(context == null || context.checkSelfPermission(x.c(str)) != 0)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    public static float d(String str) throws NumberFormatException {
        return Float.parseFloat(str);
    }

    public static int d() {
        return new Random().nextInt(65536) - 32768;
    }

    public static boolean d(Context context) {
        try {
            NetworkInfo c2 = c(context);
            if (c2 != null) {
                if (c2.isConnectedOrConnecting()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean d(Context context, String str) throws Throwable {
        return ((Integer) fu.a(str, "getInt", new Object[]{context.getContentResolver(), ((String) fu.a(str, "AIRPLANE_MODE_ON")).toString()}, new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    public static int e(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public static String e() {
        try {
            return p.b("S128DF1572465B890OE3F7A13167KLEI".getBytes("UTF-8")).substring(20);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean e(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
            for (String str : er.F) {
                if (context.checkCallingOrSelfPermission(str) != 0) {
                    return false;
                }
            }
        } else {
            Application application = (Application) context;
            for (String str2 : er.F) {
                try {
                    i = fu.b(application.getBaseContext(), "checkSelfPermission", str2);
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int f(String str) throws NumberFormatException {
        return Integer.parseInt(str, 16);
    }

    public static boolean f(Context context) {
        int i;
        if (context.getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            i = fu.b(((Application) context).getBaseContext(), "checkSelfPermission", er.G);
        } catch (Throwable unused) {
            i = 0;
        }
        return i == 0;
    }

    public static byte g(String str) throws NumberFormatException {
        return Byte.parseByte(str);
    }

    public static boolean g(Context context) {
        boolean z;
        if (context == null) {
            return true;
        }
        if (f7807a == null) {
            f7807a = (WifiManager) a(context, "wifi");
        }
        if (!c(context, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
            fr.a(new Exception("n_aws"), "OPENSDK_UTS", "iwfal_n_aws");
            z = false;
            return z ? z : z;
        }
        z = f7807a.isWifiEnabled();
        if (z && c() > 17) {
            try {
                return "true".equals(String.valueOf(fu.a(f7807a, "isScanAlwaysAvailable", new Object[0])));
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String h(Context context) {
        NetworkInfo c2 = c(context);
        if (c2 == null || !c2.isConnectedOrConnecting()) {
            return "DISCONNECTED";
        }
        int type = c2.getType();
        if (type == 1) {
            return "WIFI";
        }
        if (type != 0) {
            return "UNKNOWN";
        }
        String subtypeName = c2.getSubtypeName();
        switch (c2.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
                return "4G";
            default:
                if (!NetUtil.TYPE_GSM.equalsIgnoreCase(subtypeName)) {
                    return ("TD-SCDMA".equalsIgnoreCase(subtypeName) || "WCDMA".equalsIgnoreCase(subtypeName) || "CDMA2000".equalsIgnoreCase(subtypeName)) ? "3G" : subtypeName;
                }
                break;
        }
        return "2G";
    }

    private static boolean h(String str) {
        try {
            String str2 = Build.MANUFACTURER;
            String str3 = Build.BRAND;
            if (!str2.equalsIgnoreCase(str)) {
                if (!str3.toLowerCase().contains(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String i(Context context) {
        String h = o.h();
        if (TextUtils.isEmpty(h) || h.equals("00:00:00:00:00:00")) {
            h = fx.a(context);
        }
        return TextUtils.isEmpty(h) ? "00:00:00:00:00:00" : h;
    }

    public static boolean j(Context context) {
        return Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28;
    }

    public static boolean k(Context context) {
        ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.amap.api.location.APSService"), 128);
        } catch (Throwable unused) {
            serviceInfo = null;
        }
        return serviceInfo != null;
    }

    public static String l(Context context) {
        if (d == null) {
            d = fg.a("MD5", l.c(context));
        }
        return d;
    }

    public static boolean m(Context context) {
        try {
            if (!o(context)) {
                if (!n(context)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean n(Context context) {
        return h("vivo") && p(context) && q(context);
    }

    private static boolean o(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 31 || context == null || context.checkSelfPermission(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) == 0) {
                return false;
            }
            return context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean p(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = context.getApplicationInfo().targetSdkVersion;
            return ((i == 30) && (i2 >= 23)) || ((i == 31) && (i2 <= 30 && i2 >= 23));
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean q(Context context) {
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), new String[]{"package_name", "selected_fuzzy"}, "package_name=?", new String[]{context.getPackageName()}, null);
            boolean z2 = false;
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    } else if (cursor.getString(0) != null && cursor.getInt(1) == 1) {
                        z2 = true;
                    }
                } catch (Throwable unused) {
                    z = z2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return z2;
        } catch (Throwable unused2) {
        }
    }
}
