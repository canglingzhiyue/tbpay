package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class czl {

    /* renamed from: a  reason: collision with root package name */
    private static String f26618a;
    private static String b;
    private static String c;
    private static String d;
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized String a(Context context) {
        String str;
        synchronized (czl.class) {
            c(context);
            str = f26618a;
        }
        return str;
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b2 = digest[i2];
                int i3 = i + 1;
                cArr[i] = e[(b2 >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = e[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized String b(Context context) {
        String str;
        synchronized (czl.class) {
            try {
                if (d == null) {
                    d = a(context.getPackageManager().getPackageInfo(a(context), 64).signatures[0].toByteArray());
                }
                str = d;
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return str;
    }

    private static void c(Context context) {
        if (f26618a == null || c == null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                c = packageInfo.versionName;
                f26618a = packageInfo.packageName;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
