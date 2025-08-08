package com.ali.user.open.laxin.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.b;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.util.HashSet;
import tb.kge;

/* loaded from: classes2.dex */
public class SecurityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AES_INIT_IV = "0122030405660708";
    public static final String DEFAULT_AUTH_CODE = "";
    private static final String LOGIN_DATA = ".logindata";
    private static final String TAG = "SecurityUtil";
    private static final HashSet<Integer> sGrantedCacheSet;
    private static String sPkgKeyDigest;
    private static final HashMap<String, String> sSignMap;
    private static volatile boolean sUmidTokenInited;

    static {
        kge.a(2131269864);
        sSignMap = new HashMap<>();
        sGrantedCacheSet = new HashSet<>();
        sSignMap.put("baa4ebc0a3504b3acabdbcefc36ba4fbb2c2a54e", "ottvideochat");
        sSignMap.put("ad2b6f15319cb0d7866678210a6c6915db4be4c0", "ottvideochat_debug");
    }

    public static String encryptMD5(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9855096", new Object[]{str, new Boolean(z)});
        }
        try {
            return encryptMD5(str.getBytes(), z);
        } catch (Exception e) {
            SDKLogger.w(TAG, "encryptMD5 Exception:" + e.getMessage());
            return "";
        }
    }

    public static String encryptMD5(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("695cb653", new Object[]{bArr, new Boolean(z)});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return toHexString(messageDigest.digest(), z);
        } catch (NoSuchAlgorithmException e) {
            SDKLogger.w(TAG, "encryptMD5 Exception" + e.getMessage());
            return "";
        }
    }

    public static String toHexString(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5491182b", new Object[]{bArr, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static Certificate getCertificate(Context context, String str) {
        ByteArrayInputStream byteArrayInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Certificate) ipChange.ipc$dispatch("5723e48d", new Object[]{context, str});
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (Throwable th) {
            th = th;
            byteArrayInputStream = null;
        }
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return generateCertificate;
        } catch (Throwable th2) {
            th = th2;
            try {
                SDKLogger.w(TAG, th.getMessage());
                return null;
            } finally {
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static String getFingerprint(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c957df03", new Object[]{context, str});
        }
        Certificate certificate = getCertificate(context, str);
        if (certificate == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(certificate.getEncoded());
            return toHexString(messageDigest.digest(), false);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r9.contains(r1) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkPermission(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.laxin.util.SecurityUtil.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static String getTrustSignaturesOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33f7a64e", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("login4android", b.KEY_TRUST_SIGNATURES, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        } catch (Throwable unused) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    public static String getPackageName(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a301e6c3", new Object[]{context, new Integer(i)});
        }
        String processName = getProcessName(context, i);
        SDKLogger.d(TAG, "getPackageName pid:" + i + ",processName:" + processName);
        if (StringUtils.isEmpty(processName)) {
            return null;
        }
        int indexOf = processName.indexOf(58);
        return indexOf >= 0 ? processName.substring(0, indexOf) : processName;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessName(android.content.Context r5, int r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.laxin.util.SecurityUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r1[r5] = r2
            java.lang.String r5 = "6ec675fa"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1d:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r3.append(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r4 = "/cmdline"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
        L43:
            int r3 = r1.read()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
            if (r3 <= 0) goto L4e
            char r3 = (char) r3     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
            r2.append(r3)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
            goto L43
        L4e:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L92
            r1.close()     // Catch: java.lang.Exception -> L56
            goto L69
        L56:
            r1 = move-exception
            r1.printStackTrace()
            goto L69
        L5b:
            r2 = move-exception
            goto L61
        L5d:
            r5 = move-exception
            goto L94
        L5f:
            r2 = move-exception
            r1 = r0
        L61:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.lang.Exception -> L56
        L69:
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L91
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            java.util.Iterator r5 = r5.iterator()
        L7f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            if (r2 != r6) goto L7f
            java.lang.String r0 = r1.processName
        L91:
            return r0
        L92:
            r5 = move-exception
            r0 = r1
        L94:
            if (r0 == 0) goto L9e
            r0.close()     // Catch: java.lang.Exception -> L9a
            goto L9e
        L9a:
            r6 = move-exception
            r6.printStackTrace()
        L9e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.laxin.util.SecurityUtil.getProcessName(android.content.Context, int):java.lang.String");
    }
}
