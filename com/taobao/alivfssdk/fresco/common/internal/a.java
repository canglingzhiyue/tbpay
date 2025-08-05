package com.taobao.alivfssdk.fresco.common.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes4.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(950927137);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8efb2ad1", new Object[]{inputStream, outputStream})).longValue();
        }
        c.a(inputStream);
        c.a(outputStream);
        C0336a a2 = C0336a.a();
        try {
            byte[] bArr = a2.f8515a;
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            }
        } finally {
            a2.b();
        }
    }

    /* renamed from: com.taobao.alivfssdk.fresco.common.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0336a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Object b;
        private static C0336a c;
        private static int d;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f8515a = new byte[4096];
        private C0336a e;

        static {
            kge.a(867779432);
            b = new Object();
        }

        public static C0336a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0336a) ipChange.ipc$dispatch("855b63c5", new Object[0]);
            }
            synchronized (b) {
                if (c != null) {
                    C0336a c0336a = c;
                    c = c0336a.e;
                    c0336a.e = null;
                    d--;
                    return c0336a;
                }
                return new C0336a();
            }
        }

        private C0336a() {
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            synchronized (b) {
                if (d < 2) {
                    d++;
                    if (c != null) {
                        this.e = c;
                    }
                    c = this;
                }
            }
        }
    }
}
