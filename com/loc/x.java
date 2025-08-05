package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import com.loc.w;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import tb.iju;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    static String f7857a;
    private static final String[] b = {iju.ABI_ARM64, "x86_64"};
    private static final String[] c = {"arm", "x86"};

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f7857a = sb.toString();
    }

    public static w a() throws k {
        return new w.a("collection", "1.0", "AMap_collection_1.0").a(new String[]{"com.amap.api.collection"}).a();
    }

    public static String a(long j) {
        return a(j, "yyyyMMdd HH:mm:ss:SSS");
    }

    public static String a(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "ctt");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            java.lang.String r2 = "ut"
            r3 = 28
            r4 = 21
            if (r0 < r4) goto L34
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L34
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<android.content.pm.ApplicationInfo> r4 = android.content.pm.ApplicationInfo.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "primaryCpuAbi"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L2e
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r0 = move-exception
            java.lang.String r4 = "gct"
            com.loc.as.a(r0, r2, r4)
        L34:
            java.lang.String r0 = ""
        L36:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r3) goto La3
            java.lang.Class<android.os.Build> r3 = android.os.Build.class
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L9d
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L9d
            r5 = 0
            if (r3 == 0) goto L51
            int r6 = r3.length     // Catch: java.lang.Throwable -> L9d
            if (r6 <= 0) goto L51
            r0 = r3[r5]     // Catch: java.lang.Throwable -> L9d
        L51:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 != 0) goto La3
            java.lang.String[] r3 = com.loc.x.b     // Catch: java.lang.Throwable -> L9d
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L9d
            boolean r3 = r3.contains(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto La3
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r7.nativeLibraryDir     // Catch: java.lang.Throwable -> L9d
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L9d
            if (r3 != 0) goto La3
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L9d
            int r3 = r7.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L9d
            int r3 = r3 + r1
            java.lang.String r7 = r7.substring(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String[] r1 = com.loc.x.c     // Catch: java.lang.Throwable -> L9d
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L9d
            boolean r7 = r1.contains(r7)     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto La3
            java.lang.Class<android.os.Build> r7 = android.os.Build.class
            java.lang.String r1 = "SUPPORTED_32_BIT_ABIS"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto La3
            int r1 = r7.length     // Catch: java.lang.Throwable -> L9d
            if (r1 <= 0) goto La3
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L9d
            r0 = r7
            goto La3
        L9d:
            r7 = move-exception
            java.lang.String r1 = "gct_p"
            com.loc.as.a(r7, r2, r1)
        La3:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto Lab
            java.lang.String r0 = android.os.Build.CPU_ABI
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.a(android.content.Context):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r3.printStackTrace(r2)     // Catch: java.lang.Throwable -> L2d
        Le:
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L18
            r3.printStackTrace(r2)     // Catch: java.lang.Throwable -> L2d
            goto Le
        L18:
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r0 = move-exception
            r0.printStackTrace()
        L24:
            r2.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            r0.printStackTrace()
        L2c:
            return r3
        L2d:
            r3 = move-exception
            goto L3c
        L2f:
            r3 = move-exception
            r2 = r0
            goto L55
        L32:
            r3 = move-exception
            r2 = r0
            goto L3c
        L35:
            r3 = move-exception
            r1 = r0
            r2 = r1
            goto L55
        L39:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L3c:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r3 = move-exception
            r3.printStackTrace()
        L49:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r3 = move-exception
            r3.printStackTrace()
        L53:
            return r0
        L54:
            r3 = move-exception
        L55:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r0.printStackTrace()
        L5f:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.a(java.lang.Throwable):java.lang.String");
    }

    public static String a(Map<String, String> map) {
        String value;
        if (map.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (z) {
                    z = false;
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    value = entry.getValue();
                } else {
                    stringBuffer.append("&");
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    value = entry.getValue();
                }
                stringBuffer.append(value);
            }
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "abP");
        }
        return stringBuffer.toString();
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static Calendar a(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.CHINA);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(simpleDateFormat.parse(str));
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar2.get(11), calendar2.get(12), calendar2.get(13));
            return calendar;
        } catch (ParseException e) {
            as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "ctt");
            return null;
        }
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        String str3;
        String e = l.e(context);
        String a2 = s.a(e);
        String a3 = l.a(context);
        try {
            String str4 = "";
            if (jSONObject.has("info")) {
                str3 = jSONObject.getString("info");
                String str5 = "请在高德开放平台官网中搜索\"" + str3 + "\"相关内容进行解决";
            } else {
                str3 = str4;
            }
            if ("INVALID_USER_SCODE".equals(str3)) {
                String string = jSONObject.has("sec_code") ? jSONObject.getString("sec_code") : str4;
                if (jSONObject.has("sec_code_debug")) {
                    str4 = jSONObject.getString("sec_code_debug");
                }
                if (a2.equals(string) || a2.equals(str4)) {
                    String str6 = c("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5Lit5pCc57Si") + "\"请求内容过长导致业务调用失败\"相关内容进行解决";
                }
            } else if ("INVALID_USER_KEY".equals(str3)) {
                if (jSONObject.has("key")) {
                    str4 = jSONObject.getString("key");
                }
                if (str4.length() > 0 && !a3.equals(str4)) {
                    c("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5LiK5Y+R6LW35oqA5pyv5ZKo6K+i5bel5Y2V4oCUPui0puWPt+S4jktleemXrumimO+8jOWSqOivoklOVkFMSURfVVNFUl9LRVnlpoLkvZXop6PlhrM=");
                }
            }
        } catch (Throwable unused) {
        }
        f("SHA1Package:".concat(String.valueOf(e)));
        f("key:".concat(String.valueOf(a3)));
        f("csid:".concat(String.valueOf(str)));
        f("gsid:".concat(String.valueOf(str2)));
        f("json:" + jSONObject.toString());
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b2});
            int i = b2 & 255;
            if (i < 255 && i > 0) {
                byteArrayOutputStream.write(bArr);
            } else if (i != 255) {
            } else {
                byteArrayOutputStream.write(bArr, 0, 255);
            }
        } catch (IOException e) {
            as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "wFie");
        }
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
                return;
            } catch (IOException e) {
                as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "wsf");
                return;
            }
        }
        int length = str.length();
        if (length > 255) {
            length = 255;
        }
        a(byteArrayOutputStream, (byte) length, a(str));
    }

    public static boolean a(Context context, String str) {
        if (context != null && context.checkCallingOrSelfPermission(str) == 0) {
            if (Build.VERSION.SDK_INT >= 23 && context.getApplicationInfo().targetSdkVersion >= 23) {
                try {
                    if (((Integer) context.getClass().getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                        return false;
                    }
                } catch (Throwable th) {
                    as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "cpm");
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i / 256), (byte) (i % 256)};
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static w b() throws k {
        return new w.a("co", "1.0.0", "AMap_co_1.0.0").a(new String[]{"com.amap.co", "com.amap.opensdk.co", "com.amap.location"}).a();
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String c2 = p.c(a(str));
        try {
            return ((char) ((c2.length() % 26) + 65)) + c2;
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "tsfb64");
            return "";
        }
    }

    public static String b(Map<String, String> map) {
        String str;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return e(str);
    }

    public static boolean b(Context context) {
        return ap.a(context);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "gZp");
            return new byte[0];
        }
    }

    public static String c(String str) {
        return str.length() < 2 ? "" : p.a(str.substring(1));
    }

    public static byte[] c() {
        try {
            String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            String[] split2 = new StringBuffer(new String(p.b(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "gIV");
            return new byte[16];
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
    public static byte[] c(byte[] r8) {
        /*
            java.lang.String r0 = "zp2"
            java.lang.String r1 = "zp1"
            java.lang.String r2 = "ut"
            r3 = 0
            if (r8 == 0) goto L7e
            int r4 = r8.length
            if (r4 != 0) goto L11
            goto L7e
        L11:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L48
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L48
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "log"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L43
            r5.putNextEntry(r6)     // Catch: java.lang.Throwable -> L43
            r5.write(r8)     // Catch: java.lang.Throwable -> L43
            r5.closeEntry()     // Catch: java.lang.Throwable -> L43
            r5.finish()     // Catch: java.lang.Throwable -> L43
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L43
            r5.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r8 = move-exception
            com.loc.as.a(r8, r2, r1)
        L3a:
            r4.close()     // Catch: java.lang.Throwable -> L3e
            goto L67
        L3e:
            r8 = move-exception
            com.loc.as.a(r8, r2, r0)
            goto L67
        L43:
            r8 = move-exception
            goto L52
        L45:
            r8 = move-exception
            r5 = r3
            goto L69
        L48:
            r8 = move-exception
            r5 = r3
            goto L52
        L4b:
            r8 = move-exception
            r4 = r3
            r5 = r4
            goto L69
        L4f:
            r8 = move-exception
            r4 = r3
            r5 = r4
        L52:
            java.lang.String r6 = "zp"
            com.loc.as.a(r8, r2, r6)     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L62
            r5.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r8 = move-exception
            com.loc.as.a(r8, r2, r1)
        L62:
            if (r4 == 0) goto L67
            r4.close()     // Catch: java.lang.Throwable -> L3e
        L67:
            return r3
        L68:
            r8 = move-exception
        L69:
            if (r5 == 0) goto L73
            r5.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r3 = move-exception
            com.loc.as.a(r3, r2, r1)
        L73:
            if (r4 == 0) goto L7d
            r4.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r1 = move-exception
            com.loc.as.a(r1, r2, r0)
        L7d:
            throw r8
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.c(byte[]):byte[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    static java.security.PublicKey d() throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException {
        /*
            java.lang.String r0 = "MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L5b
            byte[] r0 = com.loc.p.b(r0)     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "IWC41MDk"
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L5c
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "EUlNB"
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> L5c
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L5c
            java.security.cert.Certificate r0 = r0.generateCertificate(r2)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L43
            if (r3 != 0) goto L29
            goto L43
        L29:
            java.security.spec.X509EncodedKeySpec r4 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L5c
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch: java.lang.Throwable -> L5c
            byte[] r0 = r0.getEncoded()     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            java.security.PublicKey r0 = r3.generatePublic(r4)     // Catch: java.lang.Throwable -> L5c
            r2.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r1 = move-exception
            r1.printStackTrace()
        L42:
            return r0
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            r0.printStackTrace()
        L4b:
            return r1
        L4c:
            r0 = move-exception
            goto L50
        L4e:
            r0 = move-exception
            r2 = r1
        L50:
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r1 = move-exception
            r1.printStackTrace()
        L5a:
            throw r0
        L5b:
            r2 = r1
        L5c:
            if (r2 == 0) goto L66
            r2.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r0 = move-exception
            r0.printStackTrace()
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.d():java.security.PublicKey");
    }

    public static byte[] d(String str) {
        if (str.length() % 2 != 0) {
            str = "0".concat(String.valueOf(str));
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static byte[] d(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    private static String e(String str) {
        try {
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "sPa");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            stringBuffer.append(str2);
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.length() > 1) {
            return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, ConnType.H2S);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "csb2h");
            return null;
        }
    }

    private static void f(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String str2 = "|" + str.substring(0, 78) + "|";
            str = str.substring(78);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        sb.toString();
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static byte[] h(byte[] r3) throws java.io.IOException, java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L29
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r2.write(r3)     // Catch: java.lang.Throwable -> L25
            r2.finish()     // Catch: java.lang.Throwable -> L25
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L25
            r2.close()     // Catch: java.lang.Throwable -> L21
            r1.close()     // Catch: java.lang.Throwable -> L1f
            return r3
        L1f:
            r3 = move-exception
            throw r3
        L21:
            r3 = move-exception
            throw r3
        L23:
            r3 = move-exception
            goto L35
        L25:
            r3 = move-exception
            goto L2b
        L27:
            r3 = move-exception
            goto L36
        L29:
            r3 = move-exception
            r2 = r0
        L2b:
            r0 = r1
            goto L32
        L2d:
            r3 = move-exception
            r1 = r0
            goto L36
        L30:
            r3 = move-exception
            r2 = r0
        L32:
            throw r3     // Catch: java.lang.Throwable -> L33
        L33:
            r3 = move-exception
            r1 = r0
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = move-exception
            throw r3
        L3e:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r3 = move-exception
            throw r3
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.h(byte[]):byte[]");
    }
}
