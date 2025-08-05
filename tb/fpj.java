package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class fpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(411403150);
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        if (inputStream == null) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(2048);
        } catch (Throwable th2) {
            byteArrayOutputStream = null;
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }
}
