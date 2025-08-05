package com.alipay.mobile.common.transport.io;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class RpcBufferedInputStream extends BufferedInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mReaded;

    public static /* synthetic */ Object ipc$super(RpcBufferedInputStream rpcBufferedInputStream, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -868736240) {
            if (hashCode == 862063607) {
                return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            }
            if (hashCode != 1871872707) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.available());
        }
        return new Integer(super.read());
    }

    public RpcBufferedInputStream(InputStream inputStream) {
        super(inputStream, 8192);
        this.mReaded = 0;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        int i = this.mReaded;
        int read = super.read();
        if (i == this.mReaded) {
            this.mReaded++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.mReaded += read;
        }
        return read;
    }

    public int getPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("265b2898", new Object[]{this})).intValue() : this.pos;
    }

    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.count;
    }

    public int getReaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee2632a5", new Object[]{this})).intValue() : this.mReaded;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
        }
        return super.available();
    }
}
