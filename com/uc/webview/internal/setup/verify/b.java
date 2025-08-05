package com.uc.webview.internal.setup.verify;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.io.File;
import tb.riy;

/* loaded from: classes9.dex */
final class b {
    private static void a(Object[] objArr, int i) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        objArr[0] = Integer.valueOf(i);
    }

    public static boolean a(File file, File file2, ClassLoader classLoader, boolean z, Object[] objArr) {
        boolean z2;
        int i;
        String[][] strArr;
        String str;
        String str2;
        int i2;
        String str3;
        File file3 = file;
        char c = 1;
        if (file3 == null) {
            return true;
        }
        String[][] a2 = EnvInfo.a(classLoader);
        int i3 = 2;
        if (a2 == null || a2.length == 0) {
            a(objArr, 2);
            ErrorCode.NATIVE_LIBRARIES_MISSING.report();
        }
        String name = file2 != null ? file2.getName() : null;
        int length = a2.length;
        char c2 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < length) {
            String[] strArr2 = a2[i4];
            if (strArr2 == null || strArr2.length < i3) {
                z2 = false;
                Log.d("Verifier.lib", "library is invalid");
                i = 3;
                break;
            }
            String str4 = strArr2[c2];
            if (TextUtils.isEmpty(name) || name.equals(str4)) {
                z3 |= true;
                long j = 0;
                try {
                    j = Long.parseLong(strArr2[c]);
                } catch (Exception unused) {
                }
                int intValue = GlobalSettings.getIntValue(131);
                if (intValue < i3 || intValue > strArr2.length) {
                    Log.w("Verifier.lib", "invalid algorithm " + intValue + ", use md5 by default");
                    intValue = 2;
                }
                File file4 = new File(file3, str4);
                String str5 = strArr2[intValue];
                boolean z4 = file4.length() == j;
                StringBuilder sb = new StringBuilder("size ");
                String str6 = "ok";
                strArr = a2;
                if (z4) {
                    str = str6;
                    str2 = name;
                    i2 = length;
                } else {
                    str = str6;
                    StringBuilder sb2 = new StringBuilder("failed, real:");
                    str2 = name;
                    i2 = length;
                    sb2.append(file4.length());
                    sb2.append(", expect:");
                    sb2.append(j);
                    str6 = sb2.toString();
                }
                sb.append(str6);
                sb.append(", [");
                sb.append(file4.getAbsolutePath());
                sb.append(riy.ARRAY_END_STR);
                Log.w("Verifier.lib", sb.toString());
                if (!z4) {
                    a(objArr, 4);
                }
                if (z4 && !z) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a.b b = intValue != 2 ? intValue != 4 ? a.b.b() : new a.b("SHA-256", "%064x") : a.b.a();
                    b.b = file4;
                    String c3 = b.c();
                    boolean z5 = !TextUtils.isEmpty(c3) && c3.equals(str5);
                    StringBuilder sb3 = new StringBuilder("content ");
                    if (z5) {
                        str3 = str;
                    } else {
                        str3 = "failed, real:" + c3 + ", expect:" + str5;
                    }
                    sb3.append(str3);
                    sb3.append(", cost:");
                    sb3.append(System.currentTimeMillis() - currentTimeMillis);
                    sb3.append(", [");
                    sb3.append(file4.getAbsolutePath());
                    sb3.append(riy.ARRAY_END_STR);
                    Log.w("Verifier.lib", sb3.toString());
                    if (!z5) {
                        a(objArr, 5);
                    }
                    z4 = z5;
                }
                if (!z4) {
                    return false;
                }
            } else {
                Log.d("Verifier.lib", "ingore " + str4 + ", target:" + name);
                strArr = a2;
                str2 = name;
                i2 = length;
            }
            i4++;
            file3 = file;
            a2 = strArr;
            name = str2;
            length = i2;
            c = 1;
            i3 = 2;
            c2 = 0;
        }
        String str7 = name;
        z2 = false;
        if (z3) {
            return true;
        }
        Log.w("Verifier.lib", "no verification for ".concat(String.valueOf(str7)));
        i = 6;
        a(objArr, i);
        return z2;
    }
}
