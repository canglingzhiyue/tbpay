package tb;

import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

/* loaded from: classes4.dex */
public class idy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(String... strArr) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b26fab", new Object[]{strArr})).longValue();
        }
        CRC32 crc32 = new CRC32();
        for (String str : strArr) {
            if (str != null) {
                crc32.update(str.getBytes("utf-8"));
            }
        }
        return crc32.getValue();
    }

    public static byte[] b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{file});
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            cun.a(th, "error while reading file");
            return null;
        }
    }

    public static long a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{file})).longValue();
        }
        CRC32 crc32 = new CRC32();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    crc32.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return crc32.getValue();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static boolean a(boolean z, long j, String... strArr) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a9154b", new Object[]{new Boolean(z), new Long(j), strArr})).booleanValue();
        }
        long a2 = a(strArr);
        if (a2 != j) {
            z2 = false;
        }
        if (z) {
            cun.a("checkCrcChecksum", "exp = " + j + ", real = " + a2 + ", ret " + z2);
        }
        return z2;
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return ConnectionUtils.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cun.a((Throwable) e, "error while md5");
            return null;
        }
    }
}
