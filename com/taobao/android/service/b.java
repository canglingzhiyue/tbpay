package com.taobao.android.service;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.util.HashSet;
import tb.apr;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_TRUST_SIGNATURES = "trust_signatures";

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<Integer> f15062a = new HashSet<>();
    private static final HashMap<String, String> b;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("19446e81f05a3243e11f00bd51b62f9a18d11b8c", "sso_demo");
        b.put("ff4c78842c83ae30235bcf04b8a749e28811ad3a", "debug_taote");
        b.put("18d47b466ca927509834929e7897d9d703944e54", "release_taote");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        if (r12.contains(r1) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.service.b.a(android.content.Context, java.lang.String):boolean");
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        Certificate c = c(context, str);
        if (c == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(c.getEncoded());
            return a(messageDigest.digest(), false);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8b85dbb", new Object[]{bArr, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
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

    private static Certificate c(Context context, String str) {
        ByteArrayInputStream byteArrayInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Certificate) ipChange.ipc$dispatch("7ce210f", new Object[]{context, str});
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
                apr.a("SecurityUtil", th, new Object[0]);
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

    public static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe74945d", new Object[]{context, new Integer(i)});
        }
        String b2 = b(context, i);
        apr.b("SecurityUtil", "getPackageName pid", Integer.valueOf(i), "processName", b2);
        if (StringUtils.isEmpty(b2)) {
            return null;
        }
        int indexOf = b2.indexOf(58);
        return indexOf >= 0 ? b2.substring(0, indexOf) : b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r5, int r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.service.b.$ipChange
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
            java.lang.String r5 = "383f363c"
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
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.service.b.b(android.content.Context, int):java.lang.String");
    }
}
