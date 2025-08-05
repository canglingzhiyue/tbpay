package com.hihonor.push.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class e {
    public static RequestHeader a() throws ApiException {
        String string;
        Context a2 = k.e.a();
        String str = null;
        try {
            Object obj = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                str = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e) {
            g.a("ConfigUtils", "getPushAppId", e);
        }
        if (TextUtils.isEmpty(str)) {
            g.a("checkPushConfig Parameter is missing");
            throw HonorPushErrorEnum.ERROR_NO_APPID.toApiException();
        }
        String str2 = "checkPushAppId Parameter is " + str;
        String a3 = a(a2, a2.getPackageName());
        if (TextUtils.isEmpty(a3)) {
            g.a("checkPushConfig Parameter is missing.");
            throw HonorPushErrorEnum.ERROR_CERT_FINGERPRINT_EMPTY.toApiException();
        }
        String str3 = "checkPushCertFingerprint Parameter is " + a3;
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setPackageName(a2.getPackageName());
        requestHeader.setAppId(str);
        requestHeader.setCertificateFingerprint(a3);
        i iVar = i.b;
        requestHeader.setPushToken(iVar.a(a2));
        synchronized (iVar) {
            iVar.b(a2);
            SharedPreferences sharedPreferences = i.f7275a.f7268a;
            string = sharedPreferences != null ? sharedPreferences.getString("key_aaid", "") : "";
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace("-", "");
                String str4 = "getRandomUUID UUID =" + string;
                i.f7275a.a("key_aaid", string);
            }
        }
        requestHeader.setAAID(string);
        requestHeader.setSdkVersion(70001100);
        return requestHeader;
    }

    public static ApiException a(Exception exc) {
        Throwable th;
        if (exc.getCause() instanceof ApiException) {
            th = exc.getCause();
        } else {
            boolean z = exc instanceof ApiException;
            th = exc;
            if (!z) {
                return new ApiException(-1, exc.getMessage());
            }
        }
        return (ApiException) th;
    }

    public static <TResult> y<TResult> a(Callable<TResult> callable) {
        ExecutorService executorService = ar.c.b;
        aq aqVar = new aq();
        try {
            executorService.execute(new w(aqVar, callable));
        } catch (Exception e) {
            aqVar.a(e);
        }
        return aqVar.f7269a;
    }

    public static <TResult> TResult a(y<TResult> yVar) throws ExecutionException, InterruptedException {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (yVar.f7295a) {
                z = yVar.b;
            }
            if (z) {
                if (!yVar.b()) {
                    throw new ExecutionException(yVar.d());
                }
                return yVar.c();
            }
            ac acVar = new ac();
            ar arVar = ar.c;
            yVar.a(new u(arVar.f7270a, acVar)).a(new p(arVar.f7270a, acVar)).a(new h(arVar.f7270a, acVar));
            acVar.f7261a.await();
            if (!yVar.b()) {
                throw new ExecutionException(yVar.d());
            }
            return yVar.c();
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:18:0x0051). Please submit an issue!!! */
    public static String a(Context context, String str) {
        Signature[] signatureArr;
        String str2;
        SigningInfo signingInfo;
        String str3 = "getCertFingerprint pkgName=" + str + "onlyOne=true";
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 30) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            if (packageInfo != null && (signingInfo = packageInfo.signingInfo) != null) {
                signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
            }
            signatureArr = null;
        } else {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            if (packageInfo2 != null) {
                signatureArr = packageInfo2.signatures;
            }
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            int length = signatureArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                try {
                    byte[] digest = MessageDigest.getInstance("SHA256").digest(signatureArr[i].toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                        if (upperCase.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(upperCase);
                    }
                    str2 = sb.toString();
                } catch (NoSuchAlgorithmException unused) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                    break;
                }
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    public static String a(byte[] bArr) {
        if (bArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return "";
    }

    public static void a(Handler handler) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException("Must be called on the handler thread");
    }

    public static byte[] a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < length; i2++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                sb.append(new String(new byte[]{bytes[i2 << 1]}, StandardCharsets.UTF_8));
                bArr[i2] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i + 1]}, StandardCharsets.UTF_8)).byteValue());
            }
        } catch (NumberFormatException e) {
            String str2 = "hex string 2 byte array exception : " + e.getMessage();
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr == null) {
            return bArr;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        if (bArr != null) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return null;
            }
            bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
        }
        return bArr3;
    }
}
