package com.alipay.mobile.common.transport.io;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class RpcBufferedOutputStream extends BufferedOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f5597a;

    public static /* synthetic */ Object ipc$super(RpcBufferedOutputStream rpcBufferedOutputStream, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683656483) {
            super.write(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 462729549) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
    }

    public RpcBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.f5597a = 0;
    }

    public RpcBufferedOutputStream(OutputStream outputStream, int i) {
        super(outputStream, i);
        this.f5597a = 0;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            return;
        }
        super.write(i);
        this.f5597a++;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        super.write(bArr, i, i2);
        this.f5597a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            super.write(bArr, 0, bArr.length);
        }
    }

    public int getContentLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e384f103", new Object[]{this})).intValue() : this.f5597a;
    }
}
