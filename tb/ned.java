package tb;

import android.support.v4.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.d;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public class ned {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte[] APNG_ACTL_BYTES;
    public static final int APNG_ACTL_OFFSET = 37;
    public static final int AVIF_HEADER_LENGTH = 4;
    public static final int BMP_HEADER_LENGTH = 2;
    public static final int GIF_HEADER_LENGTH = 6;
    public static final int HEIF_HEADER_LENGTH = 4;
    public static final int JPEG_HEADER_LENGTH = 2;
    public static final byte[] PNG_HEADER;
    public static final int PNG_HEADER_LENGTH = 41;
    public static final int WEBP_A_HEADER_LENGTH = 21;
    public static final int WEBP_HEADER_LENGTH = 21;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f31380a;
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private static final byte[] f;
    private static final byte[] g;
    private static final byte[] h;

    static {
        kge.a(-1252552950);
        PNG_HEADER = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        APNG_ACTL_BYTES = new byte[]{97, 99, 84, 76};
        f31380a = a("RIFF");
        b = a("WEBP");
        c = a("VP8X");
        d = a("GIF87a");
        e = a("GIF89a");
        f = a("BM");
        g = a("heic");
        h = a("avif");
    }

    public static boolean a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 2 && ((bArr[1] & 255) | ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) == 65496;
    }

    private static boolean k(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d17b7bd", new Object[]{bArr})).booleanValue() : bArr.length >= 21 && a(bArr, 0, f31380a) && a(bArr, 8, b);
    }

    private static boolean l(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1fdf2fe", new Object[]{bArr})).booleanValue() : bArr.length >= 21 && a(bArr, 12, c) && (bArr[20] & 16) == 16;
    }

    public static boolean b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90ffa274", new Object[]{bArr})).booleanValue() : bArr != null && k(bArr) && !l(bArr);
    }

    public static boolean c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5e5ddb5", new Object[]{bArr})).booleanValue() : bArr != null && k(bArr) && l(bArr);
    }

    public static boolean d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("facc18f6", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 6 && (a(bArr, 0, d) || a(bArr, 0, e));
    }

    public static boolean e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fb25437", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 41 && a(bArr, 0, PNG_HEADER) && !j(bArr) && bArr[25] < 3;
    }

    public static boolean f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64988f78", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 41 && a(bArr, 0, PNG_HEADER) && !j(bArr) && bArr[25] >= 3;
    }

    public static boolean g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("997ecab9", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 2 && a(bArr, 0, f);
    }

    public static boolean h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce6505fa", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 4 && a(bArr, 20, g);
    }

    public static boolean i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34b413b", new Object[]{bArr})).booleanValue() : bArr != null && bArr.length >= 4 && a(bArr, 8, h);
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1f4c97f", new Object[]{bArr, new Integer(i), bArr2})).booleanValue();
        }
        if (bArr == null || bArr2 == null || i < 0 || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        try {
            return str.getBytes("ASCII");
        } catch (Exception e2) {
            qol.h(d.TAG, "check image format asciiBytes error=%s", e2);
            return null;
        }
    }

    public static boolean j(byte[] bArr) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38317c7c", new Object[]{bArr})).booleanValue();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (byteArrayInputStream.skip(33L) != 33) {
            return false;
        }
        do {
            try {
                byte[] a2 = a(byteArrayInputStream);
                if (a2 == null) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                int length = a2.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X", Byte.valueOf(a2[i])));
                }
                int parseInt = Integer.parseInt(sb.toString(), 16);
                byte[] a3 = a(byteArrayInputStream);
                if (a3 == null) {
                    break;
                }
                String str = new String(a3);
                if ("acTL".equals(str)) {
                    return true;
                }
                if ("fcTL".equals(str) || "IDAT".equals(str) || "fdAT".equals(str)) {
                    break;
                }
                j = parseInt + 4;
            } catch (Throwable unused) {
            }
        } while (byteArrayInputStream.skip(j) == j);
        return false;
    }

    private static byte[] a(ByteArrayInputStream byteArrayInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c74543db", new Object[]{byteArrayInputStream});
        }
        byte[] bArr = new byte[4];
        if (byteArrayInputStream.read(bArr, 0, 4) == 4) {
            return bArr;
        }
        return null;
    }
}
