package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alibaba.motu.tbrest.d;
import com.ut.device.UTDevice;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class byt {

    /* renamed from: a  reason: collision with root package name */
    static boolean f26188a;
    static String b;
    private static long c;
    private static String d;

    static {
        kge.a(-1929750658);
        f26188a = false;
        b = null;
        c = 0L;
        d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr) {
        String str;
        int i = -1;
        if (bArr == null || bArr.length < 12) {
            str = "recv errCode UNKNOWN_ERROR";
        } else {
            c = bArr.length;
            boolean z = true;
            if (bza.a(bArr, 1, 3) + 8 == bArr.length) {
                if (1 != (bArr[5] & 1)) {
                    z = false;
                }
                i = bza.a(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length <= 0) {
                    b = null;
                } else if (z) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 12, bArr2, 0, length);
                    byte[] b2 = bzc.b(bArr2);
                    b = new String(b2, 0, b2.length);
                } else {
                    b = new String(bArr, 12, length);
                }
                bzd.a("errCode:" + i);
                return i;
            }
            str = "recv len error";
        }
        bzd.c(str);
        bzd.a("errCode:" + i);
        return i;
    }

    public static String a(String str, Context context) {
        String str2 = d.a().e;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (d == null) {
            try {
                d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                d = "Unknown";
            }
        }
        String str4 = d.a().f;
        if (str4 != null) {
            str3 = str4;
        }
        String format = String.format("ak=%s&av=%s&avsys=%s&c=%s&d=%s&sv=%s", str, str2, d, str3, UTDevice.getUtdid(context), "6.5.1.3");
        bzd.b("send url :" + format);
        return format;
    }

    public static byte[] a(String str, Context context, Map<String, String> map) throws Exception {
        return a(str, context, map, 1);
    }

    static byte[] a(String str, Context context, Map<String, String> map, int i) throws Exception {
        byte[] a2 = bzc.a(b(str, context, map));
        if (a2 == null || a2.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(bza.b(a2.length));
        byteArrayOutputStream.write(i);
        byte b2 = (byte) 9;
        if (f26188a) {
            b2 = (byte) (b2 | 32);
        }
        byteArrayOutputStream.write(b2);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(a2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            bzd.c(e.toString());
        }
        return byteArray;
    }

    private static byte[] b(String str, Context context, Map<String, String> map) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String a2 = a(str, context);
        if (a2 == null || a2.length() <= 0) {
            byteArrayOutputStream.write(bza.a(0));
        } else {
            byteArrayOutputStream.write(bza.a(a2.getBytes().length));
            byteArrayOutputStream.write(a2.getBytes());
        }
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                byteArrayOutputStream.write(bza.c(Integer.parseInt(str2)));
                String str3 = map.get(str2);
                if (str3 != null) {
                    byteArrayOutputStream.write(bza.c(str3.getBytes().length));
                    byteArrayOutputStream.write(str3.getBytes());
                } else {
                    byteArrayOutputStream.write(bza.c(0));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            bzd.c(e.toString());
        }
        return byteArray;
    }
}
