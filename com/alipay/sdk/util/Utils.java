package com.alipay.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.data.DynamicConfig;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f6176a = {"10.1.5.1013151", "10.1.5.1013148"};

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "com.eg.android.AlipayGphone";
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static Map<String, String> convertArgs(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83e57436", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static String subString(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b95f350a", new Object[]{str, str2, str3});
        }
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf < str.length()) {
                return "";
            }
            if (!TextUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, indexOf);
            }
            if (i <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getPublicKey(BizContext bizContext, byte[] bArr) {
        BigInteger modulus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e30de9", new Object[]{bizContext, bArr});
        }
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if ((publicKey instanceof RSAPublicKey) && (modulus = ((RSAPublicKey) publicKey).getModulus()) != null) {
                return modulus.toString(16);
            }
            return null;
        } catch (Exception e) {
            LogUtils.e("mspl", e, "auth", StatisticRecord.EC_GET_PUBLIC_KEY_FROM_SIGN_EX);
            return null;
        }
    }

    public static ExpectedPkg getExpectedPkg(BizContext bizContext, Context context, List<DynamicConfig.LaunchAppSwitchItem> list) {
        ExpectedPkg a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExpectedPkg) ipChange.ipc$dispatch("5e34ccd8", new Object[]{bizContext, context, list});
        }
        if (list == null) {
            return null;
        }
        for (DynamicConfig.LaunchAppSwitchItem launchAppSwitchItem : list) {
            if (launchAppSwitchItem != null && (a2 = a(context, launchAppSwitchItem.pn, launchAppSwitchItem.v, launchAppSwitchItem.pk)) != null && !a2.isSignIllegal(bizContext) && !a2.isVersionIllegal()) {
                return a2;
            }
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class ExpectedPkg {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String expectedSignHex;
        public final int expectedVersionCode;
        public final PackageInfo pkgInfo;

        public ExpectedPkg(PackageInfo packageInfo, int i, String str) {
            this.pkgInfo = packageInfo;
            this.expectedVersionCode = i;
            this.expectedSignHex = str;
        }

        public final boolean isSignIllegal(BizContext bizContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6014fd85", new Object[]{this, bizContext})).booleanValue();
            }
            Signature[] signatureArr = this.pkgInfo.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String publicKey = Utils.getPublicKey(bizContext, signature.toByteArray());
                if (publicKey != null && !TextUtils.equals(publicKey, this.expectedSignHex)) {
                    LogUtils.i("mspl", "biz", StatisticRecord.EC_PUBLIC_KEY_UNMATCH, String.format("Got %s, expected %s", publicKey, this.expectedSignHex));
                    return true;
                }
            }
            return false;
        }

        public final boolean isVersionIllegal() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fab13d3", new Object[]{this})).booleanValue() : this.pkgInfo.versionCode < this.expectedVersionCode;
        }
    }

    public static boolean isExistAnyExpectedPackage(BizContext bizContext, Context context, List<DynamicConfig.LaunchAppSwitchItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb5e69c", new Object[]{bizContext, context, list})).booleanValue();
        }
        try {
            for (DynamicConfig.LaunchAppSwitchItem launchAppSwitchItem : list) {
                if (launchAppSwitchItem != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo(launchAppSwitchItem.pn, 128) != null) {
                            return true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            LogUtils.e("mspl", th, "biz", StatisticRecord.EC_CHECK_LAUNCH_APP_EXIST_EX);
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2c343", new Object[]{packageInfo})).booleanValue();
        }
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            if (!TextUtils.equals(str, f6176a[0])) {
                if (!TextUtils.equals(str, f6176a[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isAlipayVersionBefore991(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115f9477", new Object[]{context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a(), 128);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode < 99;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }

    public static String getRandomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String md5Hash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("991d9903", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length << 1);
            for (byte b : digest) {
                sb.append(Character.forDigit((b & 240) >> 4, 16));
                sb.append(Character.forDigit(b & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static int getProcessUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf849c51", new Object[0])).intValue();
        }
        try {
            return Process.myUid();
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return -200;
        }
    }

    public static ActivityInfo activityInfoForCtx(Context context) {
        ActivityInfo[] activityInfoArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityInfo) ipChange.ipc$dispatch("c2185cde", new Object[]{context});
        }
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.alipay.sdk.util.Utils.ExpectedPkg a(android.content.Context r8, java.lang.String r9, int r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "auth"
            java.lang.String r1 = "mspl"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.sdk.util.Utils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L28
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r8
            r0[r6] = r9
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r10)
            r0[r5] = r8
            r0[r4] = r11
            java.lang.String r8 = "d6d9a54"
            java.lang.Object r8 = r2.ipc$dispatch(r8, r0)
            com.alipay.sdk.util.Utils$ExpectedPkg r8 = (com.alipay.sdk.util.Utils.ExpectedPkg) r8
            return r8
        L28:
            r2 = 0
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L34
            r3 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r9, r3)     // Catch: java.lang.Throwable -> L34
            goto L41
        L34:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r0
            java.lang.String r3 = "GetPackageInfoEx"
            r9[r6] = r3
            com.alipay.sdk.util.LogUtils.e(r1, r8, r9)
            r8 = r2
        L41:
            java.lang.String r9 = ""
            if (r8 != 0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = "info == null"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
        L57:
            r3 = r9
            r9 = 0
            goto L8b
        L5a:
            android.content.pm.Signature[] r3 = r8.signatures
            if (r3 != 0) goto L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = "info.signatures == null"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            goto L57
        L71:
            android.content.pm.Signature[] r3 = r8.signatures
            int r3 = r3.length
            if (r3 > 0) goto L89
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = "info.signatures.length <= 0"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            goto L57
        L89:
            r3 = r9
            r9 = 1
        L8b:
            if (r9 != 0) goto L9a
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r0
            java.lang.String r0 = "NotIncludeSignatures"
            r4[r6] = r0
            r4[r5] = r3
            com.alipay.sdk.util.LogUtils.i(r1, r4)
        L9a:
            if (r9 != 0) goto L9d
            return r2
        L9d:
            if (r8 != 0) goto La0
            return r2
        La0:
            com.alipay.sdk.util.Utils$ExpectedPkg r9 = new com.alipay.sdk.util.Utils$ExpectedPkg
            r9.<init>(r8, r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.Utils.a(android.content.Context, java.lang.String, int, java.lang.String):com.alipay.sdk.util.Utils$ExpectedPkg");
    }
}
