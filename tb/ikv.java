package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ikv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8efb2ad0", new Object[]{inputStream, outputStream})).intValue();
        }
        long b = b(inputStream, outputStream);
        if (b <= 2147483647L) {
            return (int) b;
        }
        return -1;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c5ccb0", new Object[]{inputStream, outputStream})).longValue() : a(inputStream, outputStream, new byte[4096]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcf25c58", new Object[]{inputStream, outputStream, bArr})).longValue();
        }
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] a(InputStream inputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3dc7f304", new Object[]{inputStream, new Long(j)});
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j);
        }
        return a(inputStream, (int) j);
    }

    public static byte[] a(InputStream inputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3dc77ea5", new Object[]{inputStream, new Integer(i)});
        }
        if (i < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
        } else if (i == 0) {
            return new byte[0];
        } else {
            byte[] bArr = new byte[i];
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == i) {
                return bArr;
            }
            throw new IOException("Unexpected readed size. current: " + i2 + ", excepted: " + i);
        }
    }

    public static void a(String str, OutputStream outputStream, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99d81f2", new Object[]{str, outputStream, charset});
        } else if (str == null) {
        } else {
            outputStream.write(str.getBytes(charset));
        }
    }
}
