package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* loaded from: classes6.dex */
public class kdg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Random f29975a;

    static {
        kge.a(-242630601);
        f29975a = new Random();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String trim = str.trim();
        try {
            return kdh.a(MessageDigest.getInstance("SHA-1").digest((trim + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        byte[] bArr = new byte[16];
        f29975a.nextBytes(bArr);
        return kdh.a(bArr);
    }

    public static ByteBuffer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("b94f62aa", new Object[0]) : ByteBuffer.allocate(0);
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        if (bArr != null && bArr.length >= 4) {
            for (int i = 0; i <= bArr.length - 4; i++) {
                if (bArr[i] == 13 && bArr[i + 1] == 10 && bArr[i + 2] == 13 && bArr[i + 3] == 10) {
                    if ((bArr.length - i) - 4 == 0) {
                        return null;
                    }
                    byte[] bArr2 = new byte[(bArr.length - i) - 4];
                    System.arraycopy(bArr, i + 4, bArr2, 0, (bArr.length - i) - 4);
                    return bArr2;
                }
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ef4ac6d", new Object[]{bArr});
        }
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        for (int i = 0; i <= bArr.length - 4; i++) {
            if (bArr[i] == 13 && bArr[i + 1] == 10 && bArr[i + 2] == 13 && bArr[i + 3] == 10) {
                if ((bArr.length - i) - 4 == 0) {
                    return bArr;
                }
                int i2 = i + 4;
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                return bArr2;
            }
        }
        return null;
    }
}
