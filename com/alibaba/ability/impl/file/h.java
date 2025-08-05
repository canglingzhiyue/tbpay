package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final h INSTANCE;
    public static final int IO_BUFFER_SIZE = 2048;

    /* renamed from: a  reason: collision with root package name */
    private static final ByteArrayPool f1890a;

    static {
        kge.a(-172620415);
        INSTANCE = new h();
        f1890a = new ByteArrayPool(20480);
    }

    private h() {
    }

    public final ByteArrayPool a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayPool) ipChange.ipc$dispatch("2a80fc56", new Object[]{this}) : f1890a;
    }

    public final byte[] a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)}) : f1890a.a(i);
    }

    public final void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            f1890a.a(bArr);
        }
    }

    public final byte[] a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{this, inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        j jVar = new j(null, 0, 3, null);
        byte[] a2 = a(2048);
        while (true) {
            try {
                int read = inputStream.read(a2, 0, a2.length);
                if (read >= 0) {
                    jVar.write(a2, 0, read);
                } else {
                    return jVar.toByteArray();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                a(a2);
                a((Closeable) inputStream);
            }
        }
    }

    public final void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{this, closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
