package com.taobao.themis.utils.io;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/utils/io/IOUtils;", "", "()V", "IO_BUFFER_SIZE", "", "byteArrayPool", "Lcom/taobao/themis/utils/io/ByteArrayPool;", "getByteArrayPool", "()Lcom/taobao/themis/utils/io/ByteArrayPool;", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "getBuf", "", "size", "inputToByte", "inputStream", "Ljava/io/InputStream;", "returnBuf", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final f INSTANCE;
    public static final int IO_BUFFER_SIZE = 2048;

    /* renamed from: a  reason: collision with root package name */
    private static final ByteArrayPool f22883a;

    static {
        kge.a(35713654);
        INSTANCE = new f();
        f22883a = new ByteArrayPool(20480);
    }

    private f() {
    }

    public final ByteArrayPool a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayPool) ipChange.ipc$dispatch("73d93fc5", new Object[]{this}) : f22883a;
    }

    @JvmStatic
    public static final byte[] a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)}) : f22883a.a(i);
    }

    @JvmStatic
    public static final void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else {
            f22883a.a(bArr);
        }
    }

    @JvmStatic
    public static final byte[] a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        h hVar = new h(null, 0, 3, null);
        byte[] a2 = a(2048);
        while (true) {
            try {
                int read = inputStream.read(a2, 0, a2.length);
                if (read >= 0) {
                    hVar.write(a2, 0, read);
                } else {
                    return hVar.toByteArray();
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

    @JvmStatic
    public static final void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
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
