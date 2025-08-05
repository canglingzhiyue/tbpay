package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public class jxi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char EXTENSION_SEPARATOR = '.';

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29847a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};

    public static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{bArr}) : a(bArr, true);
    }

    public static char[] a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("bb71fff9", new Object[]{bArr, new Boolean(z)});
        }
        return a(bArr, z ? f29847a : b);
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

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8"))));
        } catch (Exception e) {
            Log.e("MD5Util", "md5", e);
            e.printStackTrace();
            return "";
        }
    }
}
