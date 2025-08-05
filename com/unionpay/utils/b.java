package com.unionpay.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap f24047a = new c();

    public static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r0.equals(r9) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r9) {
        /*
            java.lang.String r0 = "sePayConf"
            java.lang.String r1 = "configs"
            java.lang.String r2 = com.unionpay.utils.UPUtils.a(r9, r1)
            java.lang.String r3 = "mode"
            java.lang.String r3 = com.unionpay.utils.UPUtils.a(r9, r3)
            java.lang.String r4 = "or"
            java.lang.String r9 = com.unionpay.utils.UPUtils.a(r9, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = 0
            r6 = 2
            java.lang.String r7 = ""
            if (r4 != 0) goto L92
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L92
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L92
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L92
            r4.<init>(r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = "sign"
            java.lang.String r2 = com.unionpay.utils.i.a(r4, r2)     // Catch: java.lang.Exception -> L92
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r3 = 0
        L3e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Exception -> L92
            byte[] r1 = android.util.Base64.decode(r1, r6)     // Catch: java.lang.Exception -> L92
            r8.<init>(r1)     // Catch: java.lang.Exception -> L92
            boolean r1 = r4.has(r0)     // Catch: java.lang.Exception -> L92
            if (r1 == 0) goto L5f
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L92
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch: java.lang.Exception -> L92
            r1.<init>(r0)     // Catch: java.lang.Exception -> L92
            goto L60
        L5f:
            r1 = r7
        L60:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L67
            r1 = r7
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Exception -> L92
            r0.append(r8)     // Catch: java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Exception -> L92
            r0.append(r9)     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = com.unionpay.utils.UPUtils.a(r9)     // Catch: java.lang.Exception -> L92
            java.lang.String r9 = b(r9)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = com.unionpay.utils.UPUtils.a(r3, r2)     // Catch: java.lang.Exception -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L92
            if (r1 != 0) goto L92
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Exception -> L92
            if (r9 == 0) goto L92
            goto L93
        L92:
            r8 = r7
        L93:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lc8
            r9.<init>(r8)     // Catch: java.lang.Exception -> Lc8
            int r0 = r9.length()
        L9c:
            if (r5 >= r0) goto Lc8
            java.lang.Object r1 = com.unionpay.utils.i.a(r9, r5)
            if (r1 == 0) goto Lc5
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = "type"
            java.lang.String r2 = com.unionpay.utils.i.a(r1, r2)
            java.lang.String r3 = "app"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc5
            java.lang.String r9 = "ca"
            java.lang.String r9 = com.unionpay.utils.i.a(r1, r9)
            java.lang.String r0 = new java.lang.String
            byte[] r9 = android.util.Base64.decode(r9, r6)
            r0.<init>(r9)
            return r0
        Lc5:
            int r5 = r5 + 1
            goto L9c
        Lc8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.utils.b.a(android.content.Context):java.lang.String");
    }

    public static String a(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String a2 = i.a(jSONObject, "sign");
            String a3 = i.a(jSONObject, "configs");
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                return null;
            }
            String str3 = new String(Base64.decode(a3, 2));
            String b = b(UPUtils.a(str3));
            String a4 = UPUtils.a(a(str2), a2);
            if (TextUtils.isEmpty(a4)) {
                return null;
            }
            if (!a4.equals(b)) {
                return null;
            }
            return str3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(riy.CONDITION_IF_MIDDLE);
            }
        }
        return sb.toString();
    }

    public static boolean a() {
        try {
            return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (Exception unused) {
            }
        }
        return packageInfo != null;
    }

    private static boolean a(Context context, String str, String str2) {
        int i;
        int e = e(context, str);
        try {
            i = f(str2);
        } catch (Exception unused) {
            i = Integer.MAX_VALUE;
        }
        return e >= i;
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    int e = e(context, str);
                    int f = f(str3);
                    if (a(context, str) && e >= f) {
                        if (str2.equalsIgnoreCase(b(context, str, "SHA256"))) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:12:0x0019, B:15:0x0020, B:17:0x002a, B:20:0x0031, B:22:0x0037, B:24:0x003e, B:30:0x004c, B:34:0x0064, B:36:0x006a, B:38:0x0070, B:32:0x0058), top: B:43:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 0
            if (r4 == 0) goto L77
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L77
            if (r1 != 0) goto L77
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L77
            if (r1 != 0) goto L77
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L77
            if (r1 != 0) goto L77
            java.lang.String r1 = "11"
            if (r8 == 0) goto L1f
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L77
            if (r2 == 0) goto L20
        L1f:
            r8 = r1
        L20:
            java.lang.String r2 = d(r4, r5)     // Catch: java.lang.Exception -> L77
            boolean r3 = e(r8)     // Catch: java.lang.Exception -> L77
            if (r3 == 0) goto L31
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L77
            if (r3 == 0) goto L31
            return r0
        L31:
            boolean r3 = a(r4, r5)     // Catch: java.lang.Exception -> L77
            if (r3 == 0) goto L77
            boolean r1 = r1.equals(r8)     // Catch: java.lang.Exception -> L77
            r3 = 1
            if (r1 != 0) goto L49
            java.lang.String r1 = "10"
            boolean r1 = r1.equals(r8)     // Catch: java.lang.Exception -> L77
            if (r1 == 0) goto L47
            goto L49
        L47:
            r1 = 0
            goto L4a
        L49:
            r1 = 1
        L4a:
            if (r1 == 0) goto L58
            java.lang.String r1 = "SHA1"
            java.lang.String r1 = b(r4, r5, r1)     // Catch: java.lang.Exception -> L77
            boolean r1 = r6.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L77
            if (r1 != 0) goto L64
        L58:
            java.lang.String r1 = "SHA256"
            java.lang.String r1 = b(r4, r5, r1)     // Catch: java.lang.Exception -> L77
            boolean r6 = r6.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L77
            if (r6 == 0) goto L77
        L64:
            boolean r6 = e(r8)     // Catch: java.lang.Exception -> L77
            if (r6 == 0) goto L70
            boolean r6 = r2.matches(r7)     // Catch: java.lang.Exception -> L77
            if (r6 != 0) goto L76
        L70:
            boolean r4 = a(r4, r5, r7)     // Catch: java.lang.Exception -> L77
            if (r4 == 0) goto L77
        L76:
            return r3
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.utils.b.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return false;
        }
        return a(context, i.a(jSONObject, "schema"), i.a(jSONObject, "sign"), i.a(jSONObject, "version"), i.a(jSONObject, "checkMode"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:15|(2:16|17)|(6:35|36|20|21|(2:23|24)|(2:27|28))|19|20|21|(0)|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
        r3.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
        r3.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052 A[Catch: CertificateEncodingException -> 0x0060, NoSuchAlgorithmException -> 0x0065, Exception -> 0x0072, TRY_LEAVE, TryCatch #6 {NoSuchAlgorithmException -> 0x0065, CertificateEncodingException -> 0x0060, blocks: (B:33:0x004c, B:35:0x0052), top: B:54:0x004c, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #5 {Exception -> 0x0072, blocks: (B:4:0x0005, B:9:0x000f, B:15:0x001b, B:17:0x001f, B:19:0x0022, B:21:0x0027, B:22:0x0032, B:28:0x0040, B:33:0x004c, B:35:0x0052, B:42:0x006b, B:38:0x0061, B:40:0x0066, B:31:0x0048, B:25:0x003a, B:12:0x0015), top: B:52:0x0005, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r3 == 0) goto La
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L72
            goto Lb
        La:
            r3 = r1
        Lb:
            if (r3 == 0) goto L18
            r2 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14 java.lang.Exception -> L72
            goto L19
        L14:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L72
        L18:
            r3 = r1
        L19:
            if (r3 == 0) goto L72
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Exception -> L72
            if (r3 == 0) goto L72
            int r4 = r3.length     // Catch: java.lang.Exception -> L72
            if (r4 <= 0) goto L72
            r4 = 0
            r2 = r3[r4]     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L72
            r3 = r3[r4]     // Catch: java.lang.Exception -> L72
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Exception -> L72
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L72
            r4.<init>(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.security.cert.CertificateException -> L39 java.lang.Exception -> L72
            goto L3e
        L39:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L72
            r3 = r1
        L3e:
            if (r3 == 0) goto L4b
            java.security.cert.Certificate r3 = r3.generateCertificate(r4)     // Catch: java.security.cert.CertificateException -> L47 java.lang.Exception -> L72
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.security.cert.CertificateException -> L47 java.lang.Exception -> L72
            goto L4c
        L47:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L72
        L4b:
            r3 = r1
        L4c:
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r5)     // Catch: java.security.cert.CertificateEncodingException -> L60 java.security.NoSuchAlgorithmException -> L65 java.lang.Exception -> L72
            if (r3 == 0) goto L69
            byte[] r3 = r3.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L60 java.security.NoSuchAlgorithmException -> L65 java.lang.Exception -> L72
            byte[] r3 = r4.digest(r3)     // Catch: java.security.cert.CertificateEncodingException -> L60 java.security.NoSuchAlgorithmException -> L65 java.lang.Exception -> L72
            java.lang.String r3 = a(r3)     // Catch: java.security.cert.CertificateEncodingException -> L60 java.security.NoSuchAlgorithmException -> L65 java.lang.Exception -> L72
            r1 = r3
            goto L69
        L60:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L72
            goto L69
        L65:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L72
        L69:
            if (r1 == 0) goto L72
            java.lang.String r3 = ":"
            java.lang.String r3 = r1.replaceAll(r3, r0)     // Catch: java.lang.Exception -> L72
            return r3
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.utils.b.b(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String b(String str) {
        byte[] bytes;
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (byte b : str.getBytes()) {
            sb.append(charArray[(b & 240) >> 4]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString().trim();
    }

    public static ArrayList b(Context context, String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = null;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object a2 = i.a(jSONArray, i);
                    if (a2 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) a2;
                        if ("app".equals(i.a(jSONObject, "type"))) {
                            JSONArray b = i.b(jSONObject, "package_info");
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (b != null) {
                                try {
                                    if (i2 >= b.length()) {
                                        break;
                                    }
                                    Object a3 = i.a(b, i2);
                                    if ((a3 instanceof JSONObject) && a(context, (JSONObject) a3)) {
                                        arrayList2.add(i.a((JSONObject) a3, "appEnAbbr"));
                                    }
                                    i2++;
                                } catch (Exception unused) {
                                    return arrayList2;
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            continue;
                        }
                    }
                } catch (Exception unused2) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception unused3) {
            return null;
        }
    }

    public static String c(Context context, String str) {
        return b(context, str, "SHA1");
    }

    public static String c(String str) {
        return !TextUtils.isEmpty((CharSequence) f24047a.get(str)) ? (String) f24047a.get(str) : str;
    }

    public static String d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(String str) {
        if (str != null) {
            try {
                return Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    private static int e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean e(String str) {
        return "11".equals(str) || "01".equals(str);
    }

    private static int f(String str) {
        try {
            return Integer.valueOf(str, 10).intValue();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
