package com.taobao.themis.utils.io;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAP_FILE_THRESHOLD_MIN = 65536;
    public static final int MAP_FILE_THRESHOOLD_MAX = 5242880;
    public static final String TAG = "IOUtils";

    /* renamed from: a  reason: collision with root package name */
    private static final TMSByteArrayPool f22886a;

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(782766534);
        f22886a = new TMSByteArrayPool(20480);
    }

    public static TMSByteArrayPool a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSByteArrayPool) ipChange.ipc$dispatch("eb1a8871", new Object[0]) : f22886a;
    }

    public static byte[] a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)}) : a().a(i);
    }

    public static void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else {
            a().a(bArr);
        }
    }

    public static void a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("java.nio.NioUtils").getDeclaredMethod("freeDirectBuffer", ByteBuffer.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, mappedByteBuffer);
        } catch (Throwable th) {
            Log.e(TAG, "freeMappedBuffer Exception!", th);
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
            } catch (IOException e) {
                Log.e(TAG, "close stream exception", e);
            }
        }
    }

    public static byte[] a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Exception e) {
                Log.e(TAG, "read exception", e);
                return null;
            } finally {
                a((Closeable) inputStream);
            }
        }
    }

    public static String b(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc678f96", new Object[]{inputStream});
        }
        if (inputStream != null) {
            return new String(a(inputStream));
        }
        return null;
    }
}
