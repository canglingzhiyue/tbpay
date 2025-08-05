package com.taobao.mrt.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.kge;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static char[] f18269a;

    public static MessageDigest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageDigest) ipChange.ipc$dispatch("cb93ce30", new Object[0]);
        }
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr}) : a().digest(bArr);
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str}) : a(str.getBytes());
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : b(a(str));
    }

    static {
        kge.a(-1360813811);
        f18269a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr}) : a(bArr, null);
    }

    private static String a(byte[] bArr, Character ch) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7936a8a3", new Object[]{bArr, ch});
        }
        int length = bArr.length;
        if (ch != null) {
            i = 3;
        }
        StringBuffer stringBuffer = new StringBuffer(length * i);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = (bArr[i2] >>> 4) & 15;
            int i4 = bArr[i2] & 15;
            if (i2 > 0 && ch != null) {
                stringBuffer.append(ch.charValue());
            }
            stringBuffer.append(f18269a[i3]);
            stringBuffer.append(f18269a[i4]);
        }
        return stringBuffer.toString();
    }

    public static String a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.toString());
        }
        FileInputStream fileInputStream = null;
        if (file.isDirectory()) {
            return null;
        }
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    String a2 = a(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused) {
                    }
                    return a2;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream});
        }
        long available = inputStream.available();
        if (available < 512) {
            available = 512;
        }
        if (available > 65536) {
            available = 65536;
        }
        byte[] bArr = new byte[(int) available];
        MessageDigest a2 = a();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                a2.update(bArr, 0, read);
            } else {
                return b(a2.digest());
            }
        }
    }
}
