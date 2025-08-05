package com.taobao.alivfssdk.fresco.common.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends FilterOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f8516a;

    static {
        kge.a(-622548898);
    }

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f8516a = 0L;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f8516a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        this.out.write(bArr, i, i2);
        this.f8516a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        this.out.write(i);
        this.f8516a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.out.close();
        }
    }
}
