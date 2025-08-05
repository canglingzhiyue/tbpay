package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class InputStreamUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        byte[] bArr2 = null;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 100);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bArr2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return bArr2;
                }
            } catch (OutOfMemoryError e) {
                BioLog.i(e.toString());
                return bArr2;
            }
        }
    }

    public static String input2String(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef135a4d", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                byteArrayOutputStream.write(read);
            } else {
                return byteArrayOutputStream.toString();
            }
        }
    }

    public static void close(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7157974", new Object[]{inputStream});
        } else if (inputStream == null) {
        } else {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
