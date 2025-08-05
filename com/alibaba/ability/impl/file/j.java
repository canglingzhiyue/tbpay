package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes2.dex */
public final class j extends ByteArrayOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayPool f1891a;

    static {
        kge.a(286467478);
        Companion = new a(null);
    }

    public j() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683656483) {
            super.write(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -483678593) {
            super.close();
            return null;
        } else if (hashCode != 462729549) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
    }

    public /* synthetic */ j(ByteArrayPool byteArrayPool, int i, int i2, o oVar) {
        this((i2 & 1) != 0 ? h.INSTANCE.a() : byteArrayPool, (i2 & 2) != 0 ? 1024 : i);
    }

    public j(ByteArrayPool pool, int i) {
        q.d(pool, "pool");
        this.f1891a = pool;
        this.buf = this.f1891a.a(rwf.c(i, 1024));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.f1891a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            this.f1891a.a(this.buf);
        }
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.count + i <= this.buf.length) {
        } else {
            byte[] a2 = this.f1891a.a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a2, 0, this.count);
            this.f1891a.a(this.buf);
            this.buf = a2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] buffer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, buffer, new Integer(i), new Integer(i2)});
            return;
        }
        q.d(buffer, "buffer");
        a(i2);
        super.write(buffer, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        a(1);
        super.write(i);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-558264994);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
