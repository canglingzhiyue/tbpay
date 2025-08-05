package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public class ouv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f32445a;
    private static final char[] b;

    static {
        kge.a(-456174945);
        f32445a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};
    }

    public static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{bArr}) : a(bArr, true);
    }

    public static char[] a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("bb71fff9", new Object[]{bArr, new Boolean(z)});
        }
        return a(bArr, z ? f32445a : b);
    }

    public static char[] a(byte[] bArr, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("b2e72fc7", new Object[]{bArr, cArr});
        }
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(bArr)));
        } catch (Exception e) {
            ouu.a(e, "MD5Util");
            e.printStackTrace();
            return "";
        }
    }
}
